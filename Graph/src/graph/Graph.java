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
public class Graph {
  private int size;
  
  List Graph[];
 
   public Graph(int size) {
        this.size = size;
        Graph=new List[size];
    }  
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
 
 
    
 public void addEdge(int s, int d,int bool){
     if(bool==1){
         
     
     if(Graph[s-1]==null){
         Graph[s-1]=new List();
     }
      Graph[s-1].AtLast(d);
//      System.out.println("___________________________________________");
//      System.out.print(s-1+"  vertice"+ " connected to ");
//      Graph[s-1].Display();
     }
      
      if(bool==0){
     if(Graph[s-1]==null){
     Graph[s-1]=new List();
     }
     Graph[s-1].AtLast(d); 
     int temp=s;
      s=d;
      d=s;
      Graph[s-1].AtLast(d); 
        }
     
// System.out.println("__________________");
//System.out.print(s-1+" vertice"+ " connected to ");
//      Graph[s-1].Display();
      }
      
 
 public void Display(){
     for(int i=0;i<size;i++){
         System.out.println("__________________________________");
         System.out.print( i+" vertex connected to "+ ", ");
           for(int j=0;j<Graph[i].size();j++){
            List temp=Graph[i].head;
           while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
               }
         
     }
     }
 }

 
 

 
 

 
  

