/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjancymatrix;

/**
 *
 * @author hp
 */
public class TwoDArray {
    private int rows;
    private int columns;
    private int value;
    private int arr[];
   
    public TwoDArray(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        arr=new int[rows*columns];
    }
    
    public void setRows(int rows){
        this.rows=rows;
    }
    
    public void setColumns(int columns){
        this.columns=columns;
    }
    public void setValue(int value){
        this.value=value;
    }
    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int getValue() {
        return value;
    }
    public void addElement(int i,int j,int val){
        int index=i*columns+j;
        arr[index]=val;
       
    }
   
  public int getElemnt(int i,int j){
      int index=i*columns+j;
      return arr[index];
      
  }
}
