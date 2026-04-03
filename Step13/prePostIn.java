package Step13;
import java.util.*;

public class prePostIn {
    public static class Pair{
        Node node;
        int num;
        Pair(Node node,int num){
            this.node = node;
            this.num = num;
        }
    }
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public static void allTraversal(Node root){
        Stack<Pair> st = new Stack<Pair>();
        
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        if(root == null) return;
        st.push(new Pair(root,1));
        while(!st.isEmpty()){
            Pair it = st.pop();
            if(it.num ==1){
                pre.add(it.node.val);
                it.num++;
                st.push(it);
                if(it.node.left != null){
                    st.push(new Pair(it.node.left,1));
                }
            }
            else if(it.num == 2){
                in.add(it.node.val);
                it.num++;
                st.push(it);
                if(it.node.right != null){
                    st.push(new Pair(it.node.right,1));
                }
            }
            else{
                post.add(it.node.val);
            }

        }
        System.out.print(pre);
        System.out.println();
        System.out.print(in);
        System.out.println();
        System.out.print(post);

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
        allTraversal(root);

    }
    
}
