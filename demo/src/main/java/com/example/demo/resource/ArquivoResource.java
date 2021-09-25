package com.example.demo.resource;
import com.example.demo.storage.Disco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/arquivos")
public class ArquivoResource {

    @Autowired
    private Disco disco;

    @PostMapping
    public void upload(@RequestParam MultipartFile arquivo){
        disco.salvarFoto(arquivo);
    }
}
