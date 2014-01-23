package Compiler;
import java.io.File;
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
     * 
     */
    
    File file;
    int row, column;
    char token;
    public Symbols(File in_file, int in_row, int in_column, char first_token){
        file = in_file;
        row = in_row;
        column = in_column;
        token = first_token;
        getToken();        
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
            return Gthan();
        }else if(token == '<'){
            return Lthan();
        }else if(token == '+'){
            return Plus();
        }else if(token == '-'){
            return Minus();
        }else if(token == '*'){
            return Times();
        }else if(token == ':'){
            return Colon();
        }else{
            return "ERROR";
        }
    }
    
    
    public String Period(){
        column++;
        return ".";
    }
    
    public String Comma(){
        column++;
        return ",";
    }
    
    public String Scolon(){
        column++;
        return ";";
    }
    
    public String Lparen(){
        column++;
        return "(";
    }
    
    public String Rparen(){
        column++;
        return ")";
    }
    
    public String Equal(){
        column++;
        return "=";
    }
    
    public String Gthan(){
        //Also includes Qequal
        return null;
    }
    
    public String Lthan(){
        //Also includes Lequal
        //Also includes Nequal
        return null;
    }
    
    public String Plus(){
        column++;
        return "+";
    }
    
    public String Minus(){
        column++;
        return "-";
    }
    
    public String Times(){
        column++;
        return "*";
    }
    
    public String Colon(){
        //Also includes the Assign
        return null;
    }
}

