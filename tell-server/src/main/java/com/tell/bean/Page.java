package com.tell.bean;

import java.util.List;

/**
 * 分页实体
 * @Author: miansen
 * @Date: 2018/11/18 14:50
 */
public class Page<T> {


    private Integer pageNo; //当前是第几页
    private Integer pageSize; //每页返回多少条数据
    private Integer totalPages; //一共有多少页
    private Integer totalCount; //一共有多少条数据
    private List<T> list; //数据实体
    private Boolean first; //是否第一页
    private Boolean last; //是否最后一页

    public Page(Integer pageNo, Integer pageSize, Integer totalCount, List<T> list) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.list = list;
        this.totalPages = totalCount % pageSize == 0 ? totalCount / pageSize : (totalCount / pageSize) + 1;
        this.first = pageNo == 1;
        this.last = pageNo.equals(this.totalPages) || pageNo > this.totalPages;
    }
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Boolean getFirst() {
        return first;
    }

    public void setFirst(Boolean first) {
        this.first = first;
    }

    public Boolean getLast() {
        return last;
    }

    public void setLast(Boolean last) {
        this.last = last;
    }

}
