/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inkey;

/**
 *
 * @author user
 */
public class Inkey {

   //create constructor
    public Inkey(String a){
        //print pinkky's value
        System.out.println(a);  
    }
    public Inkey (String p,String q,String r){
        System.out.println(p + " "+r);//pinky donkey
        System.out.println(r + " "+q);//donkey monkey
        System.out.println(p + " "+r+" "+q);//pinkey donkey monkey
    }
    public static void main(String[] args) {
        
  String blinky="pinkey"; //local variable
    String rinky="monkey";//local variable
      String pinky="donkey";//local variable
      
      Inkey ponkey=new Inkey (pinky);
      //create an object an call to constructor
      Inkey ponkey2=new Inkey(blinky,rinky,pinky);
      //create another object and call to constructor
    }
    
}
