package Step13.medium;
import java.util.*;

public class boundaryTraversal {

    public static class Node{
        int val;
        Node left;
        Node right;
        public  Node(int val){
            this.val = val;
        }
    }

    public static boolean isLeaf(Node root){
        return root.left == null && root.right==null ;
    }

    public static void addLeftNode(Node root,List<Integer> res){
        Node curr = root.left;
        while(curr != null){
            if(!isLeaf(curr)) res.add(curr.val);
            if(curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }

    public static void addRightNode(Node root,List<Integer> res){
        Node curr = root.right;
        List<Integer> temp = new ArrayList<>();
        while(curr != null){
            if(!isLeaf(curr)) temp.add(curr.val);
            if(curr.right != null) curr = curr.right;
            else curr = curr.left;
        }
        
        for(int i =temp.size()-1;i>=0;i--){
            res.add(temp.get(i));
        }
    }

    public static void addLeaf(Node root, List<Integer> res){
        if(isLeaf(root)) {
            res.add(root.val);
            return ;
        }

        if(root.left != null){
            addLeaf(root.left, res);  
        }
        if(root.right != null){
            addLeaf(root.right, res);
        }
    }

    public static List<Integer> printBoundary(Node root){
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        if(isLeaf(root)){
            res.add(root.val);
            return res;
        }
        res.add(root.val);
        addLeftNode(root, res);
        addLeaf(root, res);
        addRightNode(root, res);
        return res;
    }

    public static void print(List<Integer> res){
        for(int val: res){
            System.out.print(val +" ");
        }
        System.out.println();
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

        System.out.println(printBoundary(root));


    }
    
}
