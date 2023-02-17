package com.example.calculadora_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculadoraApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculadoraApplication.class.getResource("calculadora-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 432, 620);
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }

    public static void main(String[] args) {

        launch();
    }
}