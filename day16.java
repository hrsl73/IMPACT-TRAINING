public class day16{
    // doubly linked list
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next= null;
            this.prev=null;
        }
    }
    public static void main(String[]args){
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head.next = second;
        head.prev = null;
        second.next = third;
        second.prev = head;
        third.next = fourth;
        third.prev = second;
        fourth.next = null;
        fourth.prev = third;

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
}