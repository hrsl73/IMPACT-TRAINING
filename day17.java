// stack in java
// stack is a last in first out data structure
// stack is a subclass of vector
// stack is a part of java.util package
// stack is used to store data in a last in first out manner

import java.util.*;
public class day17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        stack.push(m);
        // System.out.println(stack.peek());
        stack.push(n);
        // System.out.println(stack.peek());

        for(int i=0;i<2;i++){
            int x = sc.nextInt();
            stack.push(x);
        }

        int top = stack.peek();
        System.out.println(top);

        // System.out.println(stack);
        // System.out.println("size of stack " +stack.size());
        // System.out.println(stack.pop());
        // System.out.println(stack);
        // System.out.println("size of stack " +stack.size());
        // System.out.println(stack.isEmpty());

        // while(stack.size()>0){
        //     System.out.println(stack.peek());
        //     stack.pop();
        //     System.out.println(stack);
        // }

        // int z = stack.search(20); // returns the position of the element from the top of the stack(starting from 1)
        // System.out.println(z);
        // System.out.println(stack.contains(40));
        // int z1 = stack.get(2);
        // System.out.println(z1);
        // stack.set(2, 100);
        // System.out.println(stack);

        // stack.clear();
        // System.out.println(stack.isEmpty());


        sc.close();
    }
}