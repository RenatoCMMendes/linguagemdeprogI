package com.example.e1;

import java.util.ArrayList;
import java.util.List;


public class Comida {

    private  String nomec;
    private  String macro;
    private  String gosto;
    private static List<Comida> listacomida = new ArrayList<>();


    public Comida(String nomec, String macro, String gosto) {
        this.nomec = nomec;
        this.macro = macro;
        this.gosto = gosto;
    }

    public String getNomec() {
        return nomec;
    }

    public String getMacro() {
        return macro;
    }

    public String getGosto() {
        return gosto;
    }

    public void setListComida() {
        listacomida.add(this); // Adiciona o objeto à lista ao ser criado
    }

    @Override
    public String toString() {
        return "Nome: " + nomec + " | Macro: " + macro + " | Gosto: " + gosto;
    }
}