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
    
    static void generateWriteS(){
        System.out.println("WRTS");
    }
    
    static void generatePush(int value){
        System.out.println("PUSH " + value);
    }
    static void generatePushF(float value){
        System.out.println("PUSH " + value);
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
    
    static void generateAdd(){
        System.out.println("ADDS");
    }
    
    static void generateSubtract(){
        System.out.println("SUBS");
    }
    
    static void generateDivide(){
        System.out.println("DIVS");
    }
    
    static void generateMultiply(){
        System.out.println("MULS");
    }
    
    static void generateMod(){
        System.out.println("MODS");
    }
    
    static void generateDivideF(){
        System.out.println("DIVSF");
    }
}
