package com.example.softfinalproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import static com.example.softfinalproject.HelloApplication.mainStage;

public class ThirdPageController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Home;

    @FXML
    void HomeButtonPage(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FirstPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1330, 700);
        mainStage.setTitle("Hello!");
        mainStage.setScene(scene);
        mainStage.show();
    }

    @FXML
    void initialize() {
        assert Home != null : "fx:id=\"Home\" was not injected: check your FXML file 'ThirdPage.fxml'.";

    }

}
