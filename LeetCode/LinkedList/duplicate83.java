package LeetCode.LinkedList;

public class duplicate83 {
    public static class Node{
        Node next ;
        int val;
        public  Node(int val){
            this.val = val;
        }
    }

     public Node deleteDuplicates(Node head) {
        Node temp = head;
        if(temp == null) return head;
        while(temp.next!= null){
        if(temp.val == temp.next.val ){
            temp.next = temp.next.next;
        }
        else temp = temp.next;
        }
     return head;
    }
    
}
