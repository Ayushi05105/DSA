package Step13.medium;

import java.util.*;


public class bottomView {

    public static class Node{
        int val;
        Node left;
        Node right;
        int hd;
        public Node(int val){
            this.val = val;
           
        }
    }

    public static ArrayList<Integer> bottomViewOfTree(Node root){
         ArrayList<Integer> ans = new ArrayList<>();
         if(root == null) return ans;
         Map<Integer , Integer> map = new TreeMap<>();
         Queue<Node> q = new LinkedList<>();
         root.hd = 0;
         q.add(root);
         while(!q.isEmpty()){
            Node temp  = q.remove();
           
            int hd = temp.hd;
            map.put(hd,temp.val);
                      
             if(temp.left != null){
                temp.left.hd = hd-1;
                q.add(temp.left);
            }
            if(temp.right != null){
                temp.right.hd = hd+1;
                q.add(temp.right);
            }
         }
         for (int value : map.values()) {
            ans.add(value);
        }
         return ans;

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
        System.out.println(bottomViewOfTree(root));
    }
    
}
