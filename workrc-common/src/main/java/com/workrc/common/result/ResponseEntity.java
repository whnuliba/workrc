package com.workrc.common.result;


public class ResponseEntity<T> {
    private T data;
    private String status;
    private String code;
    public ResponseEntity(ResponseStatus status,T data){
       this.data=data;
       this.status=status.toString();
    }
    public static ResponseEntity<String> error(){
      return new ResponseEntity(ResponseStatus.ERROR,ErrorCode.ERROR.message());
    }
    public static ResponseEntity error(String code,Object t){
        return new ResponseEntity(code,ResponseStatus.ERROR,t);
    }
    public static ResponseEntity error(Object t){
        return new ResponseEntity(ResponseStatus.ERROR,t);
    }
    public static ResponseEntity success(Object t){
        return new ResponseEntity(ResponseStatus.SUCCESS,t);
    }
    public static ResponseEntity success(String code,Object t){
        return new ResponseEntity(code,ResponseStatus.SUCCESS,t);
    }
    public ResponseEntity(String code,ResponseStatus status,T data){
        this.data=data;
        this.status=status.toString();
        this.code=code;
    }
    public ResponseEntity(String status,T data){
        this.data=data;
        this.status=status;
    }

    public ResponseEntity(String code,String status,T data){
        this.data=data;
        this.status=status;
        this.code=code;
    }
    public ResponseEntity(){};

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
