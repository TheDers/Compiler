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
 * @author DasRobotos
 */
class ReservedWords {

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
                return beginsA();
            case 'b':
                return beginsB();
            case 'd':
                return beginsD();
            case 'e':
                return beginsE();
            case 'f':
                return beginsF();
            case 'i':
                return beginsI();
            case 'm':
                return beginsM();
            case 'n':
                beginsN();
                break;
            case 'o':
                return beginsO();
            case 'p':
                return beginsP();
            case 'r':
                beginsR();
            case 't':
                return beginsT();
            case 'u':
                return beginsU();
            case 'v':
                return beginsV();
            case 'w':
                return beginsW();
            default:
                return" ";
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
    public String beginsB ()
    {
        
    }
    public String beginsD ()
    {
        
    }
    public String beginsE ()
    {
        
    }
    public String beginsF ()
    {
        
    }
    public String beginsI ()
    {
        
    }
    public String beginsM ()
    {
        
    }
    public String beginsN ()
    {
        
    }
    public String beginsO ()
    {
        
    }
    public String beginsP ()
    {
        
    }
    public String beginsR ()
    {
        
    }
    public String beginsT ()
    {
        
    }
    public String beginsU ()
    {
        
    }
    public String beginsV ()
    {
        
    }
    public String beginsW ()
    {
        
    }
    
}
