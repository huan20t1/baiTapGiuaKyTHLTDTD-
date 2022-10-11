package com.example.baitapgiuaky;

public class ThuVien {
    private String name;
    private String method;
    private String money;
    private int hinh;

    public ThuVien(String name, String method,String money, int hinh) {
        this.name = name;
        this.method = method;
        this.hinh = hinh;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}