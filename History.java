/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.util.ArrayList;

/**
 *
 * @author HossamRezk
 */
public class History {
    ArrayList<String> myList = new ArrayList<String>(5);
   // private String[] array = new String[5];
    int index = 4;
    int u = 0;
    int num = 0;

    public History() {

    }

    public void  history(String operation) {

        //ArrayList<String> myList = new ArrayList<String>(5);

        // int i =0;
        myList.add(operation);

        if (myList.size() > 5) {
            myList.remove(0);
            // myList.add(i,operation);

        }
      num = myList.size();
      u = myList.size();
      
     //System.out.println(myList.get(u));
     //u++;
    }

    public String prev() {
     if(u<=0){
         u=-1;
       return "No more history";
   }    
   u--;  
   String y = myList.get(u);
   
  
    return y;
    }

    public String next() {
     if(u>=myList.size()-1){
         u=myList.size();
         return "No more history";
         
     }
     u++;
     String y = myList.get(u);
     
     
     return y;
    }

}