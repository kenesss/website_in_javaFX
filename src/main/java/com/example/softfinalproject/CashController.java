package com.example.softfinalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CashController implements PaymentController {

    @FXML
    private Label TotalPrice;

    @FXML
    private TextField UserCashField;



    @FXML
    void GiveButton(ActionEvent event) throws IOException {
        processPayment();
    }
    @FXML
    void initialize() {
        assert TotalPrice != null : "fx:id=\"TotalPrice\" was not injected: check your FXML file 'Cash.fxml'.";
        assert UserCashField != null : "fx:id=\"UserCashField\" was not injected: check your FXML file 'Cash.fxml'.";
        TotalPrice.setText(String.valueOf(OrderMenuController1.totalPrice));
        TotalPrice.setVisible(true);
    }
    @Override
    public void processPayment() throws IOException {
        double change = Double.parseDouble(TotalPrice.getText())-Double.parseDouble(UserCashField.getText());
        if(Double.parseDouble(TotalPrice.getText())>Double.parseDouble(UserCashField.getText())){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Not enough money");
            alert.showAndWait();
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("YOUR CHANGE IS $"+change);
            alert.showAndWait();
        }
    }
}
