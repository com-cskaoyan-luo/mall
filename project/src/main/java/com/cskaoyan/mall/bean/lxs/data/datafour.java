package com.cskaoyan.mall.bean.lxs.data;


public class datafour {
    String api;
    String id;
    String label;
    //String pid;

    /*public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }*/

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "datafour{" +
                "api='" + api + '\'' +
                ", id='" + id + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
