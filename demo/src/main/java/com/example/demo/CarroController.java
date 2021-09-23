package com.example.demo;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
public class CarroController {

    CarroRepository repository;

    @GetMapping("/carros")
    public List < Carro > getAllCarros() {
        return repository.findAll();
    }

    @GetMapping("/carro/{id}")
    public Carro getCarroById(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping("/addcarro")
    @PreAuthorize("hasRole('USER')")
    public Carro saveCarro(@RequestBody Carro carro) {
        return repository.save(carro);
    }

    @DeleteMapping("/carroexcluir/{id}")
    public void deleteCarro(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping("/carroalterar/{id}")
    public Carro buscaCarroById(@PathVariable Long id, @RequestBody Carro carroDetails) {
        Carro carro = repository.findById(id).get();

        carro.setMarca(carroDetails.getMarca());
        carro.setModelo(carroDetails.getModelo());
        carro.setAno(carroDetails.getAno());

        final Carro buscaCarroById = repository.save(carro);
        return buscaCarroById;
    }








}