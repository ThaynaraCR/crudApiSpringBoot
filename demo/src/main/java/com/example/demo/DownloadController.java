package com.example.demo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DownloadController {

    @GetMapping("/download")
    public void download(HttpServletResponse response) {
        File file = new File("C:\\Users\\Thay\\Documents\\crudJavaSpring\\demo\\files\\a.pdf");

        response.setContentType("application/octet-stream");
        String headerKey  = "Content-Disposition";
        String headerValue  = "attachment; filename=" + file.getName();

        response.setHeader(headerKey, headerValue);

        ServletOutputStream outputStream;
        try {
            outputStream = response.getOutputStream();
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));

            byte [] buffer = new byte[8192];
            int bytesRead = -1;
    
            while ((bytesRead = inputStream.read(buffer)) != -1){
                outputStream.write(buffer, 0 , bytesRead);
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }
    
    
}
