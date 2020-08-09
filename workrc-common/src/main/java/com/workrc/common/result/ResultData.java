package com.workrc.common.result;

public class ResultData<T> {
    private T data;
    private String status;
    private String code;
    public ResultData(ResponseStatus status,T data){
        this.data=data;
        this.status=status.toString();
    }
    public static ResultData<String> error(){
        return new ResultData(ResponseStatus.ERROR,ErrorCode.ERROR.message());
    }
    public static ResultData<String> error(Object t){
        return new ResultData(ResponseStatus.ERROR,t);
    }
    public static ResultData success(Object t){
        return new ResultData(ResponseStatus.SUCCESS,t);
    }
    public static ResultData success(String code,Object t){
        return new ResultData(code,ResponseStatus.SUCCESS,t);
    }
    public ResultData(String code,ResponseStatus status,T data){
        this.data=data;
        this.status=status.toString();
        this.code=code;
    }
    public ResultData(String status,T data){
        this.data=data;
        this.status=status;
    }

    public ResultData(String code,String status,T data){
        this.data=data;
        this.status=status;
        this.code=code;
    }
    public ResultData(){};
}
