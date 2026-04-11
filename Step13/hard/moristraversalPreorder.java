package Step13.hard;

import java.util.ArrayList;

public class moristraversalPreorder {
    public static class Node{
        Node left;
        Node right;
        int val;
        public Node(int val){
            this.val = val;
        }
    }

    public static ArrayList<Integer> morrisPreorder(Node root){
        Node curr = root;
        ArrayList<Integer> preorder = new ArrayList<>();
        while(curr != null){
        if(curr.left == null){
            preorder.add(curr.val);
            curr = curr.right;
        }
        else{
            Node prev = curr.left;
            while(prev.right!= null && prev.right != curr){
                prev = prev.right;
            }
            if(prev.right == null){
                preorder.add(curr.val);
                prev.right = curr;
                curr = curr.left;
            }
            else{
                prev.right = null;  
                curr = curr.right;
            }
        }
    }
        return preorder;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(35);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(5);
        Node f = new Node(2);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        System.out.println(morrisPreorder(root));
    } 
    
}
