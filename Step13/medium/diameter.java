package Step13.medium;

public class diameter {

    public static class Node{
    int val;
    Node root;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
    }
}
    public static int height(Node root,int[] diameter){
        if(root == null) return 0;
        int lh = height(root.left, diameter);
        int rh = height(root.right, diameter);
        diameter[0] = Math.max(diameter[0],lh+rh);
        return 1+ Math.max(lh,rh);
    }

    public static int diameteroftree(Node root){
        int[] diameter = new int[1];
        height(root, diameter);
        return diameter[0];
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
        System.out.println(diameteroftree(root));
    }
    
}
