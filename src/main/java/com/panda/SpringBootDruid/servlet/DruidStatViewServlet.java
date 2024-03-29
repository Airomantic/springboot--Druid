package com.panda.SpringBootDruid.servlet;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * @program: SpringBoot-Druid
 * @description:
 * @author: jiangzq
 * @create: 2019-10-31 18:18
 **/
@WebServlet(urlPatterns = "/druid/*",initParams = {@WebInitParam(name = "allow",value = "192.168.1.72,127.0.0.1"),
                   @WebInitParam(name = "deny",value = "192.168.1.73"),
                   //IP黑名单（存在共同时，deny优先于allow）
                @WebInitParam(name = "loginUsername",value = "admin"),//用户名
        @WebInitParam(name = "loginPassword",value = "123456"),//密码
        @WebInitParam(name = "resetEnable",value = "false")
        //禁用HTML页面上的Reset All功能
})
public class DruidStatViewServlet extends StatViewServlet {
    private static final long serialVersionUID = 1L;
}
