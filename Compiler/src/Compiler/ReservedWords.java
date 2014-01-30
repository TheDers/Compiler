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
                return beginsN();
            case 'o':
                return beginsO();
            case 'p':
                return beginsP();
            case 'r':
                return beginsR();
            case 't':
                return beginsT();
            case 'u':
                return beginsU();
            case 'v':
                return beginsV();
            case 'w':
                return beginsW();
            default:
                return"Default on switch ";
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
            if(ch=='n')
            {
                r = buffer.read();
                ch = (char) r;
                if(r=='d')
                {
                    return "MP_AND";
                }
            }
        }
    }
    public String beginsB () throws IOException
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
            switch(ch)
            {
                case'e':
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch == 'g')
                    {
                        r = buffer.read();
                        ch = (char) r;
                        if(ch=='i')
                        {
                            r = buffer.read();
                            ch = (char) r;
                                if(ch=='n')
                                {
                                    return "MP_BEGIN";
                                }
                        }
                    }
                }
                case'o':
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch == 'o')
                    {
                        r = buffer.read();
                        ch = (char) r;
                        if(ch=='l')
                        {
                            r = buffer.read();
                            ch = (char) r;
                                if(ch=='e')
                                {
                                    r = buffer.read();
                                    ch = (char) r;
                                    if(ch=='n')
                                    {
                                        return "MP_BOOLEAN";
                                    }
                                }
                        }
                    }
                }
            }
        }
    }
    public String beginsD () throws IOException
    {
        
    }
    public String beginsE () throws IOException
    {
        
    }
    public String beginsF () throws IOException
    {
        
    }
    public String beginsI () throws IOException
    {
        
    }
    public String beginsM () throws IOException
    {
        
    }
    public String beginsN () throws IOException
    {
        
    }
    public String beginsO () throws IOException
    {
        
    }
    public String beginsP () throws IOException
    {
        
    }
    public String beginsR () throws IOException
    {
        
    }
    public String beginsT () throws IOException
    {
        
    }
    public String beginsU () throws IOException
    {
        
    }
    public String beginsV () throws IOException
    {
        
    }
    public String beginsW () throws IOException
    {
        
    }
    
}
