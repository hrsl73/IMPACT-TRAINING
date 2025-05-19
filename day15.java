// linked list
import java.util.Scanner;
public class day15{

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node insertStarting(Node head,int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        return newNode;
    }
    public static Node insertEnd(Node head,int value){
        Node newNode = new Node(value);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    public static Node deleteStart(Node head){
        head = head.next;
        return head;
    }
    public static Node deleteEnd(Node head){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // initializing the values of the nodes
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        Node head = new Node(x);
        Node second = new Node(y);
        Node third = new Node(z);

        // linking the nodes
        head.next = second;
        head.next.next = third;
        head = insertStarting(head, 11);
        head = insertEnd(head, 50);


        
        head = deleteStart(head);
        head = deleteEnd(head);


        // to print the node
        Node temp = head;
        // System.out.println(head.data);
        // System.out.println(head.next.data);
        // System.out.println(head.next.next.data);

        // to print the node using while loop
        System.out.println("Using while loop");

        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    
    
    sc.close();
    }
}








