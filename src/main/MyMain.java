/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 26-02-2021
Time: 23:46
File: MyMain.java 

*/
package main;

import implementation.MyQueue;

public class MyMain {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.traverse();
        int size = queue.size();
        System.out.println("Size --> " + size);

        queue.dequeue();
        queue.traverse();
        size = queue.size();
        System.out.println("Size --> " + size);
    }
}