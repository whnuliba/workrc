package com.workrc.common.result;

public enum ErrorCode {
    SUCCESS("200","ok"),
    FAILED("400","请求失败"),
    ERROR("500","system error"),
    ERROR_NULL("501","空指针异常"),
    ERROR_CLASS_CAST("502","类型转换异常"),
    ERROR_RUNTION("503","运行时异常"),
    ERROR_IO("504","上传文件异常"),
    ERROR_MOTHODNOTSUPPORT("505","请求方法错误"),
    FAIL("500","system error"),
    INIT("600","record init"),

    TASKNO_EXIST("1001","该任务编号已经存在"),

    PARAM_EMPTY("6001","parameter is empty"),
    FROZEN("10001","FROZEN"),
    UNFROZEN("10002","UNFROZEN"),
    CRON_ERROR("100011","Cron表达式错误"),
    FROZEN_ERROR("100012","冻结状态字段错误，应为FROZEN或UNFROZEN"),

    RUN_NOW_FAIL("7001","立即运行失败"),

    HTTP("10003","http"),
    KAFKA("10004","kafka"),

    UPDATE_FAIL("1002","更新失败"),
    NO_DATA("1003","无此定时任务编号"),

    //参数
    PARAMETER_NULL("10001","缺少参数或值为空"),
    TRIGGER_GROUP_AND_NAME_SAME("10002","组名和名称已存在"),



    //账户
    ACCOUNT_LOCK("20001","账号已锁定"),
    ACCOUNT_NOT_FOUND("20002","找不到账户信息"),
    ACCOUNT_PASSWARD_ERROR("20003","用户名密码错误"),
    ACCOUNT_EXIST("20004","账号已存在"),
    ACCOUNT_USER_LOGINOUT("20005","用户已登出"),
    ACCOUNT_USER_SUCCESS("22222","用户登录成功"),

    //权限
    AUTH_NOT_HAVE("30001","没有权限"),



    FILE_IS_NULL("40001","文件为空"),

    TASK_IS_RUNING("50001","任务已启动，无法再起启动"),
    TASK_IS_PAUSE("50002","任务暂停，只可继续执行"),
    TASK_NOT_RUNING("50003","任务未执行，无法暂停"),
    //0-100为业务码
    CUST_SYSTEM_ERROR("1000", ""),
    INVALID_PARAMS("1001", "参数错误"),
    INVALID_PAGESIZE("1002", "分页大小无效"),

    //200-299 为系统错误码
    SYSTEM_EXCEPTION("1100", "服务器内部错误，请稍后再试"),
    UPDATE_DATA_EXCEPTION("1101", "数据更新失败，请稍后再试"),

    // AGV协议
    AGV_PROTOCOL_EXCEPTION("1102", "AGV协议错误"),
    AGV_SOCKET_EXCEPTION("1103", "AGV Socket错误"),

    // 业务异
    USER_NOT_EXISTS("1200", "用户不存在"),
    USER_AUTH_FAIL("1201", "用户账号或密码错误"),
    USER_NOT_ACTIVE("1202", "用户账号没有启用"),
    USER_PARAM_NOT_FILL("1203", "用户账户或密码未输入"),
    USER_NOT_AUTHORITY("1204", "用户没有权限执行这次操作"),
    DEPENDENCY_EXISTS("1205", "存在依赖"),
    USER_PASSWORD_NOT_MATCH("1206", "密码不正确"),
    WHSEID_PARAM_ISNULL("1207","仓库ID不允许为空"),
    BUSINESS_DATA_TRANSFER_ISNULL("1208","json转化后业务数据为空"),
    JSON_TRANSFER_ISNULL("1209","json转化异常"),
    UDF_STORER_EXISTS("1210","STORERKEY已存在"),
    DATA_EXECUTE_ERROR("1211","数据执行时发生错误,请具体查看明细信息"),
    DATA_PARAM_ISNULL("1212","数据参数不允为空,请检查"),
    UDF_STORERKEY_ISNULL("1213","STORERKEY[货主,客户,供应商,承运商 ]编码不允许为空."),
    UDF_STORERTYPE_ISNULL("1214","STORER 类型不允许为空"),
    UDF_COMPANY_ISNULL("1215","名称描述不允许为空"),
    WHSEID_PARAM_REPEAT("1216","whseid仓库ID不允许重复"),
    UDF_SKU_DESCR_ISNULL("1217","货品名称不允许为空"),
    UDF_SKU_ISNULL("1218","货品编码不允许为空"),
    UDF_STORER_NOT_EXISTS("1219","STORKEY不存在。"),
    UDF_EXTERNORDRKEY_ISNULL("1220","外部单号不允许为空"),
    UDF_EXTERNORDRKEY_EXISTS("1221","外部单号已存在"),
    UDF_WHSEID_ISNULL("1222","获取仓库号ID失败"),
    UDF_DETAIL_DATA_ISEMPTY("1223","单据明细数据为空"),
    UDF_SKU_NOTEXISTS("1224","SKU不存在"),
    UDF_EXTERNRECEIPTKEY_ISNULL("1225","外部收货单号为空"),
    UDF_EXTERNRECEIPTKEY_EXISTS("1226","外部收货单号已存在"),
    UDF_QUERY_EXCEPTION("1227","库存查询查询出现异常"),
    UDF_FB_ASN_EXCEPTION("1228","获取需要回传的收货单据信息时发生异常."),
    WHSEID_PARAM_GL1("1229","仓库ID参数不允许大于1,每次只允许处理一个仓库的请求."),
    UDF_PACKS_IS_EMPTY("1230","包装信息不允许为空."),
    SYSTEM_DATA_SOURCE_ID_ERROR("1231","数据源ID不合法,请检查"),
    UDF_TYPE_IS_NULL("1232","单据类型不允许为空"),
    UDF_EXTERNLINENO_ISNULL("1233", "外部行号不允许为空"),
    UDF_QTYEXPECTED_ISNULL("1234", "ASN收货量不合法不允许小于等于0"),
    UDF_ORIGINALQTY_ISNULL("1235", "SO订单货量不合法不允许小于等于0"),
    UDF_EXTERNRECEIPTKEY_NOT_EXISTS("1236","货主+外部收货单号没有匹配的订单信息"),
    UDF_EXTERNORDERKEY_NOT_EXISTS("1237","货主+外部出收货单号没有匹配的订单信息"),
    UDF_INVENTORYDATE_IS_NOT_NULL("1238","库存查询日期,不允许为空"),
    UDF_PAGENUM_IS_NOT_NULL("1239","每页查询条数,不允许小于等于0"),
    UDF_TYPE_IS_NOT_NULL("1240","单据类型不允许为空."),
    UDF_CUSTOMER_CODE_IS_NOT_NULL("1241","客户代码不允许为空."),
    UDF_C_COMPANY_IS_NOT_NULL("1241","客户名称不允许为空."),
    UDF_CUSTOMERCODE_IS_INVALID("1242","客户代码不合法."),
    UDF_SUPPLIERCODE_IS_NULL("1242","供应商代码不允许为空."),
    UDF_SUPPLIERNAME_IS_NULL("1243","供应商名称不允许为空."),
    UDF_STORERKEY_IS_INVALID("1244","货主编码无效."),
    UDF_SUPPLIERCODE_IS_INVALID("1245","供应商代码不合法."),
    UDF_UPLOADSTATUS_IS_NULL("1246","上传状态不允许为空."),
    UDF_LABEL_TOCOUNTRY_IS_NULL("1247","发货至国家不允许为空."),
    UDF_LABEL_SHIPTO_IS_NULL("1248","发货到不允许为空."),
    UDF_LABEL_FROMCOUNTRY_IS_NULL("1249","发货自国家不允许为空."),
    UDF_LABEL_INVOICE_IS_NULL("1250","LABEL_INVOICE不允许为空."),
    UDF_LABEL_HUNO_IS_NULL("1251","HUNO不允许为空."),
    UDF_LABEL_BOXNO_IS_NULL("1252","BOXNO不允许为空."),
    UDF_FB_TRANSFER_EXCEPTION("1253","获取需要回传的内部转移单据信息时发生异常."),
    UDF_FB_SO_EXCEPTION("1254","获取需要回传的出货单据信息时发生异常."),
    UDF_HUNUMS_ISNULL("1255","HU号不允许为空."),
    UDF_HU_BUSINESSTYPE_IS_INVALID("1256","HU业务类型不合法."),
    UDF_FB_HU_EXCEPTION("1228","获取需要回传的HU信息时发生异常."),
    UDF_HU_BUSINESSTYPE_IS_NULL("1257","HU业务类型不允许为空."),
    UDF_HU_STATUS_IS_NULL("1258","HU状态不允许为空."),
    UDF_EXTERNPOKEY_ISNULL("1259","外部PO单号为空."),
    UDF_EXTERNPOKEY_EXISTS("1260","外部收货单号已存在."),
    UDF_QTY_LT_ZERO("1261","数量小于等于0."),
    UDF_UOM_ISNULL("1262","UOM不允许为空."),
    UDF_WAYBILLNO_ISNULL("1263","运单号不允许为空."),
    UDF_HU_NOT_EXISTS("1264","HU信息不存在."),
    UDF_PGL_WEIGHT_ISNULL("1265","称重信息不允为空."),
    UDF_PGL_BARCODEVALUE_ISNULL("1266","称重信息不允为空."),
    UDF_PGL_WEIGHT_INVALID("1267","称重信息不合法[重量,体积,长宽高不合法]"),
    UDF_DELETE_FAIL("1268","删除失败,目前单据状态不合法,不处于[新建状态]"),
    UDF_UPDATE_FAIL("1269","修改失败,目前单据状态不合法,不处于[新建状态]"),
    UDF_ASNSTATUS_INVALID("1270","删除/修改单据执行失败,单据状态不合法,不处于[新建状态],不允许执行作废操作"),
    UDF_EXTERNRECEIPTKEY_NOTFOUNT_RECEIPT("1271","外部收货单号没有发现对应的收货单据,因此不能执行修改单据的指令"),
    UDF_MESSAGEFUNCTIONCODE_ISNULL("1272","MESSAGEFUNCTONCODE不允许为空"),
    UDF_MESSAGEFUNCTIONCODE_ISVALID("1273","MESSAGEFUNCTONCODE不合法"),
    UDF_SOSTATUS_INVALID("1274","删除/修改单据执行失败,单据状态不合法,不处于[新建状态],不允许执行作废操作"),
    UDF_EXTERNRORDERKEY_NOTFOUNT_RECEIPT("1275","外部订单单号没有发现对应的订单单据,因此不能执行修改单据的指令"),
    UDF_LOTTABLEVALIDATIONKEY_IS_INVALID("1276","批属性验证规则不合法"),
    UDF_CREATE_JCODESTINTION("1277","创建SAP连接失败。"),
    UDF_GET_SAPJCOFUNCTION_ISNULL("1278","获取SAP的JCO函数名为空。"),
    UDF_JCO_FUNCTION_EXECUTE_EXCEPTION("1279","JCO函数执行时出现异常。"),
    UDF_PO_ISAPPROVE("1280","PO的审批状态不允许为空。"),
    UDF_PO_NOT_ALLOW_DELETE("1281","PO单存在收货数量不允许删除。"),
    UDF_PO_EXISTS_LINE("1282","PO单存在该明细行号 。"),
    UDF_PO_LINE_RECEIVEQTY_GT_ZERO("1283","PO明细行号的收货数量大于0,不允许删除 。"),
    UDF_PO_LINE_QTYORDERED_LT_RECEIVEQTY("1284","PO明细行号的订单数量小于已收货的数量,不允许修改。"),
    UDF_RETURN_TYPES_IS_NULL("1285","回传类型不允许为空."),
    UDF_PO_NOT_EXISTS_LINE("1286","PO单不存在该明细行号 。"),
    UDF_QUERY_WERKS_BY_WH_FAILED("1287","根据工厂代码未找到对应的仓库号 。"),
    UDF_QUERY_SAPCLIENT_BY_WERKS_FAILED("1288","根据工厂代码未找到对应的SAP客户端 。"),
    UDF_GET_SAPJCOFUNCTION_PARAM_ISNULL("1289","SAP函数参数为空。"),
    UDF_SAPINV_INSERT_EXCEPITON("1290","SAP库存持久化出现异常。"),
    UDF_CXFL_ADJUSTMENT_CPLINE_ISNULL("1291","产线发料的生成的调整单中,目标库存地不允许为空。"),
    //流程异
    PROCESS_CODE_EXISTS("1300", "流程编码已经存在，请更换其u他编码"),

    BOM_CODE_EXISTS("1301", "BOM下载执行SAP调用时异常。"),
    BOM_INSERT_ERROR("1302", "保存BOM到临时表业务失败，请查询错误日志。"),
    QUERY_AGV_PROCESS_ISNULL("1304", "未查询到对应的流程号。"),
    AGV_POINT_ISNULL("1305", "点位信息不允许为空。"),
    UDF_WERKS_ISNULL("1306","工厂代码不允许为空 。"),
    /**奥克斯业务差异*/

    UDF_PLANT_ISNULL("1307","生产订单号不许为空"),
    UDF_PBILLNO_ISNULL("1307","生产订单号不许为空"),
    UDF_SLOCA_ISNULL("1308","生产订单号不许为空"),
    UDF_NOT_EXISTS_LINE("1309","不存在该明细行号 。"),

    UDF_IS_NULL("1310","不允许为空"),
    UDF_IS_NOT_UPDATE("1311","不允许更新"),
    ;
    /**
     * 业务码
     */
    private String code;
    /**
     * 描述
     */
    private String message;

    private ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }
    /**
     * message允许编辑
     * @param message
     * @return
     */
    public ErrorCode setMessage(String message) {
        this.message = message;
        return this;
    }
}
