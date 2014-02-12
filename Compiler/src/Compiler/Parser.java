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

    Parser(ArrayList<String> tokenList) {
        ArrayList<String> tList = tokenList;
        int tokenCounter = 0;
        parserMethod(tList, tokenCounter);

    }

    private void parserMethod(ArrayList tokenList, int tokenCounter) {
        String token = nextToken(tokenList, tokenCounter);
        


    }

    private String nextToken(ArrayList tokenList, int tokenCounter) {
        String nextToken = tokenList.get(tokenCounter + 1).toString();

        return nextToken;
    }

    public void system_Goal() {

    }

    public void program() {

    }

    public void program_Heading() {

    }

    public void block() {

    }

    public void variable_Declaration_Part() {

    }

    public void variable_Declaration_Tail() {

    }
    public void variable_Declaration()
    {
        
    }
    public void type()
    {
        
    }
    public void procedure_And_Function_Declaration_Part()
    {
        
    }
    public void procedure_Declaration()
    {
        
    }
    public void function_Declaration()
    {
        
    }
    public void procedure_Heading()
    {
        
    }
    public void function_Heading()
    {
        
    }
    public void optional_Formal_Parameter_List()
    {
        
    }
    public void formal_Parameter_Section_Tail()
    {
        
    }
    public void value_Parameter_Section()
    {
        
    }
    public void variable_Parameter_Section()
    {
        
    }
    public void statement_Part()
    {
        
    }
    public void statement()
    {
        
    }
    public void empty_Statement()
    {
        
    }
    public void read_Statement()
    {
        
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
        
    }
    public void variable_Identifier()
    {
        
    }
    public void procedure_Identifier()
    {
        
    }
    public void function_Identifier()
    {
        
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
    public void syntax_Error()
    {
        
    }
    public void match()
    {
        
    }
}
