package Step13;
import java.util.*;


public class iterativeTraversal {
    public static class Node{
        int val;
        Node root;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public static List<Integer> preorderTraversal(Node root){
        Stack<Node> st = new Stack<>();
        st.push(root);
        List<Integer> preorder = new ArrayList<>();
        if(root == null){
            return preorder;
        }

        while(!st.isEmpty()){
            root = st.pop();
            preorder.add(root.val);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left != null){
                st.push(root.left);
            }
        }
        return preorder;
    }


    public static List<Integer> inorderTraversal(Node root){
        Stack<Node> st = new Stack<>();
        List<Integer> inorder = new ArrayList<>();
        Node curr = root;
        while(true){
        if(curr != null){
            st.push(curr);
            curr = curr.left;
        }
        else{
        if(st.isEmpty()){
            break;
        }    
        curr = st.pop();
        inorder.add(curr.val);
        curr = curr.right;
    }
}
        return inorder;
    }

// postorder using 2 stack

    public static List<Integer> postorderTraversal(Node root){
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        List<Integer> postorder = new ArrayList<>();

        if(root == null) return postorder;
        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.add(root);
            if(root.left != null) st1.add(root.left);
            if(root.right != null) st1.add(root.right);
        }
        while(!st2.isEmpty()){
            postorder.add(st2.pop().val);
        }
        return postorder;
    }



    //postOrder using 1 stack

    public static List<Integer> postorderTrav(Node root){
        Stack<Node> st = new Stack<>();
        List<Integer> post = new ArrayList<>();
        Node curr = root;
        
        while(curr != null || !st.isEmpty()){
            if(curr!=null){
                st.push(curr);
                curr = curr.left;
            }
            else{
               Node temp = st.peek().right;
                if(temp == null){
                    temp = st.peek();
                    st.pop();
                    post.add(temp.val);
                    while(!st.isEmpty() && temp == st.peek().right){
                        temp = st.peek();
                        st.pop();
                        post.add(temp.val);
                    }
                }
                else{
                    curr = temp;
                }
            }
        }
        return post;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        System.out.println(preorderTraversal(root));
        System.out.println(inorderTraversal(root));
        System.out.println(postorderTraversal(root));
        System.out.println(postorderTrav(root));
    }
    
}
