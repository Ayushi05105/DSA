package Step13.medium;

public class lca {


    public static class Node{
        Node root;
        Node left;
        Node right;
        int val;
        
        Node(int val){
            this.val = val;
         
        }
    }
    public static Node LowestCommonAncestor(Node root, Node p,Node q){
        if(root == null || root == p || root == q) return root;
        Node left = LowestCommonAncestor(root.left, p, q);
        Node right = LowestCommonAncestor(root.right, p, q);
        if(left == null) return right;
        else if(right == null) return left;
        else{
            return root;
        }
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
        Node p = e;
        Node q = f;
        Node lca = LowestCommonAncestor(root, p, q);
        System.out.println(lca.val);
    }
    
}
