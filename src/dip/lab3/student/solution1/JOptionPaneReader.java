/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author CPerera
 */
public class JOptionPaneReader implements Reader {
    private String input;

    
    @Override
    public final String readLine(){
    input = JOptionPane.showInputDialog("Please Enter your message: ");
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