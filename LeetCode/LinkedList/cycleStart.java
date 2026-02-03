package LeetCode.LinkedList;

public class cycleStart {
    public static class Node{
        Node next ;
        int val;
        public  Node(int val){
            this.val = val;
        }
    }
   public static Node cycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow ) break;
        }
        if(fast == null || fast.next == null) return null;
        Node temp = head;
        while(temp!= slow){
            slow = slow.next;
            temp = temp.next;
        }
        return temp;
    }    
}
