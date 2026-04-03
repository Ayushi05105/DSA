package Step13.medium;

public class maxDepth {
    public static class Node{
        Node root;
        Node left;
        Node right;
        int val;
        Node(int val){
            this.val = val;
         
        }
    }

    public static int MaxDepth(Node root){
        if(root == null) return 0;
        int lh = MaxDepth(root.left);
        int rh = MaxDepth(root.right);
        return 1+Math.max(lh,rh);
    }
    

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(0);
        Node b = new Node(2);
        root.left = a;
        root.right = b;
        System.out.println(MaxDepth(root));
    }
}
