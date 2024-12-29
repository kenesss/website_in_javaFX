package com.example.softfinalproject;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import static com.example.softfinalproject.HelloApplication.mainStage;

public class BookTableController {

    @FXML
    private Button Book;

    @FXML
    private Button Home;

    @FXML
    private DatePicker datePicker;

    @FXML
    private ComboBox<String> hourComboBox;

    @FXML
    private TextField reserveName;

    @FXML
    private TextField tableNum;
    private static final TableBookingSystem tableBookingSystem = new TableBookingSystem();

    @FXML
    void setOnAction(ActionEvent event) throws IOException {
        TableBookingCommand tableBookingAdapter = new TableBookingCommand(tableBookingSystem);
        String tableName =reserveName.getText();
        String tableNo = (tableNum.getText());
        LocalDate date = datePicker.getValue();
        int hour = Integer.parseInt(hourComboBox.getValue());
        LocalDateTime dateTime = LocalDateTime.of(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), hour,0);
        tableBookingAdapter.bookTable(tableNo, dateTime);
        System.out.println(tableName + ", " + date + ", " + tableNo);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("OrderMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1354, 721);
        mainStage.setTitle("Hello!");
        mainStage.setScene(scene);
        mainStage.show();
    }

    @FXML
    void HomePageButton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FirstPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1330, 700);
        mainStage.setTitle("Hello!");
        mainStage.setScene(scene);
        mainStage.show();
    }

    @FXML
    void initialize() {
        assert Home != null : "fx:id=\"Home\" was not injected: check your FXML file 'BookATable.fxml'.";
        for (int i = 0; i < 24; i++) {
            hourComboBox.getItems().add(String.format("%02d",i));
        }
    }

}
