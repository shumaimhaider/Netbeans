/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author hp
 */
public class List {
    int data;
    List next;
    List present,head,tail;
    Graph graph;
    public List(){
        
    }
    public List(int v){
        data=v;
        next=null;
   
    }
   
 public void AtLast(int data){
        List nNode=new List(data);
        if(head==null){
            head=nNode;
            tail=nNode;
        }else{
            tail.next=nNode;
            tail=nNode;
        }
    }  

   public int size(){
       List temp=head;
       int count=0;
       while(temp.next!=null){
           count++;
       }
     return count;
   }  
   public void Display(){
        List temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
     
    }
}
