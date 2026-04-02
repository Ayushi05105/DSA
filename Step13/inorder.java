package Step13;

import Step13.maxDepth.Node;

public class inorder {

    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void inorderTraversal(Node root){
        if(root == null) return;
        if(root.left != null) inorderTraversal(root.left);
        System.out.print(root.val+" ");
        if(root.right != null) inorderTraversal(root.right);
    }
    public static void main(String[] args) {
         Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f= new Node(7);
        b.left =e;
        b.right = f;
        inorderTraversal(root);
    }
}
