package LeetCode.LinkedList;

public class reverseBtw92 {
     public static class Node{
        Node next ;
        int val;
        public  Node(int val){
            this.val = val;
        }
    }
       public Node reverseBetween(Node head, int left, int right) {
        Node dummy = new Node(0);
        dummy.next = head;
        if(head == null) return head;
        if(left == right) return head;
        Node prev = dummy;
        for(int i = 1;i< left ;i++){
            prev = prev.next;
        }
        Node curr = prev.next;
        Node after = null;
        for(int i =0;i< right-left;i++){
            after = curr.next;
            curr.next= after.next;
            after.next = prev.next;
            prev.next = after;
            
        }
        return dummy.next;
    }
}
