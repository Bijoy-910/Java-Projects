package com.Project17;
class Node{
    int data;
    Node next;
}
public class LinkedList {
    Node head;
    public void insert(int data)
    {
     Node node = new Node(); //New node creation
      node.data = data;  //Adding data to the node
      node.next = null;  //next node address is null

      if(head == null)   //Checking if head is null than assigning the node to head
      {
          head = node;
      }
      else     //If head is not null then let the node be head and check for the next address
      {
          Node n = head;  //To traverse we have to hold the temporary node which will hold the data

           while(n.next != null)
          {
              n = n.next;  //If n.next address is not null the  store the address of next node on n.
          }
          n.next = node;  //or store n.next to node

      }
    }

    public void insertAtStart(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;

        head = node;
    }

    public void insertAtAnyPoint(int index,int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        Node n = head;

        if(index == 0)
        {
            insertAtStart(data);
        }
        else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void delete(int index)
    {
     if(index == 0)
     {
         head = head.next;
     }
     else {
         Node n = head;
         Node n1 = null;
         for(int i=0;i<index-1;i++)
         {
             n=n.next;
         }
         n1 = n.next;
         n.next = n1.next;
     }
    }

    public void show()
    {
        Node node = head;  ///If you want to show the data then you have to take the head node and traverse it for that we  have to take while loop and traverse the list.

        while(node.next !=null)   //First check next node is not null.
        {
            System.out.println(node.data);
            node = node.next;  ///After printing the current data you have to shift to next node so for that we have next node address.
        }

        System.out.println(node.data); ///The last node will not be printing in the loop so to print out the last node we have to manually print  the data.
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(4);
        ll.insert(6);
        ll.insert(8);
        ll.insert(10);
        ll.insert(12);

        ll.insertAtStart(2);

        ll.insertAtAnyPoint(0,0);
        ll.insertAtAnyPoint(1,3);

        ll.delete(2);
        ll.show();
    }
}
