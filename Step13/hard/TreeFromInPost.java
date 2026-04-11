package Step13.hard;

// import java.util.*;

// public class TreeFromInPost {

//     public static class Node{
//         Node left;
//         Node right;
//         int val;
//         public Node(int val){
//             this.val = val;
//         }
//     }

//     public static Node Build(int[] postorder , int[] inorder){
//         Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//         for(int i =0;i<inorder.length;i++){
//             map.put(inorder[i],i);
//         }
//         // Node root = Construct(postorder, 0, postorder.length, inorder, 0, inorder.length, map);
//         // return root;
//     }

    // public static Node Construct(int[] postorder,int postStart,int postEnd,int[] inorder ,int inStart,int inEnd , Map<Integer,Integer> map ){
    //     if(postEnd>postStart || inStart >inEnd) return null;
    //     Node root = new Node(postorder[postEnd]);
    //     int inroot = map.get(root.val);
    //     int inright = inEnd - inroot;
    //     root.right = Construct(postorder, postEnd - inright, postEnd-1, inorder, inStart+1, inEnd, map);
    //     root.left = Construct(postorder, postStart, postEnd, inorder, inStart, inEnd, map);

    // }
    
// }
