package com.workrc.common.utils;//package com.hr.common.utils;
//
//import com.hr.common.config.MySqlConfig;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
///**
// * 错误日志工具
// *
// * 打印错误日志并保存到数据库
// */
//public class ErrorLogsUtil {
//    public static void error(Exception e){
//        StackTraceElement stackTraceElement = e.getStackTrace()[0];
//        Connection connection = null;
//        try {
//            Class.forName(MySqlConfig.driver);
//            connection = (Connection) DriverManager.getConnection(MySqlConfig.url, MySqlConfig.username, MySqlConfig.password);
//        } catch (SQLException e1) {
//            e1.printStackTrace();
//        } catch (ClassNotFoundException e1) {
//            e1.printStackTrace();
//        }
//        PreparedStatement ps = null;
//        String sql = "INSERT INTO  VALUES(ID,UUID(),?,?,NOW(),?,?,?,?)";
//
//        try{
//            ps = connection.prepareStatement(sql);
//            //打印日志，错在第几行
//            String errorInfo = e.toString()+",errorMassage:"+stackTraceElement+","+"errorLine:"+stackTraceElement.getLineNumber();
//            ps.setString(1,errorInfo);
//            ps.execute();
//        }catch (SQLException e1){
//            e1.printStackTrace();
//        }finally {
//            try {
//                if(ps != null) {
//                    ps.close();
//                }
//                if(connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException e1) {
//                e1.printStackTrace();
//            }
//        }
//    }
//}