package com.agenCanggih.models;

import java.util.List;

public class PageAbleList<ENT> {

    private List<ENT> list;
    private Long total;
    private int page;
    private int size;

    public PageAbleList() {
    }

    public PageAbleList(List<ENT> list, Long total, int page, int size) {
        this.list = list;
        this.total = total;
        this.size = size;
        this.page = page;
    }

    public List<ENT> getList() {
        return this.list;
    }

    public void setList(List<ENT> list) {
        this.list = list;
    }

    public Long getTotal() {
        return this.total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }

}