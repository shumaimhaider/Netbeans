/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class GraphMain {

    
    public static void main(String[] args) {
   
     int bool;
     int choice;
     int source;
     int destination;
     
     Scanner objScanner=new Scanner(System.in);
     System.out.println("Enter number of vertices");
     
    Graph objGraph=new Graph(objScanner.nextInt());
    
    
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
     objGraph.addEdge(source, destination,bool);
        
     case 2:
        objGraph.Display();
     }
    
     
      }while(choice!=-1);
    
      
  
      
    }
    
}

