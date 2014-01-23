/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Compiler;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Anders
 */
public class mp 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        if (0 < args.length) 
        {
        String filename = args[0];
        File file = new File(filename);
        readFile(file);
        }
    }
    public static File readFile(File file) throws IOException 
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	int c = 0;
	while((c = buffer.read()) != -1) {
		char character = (char) c;
		System.out.println(character);
	}
        return file;
    }
}