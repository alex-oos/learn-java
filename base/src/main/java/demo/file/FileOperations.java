package demo.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/6 下午3:04
 */
public class FileOperations {

    public static void main(String[] args) throws IOException {

        Path filepath = Paths.get("./data/data.txt");

        List<String> list = Files.readAllLines(filepath);
        String collect = list.stream().map(s -> "\"" + s + "\"").collect(Collectors.joining(","));
        System.out.println(collect);
    }

}
