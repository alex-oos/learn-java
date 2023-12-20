package demo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/16 下午5:47
 */
public class RegexExp4 {

    public static void main(String[] args) {

        Pattern compile = Pattern.compile("^[1-9|]*");
        Matcher matcher = compile.matcher("1203|123");
        System.out.println(matcher.matches());

        long maxValue = Long.MAX_VALUE;
        System.out.println("maxValue = " + maxValue);


    }

}
