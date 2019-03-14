/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.util.HashMap;

/**
 *
 * @author AmiraHossam
 */
public class Logic {
   // HashMap usersDictionary;
    public Logic(){
   // usersDictionary = new HashMap();
   // usersDictionary.put("amira","1234");
}
    
    public boolean validate(/*String username,*/String cardnumber){
        boolean validationresult;
        String x = "1234";
        if(x.equals(cardnumber)){
           validationresult = x.equals(cardnumber);
        }else{
         validationresult =  false;   
        }
                return validationresult;
    }        
        //String fetchednumber = "1234";
       //String fetchednumber = (String) usersDictionary.get(username);
      // if(fetchednumber!=null){
        //   validationresult = fetchednumber.equals(cardnumber);
           
       //}else{
         //  validationresult=false;
       //}
        //return validationresult;
    
    
    
    
    
}
