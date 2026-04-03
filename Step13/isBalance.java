package Step13;

import Step4.BinarySearchOn1D.search;

public class isBalance {

    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public static int checkBalance(Node root){
        if(root == null) return 0;
        int lh = checkBalance(root.left);
        if(lh ==-1 ) return-1;
        int rh = checkBalance(root.right);
        if(rh == -1) return -1;
        if(Math.abs(lh-rh)> 1) return -1;
        return Math.max(lh,rh) +1;
    }
    public static boolean balance(Node root){
        return checkBalance(root) != -1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        System.out.println(balance(root));
    }
}
