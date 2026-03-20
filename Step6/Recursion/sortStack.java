package Step6.Recursion;

import java.util.Stack;

public class sortStack {
    public static void StackSort(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        StackSort(st);
        insert(st,top);
    }

    public static void insert(Stack<Integer> st,int val){
        if(st.isEmpty() || st.peek()>=val){
            st.push(val);
            return;

        }
        int top = st.pop();
        insert(st, val);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(1);
        st.push(3);
        st.push(2);
        StackSort(st);
        System.out.println(st);
    }
    
}
