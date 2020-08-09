package com.workrc.core.config.dynamic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class DynamicDataSourceContextHolder {
    private static  String DEFAULT_DATASOURCE = "master";
    private static Logger logger = LogManager.getLogger(DynamicDataSourceContextHolder.class);

    /**
     * 存储已经注册的数据源的key
     */
    public static List<String> dataSourceIds = new ArrayList<>();

    /**
     * 当前所数据眼数据
     */
     public final static ConcurrentHashMap<String, DataSource> currentDataSource = new ConcurrentHashMap<>();
    /**
     * 线程级别的私有变量
     */
    private static final ThreadLocal<String> HOLDER = new ThreadLocal<>();

    public static String getDataSourceRouterKey () {
        return HOLDER.get();
    }

    public static void setDataSourceRouterKey (String dataSourceRouterKey) {
        logger.info("切换至{}数据源", dataSourceRouterKey);
        HOLDER.set(dataSourceRouterKey);
    }

    /**
     * 设置数据源之前一定要先移除
     */
    public static void removeDataSourceRouterKey () {
        HOLDER.remove();
    }

    /**
     * 判断指定DataSrouce当前是否存在
     *
     * @param dataSourceId
     * @return
     */
    public static boolean containsDataSource(String dataSourceId){
        return dataSourceIds.contains(dataSourceId);
    }

    public static void setDataSourceID(String dataSourceID,boolean tmp) {
        if (DynamicDataSourceContextHolder.dataSourceIds.contains(dataSourceID)) {
            DynamicDataSourceContextHolder.setDataSourceRouterKey(dataSourceID);
            logger.debug("Use DataSource :{} >", dataSourceID);
        } else {
            logger.info("数据源[{}]不存在，使用默认数据源 >{}",DEFAULT_DATASOURCE);
            DynamicDataSourceContextHolder.setDataSourceRouterKey(DEFAULT_DATASOURCE);
        }
    }

    public static void setDataSourceID(String dataSourceID) {
        setDataSourceID(dataSourceID,true);
    }

    public static void setDataSourceToMaster(boolean isTemporary) {
        if(isTemporary){
            logger.debug("==== change datasource temporary to "+DEFAULT_DATASOURCE+". Thred:"+ Thread.currentThread());
        }else{
            logger.debug("==== change datasource to "+DEFAULT_DATASOURCE + ". Thred:"+ Thread.currentThread());
        }
    }
}
