package com.workrc.common.result;


import java.util.List;

public class Page<T> {
    private int pageSize;
    private int total; //总条数
    private int current;   //当前第几页
    private T requestData;

    private List<T> data;
    public Page(int totalRecord,int totalPage,int pageNo,int pageSize,List<T> t){

    }

    public Page() {
    }
    public Page(int total,List<T> data){
        this.total = total;
        this.data = data;
    }
    public Page(int pageSize,int total, int currentPage,List<T> data) {
        this.pageSize = pageSize;
        this.total = total;
        this.current = currentPage;
        this.data = data;
    }
    public static <E> Page<E> getPage(List<E> data,int total){
        return new Page(total,data);
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public T getRequestData() {
        return requestData;
    }

    public void setRequestData(T requestData) {
        this.requestData = requestData;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
