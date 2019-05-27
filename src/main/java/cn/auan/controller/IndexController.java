package cn.auan.controller;

import cn.auan.config.MessageContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author 十三月
 * @Description
 * @date 2018-08-02 下午4:57
 */
@Controller
public class IndexController {

    @Autowired
    private MessageContext messageContext;

    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("welcome", messageContext.getMessage("welcome"));
        return "index";
    }
}