package Step13.hard;

import java.util.*;


public class allNodeDistK {

    public static class Node{
        Node left;
        Node right;
        int val;
        public Node(int val){
            this.val = val;
        }
    }
  
     public static void MarkParent(Node root, Map<Node,Node> trackParent, Node target){
        Queue<Node> q = new LinkedList<Node>();
        q.offer(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr.left != null){
                trackParent.put(curr.left,curr);
                q.offer(curr.left);
            }
            if(curr.right != null){
                trackParent.put(curr.right,curr);
                q.offer(curr.right);
            }
        }
    }
    public static List<Integer> distanceK(Node root, Node target, int k) {
        Map<Node,Node> trackParent = new HashMap<>();
        MarkParent(root,trackParent,target);
        Map<Node,Boolean> visited = new HashMap<>();
        Queue<Node> q = new LinkedList<Node>();

        q.offer(target);
        visited.put(target,true);
        int currLevel = 0;
        while(!q.isEmpty()){
            int size = q.size();
            if(currLevel == k) break;
            currLevel++;

            for(int i =0;i<size;i++){
                Node curr = q.poll();
                if(curr.left != null && visited.get(curr.left) == null){
                    q.offer(curr.left);
                    visited.put(curr.left,true);
                }
                if(curr.right != null && visited.get(curr.right) == null){
                    q.offer(curr.right);
                    visited.put(curr.right,true);
                }
                Node parent = trackParent.get(curr);
                if(parent != null && visited.get(parent) == null){
                    q.offer(parent);
                    visited.put(parent,true);
                }
            }
            
        }
        List<Integer> res = new ArrayList<>();
            while(!q.isEmpty()){
                Node curr = q.poll();
                res.add(curr.val);
            }
        return res;
    }
  
  public static void main(String[] args) {
    Node root = new Node(3);
    Node a = new Node(5);
    Node b = new Node(1);
    Node c = new Node(6);
    Node d = new Node(2);
    Node e = new Node(0);
    Node f = new Node(8);
    Node g = new Node(7);
    Node h = new Node(4);
    root.left = a;
    root.right = b;
    a.left = c;
    a.right = d;
    b.left = e;
    b.right = f;
    d.left = g;
    d.right = h;
    Node target = root.left;
    int k = 2;
    List<Integer> res = distanceK(root,target,k);
    for(int val : res){
        System.out.print(val+" ");
    }
   
  }
}

    

