package LeetCode.LinkedList;

public class removeNfromEnd {
    public static class Node{
        Node next ;
        int val;
        public  Node(int val){
            this.val = val;
        }
    }

    public static Node removeNthFromEnd(Node head, int n) {
        Node temp = new Node(0);
        temp.next = head;
        Node fast = temp;
        Node slow = temp;
        for(int i = 1;i<=n+1;i++){
                fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        if(slow.next != null) slow.next = slow.next.next;
        return temp.next;
    }
    
}
