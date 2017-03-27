package com.wm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangmiao on 2017/3/25.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index.jsp";
    }
}
