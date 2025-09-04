package com.example.javafxmasodfok13a2025;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MasodfokController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}