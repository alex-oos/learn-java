package com.springboot.utils;


import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;


/**
 * @author Alex
 * @date 2021/12/15 3:49 下午
 * <P>
 * hutoools 请求工具包
 * </p>
 */
public class HuHttpUtil {

    /**
     * get请求返回string 类型
     *
     * @param url
     * @return
     */
    public static String doGet(String url) {

        String response = HttpRequest.get(url)
                .header(Header.CONTENT_TYPE.getValue(), "application/json")
                .execute().body();
        return response;
    }


    /**
     * post 请求，返回string类型
     *
     * @param url
     * @param body
     * @return
     */
    public static String doPost(String url, String body) {

        String response = HttpRequest.post(url)
                .header(Header.CONTENT_TYPE.getValue(), "application/json")// 头信息，多个头信息多次调用此方法即可
                .body(body)
                .timeout(20000)// 超时，毫秒
                .execute().body();
        return response;
    }


    public static HttpResponse doGetA(String url) {

        HttpResponse response = HttpRequest.get(url)
                .header(Header.CONTENT_TYPE.getValue(), "application/json")
                .execute();
        return response;
    }

    public static HttpResponse doPostA(String url, String body) {

        HttpResponse response = HttpRequest.post(url)
                .header(Header.CONTENT_TYPE.getValue(), "application/json")// 头信息，多个头信息多次调用此方法即可
                .body(body)
                .timeout(20000)// 超时，毫秒
                .execute();
        return response;
    }

}
