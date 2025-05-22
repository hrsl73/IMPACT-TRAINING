


import java.util.*;
public class day18 {

    public static void fun(int i, int n) {
        if (i > n) {
            return;
        }
        fun(i + 1, n); // this print in reverse order
        System.out.println(i);
        // fun(i + 1, n); // this print in normal order
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Queue
        // queue is an interface
        // Queue is a data structure that stores elements in a first-in-first-out (FIFO) order
        // It is a linear data structure

        // Queue<Integer> q = new LinkedList<>();

        // q.add(10);
        // q.add(20);
        // q.add(30);  
        // q.offer(40);
        // // .add() and .offer() are used to add elements to the queue
        // // .add() throws an exception if the queue is full
        // // .offer() returns false if the queue is full

        // boolean b = q.isEmpty();
        // System.out.println("is queue empty: " +b);

        // System.out.println(q);

        // int rem = q.remove();
        // System.out.println("does queue contain 30: " +q.contains(30));
        // System.out.println("removed element: " +rem);
        // System.out.println(q);
        // q.poll();
        // // .remove() and .poll() are used to remove the head of the queue
        // // .remove() throws an exception if the queue is empty
        // // .poll() returns null if the queue is empty

        // System.out.println(q);
        // System.out.println(q.size());

        // System.out.println("top element: " +q.peek());
        // System.out.println("top elemtent: " +q.element());
        // // .peek() and .element() are used to get the head of the queue
        // // .peek() returns null if the queue is empty
        // // .element() throws an exception if the queue is empty


        // q.clear();
        // System.out.println("is queue empty: " +q.isEmpty());
        // System.out.println(q);

        // recursion

        int n = sc.nextInt();
        fun(0,n);







        sc.close();
    }
}
