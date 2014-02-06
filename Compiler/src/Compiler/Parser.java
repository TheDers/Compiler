/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Compiler;

import java.util.ArrayList;

/**
 *
 * @author DasRobotos
 */
class Parser 
{

    Parser(ArrayList<String> tokenList) 
    {
        ArrayList<String> tList = tokenList;
        int tokenCounter = 0;
        parserMethod(tList, tokenCounter );
        
    }
    
    private void parserMethod(ArrayList tokenList, int tokenCounter)
    {
        String token = nextToken(tokenList, tokenCounter);
        switch(token) 
        {
            case "MP_AND":
                mp_and();
                break;
            case "MP_OR":
                mp_or();
                break;
            case "MP_BEGIN":
                mp_begin();
                break;
            case "MP_DIV":
                mp_div();
                break;
            case "MP_DO":
                mp_do();
                break;
            case "MP_DOWNTO":
                mp_downto();
                break;
            case "MP_ELSE":
                mp_else();
                break;
            case "MP_END":
                mp_end();
                break;
            case "MP_FALSE":
                mp_false();
                break;
            case "MP_FIXED":
                mp_fixed();
                break;
            case "MP_FLOAT":
                mp_float();
                break;
            case "MP_FOR":
                mp_for();
                break;
            case "MP_FUNCTION":
                mp_function();
                break;
            case "MP_IF":
                mp_if();
                break;
            case "MP_INTEGER":
                mp_integer();
                break;
            case "MP_MOD":
                mp_mod();
                break;
            case "MP_NOT":
                mp_not();
                break;
            case "MP_PROCEDURE":
                mp_procedure();
                break;
            case "MP_PROGRAM":
                mp_program();
                break;
            case "MP_READ":
                mp_read();
                break;
            case "MP_REPEAT":
                mp_repeat();
                break;
            case "MP_STRING":
                mp_string();
                break;
            case "MP_THEN":
                mp_then();
                break;
            case "MP_TRUE":
                mp_true();
                break;
            case "MP_TO":
                mp_to();
                break;
            case "MP_UNTIL":
                mp_until();
                break;
            case "MP_VAR":
                mp_var();
                break;
            case "MP_WHILE":
                mp_while();
                break;
            case "MP_WRITE":
                mp_write();
                break;
            case "MP_WRITELN":
                mp_writeln();
                break;
            case "Letter":
                letter();
                break;
            case "digit":
                digit();
                break;
            case "MP_INTEGER_LIT":
                mp_integer_lit();
                break;
            case "MP_FIXED_LIT":
                mp_fixed_lit();
                break;
            case "MP_FLOAT_LIT":
                mp_float_lit();
                break;
            case "MP_ASSIGN":
                mp_assign();
                break;
            case "MP_COLON":
                mp_colon();
                break;
            case "MP_COMMA":
                mp_comma();
                break;
            case "MP_EQUAL":
                mp_equal();
                break;
            case "MP_FLOAT_DIVIDE":
                mp_float_divide();
                break;
            case "MP_GEQUAL":
                mp_gequal();
                break;
            case "MP_LEQUAL":
                mp_lequal();
                break;
            case "MP_GTHAN":
                mp_gthan();
                break;
            case "MP_LTHAN":
                mp_lthan();
                break;
            case "MP_MINUS":
                mp_minus();
                break;
            case "MP_NEQUAL":
                mp_nequal();
                break;
            case "MP_PERIOD":
                mp_period();
                break;
            case "MP_PLUS":
                mp_plus();
                break;
            case "MP_RPAREN":
                mp_rparen();
                break;
            case "MP_LPAREN":
                mp_lparen();
                break;
            case "MP_SCOLON":
                mp_scolon();
                break;
            case "MP_TIMES":
                mp_times();
                break;
        }
        
    }
    
    private String nextToken(ArrayList tokenList, int tokenCounter)
    {
        String nextToken = tokenList.get(tokenCounter+1).toString();
        
        
        
        
        return nextToken;
    }

    private void mp_and() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_or() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_times() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_begin() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_div() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_do() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_downto() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_else() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_end() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_false() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_fixed() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_float() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_for() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_function() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_if() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_integer() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_mod() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_not() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_procedure() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_program() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_read() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_repeat() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_string() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_then() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_true() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_to() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_until() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_var() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_while() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_write() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_writeln() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void letter() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void digit() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_integer_lit() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_fixed_lit() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_float_lit() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_assign() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_colon() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_comma() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_equal() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_float_divide() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_gequal() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_lequal() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_gthan() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_lthan() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_lparen() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_minus() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_nequal() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_period() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_plus() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_rparen() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mp_scolon() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
