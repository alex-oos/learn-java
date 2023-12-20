package demo.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/10 下午4:00
 */
public class SQLdemo {

    public static void main(String[] args) throws IOException {

        List<String> list = Files.readAllLines(Paths.get("./data/sqlite_geometry_columns.sql"));
        System.out.println(String.join("", list));
    }

}
