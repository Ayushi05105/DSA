package Step13.medium;
import java.util.*;

public class zigZagLevel {

    public static class Node{
        int val;
        Node left;
        Node right;
        public  Node(int val){
            this.val = val;
        }
    }

    public static List<List<Integer>> ZigZagTraversal(Node root){

        
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null) return res;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        boolean LtoR = true;
        while(!q.isEmpty()){
            
            int size = q.size();
            Integer[] level = new Integer[size];
            for(int i =0;i<size;i++){
                Node curr = q.poll();
                 int index = LtoR ? i : size-i-1;
                 level[index] = curr.val;
                 if(curr.left != null) q.offer(curr.left);
                 if(curr.right != null) q.offer(curr.right);

            }
            LtoR = !LtoR;
            res.add(new ArrayList<>(Arrays.asList(level)));
        }
        return res;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        d.left = e;

        System.out.println(ZigZagTraversal(root));

    }
    
}
