package com.Project17;

public class DynamicStack {
    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;
    public void push(int data)
    {
        if(size() == capacity)
            expand();
        stack[top] = data;
        top++;
    }

    public void expand()
    {
        int length = size();
        int newStack[] = new int[capacity*2];

        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;
        capacity *=2;

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
            shrink();
        }
        return data;
    }

    public void shrink()
    {
     int length = size();
     if(length<=(capacity/2)/2)
         capacity = capacity/2;

     int newStack[] = new int[capacity];
     System.arraycopy(stack,0,newStack,0,length);
     stack = newStack;
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

    public static void main(String[] args) {
        DynamicStack dst = new DynamicStack();

        dst.push(2);
        dst.show();
        dst.push(4);
        dst.show();
        dst.push(6);
        dst.show();
        dst.push(8);
        dst.show();
        dst.push(10);
        dst.show();

        dst.pop();
        dst.show();
        //System.out.println(dst.pop());
        //dst.show();


    }
}
