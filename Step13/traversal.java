package Step13;
import java.util.*;

public class traversal {
    public static class Node{
        int val;
        Node root;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public static void inorder(Node root){
        if(root == null) return;
        if(root.left != null) inorder(root.left);
        System.out.print(root.val+" ");
        if(root.right != null) inorder(root.right);
    }

    public static void preorder(Node root){
        if(root == null) return;
        
        System.out.print(root.val+" ");
        if(root.left != null) preorder(root.left);
        if(root.right != null) preorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null) return;
        
        if(root.left != null) postorder(root.left);
        if(root.right != null) postorder(root.right);
        System.out.print(root.val+" ");
    }

    public static void levelOrder(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node curr = q.poll();
                System.out.print(curr.val+" ");
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            System.out.println();
        }
    } 

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(8);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(9);
        Node i = new Node(10);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        d.right = e;
        b.left = f;
        b.right = g;
        g.left = h;
        g.right = i;
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelOrder(root);

    }
    
}
