package com.panda.SpringBootDruid.servlet;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @program: SpringBoot-Druid
 * @description:
 * @author: jiangzq
 * @create: 2019-10-31 18:29
 **/
@WebFilter(filterName = "druidWebStatFilter",urlPatterns = "/*",
initParams = {
        @WebInitParam(name = "exclusions",value = "*.js,*.gif,*jpg,*.bmp,*png,*.c ss,*.ico,/druid/*")
})
public class DruidStatFilter extends WebStatFilter {
}
