/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Compiler;
import java.io.File;

/**
 *
 * @author Anders
 */
public class mp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        if (0 < args.length) 
        {
        String filename = args[0];
        File file = new File(filename);
        }
    }
    public static File openFile(File file)
    {
        //this is where code goes
        //do stuff with token reader
        //added third line
        return file;
    }
}
