package com.springboot.utils;


/**
 * @author Alex
 * @date 2021/12/15 3:43 下午
 * <P></p>
 * @author Alex
 * @date 2021/12/15 3:43 下午
 * <P></p>
 */


/**
 * @author Alex
 * @date 2021/12/15 3:43 下午
 * <P></p>
 */

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import okhttp3.*;

import java.io.IOException;
import java.util.Map;

public class OkhttpUtil {

    /**
     * get请求
     *
     * @param url 请求地址
     * @return 请求结果
     */

    public static String doGet(String url, String header, String get) {

        String totalCount = "";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().
                addHeader("cookie", header).
                url(url).
                build();

        Call call = client.newCall(request);
        try {
            Response responseList = call.execute();
            JSONObject jsonList = JSONUtil.parseObj(responseList.body().string());
            totalCount = jsonList.getStr(get);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return totalCount;
    }

    public static String doGet(String url, String header, int i) throws IOException {

        OkHttpClient client = new OkHttpClient();
        Request requestInfo = new Request.Builder().
                addHeader("cookie", header).
                url(url + i).
                build();
        Call callInfo = client.newCall(requestInfo);
        Response responseInfo = callInfo.execute();
        String responseString = new String(responseInfo.body().bytes());
        return responseString;
    }

    public static String doGet(String url, String header) throws IOException {

        OkHttpClient client = new OkHttpClient();
        Request requestInfo = new Request.Builder().
                addHeader("cookie", header).
                url(url).
                build();
        Call callInfo = client.newCall(requestInfo);
        Response responseInfo = callInfo.execute();
        String responseString = new String(responseInfo.body().bytes());
        return responseString;
    }


    /**
     * 表单形式post请求
     *
     * @param url 请求地址
     * @param map post请求参数
     * @return 请求结果
     */
    public static String doPost(String url, Map<String, String> map) {

        OkHttpClient client = new OkHttpClient();
        // 构建一个formBody builder
        FormBody.Builder builder = new FormBody.Builder();
        // 循环form表单，将表单内容添加到form builder中
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            builder.add(key, value);
        }
        // 构建formBody，将其传入Request请求中
        FormBody body = builder.build();
        Request request = new Request.Builder().url(url).post(body).build();
        Call call = client.newCall(request);
        // 返回请求结果
        try {
            Response response = call.execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Json body形式的post请求
     *
     * @param url 请求地址
     * @return 请求结果
     */
    public static String doPost(String url, String json) {

        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
        Request request = new Request.Builder()
                .post(body)
                .url(url).
                build();
        Call call = client.newCall(request);
        // 返回请求结果
        try {
            Response response = call.execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
