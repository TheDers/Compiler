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
class Parser {
    
    ArrayList<String> tList;
    boolean syntax_error = false;

    Parser(ArrayList<String> tokenList) {
        tList= tokenList;
        parserMethod(tList, Globals.tokenCounter);

    }

    private void parserMethod(ArrayList tokenList, int tokenCounter) {
        //String token = nextToken(tokenList, tokenCounter);
        Globals.token = tokenList.get(tokenCounter).toString();
        system_Goal();


    }

    private void nextToken(ArrayList tokenList, int tokenCounter) {
        String nextToken = tokenList.get(tokenCounter + 1).toString();
        Globals.tokenCounter++;
        Globals.token = nextToken;
    }

    public void system_Goal() {
        program();
        if(syntax_error == false){
            EOF();
        }
    }

    public void program() {
        program_Heading();
        if(Globals.token.equals("MP_SCOLON")){
            match(Globals.token, "MP_SCOLON");
        }else{
            syntax_Error();
        }
        block();
        if(Globals.token.equals("MP_PERIOD")){
            match(Globals.token, "MP_PERIOD");
        }else{
            syntax_Error();
        }
    }

    public void program_Heading() {
        if(Globals.token.equals("MP_PROGRAM")){     
            match(Globals.token, "MP_PROGRAM");
        }else{
            syntax_Error();
        }
        program_Identifier();
    }

    public void block() {
        variable_Declaration_Part();
        procedure_And_Function_Declaration_Part();
        statement_Part();
    }

    public void variable_Declaration_Part() {
        if(Globals.token.equals("MP_VAR")){
            match(Globals.token, "MP_VAR");
            variable_Declaration();
            if(Globals.token.equals("MP_SCOLON")){
                match(Globals.token, "MP_SCOLON");
            }else{
                syntax_Error();
            }
            variable_Declaration_Tail();
        }else if(Globals.token.equals("MP_BEGIN") || Globals.token.equals("MP_FUNCTION") || Globals.token.equals("MP_PROCEDURE")){
            //epsilon
        }else{
            syntax_Error();
        }
    }

    public void variable_Declaration_Tail() {
        if(Globals.token.equals("MP_IDENTIFIER")){
            variable_Declaration();
            if(Globals.token.equals("MP_SCOLON")){
                match(Globals.token, "MP_SCOLON");
            }else{
                syntax_Error();
            }
            variable_Declaration_Tail();
        }else if(Globals.token.equals("MP_BEGIN") || Globals.token.equals("MP_FUCTION") || Globals.token.equals("MP_PROCEDURE")){
            //epsilon
        }else{
            syntax_Error();
        }
    }
    public void variable_Declaration()
    {
        identifier_List();
        if(Globals.token.equals("MP_COLON")){
            match(Globals.token, "MP_COLON");
        }else{
            syntax_Error();
        }
        type();
    }
    public void type()
    {
        if(Globals.token.equals("MP_INTEGER")){
            match(Globals.token, "MP_INTEGER");
        }else if(Globals.token.equals("MP_FLOAT")){
            match(Globals.token, "MP_FLOAT");
        }else if(Globals.token.equals("MP_STRING")){
            match(Globals.token, "MP_STRING");
        }else if(Globals.token.equals("MP_BOOLEAN")){
            match(Globals.token, "MP_BOOLEAN");
        }else{
            syntax_Error();
        }
    }
    public void procedure_And_Function_Declaration_Part()
    {
        if(Globals.token.equals("MP_PROCEDURE")){           //Rule 14
            procedure_Declaration();
            procedure_And_Function_Declaration_Part();
        }else if(Globals.token.equals("MP_FUNCTION")){      //Rule 15
            function_Declaration();
            procedure_And_Function_Declaration_Part();
        }else if(Globals.token.equals("MP_BEGIN")){         //Rule 16
            //epsilon
        }else{
            syntax_Error();
        }
    }
    public void procedure_Declaration()
    {
        procedure_Heading();
        if(Globals.token.equals("MP_SCOLON")){
            match(Globals.token, "MP_SCOLON");
        }else{
            syntax_Error();
        }
        block();
        if(Globals.token.equals("MP_SCOLON")){
            match(Globals.token, "MP_SCOLON");
        }else{
            syntax_Error();
        }
    }
    public void function_Declaration()
    {
        function_Heading();
        if(Globals.token.equals("MP_SCOLON")){
            match(Globals.token, "MP_SCOLON");
        }else{
            syntax_Error();
        }
        block();
        if(Globals.token.equals("MP_SCOLON")){
            match(Globals.token, "MP_SCOLON");
        }else{
            syntax_Error();
        }
    }
    public void procedure_Heading()
    {
        if(Globals.token.equals("MP_PROCEDURE")){
            match(Globals.token, "MP_PROCEDURE");
            procedure_Identifier();
            optional_Formal_Parameter_List();
        }else{
            syntax_Error();
        }
    }
    public void function_Heading()
    {
        if(Globals.token.equals("MP_FUNCTION")){
            match(Globals.token, "MP_FUNCTION");
            function_Identifier();
            optional_Formal_Parameter_List();
            type();
        }else{
            syntax_Error();
        }
    }
    public void optional_Formal_Parameter_List()
    {
        if(Globals.token.equals("MP_LPAREN")){      //Rule 21
            match(Globals.token, "MP_LPAREN");
            formal_Parameter_Section();
            formal_Parameter_Section_Tail();
            if(Globals.token.equals("MP_RPAREN")){
                match(Globals.token, "MP_RPAREN");
            }else{
                syntax_Error();
            }
        }else if(Globals.token.equals("MP_BEGIN") || Globals.token.equals("MP_BOOLEAN") || Globals.token.equals("MP_FLOAT") || Globals.token.equals("MP_FUNCTION") || Globals.token.equals("MP_INTEGER") || Globals.token.equals("MP_PROCEDURE") || Globals.token.equals("MP_STRING")){
            //Rule 22
            //epsilon
        }else{
            syntax_Error();
        }
    }
    public void formal_Parameter_Section_Tail()
    {
        if(Globals.token.equals("MP_SCOLON")){          //Rule 23
            match(Globals.token, "MP_SCOLON");
            formal_Parameter_Section();
            formal_Parameter_Section_Tail();
        }else if(Globals.token.equals("MP_RPAREN")){    //Rule 24
            //epsilon
        }else{
            syntax_Error();
        }
    }
    public void formal_Parameter_Section()
    {
        if(Globals.token.equals("MP_IDENTIFIER")){      //Rule 25
            value_Parameter_Section();
        }else if(Globals.token.equals("MP_VAR")){       //Rule 26
            variable_Parameter_Section();
        }else{
            syntax_Error();
        }
    }
    public void value_Parameter_Section()
    {
        identifier_List();                              //Rule 27
        if(Globals.token.equals("MP_COLON")){
            match(Globals.token, "MP_COLON");
        }else{
            syntax_Error();
        }
        type();
    }
    public void variable_Parameter_Section()
    {
        if(Globals.token.equals("MP_VAR")){             //Rule 28
            match(Globals.token, "MP_VAR");
            identifier_List();
            if(Globals.token.equals("MP_COLON")){
                match(Globals.token, "MP_COLON");
            }else{
                syntax_Error();
            }
            type();
        }else{
            syntax_Error();
        }
    }
    public void statement_Part()
    {
        compound_Statement();
    }
    public void compound_Statement()
    {
        if(Globals.token.equals("MP_BEGIN")){           //Rule 30
            match(Globals.token, "MP_BEGIN");
            statement_Sequence();
            if(Globals.token.equals("MP_END")){
                match(Globals.token, "MP_END");
            }else{
                syntax_Error();
            }
        }else{
            syntax_Error();
        }
    }
    public void statement_Sequence()
    {
        statement();
        statement_Tail();
    }
    public void statement_Tail()
    {
        if(Globals.token.equals("MP_SCOLON")){      //Rule 32
            match(Globals.token, "MP_SCOLON");
            statement();
            statement_Tail();
        }else if(Globals.token.equals("MP_END")){   //Rule 33
            //epsilon
        }else{
            syntax_Error();
        }
    }
    public void statement()
    {
        if(Globals.token.equals("MP_END") || Globals.token.equals("MP_SCOLON")){            //Rule 34
            empty_Statement();
        }else if(Globals.token.equals("MP_BEGIN")){                                         //Rule 35
            compound_Statement();
        }else if(Globals.token.equals("MP_READ")){                                          //Rule 36
            read_Statement();
        }else if(Globals.token.equals("MP_WRITE") || Globals.token.equals("MP_WRITELN")){   //Rule 37
            write_Statement();
        }else if(Globals.token.equals("MP_IDENTIFIER")){                                    //Rule 38
            assignment_Statement();
        }else if(Globals.token.equals("MP_IF")){                                            //Rule 39
            if_Statement();
        }else if(Globals.token.equals("MP_WHILE")){                                         //Rule 40
            while_Statement();
        }else if(Globals.token.equals("MP_REPEAT")){                                        //Rule 41
            repeat_Statement();
        }else if(Globals.token.equals("MP_FOR")){                                           //Rule 42
            for_Statement();
        /*
         * 
         * NOT SURE HOW TO HANDLE AMBIGUITY
         * RULE 38 AND 43 BOTH GO TO IDENTIFIER
         * 
         *
        }else if(Globals.token.equals("MP_IDENTIFIER")){                                    //Rule 43
            procedure_Statement();
            * 
            */
        }else{
            syntax_Error();
        }
    }
    public void empty_Statement()
    {
        if(Globals.token.equals("MP_END") || Globals.token.equals("MP_SCOLON")){            //Rule 44
            //epsilon
        }else{
            syntax_Error();
        }
    }
    public void read_Statement()
    {
        if(Globals.token.equals("MP_READ")){
            match(Globals.token, "MP_READ");
            if(Globals.token.equals("MP_LPAREN")){
                match(Globals.token, "MP_LPAREN");
            }else{
                syntax_Error();
            }
            read_Parameter();
            read_Parameter_Tail();
            if(Globals.token.equals("MP_RPAREN")){
                match(Globals.token, "MP_RPAREN");
            }else{
                syntax_Error();
            }
        }else{
            syntax_Error();
        }
    }
    public void read_Parameter_Tail()
    {
        
    }
    public void read_Parameter()
    {
        
    }
    public void write_Statement()
    {
        
    }
    public void write_Parameter_Tail()
    {
        
    }
    public void write_Parameter()
    {
        
    }
    public void assignment_Statement()
    {
        
    }
    public void if_Statement()
    {
        
    }
    public void optional_Else_Part()
    {
        
    }
    public void repeat_Statement()
    {
        
    }
    public void while_Statement()
    {
        
    }
    public void for_Statement()
    {
        
    }
    public void control_Variable()
    {
        
    }
    public void initial_Value()
    {
        
    }
    public void step_Value()
    {
        
    }
    public void final_Value()
    {
        
    }
    public void procedure_Statement()
    {
        
    }
    public void optional_Actual_Paramenter_List()
    {
        
    }
    public void actual_Parameter_Tail()
    {
        
    }
    public void actual_Parameter()
    {
        
    }
    public void expression()
    {
        
    }
    public void optional_Relational_Part()
    {
        
    }
    public void relational_Operator()
    {
        
    }
    public void simple_Expression()
    {
        
    }
    public void term_Tail()
    {
        
    }
    public void optional_Sign()
    {
        
    }
    public void adding_Operator()
    {
        
    }
    public void term()
    {
        
    }
    public void factor_Tail()
    {
        
    }
    public void multiplying_Operator()
    {
        
    }
    public void factor()
    {
        
    }
    public void program_Identifier()
    {
        if(Globals.token.equals("MP_IDENTIFIER")){
            match(Globals.token, "MP_IDENTIFIER");
        }else{
            syntax_Error();
        }        
    }
    public void variable_Identifier()
    {
        if(Globals.token.equals("MP_IDENTIFIER")){
            match(Globals.token, "MP_IDENTIFIER");
        }else{
            syntax_Error();
        }
    }
    public void procedure_Identifier()
    {
        if(Globals.token.equals("MP_IDENTIFIER")){
            match(Globals.token, "MP_IDENTIFIER");
        }else{
            syntax_Error();
        }
    }
    public void function_Identifier()
    {
        if(Globals.token.equals("MP_IDENTIFIER")){
            match(Globals.token, "MP_IDENTIFIER");
        }else{
            syntax_Error();
        }
    }
    public void boolean_Expression()
    {
        
    }
    public void ordinal_Expression()
    {
        
    }
    public void identifier_List()
    {
        
    }
    public void indentifier_Tail()
    {
        
    }
    public void EOF(){
        System.out.println("The input program parses!");
    }
    public void syntax_Error()
    {
        syntax_error = true;
        try{
        throw new SyntaxErrorException();
        }catch (SyntaxErrorException e){
            System.out.println("Syntax Error");
        }
    }
    public void match(String token, String realToken)
    {
        if(token.equals(realToken)){
            nextToken(tList, Globals.tokenCounter);
        }else{
            syntax_Error();
        }
    }
    public class SyntaxErrorException extends Exception {
        public SyntaxErrorException(){
        }
    }
}
