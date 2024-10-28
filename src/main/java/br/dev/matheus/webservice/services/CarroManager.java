package br.dev.matheus.webservice.services;
import java.util.*;

import br.dev.matheus.webservice.entities.Carro;


public class CarroManager {
    private List<Carro> carros;
    private int codigoCount;

    public CarroManager(){
        this.carros = new ArrayList<>();
        this.carros.add(new Carro(++codigoCount,"Nivus", "VW"));
        this.carros.add(new Carro(++codigoCount,"Tucson", "Hyunday"));
        this.carros.add(new Carro(++codigoCount,"Camaro", "Chevrolet"));
        this.carros.add(new Carro(++codigoCount,"Corrola", "Toyota"));
    }
    public List<Carro> getCarros(){
        return this.carros;
    }

    public Carro add(Carro carro){
        carro.setCodigo(++codigoCount);
        this.carros.add(carro);
        return carro;
    }
    
    public Carro getByCodigo(int codigo){
        for(Carro c: this.carros){
            if(c.getCodigo() == codigo) return c;
        }
        return null;
    }

    public void remove(int codigo){
        Carro aRemover = getByCodigo(codigo);
        if(aRemover == null) return;
        this.carros.remove(aRemover);
    }

    public void update(int codigo, Carro carro){
        Carro antigo = getByCodigo(codigo);
        antigo.setMarca(carro.getMarca());
        antigo.setModelo(carro.getModelo());
    }
}
