package com.transport.entity;

import java.util.List;

/**
 * Created by chen on 2017/11/17.
 */
public class PageBean<T> {

    private int pageNum = 10;
    private int currentPage;
    private int totalCount;
    private int currentCount;
    private int totalPage;
    private List<T> list;

    public PageBean(int currentPage, int totalCount) {
        this.currentPage = currentPage;
        this.totalCount = totalCount;
        this.totalPage = (int) Math.ceil(totalCount * 1.0 / pageNum);
        this.currentCount = (this.currentPage - 1) * this.pageNum;
    }


    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
