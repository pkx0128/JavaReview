package com.pankx.collectionDemo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * LinkedList作为队列Queue的实例
 */
public class QueueDemo {

    public static void printQueue(Queue queue){
        while(queue.peek() != null){
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Queue<Integer> queue1 = new LinkedList<Integer>();
        Random random = new Random(47);
        for(int i = 0; i < 10; i++){
            queue1.offer(random.nextInt(i + 10));
        }
        printQueue(queue1);

        Queue<Character> queue2 = new LinkedList<Character>();
        for(char c : "abcdkfd".toCharArray()){
            queue2.offer(c);
        }

        printQueue(queue2);
    }

}


