package Step13.medium;


public class symmetricTree {
     
     public static class Node{
        int val;
        Node left;
        Node right;
        
        public Node(int val){
            this.val = val;
           
        }
    }

    public static boolean helper(Node left,Node right){
        if(left == null || right == null){
            return left==right;
        }
        if(left.val != right.val) return false;
 
        return helper(left.left,right.right) && helper(left.right,right.left);
    }

    public static boolean isSymmetric(Node root){
        return root == null || helper(root.left,root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(7);
        Node f = new Node(6);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        d.left = f;
        System.out.println(isSymmetric(root));
    }
    
}
