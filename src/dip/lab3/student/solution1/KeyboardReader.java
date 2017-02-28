/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author CPerera
 */
public class KeyboardReader implements Reader {
    private String input;
    private final Scanner keyboard = new Scanner(System.in);

    
    @Override
    public final String readLine(){
    System.out.println("Please Enter your message: ");
    input = keyboard.nextLine();
    setInput(input);
    return (getInput());
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