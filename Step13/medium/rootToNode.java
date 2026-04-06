package Step13.medium;

import java.util.ArrayList;

public class rootToNode {

     public static class Node{
        Node root;
        Node left;
        Node right;
        int val;
        Node(int val){
            this.val = val;
         
        }
    }
    public static boolean helper(Node root,ArrayList<Integer> arr,int x){
        if(root == null) return false;
        arr.add(root.val);
        if(root.val == x){
            return true;
        }
        if(helper(root.left, arr, x) || helper(root.right, arr, x)){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;
    }

    public static ArrayList<Integer> solve(Node A,int B){
        ArrayList<Integer> arr = new ArrayList<>();
        if(A==null) return arr;
        helper(A, arr, B);
        return arr;
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
        System.out.println(solve(root, 6));
    }
}
