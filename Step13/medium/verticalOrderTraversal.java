package Step13.medium;
import java.util.*;
public class verticalOrderTraversal {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    public static class Pair{
        Node node;
        int vertical;
        int level;
        Pair(Node node,int vertical,int level){
            this.node = node;
            this.vertical = vertical;
            this.level = level;
        }
    }
   public static List<List<Integer>> verticalTraversal(Node root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> nodes = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0,0));

        while(!q.isEmpty()){
            Pair p = q.poll();
            Node temp = p.node;
            int x = p.vertical;
            int y = p.level;

            nodes.putIfAbsent(x,new TreeMap<>());
            nodes.get(x).putIfAbsent(y, new PriorityQueue<>());
            nodes.get(x).get(y).offer(temp.val);

            if(temp.left != null){
                q.offer(new Pair(temp.left,x-1,y+1));
            }
            if(temp.right != null){
                q.offer(new Pair(temp.right,x+1,y+1));
            }
        }
        List<List<Integer>> ans = new ArrayList<>();

        for(TreeMap<Integer,PriorityQueue<Integer>> ys : nodes.values()){
            List<Integer> list = new ArrayList<>();
            for(PriorityQueue<Integer> pq : ys.values()){
                while(!pq.isEmpty()){
                    list.add(pq.poll());
                }
            }
            ans.add(list);
        }
        return ans;
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

        System.out.println(verticalTraversal(root));
   }

    
}
