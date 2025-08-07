package stack;

import java.util.Collections;
import java.util.Stack;

public class sort {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(3);
        st.push(2);
        st.push(9);
        st.push(6);

        Collections.sort(st);
        for(int i=0; i<st.size(); i++){
            System.out.print(st.get(i)+" ");
        }
    }
}
