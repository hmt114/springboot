package com.lanou3g.springboot;

import com.lanou3g.springboot.bean.Student;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hmt
 * @date 2019/7/15 11:01
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String a(Model model){
        model.addAttribute("sname","赛");
        return "index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public Student test(){
        return new Student("张三",13);
    }

    @RequestMapping("/hello")
    public String jsp(Model model){
        model.addAttribute("sname","jinsaisai");
        return "hello";
    }
}
