/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Compiler;

/**
 *
 * @author Anders
 */
public class Analyzer {
    
    public Analyzer(){
        
    }
    
    static void generateHeader(){
        System.out.println("MOV SP D0");
    }
    
    static void generateFooter(){
        System.out.println("HLT");
    }
    
    static void generateWriteS(){
        System.out.println("WRTS");
    }
    
    static void generatePush(int value){
        System.out.println("PUSH #" + value);
    }
    static void generatePushF(float value){
        System.out.println("PUSH #" + value);
    }
    
    static void generatePushS(String value){
        System.out.println("PUSH \"" + value + "\"");
    }
    
    static void generatePushIdent(int offset, int nestingLevel){
        System.out.println("PUSH " + offset + "(d" + nestingLevel + ")");
    }
    
    static void generatePop(int offset, int nestingLevel){
        System.out.println("POP " + offset + "(d" + nestingLevel + ")");
    }
    
    static void generateRead(int offset, int nestingLevel){
        System.out.println("RD " + offset + "(d" + nestingLevel + ")");
    }
    
    static void generateReadF(int offset, int nestingLevel){
        System.out.println("RDF " + offset + "(d" + nestingLevel + ")");
    }
    
    static void generateReadS(int offset, int nestingLevel){
        System.out.println("RDS " + offset + "(d" + nestingLevel + ")");
    }
    
    static void generateAdd(String type1, String type2){
        if(type1.equals("MP_FLOAT") && type2.equals("MP_INTEGER")){
            System.out.println("CASTSF");
            System.out.println("ADDSF");
        }else if(type1.equals("MP_FLOAT_LIT") && type2.equals("MP_INTEGER_LIT")){
            System.out.println("CASTSF");
            System.out.println("ADDSF");
        }else if(type1.equals("MP_FLOAT") && type2.equals("MP_INTEGER_LIT")){
            System.out.println("CASTSF");
            System.out.println("ADDSF");
        }else if(type1.equals("MP_FLOAT_LIT") && type2.equals("MP_INTEGER")){
            System.out.println("CASTSF");
            System.out.println("ADDSF");
        }else if(type1.equals("MP_INTEGER") && type2.equals("MP_FLOAT")){
            System.out.println("MOV -2(SP) 0(SP)");
            System.out.println("ADD SP #1 SP");
            System.out.println("CASTSF");
            System.out.println("MOV -1(SP) -3(SP)");
            System.out.println("SUB SP #1 SP");
            System.out.println("ADDSF");
        }else if(type1.equals("MP_INTEGER_LIT") && type2.equals("MP_FLOAT_LIT")){
            System.out.println("MOV -2(SP) 0(SP)");
            System.out.println("ADD SP #1 SP");
            System.out.println("CASTSF");
            System.out.println("MOV -1(SP) -3(SP)");
            System.out.println("SUB SP #1 SP");
            System.out.println("ADDSF");
        }else{
            System.out.println("ADDS");
        }
    }
    
    static void generateSubtract(String type1, String type2){
        if(type1.equals("MP_FLOAT") && type2.equals("MP_INTEGER")){
            System.out.println("CASTSF");
            System.out.println("SUBSF");
        }else if(type1.equals("MP_FLOAT_LIT") && type2.equals("MP_INTEGER_LIT")){
            System.out.println("CASTSF");
            System.out.println("SUBSF");
        }else if(type1.equals("MP_FLOAT") && type2.equals("MP_INTEGER_LIT")){
            System.out.println("CASTSF");
            System.out.println("SUBSF");
        }else if(type1.equals("MP_FLOAT_LIT") && type2.equals("MP_INTEGER")){
            System.out.println("CASTSF");
            System.out.println("SUBSF");
        }else if(type1.equals("MP_INTEGER") && type2.equals("MP_FLOAT")){
            System.out.println("MOV -2(SP) 0(SP)");
            System.out.println("ADD SP #1 SP");
            System.out.println("CASTSF");
            System.out.println("MOV -1(SP) -3(SP)");
            System.out.println("SUB SP #1 SP");
            System.out.println("SUBSF");
        }else if(type1.equals("MP_INTEGER_LIT") && type2.equals("MP_FLOAT_LIT")){
            System.out.println("MOV -2(SP) 0(SP)");
            System.out.println("ADD SP #1 SP");
            System.out.println("CASTSF");
            System.out.println("MOV -1(SP) -3(SP)");
            System.out.println("SUB SP #1 SP");
            System.out.println("SUBSF");
        }else{
            System.out.println("SUBS");
        }
    }
    
    static void generateDivide(String type1, String type2){
        if(type1.equals("MP_FLOAT") && type2.equals("MP_INTEGER")){
            System.out.println("CASTSF");
            System.out.println("DIVSF");
        }else if(type1.equals("MP_FLOAT_LIT") && type2.equals("MP_INTEGER_LIT")){
            System.out.println("CASTSF");
            System.out.println("DIVSF");
        }else if(type1.equals("MP_FLOAT") && type2.equals("MP_INTEGER_LIT")){
            System.out.println("CASTSF");
            System.out.println("DIVSF");
        }else if(type1.equals("MP_FLOAT_LIT") && type2.equals("MP_INTEGER")){
            System.out.println("CASTSF");
            System.out.println("DIVSF");
        }else if(type1.equals("MP_INTEGER") && type2.equals("MP_FLOAT")){
            System.out.println("MOV -2(SP) 0(SP)");
            System.out.println("ADD SP #1 SP");
            System.out.println("CASTSF");
            System.out.println("MOV -1(SP) -3(SP)");
            System.out.println("SUB SP #1 SP");
            System.out.println("DIVSF");
        }else if(type1.equals("MP_INTEGER_LIT") && type2.equals("MP_FLOAT_LIT")){
            System.out.println("MOV -2(SP) 0(SP)");
            System.out.println("ADD SP #1 SP");
            System.out.println("CASTSF");
            System.out.println("MOV -1(SP) -3(SP)");
            System.out.println("SUB SP #1 SP");
            System.out.println("DIVSF");
        }else{
            System.out.println("DIVS");
        }
    }
    
    static void generateDivideF(String type1, String type2){
        if(type1.equals("MP_FLOAT") && type2.equals("MP_INTEGER")){
            System.out.println("CASTSF");
            System.out.println("DIVSF");
        }else if(type1.equals("MP_FLOAT_LIT") && type2.equals("MP_INTEGER_LIT")){
            System.out.println("CASTSF");
            System.out.println("DIVSF");
        }else if(type1.equals("MP_FLOAT") && type2.equals("MP_INTEGER_LIT")){
            System.out.println("CASTSF");
            System.out.println("DIVSF");
        }else if(type1.equals("MP_FLOAT_LIT") && type2.equals("MP_INTEGER")){
            System.out.println("CASTSF");
            System.out.println("DIVSF");
        }else if(type1.equals("MP_INTEGER") && type2.equals("MP_FLOAT")){
            System.out.println("MOV -2(SP) 0(SP)");
            System.out.println("ADD SP #1 SP");
            System.out.println("CASTSF");
            System.out.println("MOV -1(SP) -3(SP)");
            System.out.println("SUB SP #1 SP");
            System.out.println("DIVSF");
        }else if(type1.equals("MP_INTEGER_LIT") && type2.equals("MP_FLOAT_LIT")){
            System.out.println("MOV -2(SP) 0(SP)");
            System.out.println("ADD SP #1 SP");
            System.out.println("CASTSF");
            System.out.println("MOV -1(SP) -3(SP)");
            System.out.println("SUB SP #1 SP");
            System.out.println("DIVSF");
        }else{
            System.out.println("DIVSF");
        }
    }
    
    static void generateMultiply(String type1, String type2){
        if(type1.equals("MP_FLOAT") && type2.equals("MP_INTEGER")){
            System.out.println("CASTSF");
            System.out.println("MULSF");
        }else if(type1.equals("MP_FLOAT_LIT") && type2.equals("MP_INTEGER_LIT")){
            System.out.println("CASTSF");
            System.out.println("MULSF");
        }else if(type1.equals("MP_FLOAT") && type2.equals("MP_INTEGER_LIT")){
            System.out.println("CASTSF");
            System.out.println("MULSF");
        }else if(type1.equals("MP_FLOAT_LIT") && type2.equals("MP_INTEGER")){
            System.out.println("CASTSF");
            System.out.println("MULSF");
        }else if(type1.equals("MP_INTEGER") && type2.equals("MP_FLOAT")){
            System.out.println("MOV -2(SP) 0(SP)");
            System.out.println("ADD SP #1 SP");
            System.out.println("CASTSF");
            System.out.println("MOV -1(SP) -3(SP)");
            System.out.println("SUB SP #1 SP");
            System.out.println("MULSF");
        }else if(type1.equals("MP_INTEGER_LIT") && type2.equals("MP_FLOAT_LIT")){
            System.out.println("MOV -2(SP) 0(SP)");
            System.out.println("ADD SP #1 SP");
            System.out.println("CASTSF");
            System.out.println("MOV -1(SP) -3(SP)");
            System.out.println("SUB SP #1 SP");
            System.out.println("MULSF");
        }else{
            System.out.println("MULS");
        }
    }
    
    static void generateMod(String type1, String type2){
        if(type1.equals("MP_INTEGER") && type2.equals("MP_INTEGER")){
            System.out.println("MODS");
        }else{
            System.out.println("Syntax Error : Expecting Integer, Integer input");
        }
    }    
    
    static void generateCompEq(){
        System.out.println("CMPEQS");
    }
    
    static void generateCompGe(){
        System.out.println("CMPGES");
    }
    
    static void generateCompGt(){
        System.out.println("CMPGTS");
    }
    
    static void generateCompLe(){
        System.out.println("CMPLES");
    }
    
    static void generateCompLt(){
        System.out.println("CMPLTS");
    }
    
    static void generateCompNe(){
        System.out.println("CMPNES");
    }
}
