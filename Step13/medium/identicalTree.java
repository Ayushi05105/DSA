package Step13.medium;

public class identicalTree {

    public static class Node{
    int val;
    Node root1;
    Node root2;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
    }
}

    public static boolean sameTree(Node root1,Node root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.val != root2.val) return false;
        return sameTree(root1.left, root2.left) && sameTree(root1.right, root2.right);
    }
    
    public static void main(String[] args) {
        Node root1 = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        root1.left = a;
        root1.right = b;
        a.left = c;
        a.right = d;


        Node root2 = new Node(1);
        Node e = new Node(2);
        Node f = new Node(3);
        Node g = new Node(4);
        Node h = new Node(5);
        root2.left = e;
        root2.right = f;
        e.left = g;
        e.right = h;

        System.out.println(sameTree(root1, root2));
    }
}
