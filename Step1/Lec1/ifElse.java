package Step1.Lec1;

import java.util.Scanner;

public class ifElse {
    static void IfElse(int marks){
        if(marks >= 90){
            System.out.println("Grade A");
        }
        else if(marks >=70 && marks <90){
            System.out.println("Grade B");
        }
        else if(marks >=50 && marks <70){
            System.out.println("Grade C");
        }
        else if(marks >=50 && marks < 35){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total marks:");
        int marks = sc.nextInt();
        IfElse(marks);
        sc.close();
    }
    
}
