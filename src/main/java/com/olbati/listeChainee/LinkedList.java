package com.olbati.listeChainee;

public class LinkedList {

    public Node head;


    public LinkedList(){
        this.head = new Node(0);
    }

    public void append(Object obj){

        Node current = head;
        while( current.next != null){
            current = current.next;
        }
        if (obj instanceof Node){
            current.next = (Node) obj;
        }else if ( obj instanceof LinkedList){
            LinkedList linkedList = (LinkedList) obj;
            current.next = linkedList.head;
        }else throw new RuntimeException ("Invalid Input");

    }


    public void removeNodeWithValue(int value){

        Node current = head;
        if( current.value == value){
            head = current.next;
        }
        while( current.next != null){
            if(current.next.value == value ){
                current.next = current.next.next;
            }
            current = current.next;

        }
    }

    public void removeNodeAtIndex(int index){

        int size = this.size();
        Node current = head;

        if( index > size || index < -1){
            throw new RuntimeException ("Invalid input : Index out of bounds of size of linkedList");
        }else{
            int counter =  0;
            while ( counter < index-1 ){
                current = current.next;
                counter++;
            }

            current.next = current.next.next;
        }

    }

    public void insertAtTail (int value){
        Node node = new Node(value);
        Node current = head;
        while( current.next != null){
            current = current.next;
        }
        current.next = node;

    }

    public void insertAtHead (int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public void insertElement(int index, int value){
        int size = this.size();
        Node node = new Node(value);
        Node current = head;

        if( index > size || index < -1){
            throw new RuntimeException ("Invalid input : Index out of bounds of size of linkedList");
        }else{
            int counter =  0;
            while ( counter < index-1 ){
                current = current.next;
                counter++;
            }
            node.next = current.next;
            current.next = node;
        }
    }

    public int size(){

        int listcount = 0;
        Node current = head;
        while( current.next != null){
            current = current.next;
            listcount++;
        }
        return listcount;
    }


}
