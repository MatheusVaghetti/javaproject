package br.dev.matheus.webservice;
import java.util.*;


public class CarroManager {
    private List<Carro> carros;

    public CarroManager(){
        this.carros = new ArrayList<>();
    }
    public List<Carro> getCarros(){
        return this.carros;
    }

}
