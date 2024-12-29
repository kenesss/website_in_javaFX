package com.example.softfinalproject;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import static com.example.softfinalproject.HelloApplication.mainStage;

public class OrderMenuController1 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Spinner<Integer> spinner1;

    @FXML
    private Spinner<Integer> spinner2;

    @FXML
    private Spinner<Integer> spinner3;

    @FXML
    private Spinner<Integer> spinner4;

    @FXML
    private Spinner<Integer> spinner5;

    @FXML
    private Spinner<Integer> spinner6;

    @FXML
    private Spinner<Integer> spinner7;

    @FXML
    private Spinner<Integer> spinner8;

    @FXML
    private Spinner<Integer> spinner9;
    private int currentValue = 0;
    public static int totalPrice = 0;
    @FXML
    private Label TotalPriceLabel;

    private Connection connection;
    private static String dbName = "finalSoft";
    private static String username = "postgres";
    private static String password = "Nazarov2005";
    @FXML
    private ListView<Types> ListViewBill;
    @FXML
    private Button CardButton;
    @FXML
    private Button CashButton;
    @FXML
    void PayButton(ActionEvent ae) {
        setVisibility();
        CardButton.setVisible(true);
        CashButton.setVisible(true);
    }
    public void setVisibility(){
        CardButton.setVisible(false);
        CashButton.setVisible(false);
    }
    @FXML
    void CardButton(ActionEvent ae) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Card.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 498, 327);
        mainStage.setTitle("Hello!");
        mainStage.setScene(scene);
        mainStage.show();
    }
    @FXML
    void CashButton(ActionEvent ae) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Cash.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 498, 327);
        mainStage.setTitle("Hello!");
        mainStage.setScene(scene);
        mainStage.show();
    }

    @FXML
    void add1(ActionEvent event) {
        int value1 = spinner1.getValue();
        Burger burger = new SpicyBurger();
        if(value1!=0) {
            Types type = new Types(burger.assemble(), value1, burger.price());
            Check(type);
            totalPrice += burger.price() * value1;
            TotalPriceLabel.setText(String.valueOf(totalPrice));
        }
    }

    @FXML
    void add2(ActionEvent event) {
        int value2 = spinner2.getValue();
        Burger burger = new ClassicBurger();
        if(value2!=0) {
            Types type = new Types(burger.assemble(), value2, burger.price());
            Check(type);
            totalPrice += burger.price() * value2;
            TotalPriceLabel.setText(String.valueOf(totalPrice));
        }
    }

    @FXML
    void add3(ActionEvent event) {
        int value3 = spinner3.getValue();
        Burger burger = new CheeseBurger();
        if(value3!=0) {
            Types type = new Types(burger.assemble(), value3, burger.price());
            Check(type);
            totalPrice += burger.price() * value3;
            TotalPriceLabel.setText(String.valueOf(totalPrice));
        }
    }

    @FXML
    void add4(ActionEvent event) {
        int value4 = spinner4.getValue();
        Burger burger = new AngryBurger();
        if(value4!=0) {
            Types type = new Types(burger.assemble(), value4, burger.price());
            Check(type);
            totalPrice += burger.price() * value4;
            TotalPriceLabel.setText(String.valueOf(totalPrice));
        }
    }

    @FXML
    void add5(ActionEvent event) {
        int value5 = spinner5.getValue();
        Burger burger = new DoubleHumBurger();
        if(value5!=0) {
            Types type = new Types(burger.assemble(), value5, burger.price());
            Check(type);
            totalPrice += burger.price() * value5;
            TotalPriceLabel.setText(String.valueOf(totalPrice));
        }
    }

    @FXML
    void add6(ActionEvent event) {
        int value6 = spinner6.getValue();
        Burger burger = new CheeseBurger();
        if(value6!=0) {
            Types type = new Types(burger.assemble(), value6, burger.price());
            Check(type);
            totalPrice += burger.price() * value6;
            TotalPriceLabel.setText(String.valueOf(totalPrice));
        }
    }

    @FXML
    void add7(ActionEvent event) {
        int value7 = spinner7.getValue();
        Burger burger = new PineappleBurger();
        if(value7!=0) {
            Types type = new Types(burger.assemble(), value7, burger.price());
            Check(type);
            totalPrice += burger.price() * value7;
            TotalPriceLabel.setText(String.valueOf(totalPrice));
        }
    }

    @FXML
    void add8(ActionEvent event) {
        int value8 = spinner8.getValue();
        Burger burger = new DoubleCheeseBurger();
        if(value8!=0) {
            Types type = new Types(burger.assemble(), value8, burger.price());
            Check(type);
            totalPrice += burger.price() * value8;
            TotalPriceLabel.setText(String.valueOf(totalPrice));
        }
    }

    @FXML
    void add9(ActionEvent event) {
        int value9= spinner9.getValue();
        Burger burger = new QazaqBurger();
        if(value9!=0) {
            Types type = new Types(burger.assemble(), value9, burger.price());
            Check(type);
            totalPrice += burger.price() * value9;
            TotalPriceLabel.setText(String.valueOf(totalPrice));
        }
    }
    @FXML
    void RemoveButton(ActionEvent ae) {
        Types selectedItem = ListViewBill.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            ListViewBill.getItems().remove(selectedItem);
            totalPrice-= selectedItem.getQuantity()* selectedItem.getPrice();
            TotalPriceLabel.setText(String.valueOf(totalPrice));
        } else {
            System.out.println("No item selected to remove.");
        }
    }
    private void Check(Types type) {
        try {
            if (connection == null || connection.isClosed()) {
                establishConnection();
            }

            if (connection != null) {
                ObservableList<Types> data = addValue(type);
                ListViewBill.getItems().addAll(data);
            } else {
                System.out.println("Database connection failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void establishConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbName, username, password);
            System.out.println("Database connection succeeded");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Types> addValue(Types type){
        ObservableList<Types> data = FXCollections.observableArrayList();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into orderMenu(productName,quantity,price) values(?,?,?)");
            preparedStatement.setString(1, type.getProductName());
            preparedStatement.setInt(2,type.getQuantity());
            preparedStatement.setInt(3,type.getPrice());
            preparedStatement.executeUpdate();
            data.add(type);
        }catch (Exception e){
            e.getMessage();
        }
        return data;
    }

    public

    @FXML
    void initialize() {
        assert spinner1 != null : "fx:id=\"spinner1\" was not injected: check your FXML file 'OrderMenu.fxml'.";
        assert spinner2 != null : "fx:id=\"spinner2\" was not injected: check your FXML file 'OrderMenu.fxml'.";
        assert spinner3 != null : "fx:id=\"spinner3\" was not injected: check your FXML file 'OrderMenu.fxml'.";
        assert spinner4 != null : "fx:id=\"spinner4\" was not injected: check your FXML file 'OrderMenu.fxml'.";
        assert spinner5 != null : "fx:id=\"spinner5\" was not injected: check your FXML file 'OrderMenu.fxml'.";
        assert spinner6 != null : "fx:id=\"spinner6\" was not injected: check your FXML file 'OrderMenu.fxml'.";
        assert spinner7 != null : "fx:id=\"spinner7\" was not injected: check your FXML file 'OrderMenu.fxml'.";
        assert spinner8 != null : "fx:id=\"spinner8\" was not injected: check your FXML file 'OrderMenu.fxml'.";
        assert spinner9 != null : "fx:id=\"spinner9\" was not injected: check your FXML file 'OrderMenu.fxml'.";

        SpinnerValueFactory<Integer> valueFactory1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10);
        valueFactory1.setValue(currentValue);
        SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10);
        valueFactory2.setValue(currentValue);
        SpinnerValueFactory<Integer> valueFactory3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10);
        valueFactory3.setValue(currentValue);
        SpinnerValueFactory<Integer> valueFactory4 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10);
        valueFactory4.setValue(currentValue);
        SpinnerValueFactory<Integer> valueFactory5 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10);
        valueFactory5.setValue(currentValue);
        SpinnerValueFactory<Integer> valueFactory6 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10);
        valueFactory6.setValue(currentValue);
        SpinnerValueFactory<Integer> valueFactory7 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10);
        valueFactory7.setValue(currentValue);
        SpinnerValueFactory<Integer> valueFactory8 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10);
        valueFactory8.setValue(currentValue);
        SpinnerValueFactory<Integer> valueFactory9 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10);
        valueFactory9.setValue(currentValue);

        initializeSpinner(spinner1, valueFactory1);
        initializeSpinner(spinner2, valueFactory2);
        initializeSpinner(spinner3, valueFactory3);
        initializeSpinner(spinner4, valueFactory4);
        initializeSpinner(spinner5, valueFactory5);
        initializeSpinner(spinner6, valueFactory6);
        initializeSpinner(spinner7, valueFactory7);
        initializeSpinner(spinner8, valueFactory8);
        initializeSpinner(spinner9, valueFactory9);

        System.out.println(valueFactory1.getValue());
    }


    private void initializeSpinner(Spinner<Integer> spinner, SpinnerValueFactory<Integer> valueFactory) {
        spinner.setValueFactory(valueFactory);

    }
}
class Types {
    String productName;
    int quantity;
    int price;

    public Types(String productName, int quantity, int price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
    public String toString(){
        return "productName is " + getProductName() + " that quantity is " + getQuantity() + " and price is " + getPrice();
    }
}

