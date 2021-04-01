package com.java.datastructure.linkedlist;

public class LinkedListImpl {
    Node head;
     static class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
            this.next=null;
        }
    }

    public static void printLinkedList(LinkedListImpl list){
         Node currNode = list.head;
         while(currNode!=null){
             System.out.println("List Data: " + currNode.value);
             currNode = currNode.next;
         }
    }

    public static LinkedListImpl reverseList(LinkedListImpl list){

         Node currentNode = list.head;
         Node prevNode = null;
        Node nextNode = null;
         while(currentNode.next!=null){
              nextNode = currentNode.next;
             currentNode.next = prevNode;
             prevNode = currentNode;
             currentNode = nextNode;
         }
        currentNode.next = prevNode;
         list.head = currentNode;
         return list;
    }

    public static void reverseListRecusively(Node currNode,Node prevNode,LinkedListImpl list){
         if(currNode==null){
             list.head=prevNode;
             return;
         }
         Node nextNode = currNode.next;
        currNode.next = prevNode;
        prevNode = currNode;
        reverseListRecusively(nextNode,prevNode,list);
    }

    public static LinkedListImpl deleteElementAtPosition(LinkedListImpl list, int position){
         Node current_node = list.head;
        int i=1;
             if(position==0){
                 list.head=current_node.next;
             }
             else{
                 while(current_node.next!=null){
                     if(i==position){
                         Node next_node = current_node.next;
                         current_node.next=next_node.next;
                     }
                     current_node = current_node.next;
                     i=i+1;
             }
         }
         return list;
    }

    public static LinkedListImpl insertElementAtPosition(LinkedListImpl list, int data,int position){
         Node currentNode = list.head;
         Node new_node = new Node(data);
         int i =1;
         if(position==0){
             new_node.next = list.head;
             list.head=new_node;
         }
         else{
             while(currentNode.next!=null){
                 if(i==position){
                     Node tempNode = currentNode.next;
                     currentNode.next = new_node;
                     new_node.next = tempNode;
                 }
                 currentNode = currentNode.next;
                 i=i+1;
             }
         }


         return list;
    }

    public static LinkedListImpl insertElement(LinkedListImpl list, int value){
        Node new_node = new Node(value);
        if(list.head==null){
            list.head = new_node;
        }
        else{
            Node curr_node = list.head;
            while(curr_node.next!=null){
                curr_node = curr_node.next;
            }
            curr_node.next=new_node;
        }
        return list;
    }
    public static void main(String[] args) {

        LinkedListImpl list = new LinkedListImpl();
        insertElement(list,25);
        insertElement(list,30);
        insertElement(list,300);
        insertElement(list,1000);
        printLinkedList(list);
        System.out.println("=========================");
        insertElementAtPosition(list,100,1);
        printLinkedList(list);
        deleteElementAtPosition(list,1);
        System.out.println("=========================");
        printLinkedList(list);
        System.out.println("=========================");
        printLinkedList(reverseList(list));
        System.out.println("=========================*****++++++++++++++++++++");
        reverseListRecusively(list.head,null,list);
        printLinkedList(list);
    }
}



