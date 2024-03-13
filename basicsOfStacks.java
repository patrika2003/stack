package stacks;

import java.util.*;
import java.io.*;
public class basicsOfStacks {
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println("The size is: "+st.size());
        System.out.println(st);
        st.push(1);
        System.out.println("The size is: "+st.size());
        System.out.println(st);
        System.out.println(st.isEmpty());
        st.push(10);
        System.out.println("The size is: "+st.size());
        System.out.println(st);
        st.push(21);
        System.out.println("The size is: "+st.size());
        System.out.println(st);
        st.push(13);
        System.out.println("The size is: "+st.size());
        System.out.println(st);
        st.push(45);
        System.out.println("The size is: "+st.size());
        System.out.println(st);
        //peek
        /*System.out.println(st.peek());
        System.out.println(st);
        /*st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);*/
        //System.out.println("The size is: "+st.size());
        /*while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);*/
        /*while(st.size()>2){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);*/
    }
}

   