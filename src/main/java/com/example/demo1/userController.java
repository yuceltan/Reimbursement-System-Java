package com.example.demo1;

import WithoutUI.Receipts;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class userController  {


    private static double rate1 = 0.3;//0.3 default
    private static  int rate = 15;//15 default


    @FXML
    private CheckBox carCheckId;

    @FXML
    private static TextField dayId;

    @FXML
    private ComboBox<String> dropdownId;

    @FXML
    private Label totalCalcuId;



    //car check
    public void newMethodUser()  {
        System.out.println("");


    }
    public void comboMethod(){
        ObservableList<String> data = FXCollections.observableArrayList("text1", "text2", "text3");
        dropdownId = new ComboBox<>(data);
        System.out.println("Added");

    }

    // FOR ONLY NORMAL RECEIPTS
    public static void calculateMethod(){

        String a = dayId.getText().trim();
        int c =Integer.parseInt(a);
        Receipts userNew= new Receipts();
        userNew.enterDays(c);
        int results = userNew.enterDays(c);

    }


    public static void calculateMethod2(){

        String a = dayId.getText().trim();
        int c =Integer.parseInt(a);
        double summary1 = rate1*c;
        System.out.println(rate1+"$/ per day");
        System.out.println("total amount is :"+summary1);


    }




}
