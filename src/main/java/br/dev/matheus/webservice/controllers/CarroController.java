package br.dev.matheus.webservice.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.matheus.webservice.entities.Carro;
import br.dev.matheus.webservice.services.CarroManager;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api")
public class CarroController {
    private final CarroManager manager = new CarroManager();

    @PostMapping("/carros")
    public Carro create(@RequestBody Carro carro){
        return manager.add(carro);
    }

    @GetMapping("/carros")
    public List<Carro> getCarros() {
        return manager.getCarros();
    }

    @DeleteMapping("/carros/{codigo}")
    public void deleteCarro(@PathVariable int codigo){
        manager.remove(codigo);
    }
}
