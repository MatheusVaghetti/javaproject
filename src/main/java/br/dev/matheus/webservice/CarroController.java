package br.dev.matheus.webservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarroController {

    private CarroManager carro = new CarroManager();

    @GetMapping("api/carros")
    public List<Carro> Get() {
        return carro.getCarros();
    }
}
