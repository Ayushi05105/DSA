package Step13.hard;
import java.util.*;

public class minTimetoBurn {
    public static class Node{
        Node left;
        Node right;
        int val;
        public Node(int val){
            this.val = val;
        }
    }
    public static void markparent(Node root, Map<Node,Node> parent){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr.left != null){
                parent.put(curr.left,curr);
                q.offer(curr.left);
            }
            if(curr.right != null){
                parent.put(curr.right,curr);
                q.offer(curr.right);
            }
        }
    }

        public static int minTime(Node root,Node target){
            Map<Node,Node> parent = new HashMap<>();
            markparent(root,parent);
            Queue<Node> q = new LinkedList<>();
            Map<Node,Boolean> visited = new HashMap<>();
            q.offer(target);
            visited.put(target,true);

            int time =0;

            while(!q.isEmpty()){
            int size = q.size();
            boolean burned = false;

            for(int i =0;i<size;i++){
                Node curr = q.poll();

                if(curr.left != null && !visited.containsKey(curr.left) ){
                    burned = true;
                    visited.put(curr.left,true);
                    q.offer(curr.left);
                }

                if(curr.right != null && !visited.containsKey(curr.right) ){
                    burned = true;
                    visited.put(curr.right,true);
                    q.offer(curr.right);
                }

                Node par = parent.get(curr);
                if(par != null && !visited.containsKey(par)){
                    burned = true;
                    visited.put(par,true);
                    q.offer(par);
                }
            }
            if(burned) time++;
        }
        return time;
        }
        public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.left.left.right = new Node(7);
        Node target = root;
        int res = minTime(root, target);
        System.out.println(res );
        }
    

    }

