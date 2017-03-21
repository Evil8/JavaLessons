package Task1;

import java.util.LinkedList;

public class Main {
    public static MyLinkedList<Integer> myLinkedList;

    public static void main(String[] args){

        Node<Integer> head = new Node(1);
        myLinkedList = new MyLinkedList<>(head);
        myLinkedList.addFirst(2);
        myLinkedList.addLast(3);
        myLinkedList.add(4,5);
        myLinkedList.show();
        myLinkedList.remove(1);
        myLinkedList.show();
        Node<Integer> val = myLinkedList.get(1);
        myLinkedList.show(val);
        System.out.println(myLinkedList.get(new Integer(2)));


    }
}