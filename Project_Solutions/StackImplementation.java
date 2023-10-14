package com.Project17;

class Stack{
    int stack[] = new int[5];
    int top = 0;
    public void push(int data)
    {
        if(top == 5)
        {
            System.out.print("Stack is full");
        }
        else {
            stack[top] = data;
            top++;
        }
    }

    public int pop()
    {
        int data=0;

        if (isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            top--;
            data = stack[top];
            stack[top] =0;
        }

        return data;
    }

    public int peek()
    {
        int data;
        data = stack[top-1];
        return data;
    }

    public int size()
    {
        return top;
    }
    public boolean isEmpty() {
//        int data;
//        data = stack[top];
        return top<=0;
    }
    public void show()
    {
        for (int st: stack)
        {
            System.out.println(st);
        }
    }
}
public class StackImplementation {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        st.push(10);
        st.show();
        System.out.println("The size of the stack is "+ st.size());
        st.pop();
        System.out.println(" Through peeking we got "+ st.peek());
        System.out.println(st.isEmpty());
        st.show();
    }
}
