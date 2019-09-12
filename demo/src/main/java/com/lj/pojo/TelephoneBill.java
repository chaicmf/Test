package com.lj.pojo;

public class TelephoneBill {
    private Integer id;

    private String telephoneBill;

    private String resTelephoneBill;

    private String telephone;

    private String year;

    private String month;

    private String userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTelephoneBill() {
        return telephoneBill;
    }

    public void setTelephoneBill(String telephoneBill) {
        this.telephoneBill = telephoneBill == null ? null : telephoneBill.trim();
    }

    public String getResTelephoneBill() {
        return resTelephoneBill;
    }

    public void setResTelephoneBill(String resTelephoneBill) {
        this.resTelephoneBill = resTelephoneBill == null ? null : resTelephoneBill.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}