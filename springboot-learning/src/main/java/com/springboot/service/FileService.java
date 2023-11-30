package com.springboot.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/27 下午7:20
 */
public interface FileService {


    void downloadCsv(HttpServletResponse httpServletResponse);

    void updaload(MultipartFile file);

}
