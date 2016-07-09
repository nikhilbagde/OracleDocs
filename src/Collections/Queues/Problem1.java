package Collections.Queues;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by Nikhil on 7/9/2016.
 */
public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Queue 1");
        Queue<Integer> q1 = new ArrayBlockingQueue<>(3);

        //Set 1 Operations of Queue: .add(), .remove(), .element()
        printHeadElement(q1);
        addItems(q1);
        printHeadElement(q1);
        printItems(q1);
        removeItems(q1);

        System.out.println("Queue 2");
        Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(3);

        //Set 2 Operations of Queue: .offer(), .poll(), .peek()
        printHeadPeek(q2);
        offerItems(q2);
        printItems(q2);
        printHeadPeek(q2);
        pollItems(q2);

    }

    //Set 1:
    public static void addItems(Queue<Integer> q){
        System.out.println(" Added to queue " + q.add(41));
        System.out.println(" Added to queue " + q.add(42));
        System.out.println(" Added to queue " + q.add(43));
        try{
            q.add(44);
        }catch( IllegalStateException e){
            System.out.println("Queue is full!");
        }
    }
    public static void printItems(Queue<Integer> q){
        for( Integer i : q){
            System.out.println("Printing Quque: " + i);
        }
    }
    public static void removeItems(Queue<Integer> q){
        System.out.println("Removed from queue " + q.remove());
        printHeadElement(q);
        System.out.println("Removed from queue " + q.remove());
        printHeadElement(q);
        System.out.println("Removed from queue " + q.remove());
        printHeadElement(q);
        try{
            System.out.println("Removed from queue " + q.remove());
        }catch ( NoSuchElementException e) {
            System.out.println("No element to delete");
        }
        printHeadElement(q);
    }

    /**
     * Uses .element method to see head.
     * @param q
     */
    public static void printHeadElement(Queue<Integer> q){
        try{
            System.out.println("Printing Head: " + q.element());
        }catch( NoSuchElementException e){
            System.out.println("Element not found!");
        }

    }

    //Set 2

    /**
     * Here we don't require to handle exception when adding out of bound
     * @param q
     */
    public static void offerItems(Queue<Integer>q){
        System.out.println(" offer to queue " + q.offer(91));
        System.out.println(" offer to queue " + q.offer(92));
        System.out.println(" offer to queue " + q.offer(93));
        //Adding out of bound will only give false answer
        //No need to handle expections
        System.out.println(" offer to queue " + q.offer(94));
    }
    public static void pollItems(Queue<Integer> q){
        System.out.println("Polling from queue " + q.poll());
        printHeadPeek(q);
        System.out.println("Polling from queue " + q.poll());
        printHeadPeek(q);
        System.out.println("Polling from queue " + q.poll());
        printHeadPeek(q);

        //Again no need to handle exceptions when using poll (remove)
        //It will just return null when no item to poll
        System.out.println("Polling from queue " + q.poll());
        printHeadPeek(q);
    }

    /**
     * Uses .peek method to see head.
     * @param q
     */
    public static void printHeadPeek(Queue<Integer> q){
        //No need to handle exceptions. It will just return null .
        System.out.println("Peeking Head: " + q.peek());


    }
}
