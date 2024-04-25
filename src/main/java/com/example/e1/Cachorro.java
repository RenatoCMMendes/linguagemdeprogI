package com.example.e1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.List;


public class Cachorro {

    private static List<Cachorro> cachorroLista = new ArrayList<>();
    private final String nome;
    private final String raca;
    private final String cor;

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
        cachorroLista.add(this);
    }
    
    public void initData(String nome, String raca, String cor) {
    }
}