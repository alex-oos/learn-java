package demo.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author: Alex
 * @date: 2023/10/7 上午10:35
 * @Descprition: 显示所有路径下的文件
 */
public class FilePath {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/mnt/pipeline_storage/data_validator_storage");
        Stream<Path> walk = Files.walk(path);
        walk.forEach(System.out::println);
    }

}
