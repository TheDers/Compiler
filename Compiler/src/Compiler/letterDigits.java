/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compiler;
import java.io.*;

/**
 *
 * Only going to handle digits, but this includes digits, 
 * integer_lit, fixed_lit, and Float_lit
 *
 */

public class letterDigits {
    
    File file;
    int row, column;
    char token, next_token;
    String lexeme = "";
    int c = 0;
    public letterDigits(File in_file, int in_row, int in_column, char first_token) {
        file = in_file;
        row = in_row;
        column = in_column;
        token = first_token;
    }
    
    public String getToken()throws IOException{
        lexeme = lexeme + token;
        column++;
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        try{
            while((c = buffer.read()) != -1) 
                {
                    for(int i = 0;i<row;i++){
                        buffer.readLine();
                    }
                    for(int j = 0;j<column-1;j++){
                        next_token = (char)buffer.read();
                    }
                }
            if(Character.isDigit(next_token)){
                return "";
            }else{
                return "";
            }
        }
        catch(IOException e){
                System.out.println("General I/O exception: " + e.getMessage());
                return "ERROR";
        }
    }
    public String getLexeme(){
        return lexeme;
    }
    public int getRow(){
        return row;
    }
    public int getColumn(){
        return column;
    }
}
