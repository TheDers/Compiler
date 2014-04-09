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
    
    static void generateWrite(int offset, int nestingLevel){
        System.out.println("WRT " + offset + "(d" + nestingLevel + ")");
    }
    
    static void generatePush(int value){
        System.out.println("PUSH " + value);
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
}
