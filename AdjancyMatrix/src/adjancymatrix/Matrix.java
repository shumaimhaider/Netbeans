/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjancymatrix;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Matrix {
    
   TwoDArray d;
   Scanner objScanner=new Scanner(System.in);
           
   
   public Matrix(int inputGraph){
      d=new TwoDArray(inputGraph,inputGraph);
   }

 public void intialize2dArray(){
     for(int i=0;i<this.d.getRows();i++){
                   for(int j=0;j<this.d.getColumns();j++){
                       d.addElement(i, j,0);
 }
     }
 }
   public void addEdge(int i,int j,int bool){
            
                         if(bool==1){
                                
                               d.addElement(i-1, j-1, 1);
                         }
                         if(bool==0){
                             d.addElement(i-1, j-1, 1);
                             d.addElement(j-1, i-1, 1);
                         }

   }
      public void print(){
           System.out.println("___________________________________");
                for(int i=0;i<this.d.getRows();i++){
                   for(int j=0;j<this.d.getColumns();j++){        
                           System.out.print(d.getElemnt(i, j)+" ");
   
}
                   
                   System.out.println("");  
                }
           System.out.println("________________________________________");
      
}
}
