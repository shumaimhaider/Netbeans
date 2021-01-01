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
public class AdjancyMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objScanner=new Scanner(System.in);
        int choice;
        int bool;
        int source;
        int destination;
        System.out.println("Enter number of vertices");
        Matrix m=new Matrix(objScanner.nextInt());
        m.intialize2dArray();
        
        
        
          do{              
                        System.out.println("_________________________");
                        System.out.println("Menu Select 1 choice");
			System.out.println("press 1 to  Add edges");
                        System.out.println("press 2 to display");
			System.out.println("Enter you choice:");
			choice=objScanner.nextInt();
                       
      
     switch(choice){
         
     case 1:
  
     System.out.println("Enter 0 for undirected and 1 for directed graph");
     bool=objScanner.nextInt();
     System.out.println("Enter source");
     source=objScanner.nextInt();
     System.out.println("Enter Destination");
     destination=objScanner.nextInt();
     m.addEdge(source, destination,bool);
        
     case 2:
        m.print();
     }
    
     
      }while(choice!=-1);
    
      
    }
    
}
