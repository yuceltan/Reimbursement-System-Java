package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.Optional;


public class HelloController  {
    @FXML
    private Button adminButton;

    @FXML
    private Label screenlabel;

    @FXML
    private Button userButton;

    //@FXML
    //void userStart(KeyEvent event) {

    //}
    @FXML
   private Pane mainwindow;

    @FXML
    private Label endTotal;




    public void adminStart(ActionEvent actionEvent) throws IOException {
        System.out.println("You are admin right now ");
        screenlabel.setText("Logging as a admin.....");
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainwindow.getScene().getWindow());

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("adminScreen.fxml"));

        dialog.setTitle("AdminMainScreen");
        dialog.getDialogPane().setContent(fxmlLoader.load());
        dialog.getDialogPane().getButtonTypes().add(ButtonType.APPLY);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();

        if(result.get() == ButtonType.APPLY){
                //adminController dialogController = fxmlLoader.getController();



        }


    }
    public void userStart(ActionEvent actionEvent) throws IOException {
        System.out.println("You are user right now ");
        screenlabel.setText("Logging as a user.....");
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainwindow.getScene().getWindow());

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("userScreen.fxml"));

        dialog.setTitle("UserMainScreen");
        dialog.getDialogPane().setContent(fxmlLoader.load());
        dialog.getDialogPane().getButtonTypes().add(ButtonType.APPLY);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        userController dialogController1 = fxmlLoader.getController();
        dialogController1.comboMethod();

        if(result.get() == ButtonType.APPLY){
            userController dialogController = fxmlLoader.getController();
            dialogController.newMethodUser();
            dialogController.comboMethod();
            dialogController.calculateMethod();
           // dialogController.calculateMethod2();
            endTotal.setText("Working");




        }

    }



}