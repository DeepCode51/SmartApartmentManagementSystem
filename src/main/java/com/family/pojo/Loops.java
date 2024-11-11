package com.family.pojo;

public class Loops {
    private  Integer id;
    private String tuisu;
    private String lixiao;

    @Override
    public String toString() {
        return "Loop{" +
                "id=" + id +
                ", tuisu='" + tuisu + '\'' +
                ", lixiao='" + lixiao + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTuisu() {
        return tuisu;
    }

    public void setTuisu(String tuisu) {
        this.tuisu = tuisu;
    }

    public String getLixiao() {
        return lixiao;
    }

    public void setLixiao(String lixiao) {
        this.lixiao = lixiao;
    }
}
