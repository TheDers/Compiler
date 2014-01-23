/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Compiler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Odin
 */
public class ReservedWords {
    BufferedReader buffer;
    File file;
    int row, column;
    char first_token;
    ReservedWords(File in_file, int in_row, int in_column, char in_first_token)
    {
        file = in_file;
        row = in_row;
        column = in_column;
        first_token = in_first_token;
    }
    public String getToken() throws FileNotFoundException, IOException
    {
        buffer = new BufferedReader(new FileReader(file));
        switch (first_token)
        {
            case 'a':
                String token;
                token = beginsA();
                break;
            case 'b':
                beginsB();
                break;
            case 'd':
                beginsD();
                break;
            case 'e':
                beginsE();
                break;
            case 'f':
                beginsF();
                break;
            case 'i':
                beginsI();
                break;
            case 'm':
                beginsM();
                break;
            case 'n':
                beginsN();
                break;
            case 'o':
                beginsO();
                break;
            case 'p':
                beginsP();
                break;
            case 'r':
                beginsR();
                break;
            case 't':
                beginsT();
                break;
            case 'u':
                beginsU();
                break;
            case 'v':
                beginsV();
                break;
            case 'w':
                beginsW();
                break;
            default:
                break;
        }
                
    }

    public String beginsA () throws IOException
    {
        int temp = 0;
        int r = 0;
        do
        {
            buffer.readLine();
            temp++;
        }while(temp<row);
        
        while ((r = buffer.read()) < column) {
            //do nothing
        }
        while((r = buffer.read()) != -1)
        {
            char ch = (char) r;
        }
    }
    public void beginsB ()
    {
        
    }
    public void beginsD ()
    {
        
    }
    public void beginsE ()
    {
        
    }
    public void beginsF ()
    {
        
    }
    public void beginsI ()
    {
        
    }
    public void beginsM ()
    {
        
    }
    public void beginsN ()
    {
        
    }
    public void beginsO ()
    {
        
    }
    public void beginsP ()
    {
        
    }
    public void beginsR ()
    {
        
    }
    public void beginsT ()
    {
        
    }
    public void beginsU ()
    {
        
    }
    public void beginsV ()
    {
        
    }
    public void beginsW ()
    {
        
    }
}
    
    
