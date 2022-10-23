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
      //Write your code here
      if(root == null )
        System.out.println(root);
        
        Queue<Node> qu = new LinkedList<Node>();
        qu.add(root);
        while(!qu.isEmpty())
        {
            int size = qu.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i = 0; i< size; i++)
            {
                Node current = qu.remove();
                currentLevel.add(current.data);
                if(current.left != null)
                    qu.add(current.left);
                if(current.right != null)
                    qu.add(current.right);
                    
                System.out.print(current.data+" ");
            }
            
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
