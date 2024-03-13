package stacks;

import java.util.Stack;
import java.util.Scanner;
/*public class moveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
}*/
public class moveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        //reverse order
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println(rt);
        //reverse2ndtime
        Stack<Integer> qt = new Stack<>();
        while(rt.size()>0){
            qt.push(rt.pop());
        }
        System.out.println(qt);
    }
}