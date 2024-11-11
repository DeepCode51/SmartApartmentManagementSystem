package com.family.pojo;


public class Auser {
    private Integer id;
    private String useradd;  //收入统计
    private String useredit;  //支出统计
    private String addis;    //净收入
    private String fangshi; //支付方式

    @Override
    public String toString() {
        return "Auser{" +
                "id=" + id +
                ", useradd='" + useradd + '\'' +
                ", useredit='" + useredit + '\'' +
                ", addis='" + addis + '\'' +
                ", fangshi='" + fangshi + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUseradd() {
        return useradd;
    }

    public void setUseradd(String useradd) {
        this.useradd = useradd;
    }

    public String getUseredit() {
        return useredit;
    }

    public void setUseredit(String useredit) {
        this.useredit = useredit;
    }

    public String getAddis() {
        return addis;
    }

    public void setAddis(String addis) {
        this.addis = addis;
    }

    public String getFangshi() {
        return fangshi;
    }

    public void setFangshi(String fangshi) {
        this.fangshi = fangshi;
    }
}
