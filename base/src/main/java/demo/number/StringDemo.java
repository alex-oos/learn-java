package demo.number;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author Alex
 * @since 2023/10/12 下午2:57
 * <P></p>
 */
public class StringDemo {

    /**
     * 字符串格式化
     */
    public static void format() {

        String name = "Alex";
        int age = 28;
        String format = String.format("大家好，我叫 %s ,今年 %d 岁,%d", name, age);
        System.out.println("format = " + format);
    }

    public static void f1() {

        String a = "consistent";
        System.out.println("a.toUpperCase() = " + a.toUpperCase());

        String demo = "LAYER_NAME, FIELD_NAME, ACTUAL_NAME, FEATURE_ID, ASSIST_NAME, ASSIST_ID, CHECK_ID, CHECK_NAME,\n" + " ERR_CODE, ERR_DESC, MISINFO, IMP_LEVEL, PARA_VALUE, TASK_ID, TILE, ASSIST_TILE, MANUAL_MIS        DATE_TIME, STEP, UUID, DIFF_FLAG, MIS_FLAG, CHECK_VERSION, LOG_SOURCE, FEEDBACK, UPDATEUSER,UPDATETIME, GEOTEXT, GEOMETRY, GEOMETRY_Z, SUB_TASK_I";

        String[] split = demo.split(",");
        List<String> list = Arrays.asList(split);
        List<String> collect = list.stream().map(e -> e.toLowerCase().strip()).collect(Collectors.toList());
        String join = String.join(",", collect);
        System.out.println("join = " + join);
    }

    /**
     * 获取geometry字段数量
     */
    public static void getGeometryFiledCount(String geometryStr) {

 /*        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入从数据库中查询出来的geometryStr数据：");
        // POLYGON Z((116.325394 40.084884 0, 116.326268 40.084579 0, 116.325624 40.084318 0, 116.325394 40.084884 0, 116.325394 40.084884 0))
        String geometryStr = scanner.nextLine(); */


        int beginIndex = geometryStr.lastIndexOf("(");
        int endIndex = geometryStr.lastIndexOf(")");

        int pointNum = geometryStr.substring(beginIndex, endIndex).split(",").length;
        if (pointNum < 2) {
            System.out.println("节点数为 = " + pointNum);
        }
    }

    public static void main(String[] args) throws IOException {

        // List<String> list = Files.readAllLines(Paths.get("./data/geometry.txt"));
        // // System.out.println("list = " + list);
        // list.forEach(StringDemo::f3);
        // 字符串与字节数组的转换
        String a = "你好";
        byte[] bytes = a.getBytes();
        String s = new String(bytes, StandardCharsets.UTF_8);
        System.out.println("s = " + s);
        format();

    }

}
