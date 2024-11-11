package com.family.pojo;

/**
 * 用户前端登录表
 */
public class Vuser {
    private Integer id;
    private String names;
    private String pass;

    @Override
    public String toString() {
        return "Vuser{" +
                "id=" + id +
                ", names='" + names + '\'' +
                ", pass='" + pass + '\'' +
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
