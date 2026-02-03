package LeetCode.LinkedList;

public class deleteMiddle876 {
     public static class Node{
        Node next ;
        int val;
        public  Node(int val){
            this.val = val;
        }
    }
    public static Node deleteMiddle(Node head){
        Node fast = head;
        Node slow = head;
        if(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
