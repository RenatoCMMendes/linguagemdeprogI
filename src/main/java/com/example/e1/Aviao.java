package com.example.e1;

import java.util.ArrayList;
import java.util.List;


public class Aviao {

    private  String modelo;
    private  String tipo;
    private double velmax;
    private static List<Aviao> listaaviao = new ArrayList<>();


    public Aviao(String modelo, String tipo, double velmax) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.velmax = velmax;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public double getVelmax() {
        return velmax;
    }

    public void setListAviao() {
        listaaviao.add(this); // Adiciona o objeto à lista ao ser criado
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + " | Tipo: " + tipo + " | Vel Max: " + velmax;
    }
}