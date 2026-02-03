package LeetCode.LinkedList;

public class detectCycle141 {
    public static class Node{
        Node next ;
        int val;
        public  Node(int val){
            this.val = val;
        }
    }
    public static boolean cycle(Node head){
        if(head == null) return false;
        if(head.next == null) return false;
        Node slow = head;
        Node fast = head;
        while(fast != null){
            if(slow == null) return false;
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow ) return true;
        }
        return false;
    }
    
}
