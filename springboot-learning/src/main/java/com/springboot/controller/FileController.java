package com.springboot.controller;

import com.springboot.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/27 下午7:19
 */
@Slf4j
@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    FileService fileService;

    @PostMapping("/upload")
    public void upload(@RequestPart MultipartFile file) {

        fileService.updaload(file);

    }

    @PostMapping("/download")
    public void download(HttpServletResponse httpServletResponse) {

        fileService.downloadCsv(httpServletResponse);

    }


}
