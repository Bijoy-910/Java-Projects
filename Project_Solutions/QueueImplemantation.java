package com.Project17;

public class QueueImplemantation {
    int queue[]= new int[5];
    int front;
    int rear;
    int size;

    public void enqueue(int data)
    {
        if(!isFull())
        {
            queue[rear] = data;
            rear = (rear+1)%5;
            size++;

        }
        else
            System.out.println("The queue is full.");
    }

    public int dequeue()
    {
        int data = queue[front];
        if(!isEmpty())
        {
            front = (front+1)%5;
            size--;
        }
        else
            System.out.println("The queue is empty.");
        return data;
    }

    public int getSize()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean isFull()
    {
        return size ==5;
    }

    public void show()
    {
        System.out.print("Elements : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(queue[(front + i)%5] + " ");
        }
    }

    public static void main(String[] args) {
        QueueImplemantation qu = new QueueImplemantation();
        qu.enqueue(5);
        qu.enqueue(4);
        qu.enqueue(3);
        qu.enqueue(2);
        qu.enqueue(1);
        qu.show();
        System.out.println(" The element which we are removing is : " + qu.dequeue());
        qu.show();
        System.out.println(" The element which we are removing is : " + qu.dequeue());
        qu.show();

        qu.enqueue(10);
        qu.enqueue(11);
        qu.enqueue(12);
        qu.show();
        System.out.print("The size of the queue elements is : " + qu.getSize());

        qu.isEmpty();
        qu.isFull();
    }
}
