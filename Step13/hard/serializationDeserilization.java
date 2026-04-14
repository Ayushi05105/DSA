
package Step13.hard;
import java.util.*;
public class serializationDeserilization {

    public static class Node{
        Node root;
        Node left;
        Node right;
        int val;
        
        Node(int val){
            this.val = val;
         
        }
    }

    public static String serilization(Node root){
        if(root == null) return " ";
        Queue<Node> q = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        q.add(root);
        while(!q.isEmpty()){
            Node node = q.poll();
            if(node == null){
                res.append(" ");
                break;
            }
            res.append(node.val+" ");
            q.add(node.left);
            q.add(node.right);
        }
        return res.toString();
    }

    public static Node deserilization(String data){
        if(data == null || data.length() ==0) return null;
        String[] values = data.split(" "); 
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(Integer.parseInt(values[0]));
        q.add(root);
        int i =1;
        while(!q.isEmpty() && i<values.length){
            Node parent = q.poll();
            if(!values[i].equals(" ")){
                Node left = new Node(Integer.parseInt(values[i]));
                parent.left = left;
                q.add(left);
            }
            i++;
            if(i<values.length && !values[i].equals("")){
                Node right = new Node(Integer.parseInt(values[i]));
                parent.right = right;
                q.add(right);
            }
            i++;
        }
        return root;

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
        System.out.println(serilization(root));
    }

    
}
