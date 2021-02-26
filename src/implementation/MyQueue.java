/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 26-02-2021
Time: 22:48
File: MyQueue.java 

*/
package implementation;

import myinterface.QueueADT;

public class MyQueue<E> implements QueueADT<E> {
    Node<E> front;
    Node<E> rear;
    int size = 0;

    @Override
    public void enqueue(E data) {
        Node<E> node = new Node<>(data);
        if (!isEmpty()) {
            rear.setNext(node);
            rear = node;
        }
        else {
            front = node;
            rear = node;
        }
        size++;
    }

    @Override
    public E dequeue() {
        E response = null;
        if (!isEmpty()) {
            response = front.getData();
            front = front.getNext();
            if (front.getNext() == null) {
                response = rear.getData();
                rear = null;
            }
            size--;
        }
        else {
            System.out.println("Queue UnderFlow...");
        }
        return response;
    }

    @Override
    public E peek() {
        E response = null;
        if (!isEmpty()) {
            response = front.getData();
        }
        else {
            System.out.println("Queue is Empty...");
        }
        return response;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void traverse() {
        Node<E> temp = front;
        System.out.println("Printing Queue...");
        System.out.print("front<--");
        while (temp != null) {
            System.out.print(temp.getData() + "<--");
            temp = temp.getNext();
        }
        System.out.println("rear");
    }
}