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
 * @author HossamRezk
 */
public class Transcations {
    project myproject;
    Depositamount amount1;
    Scene scene;
    JavaFXApplication1 javafxapplication1;
    Amount amount;
    Stage stage;
    History myhistory;
    int index =0;
    int index1=4;
    public Transcations(Stage stage,History myhistory){
      this.stage = stage ;        
      this.myhistory = myhistory;
    }
    public void draw(){
        myproject = new project();
        Button withdraw = new Button("     withdraw      ");
        Button deposit = new Button("     deposit     ");
        Button balanceinquiry = new Button(" balanceinquiry ");
        Button previous= new Button("      previous      ");
        Button next = new Button("       next        ");
        Label balanceLabel = new Label();
        Label historyLabel = new Label();
        GridPane grid = new GridPane();
        grid.add(withdraw, 0, 0);
        grid.add(deposit, 1, 0);
        grid.add(balanceinquiry, 0, 2);
        grid.add(previous, 0, 1);
        grid.add(next, 1, 1);
        grid.add(balanceLabel,1, 10); 
        grid.add(historyLabel, 1, 11); 
        
       
        previous.setOnAction(new EventHandler<ActionEvent>() {
          
            @Override
            public void handle(ActionEvent event) {
              //index --;
              
              historyLabel.setText(myhistory.prev());
            //stage.setScene(javafxapplication1.getScene());
                
            }
        });
         next.setOnAction(new EventHandler<ActionEvent>() {
          
            @Override
            public void handle(ActionEvent event) {
                
              //index1++;
              historyLabel.setText(myhistory.next());
            //stage.setScene(javafxapplication1.getScene());
                
            }
        });
        
        
        
        
        
        withdraw.setOnAction(new EventHandler<ActionEvent>() {
          
            @Override
            public void handle(ActionEvent event) {
                
            stage.setScene(amount.getScene());
            
             
            //String x = amount.getAmount();
            
            //myproject.withdraw(x);
                
            }
        });
        
        deposit.setOnAction(new EventHandler<ActionEvent>() {
          
            @Override
            public void handle(ActionEvent event) {
                
            stage.setScene(amount1.getScene());
            
            
                
            }
        });
        
         balanceinquiry.setOnAction(new EventHandler<ActionEvent>() {
          
            @Override
            public void handle(ActionEvent event) {
              
           int x =amount1.myproject.getCurrentBalance();
           balanceLabel.setText("Your balance is "+x);   
          // String z = balanceLabel.getText();
            String z = " Balanceinquiry : " +x;
            myhistory.history(z);
            }
        });
        
        
        
        scene = new Scene(grid,600,400); 
    }
    
    public Scene getScene(){
        return scene;
    }
    public void setJavaFXApplication1(JavaFXApplication1 javafxapplication1){
      this.javafxapplication1 = javafxapplication1;
    }
     public void setAmount(Amount amount){
      this.amount = amount;
    }
    public void setDepositamount(Depositamount amount1){
      this.amount1 = amount1;
    } 
}
