package com.example.e1;

import java.util.ArrayList;
import java.util.List;


public class Cachorro {

    private  String nome;
    private  String raca;
    private  String cor;
    private static List<Cachorro> listacachorro = new ArrayList<>();


    public Cachorro(String nome, String raca, String cor) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getCor() {
        return cor;
    }

    public void setListCachorro() {
        listacachorro.add(this); // Adiciona o objeto à lista ao ser criado
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Raça: " + raca + " | Cor: " + cor;
    }
}