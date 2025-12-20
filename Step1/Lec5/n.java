package Step1.Lec5;

public class n{
    static void print(){
        if(cnt == 7) return;
        System.out.print(cnt+" ");
        cnt = cnt +1;
        print();
    }   
    public static void main(String[] args) {
        print();
    }
}
