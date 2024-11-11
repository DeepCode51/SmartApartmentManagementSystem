package com.family.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 前端页面入口
 */
@Controller
public class View {
    /**
     * 登录
     */
    @RequestMapping("/vivelogin.m")
    public String vivelogin(){return "vivew/login";}
    /**
     * 迎新
     */
    @RequestMapping("/viveindex.m")
    public String viveindex(){return "vivew/index";}
    /**
     * 宿舍考评可视化
     */
    @RequestMapping("/vivemessage.m")
    public String vivemessage(){return "vivew/message";}
    /**
     * 公寓管理
     */
    @RequestMapping("/viveabout.m")
    public String viveabout(){return "vivew/about";}
    /**
     * 登记管理
     */
    @RequestMapping("/vive404.m")
    public String vive404(){return "vivew/404";}
    /**
     * 门禁出入
     */
    @RequestMapping("/vivecomment.m")
    public String vivecomment(){return "vivew/comment";}
    /**
     * 退宿离校
     */
    @RequestMapping("/vivedetails.m")
    public String vivedetails(){return "vivew/details";}

    /**
     * 列表
     */
    @RequestMapping("/userelist.m")
    public String userelist(){return "user/userlist";}
    /**
     * 添加
     */
    @RequestMapping("/usersave.m")
    public String usersave(){return "user/usersave";}
    /**
     * 修改
     */
    @RequestMapping("/useredit.m")
    public String useredit(){return "user/useredit";}

}
