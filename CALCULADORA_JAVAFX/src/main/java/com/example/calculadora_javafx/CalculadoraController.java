package com.example.calculadora_javafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculadoraController implements Initializable {

    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnAC;

    @FXML
    private Button btnDiv;

    @FXML
    private Button btnMult;

    @FXML
    private Button btnPercent;

    @FXML
    private Button btnResult;

    @FXML
    private Button btnSub;

    @FXML
    private Button btnSum;

    @FXML
    private Button btnVirgula;

    @FXML
    private TextField txtDisplay;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                txtDisplay.setText("1");
            }
        });
    }
}