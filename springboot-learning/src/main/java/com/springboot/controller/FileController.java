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
 * <P> 文件基本操作</p>
 *
 * @author Alex
 * @since 2023/11/27 下午7:19
 */
@Slf4j
// @Api(value = "FileController", tags = "文件相关接口")
@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    FileService fileService;

    // @ApiOperation(value = "上传", tags = "")
    @PostMapping("/upload")
    public void upload(@RequestPart MultipartFile file) {

        fileService.updaload(file);

    }

    // @ApiOperation(value = "下载", tags = "")
    @PostMapping("/download")
    public void download(HttpServletResponse httpServletResponse) {

        fileService.downloadCsv(httpServletResponse);

    }


}
