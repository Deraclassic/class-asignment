package week5_curriculum.class_activity5b;

public class LinkedListEx2 {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;

    public LinkedListEx2() {
        head = null;
    }

    public void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void delete(int val){
        if(head == null) return;
        if(head.val == val){
            head = head.next;
            return;
        }
        Node prev = null;
        Node current = head;
        while (current != null && current.val != val){
            prev = current;
            current = current.next;
        }
        if(current != null){
            prev.next = current.next;
        }
    }
    public void printList(){
        Node current = head;
        while (current != null){
            System.out.println(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

}