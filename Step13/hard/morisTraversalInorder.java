package Step13.hard;
import java.util.*;

public class morisTraversalInorder {

    public static class Node{
        Node left;
        Node right;
        int val;
        public Node(int val){
            this.val = val;
        }
    }

    public static ArrayList<Integer> morrisInorder(Node root){
        Node curr = root;
        ArrayList<Integer> inorder = new ArrayList<>();
        while(curr != null){
        if(curr.left == null){
            inorder.add(curr.val);
            curr = curr.right;
        }
        else{
            Node prev = curr.left;
            while(prev.right!= null && prev.right != curr){
                prev = prev.right;
            }
            if(prev.right == null){
                prev.right = curr;
                curr = curr.left;
            }
            else{
                prev.right = null;
                inorder.add(curr.val);
                curr = curr.right;
            }
        }
    }
        return inorder;
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
        System.out.println(morrisInorder(root));
    } 
}
