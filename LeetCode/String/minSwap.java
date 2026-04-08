package LeetCode.String;

public class minSwap {

     public static int minSwapsToPalindrome(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int[] freq = new int[26];
        for (char c : arr) freq[c - 'a']++;

        int odd = 0;
        for (int f : freq) {
            if (f % 2 != 0) odd++;
        }
        if (odd > 1) return -1;

        int swaps = 0;
        int left = 0, right = n - 1;

        while (left < right) {
            if (arr[left] == arr[right]) {
                left++;
                right--;
            } else {
                int k = right;

                while (k > left && arr[k] != arr[left]) {
                    k--;
                }

                if (k == left) {
                    
                    swap(arr, k, k + 1);
                    swaps++;
                } else {
                    
                    while (k < right) {
                        swap(arr, k, k + 1);
                        swaps++;
                        k++;
                    }
                    left++;
                    right--;
                }
            }
        }

        return swaps;
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String s = "mamad";
        System.out.println(minSwapsToPalindrome(s)); 
    }
    
    
}
