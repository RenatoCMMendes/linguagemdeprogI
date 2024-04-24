package com.example.e1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.management.ValueExp;
import java.awt.*;

public class HelloController {
    @FXML
    private Label resultado;
    @FXML
    private Button calcular;
    @FXML
    private TextField numerador1;
    @FXML
    private TextField denominador1;
    @FXML
    private TextField numerador2;
    @FXML
    private TextField denominador2;
    @FXML
    private CheckBox soma;
    @FXML
    private CheckBox subtracao;
    @FXML
    private CheckBox multiplicacao;
    @FXML
    private CheckBox divisao;


    @FXML
    public void oncalcularclick() {

        double result = 0;
        double num = 0;
        double deno = 0;
        
        double num1;
        double deno1;
        double num2;
        double deno2;
        
        boolean cbsoma = false;
        boolean cbsub = false;
        boolean cbmult = false;
        boolean cbdiv = false;

        num1 = Double.parseDouble(numerador1.getText());
        deno1 = Double.parseDouble(denominador1.getText());
        num2 = Double.parseDouble(numerador2.getText());
        deno2 = Double.parseDouble(denominador2.getText());
        
        cbsoma = soma.selectedProperty().getValue();
        cbsub = subtracao.selectedProperty().getValue();
        cbmult = multiplicacao.selectedProperty().getValue();
        cbdiv = divisao.selectedProperty().getValue();

        if(cbsoma){
            num = (num1 * deno2) + (deno1 * num2);
            deno = (deno1 * deno2);
        } else if (cbsub) {
            num = (num1 * deno2) - (deno1 * num2);
            deno = (deno1 * deno2);
        } else if (cbmult) {
            num = (num1 * num2);
            deno = (deno1 * deno2);
        } else if (cbdiv) {
            num = (num1 * deno2);
            deno = (deno1 * num2);
        }else {
            resultado.setText("Selecione uma opção");
        }

        resultado.setText(num + "\n ------- \n" + deno);

    }
}