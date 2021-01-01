/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodetree;


public class NodeTree {
      NodeTree left;
      NodeTree right;
        int id;
        String name;
        int totalMarks;
        char Gender;
        String courseName;
        String courseId;
        int obtainedMarks;
    public NodeTree(){
        
    }
    public NodeTree(int d,String n,int TMarks ,char g,String cName,String cId,int oMarks){
        id=d;
        left=null;
        right=null;
        name=n;
       totalMarks=TMarks;
       Gender=g;
       courseName=cName;
       courseId=cId;
       obtainedMarks=oMarks;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
    
    Tree objTree=new Tree();
    objTree.addNode(20," shumaim ",30, 'M',"DSA","DSA123",28);
    objTree.addNode(10," shaan ",30, 'M',"DSA","DSA123",20);
    objTree.addNode(30," ahmad ",30,'M',"DSA","DSA123",3);
    objTree.addNode(5," ali ",30,'M',"DSA","DSA123",3);
    objTree.addNode(15," areesh ",30,'F',"DSA","DSA123",15);
    objTree.addNode(14," ayesha ",30,'F',"DSA","DSA123",22);
//    objTree.preOrder(objTree.root);
//    objTree.PrintFirst();
   objTree.inOrder(objTree.root);
   // objTree.Minimum();

        
    
}
}
