package com.example.springbootelasticsearch.entity;

/**
 * 类功能简述： 插入es的数据
 * 类功能详述：
 *
 * @author fanrongchen
 * @date 2019/12/29 11:33
 */
public final class EsEntity<T> {

    private String id;
    private T data;

    public EsEntity() {
    }

    public EsEntity(String id, T data) {
        this.data = data;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}