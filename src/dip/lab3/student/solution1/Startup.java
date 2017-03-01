/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author CPerera
 */
public class Startup {
     public static void main(String[] args) {
        
//        Reader reader = new KeyboardReader();
//        Writer writer = new ConsoleWriter();


        Reader reader = new RandomArrayMessageReader();
        Writer writer = new JOptionPaneWriter();
         
                 
        MessagingSystem message = new MessagingSystem(reader,writer);
        message.sendMessage();
     
        
    }
}
