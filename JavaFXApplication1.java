/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author HossamRezk
 */
public class JavaFXApplication1 {
    Scene scene;
    Logic logic;
    Stage stage;
    Transcations transactions;
    public JavaFXApplication1(Stage stage){
        this.stage = stage;
    }
    
    public void draw() {
        logic = new Logic();
        
        
        Label cardnumberLabel = new Label("cardnumber");
        //Label usernameLabel = new Label("username");
        TextField cardNumberField = new TextField();
       // TextField userNameField = new TextField();
        Button submit = new Button("Enter");
        
        Label validationLabel = new Label();
        GridPane grid = new GridPane();
        grid.add(cardnumberLabel, 0, 1);
       // grid.add(usernameLabel, 0, 0);
        //grid.add(userNameField, 1, 0);
        grid.add(cardNumberField, 1, 1);
        grid.add(submit, 1, 2);
        grid.add(validationLabel, 1, 3);
        submit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String cardnumber = cardNumberField.getText();
                //String username =  userNameField.getText();
               boolean valid = logic.validate(/*username,*/cardnumber);
                if(valid){
                    validationLabel.setText("choose your transaction");
                    stage.setScene(transactions.getScene());
                    
                }else{
                    validationLabel.setText("Invalid cardnumber");
                }
                
            }
        });
      
      scene = new Scene(grid,600,400);
    }

    /**
     * @param args the command line arguments
     */
    
    public Scene getScene(){
        return this.scene;
    }
    
    public void setTranscations(Transcations transactions){
        this.transactions = transactions;
    }
    
    
}
