/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author CPere
 */
public class JOptionPaneWriter implements Writer {
    private String line;

       
    @Override
    public final void writeLine(String line){
        setLine(line);
        JOptionPane.showMessageDialog(null, getLine());
    }

    @Override
    public final String getLine() {
        return line;
    }

    @Override
    public final void setLine(String line) {
        if(line == null || line.isEmpty()){
        throw new IllegalArgumentException("The input cannot be null or empty");
        }
        this.line = line;
    }
    
}
