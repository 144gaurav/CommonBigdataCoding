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
        printLinkedList(list);
    }
}



