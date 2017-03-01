/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author CPere
 */
public class MessagingSystem {
    Reader reader;
    Writer writer;

    public MessagingSystem(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }
    
    public final void sendMessage(){
        writer.writeLine(reader.readLine());
    }
    
}
