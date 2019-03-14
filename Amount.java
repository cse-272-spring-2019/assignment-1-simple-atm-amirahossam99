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
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author AmiraHossam
 */
public class Amount {
    Depositamount amount1;
    Amount amount;
    String amountnumber;
    Scene scene;
    Stage stage;
    Transcations transactions;
    project myproject;
    History myhistory;
    public Amount(Stage stage,project myproject,History myhistory){
       this.stage = stage;
      this.myproject = myproject;
      this.myhistory = myhistory;
    }
    public void draw(){
       
        Button zero = new Button("     0     ");
        Button one = new Button("     1     ");
        Button two = new Button("     2     ");
        Button three = new Button("     3     ");
        Button four = new Button("     4     ");
        Button five = new Button("     5     ");
        Button six = new Button("     6     ");
        Button seven = new Button("     7     ");
        Button eight = new Button("     8     ");
        Button nine = new Button("     9     ");
        Button submit = new Button("  Enter  ");
        Button back = new Button("  Back  ");
        Button clear = new Button("  clear  ");
        Label amountLabel = new Label();
        Label checkLabel = new Label();
        GridPane grid = new GridPane();
        grid.add(submit,2,4);
        grid.add(back, 2, 5);
        grid.add(zero, 0, 4);
        grid.add(clear,1,4);
        grid.add(one, 0, 1);
        grid.add(two, 1, 1);
        grid.add(three, 2, 1);
        grid.add(four, 0, 2);
        grid.add(five, 1, 2);
        grid.add(six, 2, 2);
        grid.add(seven, 0, 3);
        grid.add(eight, 1, 3);
        grid.add(nine, 2, 3);
        grid.add(checkLabel,7,8);
        grid.add(amountLabel, 0, 0);
        amountLabel.setText("");
        submit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
              String amountnumber = amountLabel.getText();
            int x =  myproject.getCurrentBalance();
            int result = Integer.parseInt(amountLabel.getText());
            if(x<result){
               checkLabel.setText("You don't have enough balance to withdraw");
                 
            }else{
            myproject.withdraw(amountnumber);
             String z = " wihtdraw : " +amountLabel.getText();
            myhistory.history(z);
            }
           
              
                
            }
        });
       back.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
              
           stage.setScene(transactions.getScene());
               
              
                
            }
        });
         clear.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
              
           amountLabel.setText("");
               
              
                
            }
        });
        
        
        one.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
     
               amountLabel.setText(amountLabel.getText()+"1");
              
                
            }
        });
        two.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               amountLabel.setText(amountLabel.getText()+"2");
              
                
            }
        });
        three.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               amountLabel.setText(amountLabel.getText()+"3");
              
                
            }
        });
        four.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               amountLabel.setText(amountLabel.getText()+"4");
              
                
            }
        });
        five.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               amountLabel.setText(amountLabel.getText()+"5");
              
                
            }
        });
        six.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               amountLabel.setText(amountLabel.getText()+"6");
              
                
            }
        });
        seven.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               amountLabel.setText(amountLabel.getText()+"7");
              
                
            }
        });
        eight.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               amountLabel.setText(amountLabel.getText()+"8");
              
                
            }
        });
        nine.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               amountLabel.setText(amountLabel.getText()+"9");
              
                
            }
        });
        zero.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               amountLabel.setText(amountLabel.getText()+"0");
              
                
            }
        });      
       // String amountnumber = amountLabel.getText();
        scene = new Scene(grid,600,400);
     //return amountnumber;   
    }
     public Scene getScene(){
        return scene;
    }
    /* public String getAmount(){
         String y = amount.draw();
        return y;
     }*/
     public void setTranscations(Transcations transactions){
      this.transactions = transactions;
    }  
    
     }
