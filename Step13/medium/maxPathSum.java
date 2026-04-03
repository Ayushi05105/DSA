package Step13.medium;

public class maxPathSum {

    public static class Node{
    int val;
    Node root;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
    }
}
    public static int maxPathDown(Node root, int[] max){
        if(root == null) return 0;
        int left = Math.max(0,maxPathDown(root.left, max));
        int right = Math.max(0,maxPathDown(root.right, max));
        max[0] = Math.max(max[0],left + right +root.val);
        return Math.max(left,right) + root.val;
    }

    public static int maxSum(Node root){
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        maxPathDown(root, max);
        return max[0];
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        System.out.println(maxSum(root));
    }
    
}
