package br.dev.matheus.webservice.entities;


public class Carro {
    private int codigo;
    private String modelo;
    private String marca;

    public Carro(){
    }
    public Carro(int codigo, String modelo, String marca){
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    

}
