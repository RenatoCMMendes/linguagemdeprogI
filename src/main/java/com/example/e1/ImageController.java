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
    private Label respotcachorro;
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
    private Label respotaviao;
    @FXML
    private Button cadastraraviao;
    @FXML
    private TextField modeloaviao;
    @FXML
    private TextField tipoaviao;
    @FXML
    private TextField velmaxaviao;
    //comidas
    @FXML
    private Label respotcomidas;
    @FXML
    private Button cadastrarcomidas;
    @FXML
    private TextField nomecomida;
    @FXML
    private TextField macrocomida;
    @FXML
    private TextField gostocomida;


    @FXML
    public void onCachorroclick() {

            String nome = nomecachorro.getText();
            String raca = racacachorro.getText();
            String cor = corcachorro.getText();


    }
    @FXML
    public void onAviaoclick() {



    }
    @FXML
    public void onComidasclick() {



    }
}