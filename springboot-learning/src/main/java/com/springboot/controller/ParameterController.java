package com.springboot.controller;


import com.springboot.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.parser.Cookie;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Alex
 * @since 2021/8/10 10:07 上午
 * <P></p>
 */
@Slf4j
@RestController
public class ParameterController {

    /**
     * 数据绑定：页面提交的请求数据数据，都可以和对象属性进行绑定
     *
     * @param person
     * @return
     */
    // @PostMapping("/saveUser")
    public Person saveUser(Person person) {

        return person;
    }
    // car/2/ower/zhangsan
    // @GetMapping("/car/{id}/owner/{username}")
    public Map<String, Object> moreParamater(@PathVariable("id") Integer id,
                                             @PathVariable("username") String name,
                                             @PathVariable Map<String, Object> pv,
                                             @RequestHeader("user-agent") String userAgent,
                                             @RequestHeader Map<String, Object> headers,
                                             @RequestParam("age") String age,
                                             @RequestParam("inters") List<String> inters,
                                             @RequestParam Map<String, String> params,
                                             @CookieValue("_ga") String _ga,
                                             @CookieValue() Cookie cookie
    ) {

        String[] split = userAgent.split(":");
        log.info(split[0]);
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("username", name);
        map.put("map", pv);
        map.put("user-agent", userAgent);
        map.put("headers", headers);
        map.put("age", age);
        map.put("inters", inters);
        map.put("params", params);
        map.put("_ga", _ga);
        map.put("cookie", cookie);
        return map;
    }

    // @PostMapping("/save")
    public Map save(@RequestBody String content) {

        Map<String, String> map = new HashMap<>();
        map.put("content", content);
        return map;

    }


}
