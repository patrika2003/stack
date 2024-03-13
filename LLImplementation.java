package stacks;

public class LLImplementation {
    Stack st = new Stack(); //creating object
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(1);
        st.display(); // 4 5 1
        System.out.println(st.size()); //3
        st.pop();
        st.display(); //4 5
        System.out.println(st.size());

        st.push(9);
        st.push(7);
        st.push(8);
        System.out.println(st.isFull());
        st.push(70);
}
