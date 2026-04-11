package Step13.hard;

import java.util.Stack;

public class flattenBT {
    public static class Node{
        Node left;
        Node right;
        int val;
        public Node(int val){
            this.val = val;
        }
    }

    public static void FlattentBinaryTree(Node root){
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node curr = st.peek();
            st.pop();
            if(curr.right != null){
                st.push(curr.right);
            }
            if(curr.left != null){
                st.push(curr.left);
            }
            if(!st.isEmpty()){
            curr.right = st.peek();
            }
            curr.left = null;
        }
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
        FlattentBinaryTree(root);
        Node curr = root;
        while(curr != null){
            System.out.print(curr.val+" ");
            curr = curr.right;
        }
       
    }
    
}
