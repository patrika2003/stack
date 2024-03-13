package stacks;

import java.util.Scanner;
import java.util.Stack;

public class insertionInStack {
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        int idx = 3;
        int x = 13;
        Stack<Integer> qt = new Stack<>();
        while(st.size()>idx){
            qt.push(st.pop());
        }
        st.push(x);
        while(qt.size()>0){
            st.push(qt.pop());
        }
        System.out.println(st);
    }
}
