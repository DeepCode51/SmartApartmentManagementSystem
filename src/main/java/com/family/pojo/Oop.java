package com.family.pojo;


public class Oop {
    private Integer id;
    private String names;
    private String fangshi;
    private String renshu;

    @Override
    public String toString() {
        return "Oop{" +
                "id=" + id +
                ", names='" + names + '\'' +
                ", fangshi='" + fangshi + '\'' +
                ", renshu='" + renshu + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getFangshi() {
        return fangshi;
    }

    public void setFangshi(String fangshi) {
        this.fangshi = fangshi;
    }

    public String getRenshu() {
        return renshu;
    }

    public void setRenshu(String renshu) {
        this.renshu = renshu;
    }
}
