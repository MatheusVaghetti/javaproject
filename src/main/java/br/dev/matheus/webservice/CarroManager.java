package br.dev.matheus.webservice;
import java.util.*;


public class CarroManager {
    private List<Carro> carros;

    public CarroManager(){
        this.carros = new ArrayList<>();
        this.carros.add(new Carro("Nivus", "VW"));
        this.carros.add(new Carro("Tucson", "Hyunday"));
    }
    public List<Carro> getCarros(){
        return this.carros;
    }

}
