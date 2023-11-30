package com.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Alex
 * @date 2021/8/10 11:02 上午
 * <P></p>
 */

@Controller
public class RequestController {

    @GetMapping("/goto")
    public String gotoPage(HttpServletRequest request) {

        request.setAttribute("msg", "成功了");
        request.setAttribute("code", 200);

        return "forward:/success";
    }

    @ResponseBody
    @GetMapping("/success")
    public Map success(@RequestAttribute("msg") String msg,
                       @RequestAttribute("code") String code,
                       HttpServletRequest request) {

        Object attribute = request.getAttribute("msg");

        Map<String, Object> map = new HashMap<>();
        map.put("requestMethod_msg", attribute);
        map.put("annotation_msg", msg);


        return map;
    }

}
