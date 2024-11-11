package com.family.pojo;


public class Userop {
    private Integer id;
    private String zhichu;  //支出
    private String jiine;  //人数
    private String fangshi;  //方式
    private String didian;  //地点

    @Override
    public String toString() {
        return "Userop{" +
                "id=" + id +
                ", zhichu='" + zhichu + '\'' +
                ", jiine='" + jiine + '\'' +
                ", fangshi='" + fangshi + '\'' +
                ", didian='" + didian + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZhichu() {
        return zhichu;
    }

    public void setZhichu(String zhichu) {
        this.zhichu = zhichu;
    }

    public String getJiine() {
        return jiine;
    }

    public void setJiine(String jiine) {
        this.jiine = jiine;
    }

    public String getFangshi() {
        return fangshi;
    }

    public void setFangshi(String fangshi) {
        this.fangshi = fangshi;
    }

    public String getDidian() {
        return didian;
    }

    public void setDidian(String didian) {
        this.didian = didian;
    }
}
