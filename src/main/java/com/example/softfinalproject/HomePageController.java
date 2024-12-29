package com.example.softfinalproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import static com.example.softfinalproject.HelloApplication.mainStage;

public class HomePageController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BookTable;
    @FXML
    void BookTableButton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BookATable.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1330, 700);
        mainStage.setTitle("Hello!");
        mainStage.setScene(scene);
        mainStage.show();
    }

    @FXML
    void FifthPageReturn(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FifthPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1330, 700);
        mainStage.setTitle("Hello!");
        mainStage.setScene(scene);
        mainStage.show();
    }

    @FXML
    void FourthPageReturn(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FourthPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1330, 750);
        mainStage.setTitle("Hello!");
        mainStage.setScene(scene);
        mainStage.show();
    }

    @FXML
    void SecondPageReturn(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SecondPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1330, 700);
        mainStage.setTitle("Hello!");
        mainStage.setScene(scene);
        mainStage.show();
    }

    @FXML
    void SixthPageReturn(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SixthPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1330, 700);
        mainStage.setTitle("Hello!");
        mainStage.setScene(scene);
        mainStage.show();
    }

    @FXML
    void ThirdPageReturn(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ThirdPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1330, 700);
        mainStage.setTitle("Hello!");
        mainStage.setScene(scene);
        mainStage.show();
    }

    @FXML
    void initialize() {
        assert BookTable != null : "fx:id=\"BookTable\" was not injected: check your FXML file 'FirstPage.fxml'.";

    }

}
