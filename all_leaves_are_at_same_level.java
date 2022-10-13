public class LeafLevel {  
  
    //Represent a node of binary tree  
    public static class Node{  
        int data;  
        Node left;  
        Node right;  
  
        public Node(int data){  
            //Assign data to the new node, set left and right children to null  
            this.data = data;  
            this.left = null;  
            this.right = null;  
            }  
        }  
  
    //Represent the root of binary tree  
    public Node root;  
  
    //It will store level of first encountered leaf  
    public static int level = 0;  
  
    public LeafLevel(){  
        root = null;  
    }  
  
    //isSameLevel() will check whether all leaves of the binary tree is at same level or not  
    public boolean isSameLevel(Node temp, int currentLevel ) {  
  
        //Check whether tree is empty  
        if(root == null){  
          System.out.println("Tree is empty");  
          return true;  
        }  
        else {  
            //Checks whether node is null  
            if(temp==null)  
                return true;  
  
            if(temp.left == null && temp.right == null) {  
                //If first leaf is encountered, set level to current level  
                if(level == 0) {  
                    level = currentLevel ;  
                    return true;  
                }  
                //Checks whether the other leaves are at same level of that of first leaf  
                else  
                   return (level == currentLevel) ;  
             }  
  
            //Checks for leaf node in left and right subtree recursively.  
            return  (isSameLevel(temp.left, currentLevel + 1) && isSameLevel(temp.right, currentLevel + 1)) ;  
         }  
    }  
  
    public static void main (String[] args) {  
  
        LeafLevel bt = new LeafLevel();  
        //Add nodes to the binary tree  
        bt.root = new Node(1);  
        bt.root.left = new Node(2);  
        bt.root.right = new Node(3);  
        bt.root.left.left = new Node(4);  
        bt.root.right.left = new Node(5);  
        bt.root.right.right = new Node(6);  
  
        //Checks whether all leaves of given binary tree is at same level  
        if(bt.isSameLevel(bt.root, 1))  
            System.out.println("All leaves are at same level");  
        else  
            System.out.println("All leaves are not at same level");  
  }  
}  
