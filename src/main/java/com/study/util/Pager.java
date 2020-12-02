package com.study.util;

import java.io.Serializable;
import java.util.List;

/**
 * 分页类
 *
 * @author Sky
 * @date 2020-12-02 18:48.
 */
public class Pager<T> implements Serializable {
    private static final long serialVersionUID = -7472692818223233702L;

    /** 每页显示多少条记录 */
    private int pageSize;
    /** 当前第几页数据 */
    private int currentPage;
    /** 一共多少条记录 */
    private int totalRecord;
    /** 一共多少页 */
    private int totalPage;
    /** 要显示的数据 */
    private List<T> dataList;

    public Pager() {
    }

    public Pager(int pageSize, int currentPage, int totalRecord, int totalPage, List<T> dataList) {
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.totalRecord = totalRecord;
        this.totalPage = totalPage;
        this.dataList = dataList;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
