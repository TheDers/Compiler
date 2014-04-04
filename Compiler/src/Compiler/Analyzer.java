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
    
    static void generateRead(){
        
    }
}
