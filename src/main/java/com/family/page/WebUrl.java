package com.family.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台页面控制入口
 */
@Controller
public class WebUrl {
    /**
     * 进入后台管理系统
     */
    @RequestMapping("/login.m")
    public String goManagementLogin() {
        return "m-login";
    }
    /**
     * 管理员列表
     */
    @RequestMapping("/adminlist.m")
    public String adminlist() {
        return "admin/m-admin-list";
    }
    /**
     * 管理员添加
     */
    @RequestMapping("/adminsave.m")
    public String adminsave() {
        return "admin/m-admin-save";
    }
    /**
     * 管理员修改
     */
    @RequestMapping("/adminedit.m")
    public String adminedit() {
        return "admin/m-admin-edit";
    }
    /**
     * 首页系统
     */
    @RequestMapping("/adminmain.m")
    public String adminmain() {
        return "m-main";
    }
    /**
     * 首页列表
     */
    @RequestMapping("/keylist.m")
    public String keylist(){return "lokhouse/key-list";}
    /**
     * 修改首页
     */
    @RequestMapping("/keyedit.m")
    public String keyedit(){return "lokhouse/key-edit";}
    /**
     * 添加预首页
     */
    @RequestMapping("/keyadd.m")
    public String keyadd(){return "lokhouse/key-add";}
    /**
     * 支出列表
     */
    @RequestMapping("/userlist.m")
    public String userlist(){return "userop/userlist";}
    /**
     * 修改支出
     */
    @RequestMapping("/userdit.m")
    public String userdit(){return "userop/userdit";}
    /**
     * 添加支出
     */
    @RequestMapping("/useradd.m")
    public String useradd(){return "userop/useradd";}
    /**
     * 收入列表
     */
    @RequestMapping("/ooplist.m")
    public String ooplist(){return "oop/ooplist";}
    /**
     * 收入修改
     */
    @RequestMapping("/oopedit.m")
    public String oopedit(){return "oop/oopedit";}
    /**
     * 收入添加
     */
    @RequestMapping("/oopadd.m")
    public String oopadd(){return "oop/oopadd";}
    /**
     * 报表视图
     */
    @RequestMapping("/welcome1.m")
    public String welcome1(){return "welcome1";}


    /**
     * 家庭修改
     */
    @RequestMapping("/keepedit.m")
    public String keepedit(){return "keep/keepedit";}
    /**
     * 家庭添加
     */
    @RequestMapping("/keepadd.m")
    public String keepadd(){return "keep/keepadd";}

    /**
     * 家庭列表
     */
    @RequestMapping("/keeplist.m")
    public String keeplist(){return "keep/keeplist";}
    /**
     *
     */
    @RequestMapping("/mhomepage.m")
    public String mhomepage(){return "m-home-page";}



    /**
     * 修改
     */
    @RequestMapping("/loopsedit.m")
    public String loopsedit(){return "loops/loopsedit";}
    /**
     * 添加
     */
    @RequestMapping("/loppsadd.m")
    public String loppsadd(){return "loops/loppsadd";}

    /**
     * 列表
     */
    @RequestMapping("/loopslist.m")
    public String loopslist(){return "loops/loopslist";}
}
