package demo.streamdemo;

import com.alibaba.fastjson2.JSONObject;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/14 上午10:31
 */
public class IntStreamDemo {

    public static void main(String[] args) {

        List<Integer> collect = IntStream.rangeClosed(0, 32).boxed().collect(Collectors.toList());
        collect.add(46);
        collect.add(47);
        System.out.println("collect = " + collect);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("value", "9223372036854775808");
        jsonObject.put("bytes", collect);
        System.out.println("jsonObject = " + jsonObject.toJSONString());

    }

}
