package com.example.e1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class CachorroController {
    @FXML private TextField nomeField;
    @FXML private TextField racaField;
    @FXML private TextField corField;
    @FXML private TableView<Cachorro> cachorroTable;
    @FXML private TableColumn<Cachorro, Integer> idColumn;
    @FXML private TableColumn<Cachorro, String> nomeColumn;
    @FXML private TableColumn<Cachorro, String> racaColumn;
    @FXML private TableColumn<Cachorro, String> corColumn;

    private CachorroDAO cachorroDAO;
    private ObservableList<Cachorro> cachorroList;

    public CachorroController() {
        cachorroDAO = new CachorroDAO();
        cachorroList = FXCollections.observableArrayList();
    }

    @FXML
    private void initialize() {
        idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        nomeColumn.setCellValueFactory(cellData -> cellData.getValue().nomeProperty());
        racaColumn.setCellValueFactory(cellData -> cellData.getValue().racaProperty());
        corColumn.setCellValueFactory(cellData -> cellData.getValue().corProperty());
        loadCachorroData();
    }

    private void loadCachorroData() {
        cachorroList.clear();
        try {
            cachorroList.addAll(cachorroDAO.getAllCachorros());
            cachorroTable.setItems(cachorroList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleAddCachorro() {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome(nomeField.getText());
        cachorro.setRaca(racaField.getText());
        cachorro.setCor(corField.getText());
        try {
            cachorroDAO.addCachorro(cachorro);
            loadCachorroData();
            clearFields();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleUpdateCachorro() {
        Cachorro selectedCachorro = cachorroTable.getSelectionModel().getSelectedItem();
        if (selectedCachorro != null) {
            selectedCachorro.setNome(nomeField.getText());
            selectedCachorro.setRaca(racaField.getText());
            selectedCachorro.setCor(corField.getText());
            try {
                cachorroDAO.updateCachorro(selectedCachorro);
                loadCachorroData();
                clearFields();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void handleDeleteCachorro() {
        Cachorro selectedCachorro = cachorroTable.getSelectionModel().getSelectedItem();
        if (selectedCachorro != null) {
            try {
                cachorroDAO.deleteCachorro(selectedCachorro.getId());
                loadCachorroData();
                clearFields();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void clearFields() {
        nomeField.clear();
        racaField.clear();
        corField.clear();
    }
}
