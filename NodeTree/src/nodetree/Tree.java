/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodetree;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Tree {
    
Scanner objScanner=new Scanner(System.in);
  NodeTree root;
  void addNode(int d,String n,int TMarks ,char g,String cName,String cId,int oMarks){
    NodeTree nNode=new NodeTree(d,n,TMarks,g,cName,cId,oMarks);
 
    NodeTree temp=root;
    
    if(root==null){
      root=nNode;
      return;
    }else{
      while(temp!=null){
        if(d>=temp.id){
          if(temp.right!=null){
            temp=temp.right;
          }else{
            temp.right=nNode;
            return;
          }
         }
          if(d<temp.id){
          if(temp.left!=null){
            temp=temp.left;
          }else{
            temp.left=nNode;
            return;
          }
        }
      }
    }
  }
  
//        int choice;
//      System.out.println(" Enter 0 to add left  1 to add in right.");
//      choice=objScanner.nextInt();
//      switch(choice){
//        case 0:
//          if(temp.left!=null){
//            temp=temp.left;
//            return;
//          }else{
//            temp.left=nNode;
//            return;
//          }
//        case 1:
//          if(temp.right!=null){
//            temp=temp.right;
//            return;
//          }else{
//            temp.right=nNode;
//            return;
//          }
//      }
//    
//    }
//  }
//  } 
  
    int first=0;
    NodeTree tempf;
    int sumM;
    int sumF;
    int countM=0;
    int countF=0;
    void preOrder(NodeTree n){
    if(n==null){
      return;
    }else{
       
       if(first<n.obtainedMarks){
           first=n.obtainedMarks;
           tempf=n;
       }
        System.out.println("____________________________________________");
       if(n.obtainedMarks<15){
           System.out.println("Student failed");
       System.out.println("Id "+n.id);
       System.out.println("Name "+n.name);
       System.out.println("Total Marks "+n.totalMarks);
       System.out.println("Obtained Marks "+n.obtainedMarks);
       System.out.println("Course Name "+n.courseName);
       System.out.println("Course Id "+n.courseId);
       System.out.println("Obtained Marks "+n.obtainedMarks);
       }
        System.out.println("_________________________________________");
       if(n.obtainedMarks>=15){
       System.out.println("Student Passed");
       System.out.println("Id "+n.id);
       System.out.println("Name "+n.name);
       System.out.println("Total Marks "+n.totalMarks);
       System.out.println("Obtained Marks "+n.obtainedMarks);
       System.out.println("Course Name "+n.courseName);
       System.out.println("Course Id "+n.courseId);
       System.out.println("Obtained Marks "+n.obtainedMarks);
       }
       if(n.Gender=='M'){
           sumM=sumM+n.obtainedMarks;
           countM++;
       }
       if(n.Gender=='F'){
           sumF=sumF+n.obtainedMarks;
           countF++;
       }

       }
      preOrder(n.left); 
      preOrder(n.right);
    }
    
 
   
  /////////////////////////////////
      void inOrder(NodeTree n){
     
    if(n==null){
      return;
    }else{
       
      inOrder(n.left); 
        System.out.println("Id "+n.id);
       System.out.println("Name "+n.name);
        System.out.println("Total Marks "+n.totalMarks);
        System.out.println("Obtained Marks "+n.obtainedMarks);
        System.out.println("Course Name "+n.courseName);
        System.out.println("Course Id "+n.courseId);
        System.out.println("Obtained Marks "+n.obtainedMarks);
      inOrder(n.right);
    }
  
  }
  ////////////////////////
    void PostOrder(NodeTree n){ 
    if(n==null){
      return;
    }else{
      inOrder(n.left); 
      inOrder(n.right);
        System.out.println("Id "+n.id);
        System.out.println("Name "+n.name);
        System.out.println("Total Marks "+n.totalMarks);
        System.out.println("Obtained Marks "+n.obtainedMarks);
        System.out.println("Course Name "+n.courseName);
        System.out.println("Course Id "+n.courseId);
        System.out.println("Obtained Marks "+n.obtainedMarks);
    }
  
  }
    boolean found=false;
    NodeTree temp;
    NodeTree tempT;
    Boolean search(NodeTree temp,int data){
        while(temp!=null){
            if(temp.id==data){
                found=true;
                System.out.println("found");
                return true;
            }
            if(temp.id>=data){
                temp=temp.right;
            }else{
                temp=temp.left;
            } 
         }
        if(found!=true){
            System.out.println("not found");
        }
        tempT=temp;
       return false;
    }    
    
    
    public NodeTree Minimum(){
        NodeTree temp=root;
        while(temp.left!=null){
            temp=temp.left;
        }
        System.out.println("minimum "+temp.id);
        return temp;
    }
    
    

    public void PrintFirst(){
        System.out.println("First position hloder detail");
        System.out.println("Id "+tempf.id);
        System.out.println("Name "+tempf.name);
        System.out.println("Total Marks "+tempf.totalMarks);
        System.out.println("Obtained Marks "+tempf.obtainedMarks);
        System.out.println("Course Name "+tempf.courseName);
        System.out.println("Course Id "+tempf.courseId);
        System.out.println("Obtained Marks "+tempf.obtainedMarks);
        System.out.println("____________________________________________");
        System.out.println("Average");
        System.out.println("Average of male "+sumM/countM);
        System.out.println("Average of female "+sumF/countF);
    }
   
//static int successor, predecessor;
 
//    public void successorPredecessor(NodeTree n, int val) {
//        if (root!= null) {
//            if (root.id == val) {
//                if (root.left != null) {
//                    NodeTree t = root.left;
//                    while (t.right != null) {
//                        t = t.right;
//                    }
//                    predecessor = t.id;
//                }
//                if (root.right != null) {
//                    NodeTree t = root.right;
//                    while (t.left != null) {
//                        t = t.left;
//                    }
//                    successor = t.id;
//                }
//            } else if (root.id > val) {
//                successor = root.id;
//                successorPredecessor(root.left, val);
//              } else if (root.id < val) {
//                predecessor = root.id;
//                successorPredecessor(root.right, val);
//            }
//        }
//   }
}

 

  