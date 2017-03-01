/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author CPerera
 */
public class RandomArrayMessageReader implements Reader {
    private String input;
    private List <String> messageArray = new ArrayList <String>();

   

    public final void addMessagesToArray(){
      messageArray.add("The day is what you make it! So why not make it a great one?");
      messageArray.add("Write it on your heart that every day is the best day in the year.");
      messageArray.add("You cannot tailor-make the situations in life but you can tailor-make the attitudes to fit those situations.");
      messageArray.add("Being miserable is a habit; being happy is a habit; and the choice is yours.");
    }
    
       
    @Override
    public final String readLine(){
    addMessagesToArray();
    Random ranNumber = new Random();
    int i = ranNumber.nextInt(messageArray.size());
        return messageArray.get(i);
    }

  
   
    @Override
    public final String getInput() {
        return input;
    }

    
    @Override
    public final void setInput(String input) {
        if(input == null || input.isEmpty()){
        throw new IllegalArgumentException("The input cannot be null or empty");
        }
        this.input = input;
}
}