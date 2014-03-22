/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Compiler;
import java.util.*;

/**
 *
 * @author Anders
 */
public class SymbolTable {
    private List st;
    private Table table;
    private static class Table {
        String tableName;
        Table tableParent;
        //Int nesting level
        Table(String name, Table parent){
            this.tableName = name;
            this.tableParent = parent;
        }
    }
    private static class List {
        String varName;
        String classType;   //variable, procedure, function, etc.
        String scope;       //in, local, etc.
        String varType;     //integer, boolean, etc.
        List next;
        List(String vName, String cType, String scope, String varType, List next){
            this.varName = vName;
            this.classType = cType;
            this.scope = scope;
            this.varType = varType;
            this.next = next;
        }
    }
    
    public void insert(String varName, String classType ,String scope, String varType){
        st = new List(varName, classType, scope, varType, st);
    }
    
    public void tableHeader(){
        System.out.println(table.tableName);
    }
    
    public void tableParent(){
        System.out.println(table.tableParent);
    }
    
    public String lookup(String varName){
        for(List x = st; x != null; x = x.next){
            if(varName.equals(x.varName)){
                return x.varName + " " + x.classType + " " + x.scope + " " + x.varType;
            }
        }
        return "Entry Not Found";
    }
    
    public void createSTable(String name, String parent){
        table = new Table(name, parent);
    }
    
    public void destroySTable(){
        
    }
}
