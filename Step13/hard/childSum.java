package Step13.hard;

public class childSum {

    public static class Node{
        Node left;
        Node right;
        int val;
        public Node(int val){
            this.val = val;
        }
    }


    // RECURSIVE LEVEL ORDER TRAVERSAL
    public static int height(Node root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public static void level(Node root,int level){
        if(root == null) return ;
        if(level == 1){
            System.out.print(root.val+" ");
        }
        else{
            level(root.left, level-1);
            level(root.right, level-1);
        }
    }
    public static void levelOrder(Node root){
        int h = height(root);
        for(int i =1;i<=h;i++){
            level(root, i);
            System.out.println();
        }
    }


    //INORDER TRAVERSAL
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void changeTree(Node root){
        if(root == null) return ;
        int child = 0;
        if(root.left != null){
            child += root.left.val;
        }
        if(root.right!=null){
            child += root.right.val;
        }
        if(child >= root.val){
            root.val = child;
        }
        else{
            if(root.left != null) root.left.val = root.val;
            if(root.right != null) root.right.val = root.val;
        }
        changeTree(root.left);
        changeTree(root.right);
        int total = 0;
        if(root.left != null){
            total+= root.left.val;
        }
        if(root.right != null){
            total += root.right.val;
        }
        if(root.left!= null || root.right != null) root.val = total;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(35);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(5);
        Node f = new Node(2);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
       changeTree(root);
       inorder(root);
       System.out.println();
       levelOrder(root);
    }
    
}





// public class Solution {
//     public static int minSwapsToPalindrome(String s) {
//         char[] arr = s.toCharArray();
//         int n = arr.length;

//         // Check if possible
//         int[] freq = new int[26];
//         for (char c : arr) freq[c - 'a']++;

//         int odd = 0;
//         for (int f : freq) {
//             if (f % 2 != 0) odd++;
//         }
//         if (odd > 1) return -1;

//         int swaps = 0;
//         int left = 0, right = n - 1;

//         while (left < right) {
//             if (arr[left] == arr[right]) {
//                 left++;
//                 right--;
//             } else {
//                 int k = right;

//                 // find matching char
//                 while (k > left && arr[k] != arr[left]) {
//                     k--;
//                 }

//                 if (k == left) {
//                     // no match → move it toward center
//                     swap(arr, k, k + 1);
//                     swaps++;
//                 } else {
//                     // bring match to right
//                     while (k < right) {
//                         swap(arr, k, k + 1);
//                         swaps++;
//                         k++;
//                     }
//                     left++;
//                     right--;
//                 }
//             }
//         }

//         return swaps;
//     }

//     private static void swap(char[] arr, int i, int j) {
//         char temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public static void main(String[] args) {
//         String s = "mamad";
//         System.out.println(minSwapsToPalindrome(s)); // Output: 3
//     }
// }
