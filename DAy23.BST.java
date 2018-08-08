Input Format

The locked stub code in your editor reads the following inputs and assembles them into a BST: 
The first line contains an integer,T  (the number of test cases). 
The T subsequent lines each contain an integer,data , denoting the value of an element that must be added to the BST.

Output Format

Print the data value of each node in the tree's level-order traversal as a single line of N space-separated integers.
Solution
import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
  	static void levelOrder(Node root){
      Queue<Node> queue =new LinkedList<Node>();
        queue.add(root);
        while(queue.peek()!=null)
        {
            Node node=queue.remove();
            System.out.print(node.data+" ");
            if(node.left!=null)
                queue.add(node.left);
            if(node.right!=null)
                queue.add(node.right);
        }
            
        }
  	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}

