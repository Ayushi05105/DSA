package Step6.Recursion;

import java.util.Stack;

public class reverseStack {
    public static void insertAtBottom(Stack<Integer> st,int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int topVal = st.pop();
        insertAtBottom(st, val);
        st.push(topVal);
    }
    public static void ReverseStack(Stack<Integer> st){
        if(st.isEmpty()) return ;
        int topVal = st.pop();
        ReverseStack(st);
        insertAtBottom(st,topVal);
        

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(1);
        st.push(3);
        st.push(2);
        ReverseStack(st);
        System.out.println(st);
    }
    
}
