package com.lj.pojo;

public class TelephoneBiz {
    private Integer id;

    private String telephoneBillId;

    private String bizname;

    private String money;

    private Integer status;

    private String version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTelephoneBillId() {
        return telephoneBillId;
    }

    public void setTelephoneBillId(String telephoneBillId) {
        this.telephoneBillId = telephoneBillId == null ? null : telephoneBillId.trim();
    }

    public String getBizname() {
        return bizname;
    }

    public void setBizname(String bizname) {
        this.bizname = bizname == null ? null : bizname.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }
}