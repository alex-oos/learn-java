package Image;


import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author alex
 * @date 2023-07-11 下午3:26
 * @Description :  验证码图片识别
 **/
public class IMageOCR {
    /**
     * 获取验证码图片
     *
     * @return
     */
    public static String getImageStr() {
        String res = HttpUtil.get("https://ankamak.com/mer/captcha");
        JSON parse = JSONUtil.parse(res);
        String imageUrl = (String) parse.getByPath("data.captcha");
        //image 返回来的格式包含data:image/jpeg;base64，需要去掉
        String image = imageUrl.substring(imageUrl.indexOf(",") + 1);
        // base64解码图片字符串，并且保存到本地 教程：https://juejin.cn/post/6982167358324342815#heading-5
/*        byte[] base64Image = Base64.getDecoder().decode(image);
        File file = new File("./captcha.jpeg");
        FileUtils.writeByteArrayToFile(file, base64Image);*/
        return image;
    }

    /**
     * 识别验证码 使用：http://api.ttshitu.com 来识别
     *
     * @return
     * @throws IOException
     */
    public static String getCaptcha() throws IOException {
        String imageStr = getImageStr();
        Map<String, String> data = new HashMap<>();
        data.put("username", "alexoos");
        data.put("password", "ttshitu242");
        data.put("typeid", "2");
        data.put("image", imageStr);
        String resultString = Jsoup.connect("http://api.ttshitu.com/predict")
                .requestBody(com.alibaba.fastjson.JSON.toJSONString(data))
                .header("Content-Type", "application/json")
                .ignoreContentType(true)
                .post()
                .body()
                .text();
        JSONObject jsonObject = JSONObject.parseObject(resultString);
        if (jsonObject.getBoolean("success")) {
            String result = jsonObject.getJSONObject("data").getString("result");
            System.out.println("识别成功结果为:" + result);
            return result;
        } else {
            System.out.println("识别失败原因为:" + jsonObject.getString("message"));
            return jsonObject.getString("message");
        }
    }


    public static void main(String[] args) throws IOException {
        String captcha = getCaptcha();

    }
}
