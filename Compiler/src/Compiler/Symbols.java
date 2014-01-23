
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
    
    public Symbols(File in_file, int row, int column, char first_token){
        
    }
    
    if(first_token == '.'){
        Period();
    }else if(first_toke == ','){
        Comma();
    }else if(first_toke == ';'){
        Scolon();
    }else if(first_toke == '()'){
        Lparen();
    }else if(first_toke == ')'){
        Rparen();
    }else if(first_toke == '='){
        Equal();
    }else if(first_toke == '>'){
        Gthan();
    }else if(first_toke == '<'){
        Lthan();
    }else if(first_toke == '+'){
        Plus();
    }else if(first_toke == '-'){
        Minus();
    }else if(first_toke == '*'){
        Times();
    }else if(first_toke == ':'){
        Colon();
    }else{
        System.out.println("ERROR");
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
