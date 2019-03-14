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
public class project {
    private int balance;
	
	public project( ){

	}
	
	
	public int getCurrentBalance(){
		return balance;
	}
	public void withdraw(String amount){
                int result = Integer.parseInt(amount);
		if(result<=balance){
			balance=balance-result;
                        System.out.println("your balance is"+balance);
		}else{
			System.out.println("You don't have enough balance to withdraw");
		}
        	
	}
	public void deposit(String amount){
                int result = Integer.parseInt(amount);       
		balance=balance+result;
                System.out.println("your balance is "+balance);
		
		
	}
	//public String prev(){
		
	//}
	//public String next(){
		
	//}
    
    
    
    
}
