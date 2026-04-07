package Step13.hard;

import java.util.*;

public class width {

    public static class Pair{
        Node root;
        int index;
        public Pair(Node root,int index){
            this.root = root;
            this.index = index;
        }
    }
    public static class Node{
        Node left;
        Node right;
        int val;
        public Node(int val){
            this.val = val;
        }
    }

    public static int WidthOfBT(Node root){
        if(root == null) return 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        int maxWidth =0;
        while(!q.isEmpty()){
            int size = q.size();
            int minWidth = q.peek().index;
            int first =0;
            int last =0;

            for(int i =0;i<size;i++){
            Pair p = q.poll();
            int curr = p.index - minWidth;
            if(i == 0) first = curr;
            if(i == size-1) last = curr;
            if(p.root.left!=null){
                q.offer(new Pair(p.root.left,curr*2+1));
            }
            if(p.root.right != null){
                q.offer(new Pair(p.root.right,curr*2+2));
            }
            maxWidth = Math.max(maxWidth,last-first+1);
        }
        
        }
        return maxWidth;
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
        System.out.println(WidthOfBT(root));
    }
    
}
