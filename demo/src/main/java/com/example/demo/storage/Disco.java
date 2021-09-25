package com.example.demo.storage;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class Disco {

    
    private String raiz ="C:/Users/Thay/Desktop/tmp/contato-disco";
    private String diretorioArquivos ="arquivos";

    public void salvarFoto(MultipartFile arquivo) {
        this.salvar(this.diretorioArquivos, arquivo);
    }
    
    public void salvar(String diretorio, MultipartFile arquivo){
        Path diretorioPath= Paths.get(this.raiz, diretorio);
        Path arquivoPath = diretorioPath.resolve(arquivo.getOriginalFilename());

        try {
            Files.createDirectories(diretorioPath);
            arquivo.transferTo(arquivoPath.toFile());
        } catch (Exception e) {
            throw new RuntimeException("Arquivo não salvo");
        }

    }
     


}
