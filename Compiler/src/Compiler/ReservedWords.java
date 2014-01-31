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
        while(temp<row){
            buffer.readLine();
            temp++;
        }
        while((r = buffer.read()) != -1)
        {
            char ch = (char) r;
            if(ch==' ')
            {
                return "Letter";
            }
            if(ch=='n'||ch=='N')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch=='d'||ch=='D')
                {
                    return "MP_AND";
                }
            }
        }
        return "MP_IDENTIFIER";
    }
    public String beginsB () throws IOException
    {
        int temp = 0;
        int r = 0;
        while(temp<row){
            buffer.readLine();
            temp++;
        }
        
        while ((r = buffer.read()) < column) {
            //do nothing
        }
        while((r = buffer.read()) != -1)
        {
            char ch = (char) r;
            if(ch=='e'||ch=='E')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch == 'g'||ch=='G')
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch=='i'||ch=='I')
                    {
                        r = buffer.read();
                        ch = (char) r;
                        if(ch=='n'||ch=='N')
                        {
                            return "MP_BEGIN";
                        }
                    }
                }
            }
            if(ch=='o'||ch=='O')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch == 'o'||ch=='O')
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch=='l'||ch=='L')
                    {
                        r = buffer.read();
                        ch = (char) r;
                        if(ch=='e'||ch=='E')
                        {
                            r = buffer.read();
                            ch = (char) r;
                            if(ch=='a'||ch=='A')
                            {
                                r = buffer.read();
                                ch = (char) r;
                                if(ch=='n'||ch=='N')
                                {
                                    return "MP_BOOLEAN";
                                }
                            }
                        }
                    }
                }
            }
        }
        return "MP_IDENTIFIER";
    }
    public String beginsD () throws IOException
    {
        int temp = 0;
        int r = 0;
        while(temp<row){
            buffer.readLine();
            temp++;
        }
        
        while ((r = buffer.read()) < column) {
            //do nothing
        }
        while((r = buffer.read()) != -1)
        {
            char ch = (char) r;
            if(ch=='i'||ch=='I')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch == 'v'||ch=='V')
                {
                    return "MP_DIV";
                }
            }
            if(ch=='o'||ch=='O')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch == ' ')
                {
                    return "M_DO";
                }
                if(ch == 'w'||ch=='W')
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch=='n'||ch=='N')
                    {
                        r = buffer.read();
                        ch = (char) r;
                        if(ch=='t'||ch=='T')
                        {
                            r = buffer.read();
                            ch = (char) r;
                            if(ch=='o'||ch=='O')
                            {
                                return "MP_DOWNTO";
                            }
                        }
                    }
                }
            }
        }
        return "MP_IDENTIFIER";
    }
    public String beginsE () throws IOException
    {
        int temp = 0;
        int r = 0;
        while(temp<row){
            buffer.readLine();
            temp++;
        }
        
        while ((r = buffer.read()) < column) {
            //do nothing
        }
        while((r = buffer.read()) != -1)
        {
            char ch = (char) r;
            if(ch=='l'||ch=='L')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch == 's'||ch=='S')
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch=='e'||ch=='E')
                    {
                        return "MP_ELSE";
                    }
                }
            }
            if(ch=='n'||ch=='N')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch == 'd'||ch=='D')
                {
                    return "MP_END";
                }
            }
        }
        return "MP_IDENTIFIER";
    }
    public String beginsF () throws IOException
    {
        int temp = 0;
        int r = 0;
        while(temp<row){
            buffer.readLine();
            temp++;
        }
        
        while ((r = buffer.read()) < column) {
            //do nothing
        }
        while((r = buffer.read()) != -1)
        {
            char ch = (char) r;
            if(ch=='a'||ch=='A')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch == 'l'||ch=='L')
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch == 's'||ch=='S')
                    {
                        r = buffer.read();
                        ch = (char) r;
                        if(ch == 'e'||ch=='E')
                        {
                            return "MP_FALSE";
                        }
                    }
                }
            }
            if(ch=='i'||ch=='I')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch == 'x'||ch=='X')
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch == 'e'||ch=='E')
                    {
                        r = buffer.read();
                        ch = (char) r;
                        if(ch == 'd'||ch=='D')
                        {
                            return "MP_FIXED";
                        }
                    }
                }
            }
            if(ch=='l'||ch=='L')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch == 'o'||ch=='O')
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch=='a'||ch=='A')
                    {
                        r = buffer.read();
                        ch = (char) r;
                        if(ch=='t'||ch=='T')
                        {
                            return "MP_FLOAT";
                        }
                    }
                }
            }
            if(ch=='o'||ch=='O')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch == 'r'||ch=='R')
                {
                    return "FOR";
                }
            }
            if(ch=='u'||ch=='U')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch == 'n'||ch=='N')
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch == 'c'||ch=='C')
                    {
                        r = buffer.read();
                        ch = (char) r;
                        if(ch == 't'||ch=='T')
                        {
                            r = buffer.read();
                            ch = (char) r;
                            if(ch == 'i'||ch=='I')
                            {
                                r = buffer.read();
                                ch = (char) r;
                                if(ch == 'o'||ch=='O')
                                {
                                    r = buffer.read();
                                    ch = (char) r;
                                    if(ch == 'n'||ch=='N')
                                    {
                                        return "MP_FUNCTION";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return "MP_IDENTIFIER";
    }
    public String beginsI () throws IOException
    {
        int temp = 0;
        int r = 0;
        while(temp<row){
            buffer.readLine();
            temp++;
        }
        
        while ((r = buffer.read()) < column) {
            //do nothing
        }
        while((r = buffer.read()) != -1)
        {
            char ch = (char) r;
            if(ch=='f'||ch=='F')
            {
                return "MP_IF";
            }
            if(ch=='n'||ch=='N')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch == 't'||ch=='T')
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch=='e'||ch=='E')
                    {
                        r = buffer.read();
                        ch = (char) r;
                        if(ch=='g'||ch=='G')
                        {
                            r = buffer.read();
                            ch = (char) r;
                            if(ch=='e'||ch=='E')
                            {
                                r = buffer.read();
                                ch = (char) r;
                                if(ch=='r'||ch=='R')
                                {
                                    return "MP_INTEGER";
                                }
                            }
                        }
                    }
                }
            }
        }
        return "MP_IDENTIFIER";
    }
    public String beginsM () throws IOException
    {
        int temp = 0;
        int r = 0;
        while(temp<row){
            buffer.readLine();
            temp++;
        }
        
        while ((r = buffer.read()) < column) {
            //do nothing
        }
        while((r = buffer.read()) != -1)
        {
            char ch = (char) r;
            if(ch=='o'||ch=='O')
            {
                r = buffer.read();
                ch = (char) r;
                if(r=='d'||ch=='D')
                {
                    return "MP_MOD";
                }
            }
        }
        return "MP_IDENTIFIER";
    }
    public String beginsN () throws IOException
    {
        int temp = 0;
        int r = 0;
        while(temp<row){
            buffer.readLine();
            temp++;
        }
        
        while ((r = buffer.read()) < column) {
            //do nothing
        }
        while((r = buffer.read()) != -1)
        {
            char ch = (char) r;
            if(ch=='o'||ch=='O')
            {
                r = buffer.read();
                ch = (char) r;
                if(r=='t'||ch=='T')
                {
                    return "MP_NOT";
                }
            }
        }
        return "MP_IDENTIFIER";
    }
    public String beginsO () throws IOException
    {
        int temp = 0;
        int r = 0;
        while(temp<row){
            buffer.readLine();
            temp++;
        }
        
        while ((r = buffer.read()) < column) {
            //do nothing
        }
        while((r = buffer.read()) != -1)
        {
            char ch = (char) r;
            if(ch=='r'||ch=='R')
            {
                return"MP_OR";
            }
        }
        return "MP_IDENTIFIER";
    }
    public String beginsP () throws IOException
    {
        int temp = 0;
        int r = 0;
        while(temp<row){
            buffer.readLine();
            temp++;
        }
        
        while ((r = buffer.read()) < column) {
            //do nothing
        }
        while((r = buffer.read()) != -1)
        {
            char ch = (char) r;
            if(ch=='r'||ch=='R')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch =='o'||ch=='O')
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch=='g'||ch=='G')
                    {
                        r = buffer.read();
                        ch = (char) r;
                        if(ch=='r'||ch=='R')
                        {
                            r = buffer.read();
                            ch = (char) r;
                            if(ch=='a'||ch=='A')
                            {
                                r = buffer.read();
                                ch = (char) r;
                                if(ch=='m'||ch=='M')
                                {
                                    return "MP_PROGRAM";
                                }
                            }
                        }
                    }
                    if(ch=='c'||ch=='C')
                    {
                        r = buffer.read();
                        ch = (char) r;
                        if(ch=='e'||ch=='E')
                        {
                            r = buffer.read();
                            ch = (char) r;
                            if(ch=='d'||ch=='D')
                            {
                                r = buffer.read();
                                ch = (char) r;
                                if(ch=='u'||ch=='U')
                                {
                                    r = buffer.read();
                                    ch = (char) r;
                                    if(ch=='r'||ch=='R')
                                    {
                                        r = buffer.read();
                                        ch = (char) r;
                                        if(ch=='e'||ch=='E')
                                        {
                                            return "MP_PROCEDURE";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return "MP_IDENTIFIER";
    }
    public String beginsR () throws IOException
    {
        int temp = 0;
        int r = 0;
        while(temp<row){
            buffer.readLine();
            temp++;
        }
        
        while ((r = buffer.read()) < column) {
            //do nothing
        }
        while((r = buffer.read()) != -1)
        {
            char ch = (char) r;
            if(ch=='e'||ch=='E')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch == 'a'||ch=='A')
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch=='d'||ch=='D')
                    {
                        return "MP_READ";
                    }
                }
                if(ch == 'p'||ch=='P')
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch=='e'||ch=='E')
                    {
                        r = buffer.read();
                        ch = (char) r;
                        if(ch=='a'||ch=='A')
                        {
                            r = buffer.read();
                            ch = (char) r;
                            if(ch=='t'||ch=='T')
                            {
                                return "MP_REPEAT";
                            }
                        }
                    }
                }
            }
        }
        return "MP_IDENTIFIER";
    }
    public String beginsT () throws IOException
    {
        int temp = 0;
        int r = 0;
        while(temp<row){
            buffer.readLine();
            temp++;
        }
        
        while ((r = buffer.read()) < column) {
            //do nothing
        }
        while((r = buffer.read()) != -1)
        {
            char ch = (char) r;
            if(ch=='h'||ch=='H')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch == 'e'||ch=='E')
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch=='n'||ch=='N')
                    {
                        return "MP_THEN";
                    }
                }
            }
            if(ch=='r'||ch=='R')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch == 'u'||ch=='U')
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch == 'e'||ch=='E')
                    {
                        return "M_TRUE";
                    }
                }
            }
            if(ch=='o'||ch=='O')
            {
                return "MP_TO";
            }
        }
        return "MP_IDENTIFIER";
    }
    public String beginsU () throws IOException
    {
        int temp = 0;
        int r = 0;
        while(temp<row){
            buffer.readLine();
            temp++;
        }
        
        while ((r = buffer.read()) < column) {
            //do nothing
        }
        while((r = buffer.read()) != -1)
        {
            char ch = (char) r;
            if(ch=='n'||ch=='N')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch=='t'||ch=='T')
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch=='i'||ch=='I')
                    {
                        r = buffer.read();
                        ch = (char) r;
                        if(ch=='l'||ch=='L')
                        {
                            return "MP_UNTIL";
                        }
                    }
                }
            }
        }
        return "MP_IDENTIFIER";
    }
    public String beginsV () throws IOException
    {
        int temp = 0;
        int r = 0;
        while(temp<row){
            buffer.readLine();
            temp++;
        }
        
        while ((r = buffer.read()) < column) {
            //do nothing
        }
        while((r = buffer.read()) != -1)
        {
            char ch = (char) r;
            if(ch=='a'||ch=='A')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch=='r'||ch=='R')
                {
                    return "MP_VAR";
                }
            }
        }
        return "MP_IDENTIFIER";
    }
    public String beginsW () throws IOException
    {
        int temp = 0;
        int r = 0;
        while(temp<row){
            buffer.readLine();
            temp++;
        }
        
        while ((r = buffer.read()) < column) {
            //do nothing
        }
        while((r = buffer.read()) != -1)
        {
            char ch = (char) r;
            if(ch=='h'||ch=='H')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch == 'i'||ch=='I')
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch=='l'||ch=='L')
                    {
                        r = buffer.read();
                        ch = (char) r;
                        if(ch=='e'||ch=='E')
                        {
                            return "MP_WHILE";
                        }
                    }
                }
            }
            if(ch=='r'||ch=='R')
            {
                r = buffer.read();
                ch = (char) r;
                if(ch == 'i'||ch=='I')
                {
                    r = buffer.read();
                    ch = (char) r;
                    if(ch=='t'||ch=='T')
                    {
                        r = buffer.read();
                        ch = (char) r;
                        if(ch=='e'||ch=='E')
                        {
                            if(ch=='l'||ch=='L')
                            {
                                r = buffer.read();
                                ch = (char) r;
                                if(ch=='n'||ch=='N')
                                {
                                    return "MP_WRITEIN";
                                }
                            }
                            if(ch==' ')
                            {
                                return "MP_WRITE";
                            }
                        }
                    }
                }
            }
        }
        return "MP_IDENTIFIER";
    }
    public int getRowandColumn()
    {
        return 0;
    }
}
