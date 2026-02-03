package LeetCode.LinkedList;

public class mergeSorted21 {
     public static class Node{
        Node next ;
        int val;
        public  Node(int val){
            this.val = val;
        }
    }
    public static Node merge(Node list1,Node list2){
        Node l1 = list1;
        Node l2 = list2;
        Node h = new Node(100);
        Node t = h;
        while(l1 != null && l2!= null){
            if(l1.val < l2.val){
            t.next = l1;
            t = l1;
            l1 = l1.next;
        }
        else{
            t.next = l2;
            t = l2;
            l2 = l2.next;
        }
    }
        if(l1== null) t.next = l2;
        if(l2== null) t.next = l1;
        return h.next;
    
    }
}
