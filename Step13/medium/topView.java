package Step13.medium;
import java.util.*;
public class topView {

    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static class Pair{
        Node node;
        
        int hd;
        Pair(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static ArrayList<Integer> topViewOfTree(Node root){
         ArrayList<Integer> ans = new ArrayList<>();
         if(root == null) return ans;
         Map<Integer , Integer> map = new TreeMap<>();
         Queue<Pair> q = new LinkedList<Pair>();
         q.add(new Pair(root,0));
         while(!q.isEmpty()){
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;
            if (!map.containsKey(hd)) {
                map.put(hd, temp.val);
            }           
             if(temp.left != null){
                q.add(new Pair(temp.left,hd -1));
            }
            if(temp.right != null){
                q.add(new Pair(temp.right, hd+1));
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
        System.out.println(topViewOfTree(root));
    }
    
}
