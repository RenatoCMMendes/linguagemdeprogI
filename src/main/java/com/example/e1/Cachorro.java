package com.example.e1;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Cachorro {
    private final IntegerProperty id;
    private final StringProperty nome;
    private final StringProperty raca;
    private final StringProperty cor;

    public Cachorro() {
        this.id = new SimpleIntegerProperty();
        this.nome = new SimpleStringProperty();
        this.raca = new SimpleStringProperty();
        this.cor = new SimpleStringProperty();
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public String getNome() {
        return nome.get();
    }

    public void setNome(String nome) {
        this.nome.set(nome);
    }

    public StringProperty nomeProperty() {
        return nome;
    }

    public String getRaca() {
        return raca.get();
    }

    public void setRaca(String raca) {
        this.raca.set(raca);
    }

    public StringProperty racaProperty() {
        return raca;
    }

    public String getCor() {
        return cor.get();
    }

    public void setCor(String cor) {
        this.cor.set(cor);
    }

    public StringProperty corProperty() {
        return cor;
    }
}
