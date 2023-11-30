package com.springboot.service.impl;

import com.csvreader.CsvWriter;
import com.springboot.entity.RunSetRulesEntity;
import com.springboot.service.FileService;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * <P></p>
 *
 * @author `Alex`
 * @since 2023/11/27 下午7:20
 */
@Service
public class FileServiceImpl implements FileService {

    @Override
    public void downloadCsv(HttpServletResponse response) {

        Path path1 = Path.of("data/checkSet");
        Path data1 = null;
        try {
            if (!path1.toFile().exists()) {
                data1 = Files.createDirectories(path1);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Path path = Paths.get(data1.toString() + UUID.randomUUID() + ".csv");

        CsvWriter csvWriter = new CsvWriter(path.toString());

        String[] header = {"id", "set_name", "rules", "create_time", "update_time"};
        try {
            csvWriter.writeRecord(header);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<RunSetRulesEntity> list = new ArrayList<>();
        RunSetRulesEntity runSetRulesEntity1 = RunSetRulesEntity.builder().set_name("ss").id(1L).build();
        list.add(runSetRulesEntity1);
        for (RunSetRulesEntity runSetRulesEntity : list) {
            String[] data = new String[5];
            data[0] = String.valueOf(runSetRulesEntity.getId());
            data[1] = String.valueOf(runSetRulesEntity.getSet_name());
            data[2] = String.valueOf(runSetRulesEntity.getRules());
            data[3] = String.valueOf(runSetRulesEntity.getCreate_time());
            data[4] = String.valueOf(runSetRulesEntity.getUpdate_time());
            try {
                csvWriter.writeRecord(data);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        csvWriter.flush();
        // 设置文件流
        response.setContentType("application/octet-stream");
        // 设置文件名称
        response.setHeader("Content-disposition", "attachment;filename=checkSet.csv");
        // 将输入流拷贝成输出流
        try {
            IOUtils.copy(Files.newInputStream(path.toFile().toPath()), response.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 删除文件
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updaload(MultipartFile file) {
        // 将MultipartFile流转化为file流
        File newFile = new File(Objects.requireNonNull(file.getOriginalFilename()));
        try (FileOutputStream fos = new FileOutputStream(newFile)) {
            fos.write(file.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
