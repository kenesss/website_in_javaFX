package com.example.softfinalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static com.example.softfinalproject.HelloApplication.mainStage;

public class CodeController {

    @FXML
    private TextField CodeField;

    @FXML
    void CheckButton(ActionEvent event) throws IOException {
        String field = CodeField.getText();
        File file = new File("code.txt");
        Scanner datenta = new Scanner(file);
        String randomNum = datenta.next();

        if(field.equals(randomNum)){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Thank you for choosing us");
            alert.showAndWait();
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Code is incorrect.Please enter again!");
            alert.showAndWait();
        }
    }

}
