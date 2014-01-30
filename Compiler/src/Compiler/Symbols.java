package Compiler;
import java.io.*;
/**
 *
 * @author Anders
 */
public class Symbols {

    
    /*
     * SYMBOLS NEEDED
     * MP_PERIOD         "."
	MP_COMMA          ","
	MP_SCOLON         ";"
	MP_LPAREN         "("
	MP_RPAREN         ")"
	MP_EQUAL          "="
	MP_GTHAN          ">"
	MP_GEQUAL         ">="
	MP_LTHAN          "<"
	MP_LEQUAL         "<="
	MP_NEQUAL         "<>"
	MP_ASSIGN         ":="
	MP_PLUS           "+"
	MP_MINUS          "-"
	MP_TIMES          "*"
	MP_COLON          ":"
        MP_FLOAT_DIVIDE   "/"
     * 
     */
    
    File file;
    int row, column;
    char token, next_token;
    String lexeme = "";
    int c = 0;
    public Symbols(File in_file, int in_row, int in_column, char first_token)throws IOException{
        file = in_file;
        row = in_row;
        column = in_column;
        token = first_token;    
    }
    
    
    public String getToken(){
        if(token == '.'){
            return Period();
        }else if(token == ','){
            return Comma();
        }else if(token == ';'){
            return Scolon();
        }else if(token == '('){
            return Lparen();
        }else if(token == ')'){
            return Rparen();
        }else if(token == '='){
            return Equal();
        }else if(token == '>'){
            try{
            return Gthan();
            }catch(IOException e){
                System.out.println("General I/O exception: " + e.getMessage());
                return "ERROR";
            }
        }else if(token == '<'){
            try{
            return Lthan();
            }catch(IOException e){
                System.out.println("General I/O exception: " + e.getMessage());
                return "ERROR";
            }
        }else if(token == '+'){
            return Plus();
        }else if(token == '-'){
            return Minus();
        }else if(token == '*'){
            return Times();
        }else if(token == ':'){
            try{
            return Colon();
            }catch(IOException e){
                System.out.println("General I/O exception: " + e.getMessage());
                return "ERROR";
            }
        }else if(token == '/'){
            return Divide();
        }else{
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
    
    
    public String Period(){
        column++;
        lexeme = ".";
        return "MP_PERIOD";
    }
    
    public String Comma(){
        column++;
        lexeme = ",";
        return "MP_COMMA";
    }
    
    public String Scolon(){
        column++;
        lexeme = ";";
        return "MP_SCOLON";
    }
    
    public String Lparen(){
        column++;
        lexeme = "(";
        return "MP_LPAREN";
    }
    
    public String Rparen(){
        column++;
        lexeme = ")";
        return ")MP_RPAREN";
    }
    
    public String Equal(){
        column++;
        lexeme = "=";
        return "MP_EQUAL";
    }
    
    public String Gthan()throws IOException{
        //Also includes Gequal
        column++;
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        while((char)(c = buffer.read()) != ' ')
            {
                for(int i = 0;i<row;i++){
                    buffer.readLine();
                }
                for(int j = 0;j<column-1;j++){
                    next_token = (char)buffer.read();
                }
            }
        c = 0;
        if(next_token == '='){
            column++;
            lexeme = ">=";
            return "MP_GEQUAL";
        }else{
            lexeme = ">";
            return "MP_GTHAN";
        }
    }
    
    public String Lthan()throws IOException{
        //Also includes Lequal
        //Also includes Nequal
        column++;
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        while((char)(c = buffer.read()) != ' ') 
            {
                for(int i = 0;i<row;i++){
                    buffer.readLine();
                }
                for(int j = 0;j<column-1;j++){
                    next_token = (char)buffer.read();
                }
            }
        c = 0;
        if(next_token == '='){
            column++;
            lexeme = "<=";
            return "MP_LEQUAL";
        }else if(next_token == '>'){
            column++;
            lexeme = "<>";
            return "MP_NEQUAL";
        }else{
            lexeme = "<";
            return "MP_LTHAN";
        }
    }
    
    public String Plus(){
        column++;
        lexeme = "+";
        return "MP_PLUS";
    }
    
    public String Minus(){
        column++;
        lexeme = "-";
        return "MP_MINUS";
    }
    
    public String Times(){
        column++;
        lexeme = "*";
        return "MP_TIMES";
    }
    
    public String Colon()throws IOException{
        //Also includes the Assign
        column++;
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        while((char)(c = buffer.read()) != ' ')
            {
                for(int i = 0;i<row;i++){
                    buffer.readLine();
                }
                for(int j = 0;j<column-1;j++){
                    next_token = (char)buffer.read();
                }
            }
        c = 0;
        if(next_token == '='){
            column++;
            lexeme = ":=";
            return "MP_ASSIGN";
        }else{
            lexeme = ":";
            return "MP_COLON";
        }
    }
    
    public String Divide(){
        column++;
        lexeme = "/";
        return "MP_FLOAT_DIVIDE";
    }
}

