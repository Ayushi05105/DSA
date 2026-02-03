package LeetCode.LinkedList;

public class palindrome {

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

    public static boolean palindromeList(Node head){
        Node slow = null;
        Node fast = null;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
            Node temp = reverse(slow.next);
            slow.next = temp;
            Node p1 = head;
            Node p2 = slow.next;
            while(p2!= null){
                if(p1.val != p2.val) return false;
                p1 = p1.next;
                p2 = p2.next;
            }
            return true;
    }
    
}
