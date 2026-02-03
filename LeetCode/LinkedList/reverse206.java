package LeetCode.LinkedList;

public class reverse206 {
     public static class Node{
        Node next ;
        int val;
        public  Node(int val){
            this.val = val;
        }
    }
    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node after = curr.next;
        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    
}
