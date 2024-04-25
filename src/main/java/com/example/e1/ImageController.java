package com.example.e1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;


public class ImageController {
    //cachorro
    @FXML
    private Button cadastrarcachorro;
    @FXML
    private TextField nomecachorro;
    @FXML
    private TextField racacachorro;
    @FXML
    private TextField corcachorro;
    @FXML
    private ListView<String> cachorroListView;
    @FXML
    private ObservableList<String> cachorroLista = FXCollections.observableArrayList();
    //aviao
    @FXML
    private Button cadastraraviao;
    @FXML
    private TextField modeloaviao;
    @FXML
    private TextField tipoaviao;
    @FXML
    private TextField velmaxaviao;
    @FXML
    private ListView<String> aviaoListView;
    @FXML
    private ObservableList<String> aviaoLista = FXCollections.observableArrayList();
    //comidas
    @FXML
    private Button cadastrarcomidas;
    @FXML
    private TextField nomecomida;
    @FXML
    private TextField macrocomida;
    @FXML
    private TextField gostocomida;
    @FXML
    private ListView<String> comidaListView;
    @FXML
    private ObservableList<String> comidaLista = FXCollections.observableArrayList();


    @FXML
    public void initialize() {
        cadastrarcachorro.setOnAction(event -> {
            // Obter os valores inseridos pelo usuário
            String nome = nomecachorro.getText();
            String raca = racacachorro.getText();
            String cor = corcachorro.getText();

            // Criar um novo objeto Cachorro
            Cachorro cachorro = new Cachorro(nome, raca, cor);

            // Adicionar o cachorro à lista
            cachorro.setListCachorro();

            // Adicionar o cachorro à lista
            cachorroLista.add("Cachorro " + cachorroLista.size() + ": " + cachorro.toString());

            // Atualizar a lista na interface do usuário
            cachorroListView.setItems(cachorroLista);
        });
        cadastraraviao.setOnAction(event -> {
            // Obter os valores inseridos pelo usuário
            String modelo = modeloaviao.getText();
            String tipo = tipoaviao.getText();
            double velmax = Double.parseDouble(velmaxaviao.getText());

            // Criar um novo objeto Aviao
            Aviao aviao = new Aviao(modelo, tipo, velmax);

            // Adicionar o avaio à lista
            aviao.setListAviao();

            // Adicionar o aviao à lista
            aviaoLista.add("Aviao " + aviaoLista.size() + ": " + aviao.toString());

            // Atualizar a lista na interface do usuário
            aviaoListView.setItems(aviaoLista);
        });
        cadastrarcomidas.setOnAction(event -> {
            // Obter os valores inseridos pelo usuário
            String nomec = nomecomida.getText();
            String macro = macrocomida.getText();
            String gosto = gostocomida.getText();

            // Criar um novo objeto Comida
            Comida comida = new Comida(nomec, macro, gosto);

            // Adicionar a comida à lista
            comida.setListComida();

            // Adicionar a comida à lista
            comidaLista.add("Comida " + comidaLista.size() + ": " + comida.toString());

            // Atualizar a lista na interface do usuário
            comidaListView.setItems(comidaLista);
        });
    }
}