package com.example.springbootelasticsearch.entity;

import java.util.Date;

/**
 * 类功能简述： 插入es的数据
 * 类功能详述：
 *
 * @author fanrongchen
 * @date 2019/12/29 11:33
 */

public class Dept {
    private int id;
    private String name;
    private int pid;
    private int enabled;
    private Date create_time;

    public Dept(int id, String name, int pid, int enabled, Date create_time) {
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.enabled = enabled;
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name=" + name +
                ", pid=" + pid +
                ", enabled=" + enabled +
                ", create_time=" + create_time +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
