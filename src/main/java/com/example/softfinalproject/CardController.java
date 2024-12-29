package com.example.softfinalproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import static com.example.softfinalproject.HelloApplication.mainStage;

public class CardController implements PaymentController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField CVVField;

    @FXML
    private TextField CardNOField;

    @FXML
    private TextField DateField;

    @FXML
    private TextField NameField;
    private Random rand;


    @FXML
    void PayButton(ActionEvent event) throws IOException {
        processPayment();
    }

    @FXML
    void initialize() {

    }

    @Override
    public void processPayment() throws IOException {
        if(CardNOField.getText().length()>16 || CardNOField.getText().length()<16){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("CARD NUMBER SHOULD CONTAINS ONLY 16 NUMBERS");
            alert.showAndWait();
        } else if(CardNOField.getText().isEmpty() || DateField.getText().isEmpty() || NameField.getText().isEmpty() || CVVField.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("FIELDS ARE EMPTY");
            alert.showAndWait();
        }else{
            rand = new Random();
            int randomNumber = rand.nextInt(8999) + 1000;
            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("code.txt"))){
                bufferedWriter.write(randomNumber +"\n");
            }
            System.out.println(randomNumber);
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Code.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 356, 211);
            mainStage.setTitle("Hello!");
            mainStage.setScene(scene);
            mainStage.show();
        }
    }
}
