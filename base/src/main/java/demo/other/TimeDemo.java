package demo.other;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author: Alex
 * @date: 2023/9/21 下午3:41
 * @Descprition:
 */
public class TimeDemo {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String format = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println("format = " + format);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String now = dateTimeFormatter1.format(LocalDateTime.now());
        System.out.println("now = " + now);
    }

}
