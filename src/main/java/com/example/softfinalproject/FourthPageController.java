package com.example.softfinalproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import static com.example.softfinalproject.HelloApplication.mainStage;

public class FourthPageController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text Description1;

    @FXML
    private Text Description2;

    @FXML
    private Text Description3;

    @FXML
    private Text Description4;

    @FXML
    private Text Description5;

    @FXML
    private Text Description6;

    @FXML
    private Text Description7;

    @FXML
    private Text Description8;

    @FXML
    private Text FoodName1;

    @FXML
    private Text FoodName2;

    @FXML
    private Text FoodName3;

    @FXML
    private Text FoodName4;

    @FXML
    private Text FoodName5;

    @FXML
    private Text FoodName6;

    @FXML
    private Text FoodName7;

    @FXML
    private Text FoodName8;

    @FXML
    private Button Home;

    @FXML
    private ImageView Image1;

    @FXML
    private ImageView Image2;

    @FXML
    private ImageView Image3;

    @FXML
    private ImageView Image4;

    @FXML
    private ImageView Image5;

    @FXML
    private ImageView Image6;

    @FXML
    private ImageView Image7;

    @FXML
    private ImageView Image8;

    @FXML
    private Text Price1;

    @FXML
    private Text Price2;

    @FXML
    private Text Price3;

    @FXML
    private Text Price4;

    @FXML
    private Text Price5;

    @FXML
    private Text Price6;

    @FXML
    private Text Price7;

    @FXML
    private Text Price8;
    @FXML
    void HomeButtonPage(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FirstPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1330, 700);
        mainStage.setTitle("Hello!");
        mainStage.setScene(scene);
        mainStage.show();
    }

    @FXML
    void All(MouseEvent event) {
        setVisibility();
        Image1.setVisible(true);
        Image2.setVisible(true);
        Image3.setVisible(true);
        Image4.setVisible(true);
        Image5.setVisible(true);
        Image6.setVisible(true);
        Image7.setVisible(true);
        Image8.setVisible(true);
        FoodName1.setVisible(true);
        FoodName2.setVisible(true);
        FoodName3.setVisible(true);
        FoodName4.setVisible(true);
        FoodName5.setVisible(true);
        FoodName6.setVisible(true);
        FoodName7.setVisible(true);
        FoodName8.setVisible(true);
        Description1.setVisible(true);
        Description2.setVisible(true);
        Description3.setVisible(true);
        Description4.setVisible(true);
        Description5.setVisible(true);
        Description6.setVisible(true);
        Description7.setVisible(true);
        Description8.setVisible(true);
        Price1.setVisible(true);
        Price2.setVisible(true);
        Price3.setVisible(true);
        Price4.setVisible(true);
        Price5.setVisible(true);
        Price6.setVisible(true);
        Price7.setVisible(true);
        Price8.setVisible(true);
    }

    @FXML
    void Spicy(MouseEvent event) {
        setVisibility();
        Image3.setVisible(true);
        Image8.setVisible(true);
        FoodName3.setVisible(true);
        FoodName8.setVisible(true);
        Description3.setVisible(true);
        Description8.setVisible(true);
        Price3.setVisible(true);
        Price8.setVisible(true);
    }

    @FXML
    void Classic(MouseEvent event) {
        setVisibility();
        Image1.setVisible(true);
        Image2.setVisible(true);
        FoodName1.setVisible(true);
        FoodName2.setVisible(true);
        Description1.setVisible(true);
        Description2.setVisible(true);
        Price1.setVisible(true);
        Price2.setVisible(true);
    }

    @FXML
    void Cheese(MouseEvent event) {
        setVisibility();
        Image4.setVisible(true);
        Image5.setVisible(true);
        FoodName4.setVisible(true);
        FoodName5.setVisible(true);
        Description4.setVisible(true);
        Description5.setVisible(true);
        Price4.setVisible(true);
        Price5.setVisible(true);
    }

    @FXML
    void Chicken(MouseEvent event){
        setVisibility();
        Image6.setVisible(true);
        FoodName6.setVisible(true);
        Description6.setVisible(true);
        Price6.setVisible(true);
    }

    @FXML
    void Qazaq(MouseEvent event) {
        setVisibility();
        Image7.setVisible(true);
        FoodName7.setVisible(true);
        Description7.setVisible(true);
        Price7.setVisible(true);
    }

    private void setVisibility() {
        Image1.setVisible(false);
        Image2.setVisible(false);
        Image3.setVisible(false);
        Image4.setVisible(false);
        Image5.setVisible(false);
        Image6.setVisible(false);
        Image8.setVisible(false);
        Image7.setVisible(false);
        FoodName1.setVisible(false);
        FoodName2.setVisible(false);
        FoodName3.setVisible(false);
        FoodName4.setVisible(false);
        FoodName5.setVisible(false);
        FoodName6.setVisible(false);
        FoodName7.setVisible(false);
        FoodName8.setVisible(false);
        Description1.setVisible(false);
        Description2.setVisible(false);
        Description3.setVisible(false);
        Description4.setVisible(false);
        Description5.setVisible(false);
        Description6.setVisible(false);
        Description7.setVisible(false);
        Description8.setVisible(false);
        Price1.setVisible(false);
        Price2.setVisible(false);
        Price3.setVisible(false);
        Price4.setVisible(false);
        Price5.setVisible(false);
        Price6.setVisible(false);
        Price7.setVisible(false);
        Price8.setVisible(false);
    }

    @FXML
    void initialize() {
        assert Description1 != null : "fx:id=\"Description1\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Description2 != null : "fx:id=\"Description2\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Description3 != null : "fx:id=\"Description3\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Description4 != null : "fx:id=\"Description4\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Description5 != null : "fx:id=\"Description5\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Description6 != null : "fx:id=\"Description6\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Description7 != null : "fx:id=\"Description7\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Description8 != null : "fx:id=\"Description8\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert FoodName1 != null : "fx:id=\"FoodName1\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert FoodName2 != null : "fx:id=\"FoodName2\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert FoodName3 != null : "fx:id=\"FoodName3\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert FoodName4 != null : "fx:id=\"FoodName4\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert FoodName5 != null : "fx:id=\"FoodName5\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert FoodName6 != null : "fx:id=\"FoodName6\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert FoodName7 != null : "fx:id=\"FoodName7\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert FoodName8 != null : "fx:id=\"FoodName8\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Home != null : "fx:id=\"Home\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Image1 != null : "fx:id=\"Image1\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Image2 != null : "fx:id=\"Image2\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Image3 != null : "fx:id=\"Image3\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Image4 != null : "fx:id=\"Image4\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Image5 != null : "fx:id=\"Image5\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Image6 != null : "fx:id=\"Image6\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Image7 != null : "fx:id=\"Image7\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Image8 != null : "fx:id=\"Image8\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Price1 != null : "fx:id=\"Price1\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Price2 != null : "fx:id=\"Price2\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Price3 != null : "fx:id=\"Price3\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Price4 != null : "fx:id=\"Price4\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Price5 != null : "fx:id=\"Price5\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Price6 != null : "fx:id=\"Price6\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Price7 != null : "fx:id=\"Price7\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert Price8 != null : "fx:id=\"Price8\" was not injected: check your FXML file 'FourthPage.fxml'.";

    }

}
