package Step13.medium;
import java.util.*;

public class rightview {

    public static class Node{
        int val;
        Node left;
        Node right;
        int hd;
        public Node(int val){
            this.val = val;
           
        }
    }


    public static void rightView(Node curr, ArrayList<Integer> level , int currdepth){
        if(curr == null) return;

        if(currdepth == level.size()){
            level.add(curr.val);
        }
        rightView(curr.right, level, currdepth+1);   // for left view first call left then right
        rightView(curr.left, level, currdepth+1);
    }

    public static List<Integer> rightSideView(Node root){
        ArrayList<Integer> level = new ArrayList<>();
        rightView(root, level, 0);
        return level;
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
        System.out.println(rightSideView(root));
    }
    
}
