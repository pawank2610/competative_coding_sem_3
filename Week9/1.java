class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linked_list {
    Node head = null;

  
    void insert_At_beg(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

 
    void insert_At_Last(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new_node;
    }

    
    void delete_At_beg() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }


    void delete_At_Last() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        Linked_list list = new Linked_list();

        list.insert_At_beg(10);
        list.insert_At_beg(20);
        list.insert_At_beg(30);
        list.insert_At_Last(90);
        list.insert_At_Last(100);

        System.out.println("Original list:");
        list.display();

        list.delete_At_beg();
        System.out.println("After deleting from beginning:");
        list.display();

        list.delete_At_Last();
        System.out.println("After deleting from end:");
        list.display();
    }
}