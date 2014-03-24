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
    private TableElement element;
    public Table table, parentTable;
    public TableElement currElement;
    public boolean printed = false;
    
    private static class Table {
        String tableName;
        Table tableParent;
        int nestingLevel;
        TableElement next;
        Table(String name, Table parent, int nestingLevel, TableElement next){
            this.tableName = name;
            this.tableParent = parent;
            this.nestingLevel = nestingLevel;
            this.next = next;
        }
    }
    private static class TableElement {
        String varName;
        String classType;   //variable, procedure, function, etc.
        String scope;       //in, local, etc.
        String varType;     //integer, boolean, etc.
        TableElement next;
        TableElement(String vName, String varType, String scope, String cType, TableElement next){
            this.varName = vName;
            this.classType = cType;
            this.scope = scope;
            this.varType = varType;
            this.next = next;
        }
    }
    
    public void insert(String varName, String varType ,String scope, String classType){
        element = new TableElement(varName, varType, scope, classType, null);       //create new table element
        if(table.next == null){                                                     //If the symbol table is added, insert the element as the first element of the table
            table.next = element;
        }else {                                                                     //If the symbol table is not empty, find the end of the list and then add on the new element
            currElement = table.next;
            while(currElement.next != null){
                currElement = currElement.next;
            }
            currElement.next = element;
        }
    }
        
    
    public void lookup(String varName){
        for(TableElement x = table.next; x != null; x = x.next){         //loop as long as there are elements in the S Table
            if(varName.equals(x.varName)){  //matcher
                System.out.println(x.varName + " " + x.varType + " " + x.scope + " " + x.classType);
                printed = true;
            }
        }
        if(printed == false){       //if not found, print error message
            System.out.println("Entry Not Found");
        }
    }
    
    public void createSTable(String name, int nestingLevel){
        parentTable = table;                                  //save current table as parent 
        table = new Table(name, null, nestingLevel, null);    //make new current table
        table.tableParent = parentTable;                      //link tables
        
    }
    
    public void destroySTable(){
        table = table.tableParent;  //set parent table to be current table, effectivly destroying current table
    }
    
    public void printSTable(){
        if(table == null){
            System.out.println("NO SYMBOL TABLE EXISTS");
        }else{
            while(table.nestingLevel > 0){
                System.out.println(table.tableName + " " + table.nestingLevel);
                currElement = table.next;
                while(currElement != null){
                    System.out.println(currElement.varName + " " + currElement.varType + " " + currElement.scope + " " + currElement.classType);
                    currElement = currElement.next;
                }
                table = table.tableParent;
            }
            System.out.println(table.tableName + " " + table.nestingLevel);
                currElement = table.next;
                while(currElement != null){
                    System.out.println(currElement.varName + " " + currElement.varType + " " + currElement.scope + " " + currElement.classType);
                    currElement = currElement.next;
                }
        }
    }
}
