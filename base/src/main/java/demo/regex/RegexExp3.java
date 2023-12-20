package demo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/20 上午10:03
 */
public class RegexExp3 {

    public static void main(String[] args) {

        String str = "1234567890_asdfghjkl";
        String regex = "[^\\d_]";
        // str里面的字符只要不是数字和下划线就返回false
        System.out.println(str.matches(regex));
        // str里面的字符只要有一个是数字或者下划线就返回true
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        boolean isFindMatched = matcher.find();
        boolean isMatchesMatched = matcher.matches();
        System.out.println(isFindMatched);
        System.out.println(isMatchesMatched);

    }

}
