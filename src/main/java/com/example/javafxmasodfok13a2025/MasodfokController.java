package com.example.javafxmasodfok13a2025;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class MasodfokController {
    @FXML
    public TextField textfield_A;
    @FXML
    public TextField textfield_B;
    @FXML
    public TextField textfield_C;
    @FXML
    public Button button_Solve;
    @FXML
    public ListView listview_Solution;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void onSolveButtonClick() {
        // get a, b, c
        double a;
        double b;
        double c;
        try {
            a = Double.parseDouble(textfield_A.getText());
            b = Double.parseDouble(textfield_B.getText());
            c = Double.parseDouble(textfield_C.getText());
        } catch (NumberFormatException e) {
            List<String> lines = new ArrayList<>();
            lines.add("Please enter only valid numbers!");
            ObservableList<String> linesFX = FXCollections.observableList(lines);
            listview_Solution.setItems(linesFX);
            return;
        }

        // calculate d
        double d = b*b - 4.0*a*c;

        // TODO - check count of solutions

        // solve if had 2 different solutions
        double x1 = ( -b + Math.sqrt(d) )/( 2.0*a );
        double x2 = ( -b - Math.sqrt(d) )/( 2.0*a );

        String line1 = "x1 = "+Math.round(x1*100.0)/100.0;
        String line2 = "x2 = "+Math.round(x2*100.0)/100.0;

        List<String> lines = new ArrayList<>();
        lines.add(line1);
        lines.add(line2);
        ObservableList<String> linesFX = FXCollections.observableList(lines);
        listview_Solution.setItems(linesFX);
    }
}