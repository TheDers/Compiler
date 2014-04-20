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
            System.out.println("CASTSI");
            System.out.println("ADDS");
        }else{
            System.out.println("ADDS");
        }
    }
    
    static void generateSubtract(String type1, String type2){
        if(type1.equals("MP_FLOAT") && type2.equals("MP_INTEGER")){
            System.out.println("CASTSI");
            System.out.println("SUBS");
        }else{
            System.out.println("SBUS");
        }
    }
    
    static void generateDivide(String type1, String type2){
        if(type1.equals("MP_FLOAT") && type2.equals("MP_INTEGER")){
            System.out.println("CASTSI");
            System.out.println("DIVS");
        }else{
            System.out.println("DIVS");
        }
    }
    
    static void generateMultiply(String type1, String type2){
        if(type1.equals("MP_FLOAT") && type2.equals("MP_INTEGER")){
            System.out.println("CASTSI");
            System.out.println("MULS");
        }else{
            System.out.println("MULS");
        }
    }
    
    static void generateMod(String type1, String type2){
        if(type1.equals("MP_FLOAT") && type2.equals("MP_INTEGER")){
            System.out.println("CASTSI");
            System.out.println("MODS");
        }else{
            System.out.println("MODS");
        }
    }
    
    static void generateDivideF(String type1, String type2){
        if(type1.equals("MP_FLOAT") && type2.equals("MP_INTEGER")){
            System.out.println("CASTSI");
            System.out.println("DIVSF");
        }else{
            System.out.println("DIVSF");
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
