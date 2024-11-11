package com.family.pojo;


public class Keep {
    private Integer id;
    private String fap;  //新生选房
    private String agea;//新生分房
    private String kop;//到校登记
    private String xinse;//迎新问答
    private String ipho;//手机选号
    private String xian;//线上充值
    private String wu;//生活用品预定
    private String ipo;//新生礼包

    @Override
    public String toString() {
        return "Keep{" +
                "id=" + id +
                ", fap='" + fap + '\'' +
                ", agea='" + agea + '\'' +
                ", kop='" + kop + '\'' +
                ", xinse='" + xinse + '\'' +
                ", ipho='" + ipho + '\'' +
                ", xian='" + xian + '\'' +
                ", wu='" + wu + '\'' +
                ", ipo='" + ipo + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFap() {
        return fap;
    }

    public void setFap(String fap) {
        this.fap = fap;
    }

    public String getAgea() {
        return agea;
    }

    public void setAgea(String agea) {
        this.agea = agea;
    }

    public String getKop() {
        return kop;
    }

    public void setKop(String kop) {
        this.kop = kop;
    }

    public String getXinse() {
        return xinse;
    }

    public void setXinse(String xinse) {
        this.xinse = xinse;
    }

    public String getIpho() {
        return ipho;
    }

    public void setIpho(String ipho) {
        this.ipho = ipho;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public String getWu() {
        return wu;
    }

    public void setWu(String wu) {
        this.wu = wu;
    }

    public String getIpo() {
        return ipo;
    }

    public void setIpo(String ipo) {
        this.ipo = ipo;
    }
}
