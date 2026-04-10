package Step13.hard;

public class countNoOfNodes {

        public static class Node{
        Node left;
        Node right;
        int val;
        public Node(int val){
            this.val = val;
        }
    }

    public static int getRightHeigth(Node root){
        int count =0;
        while(root != null){
            count++;
            root = root.right;
        }
        return count;
    }

    public static int getLeftHeigth(Node root){
        int count =0;
        while(root != null){
            count++;
            root = root.left;
        }
        return count;
    }

    public static int NoofNodes(Node root){
        if(root == null) return 0;
        int lh = getLeftHeigth(root);
        int rh = getRightHeigth(root);
        if(lh == rh) return ((1 << lh) -1);
        else  return 1 + NoofNodes(root.left) + NoofNodes(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(35);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(5);
        Node f = new Node(2);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        System.out.println(NoofNodes(root));
    }
}
