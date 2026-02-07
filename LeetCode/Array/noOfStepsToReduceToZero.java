package LeetCode.Array;

public class noOfStepsToReduceToZero {
    public static int numberOfSteps(int num) {
        int count =0;
        while(num!=0){
        if(num%2==0){
            num = num/2;
        }else{
            num = num-1;
        }
        count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 8;
        System.out.println(numberOfSteps(num));
    }
}
