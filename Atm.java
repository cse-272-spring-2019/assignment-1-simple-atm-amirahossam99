/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

/**
 *
 * @author HossamRezk
 */
import javafx.application.Application;
import javafx.stage.Stage;
public class Atm  extends Application{
     public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
         primaryStage.setTitle("ATM");
         History myhistory = new History();
         project myproject = new project();
         JavaFXApplication1 javafxapplication1 = new JavaFXApplication1(primaryStage);
         Amount amount = new Amount(primaryStage,myproject,myhistory);
         Depositamount amount1 = new Depositamount(primaryStage,myproject,myhistory);
         Transcations transactions = new Transcations(primaryStage,myhistory);
         transactions.draw();
         javafxapplication1.draw();
         amount.draw();
         amount1.draw();
         
         javafxapplication1.setTranscations(transactions);
         transactions.setJavaFXApplication1(javafxapplication1);
         transactions.setAmount(amount);
         transactions.setDepositamount(amount1);
         amount.setTranscations(transactions);
         amount1.setTranscations(transactions);
         primaryStage.setScene(javafxapplication1.getScene());
         primaryStage.show();
         
    }
}
