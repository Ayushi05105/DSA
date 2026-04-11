package Step13.hard;
import java.util.*;

public class TreeFromInPre {
    public static class Node{
        Node left;
        Node right;
        int val;
        public Node(int val){
            this.val = val;
        }
    }

    public static void PrintInorder(Node root){
        if(root == null) return;
        if(root.left != null) PrintInorder(root.left);
        System.out.print(root.val +" ");
        if(root.right!=null) PrintInorder(root.right);
    }

    public static Node BuildTree(int[] preOrder,int[] inOrder){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i =0;i<inOrder.length;i++){
            map.put(inOrder[i],i);
        }
        Node root = construct(preOrder,0, preOrder.length-1, inOrder, 0, inOrder.length-1, map);
        return root;

    }

    public static Node construct(int[] preOrder,int preStart,int preEnd,int[] inOrder,int inStart,int inEnd,Map<Integer,Integer> map){
        if(preStart > preEnd || inStart > inEnd ) return null;
        Node root = new Node(preOrder[preStart]);

        int inRoot = map.get(root.val);
        int left = inRoot - inStart;

        root.left = construct(preOrder, preStart+1, preStart + left, inOrder, inStart, inRoot-1, map);
        root.right= construct(preOrder, preStart+left+1, preEnd, inOrder, inRoot +1, inEnd, map);
        return root;

    }
    public static void main(String[] args) {
        int[] inOrder = {9,3,15,20,7};
        int[] preOrder = {3,9,20,15,7};
        Node root = BuildTree(preOrder, inOrder);
        PrintInorder(root);
    }
    
}
