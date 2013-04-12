/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javashell;

import asg.cliche.Command;
import asg.cliche.ShellFactory;
import java.io.IOException;

/**
 *
 * @author 2015-15
 */
public class JavaShell {

    /**
     * @param args the command line arguments
     */
    
    @Command
    public String hello(String name) {
        return "Hello " + name;
    }
    
    @Command
    public int ResistorDecode(String StrOne, String StrTwo, String StrMul){
        return ElecUtils.ColorDecode(StrOne, StrTwo, StrMul);
    }
    
    @Command
    public String ResistorEncode(int value){
        return ElecUtils.ColorEncode(value);
    }
    
   public static void main(String[] args) throws IOException {
        ShellFactory.createConsoleShell("test", "A simple test shell.", new JavaShell())
            .commandLoop(); // and three.
    }
    
}
