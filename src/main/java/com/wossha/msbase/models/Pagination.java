package com.wossha.msbase.models;

public class Pagination {
	private Integer size;
    private Integer init;
    private Integer limit;

    public Pagination(Integer size, Integer init, Integer limit) {
        this.size = size;
        this.init = init;
        this.limit = limit;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getInit() {
        return init;
    }

    public void setInit(Integer init) {
        this.init = init;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
