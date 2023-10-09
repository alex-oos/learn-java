package com.springboot.interceptor;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Alex
 * @date 2021/8/11 2:33 下午
 * <P>
 * 登录拦截器
 * </p>
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 在目标执行之前
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String requestURI = request.getRequestURI();
        log.info("preHandle拦截器拦截的请求路径是：{}", requestURI);
        // 登录检查器
        HttpSession session = request.getSession();

        Object loginUser = session.getAttribute("loginUser");
        if (loginUser != null) {
            return true;
        } else {
            // 拦截住，未登录，跳转到登录页
            request.setAttribute("msg", "请先登录");
            // request.getRequestDispatcher("/").forward(request, response);
            return false;
        }
    }

    /**
     * 在目标执行之后
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        log.info("postHandle拦截器执行{}", modelAndView);

        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    /**
     * 在页面跳转之后
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        log.info("afterCompletion拦截器执行：{}", request);
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }

}
