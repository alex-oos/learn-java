package demo.file;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author: Alex
 * @date: 2023/9/14 下午4:07
 * @Descprition:
 */
public class FileDemo {

    public static void main(String[] args) throws IOException {
        //
        // File file = new File("data");
        // if (!file.exists()) {
        //     boolean delete = file.delete();
        //     System.out.println("delete = " + delete);
        //     boolean mkdir = file.mkdir();
        //     System.out.println("mkdir = " + mkdir);
        // }

        String a = "avp/check/lxw/v1/1/";

        String[] split = a.split("/");
        System.out.println("Arrays.toString(split) = " + Arrays.toString(split));
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < split.length - 1; i++) {
            s.append(split[i]);
            s.append("/");

        }
        System.out.println("s = " + s);
        String s1 = split[split.length - 1];
        System.out.println("s1 = " + s1);

        // boolean b = a.endsWith("/");
        // System.out.println("b = " + b);
        // String substring = a.substring(0,);
        // System.out.println("substring = " + substring);


    }

}
