//Linked list class, stores the head and methods to manipulate the linked list
public class LinkedList {
    Node head;  //head of the linked list

    //Method to print the linked list
    public void display()
    {
        Node cur = head;
        while(cur != null)
        {
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
        System.out.print("NULL");
    }

    //Method to add new to node at the beginning and update the head of the linked list
    public void addNode(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //Method to append node at the end of the linked list
    public void appendNode(int data)
    {
        Node newNode = new Node(data);

        // If list is empty, new node becomes head
        if (head == null)
        {
            head = newNode;
            return;
        }

        //Traverse till last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //Method to insert node in between of 2 nodes in the linked list
    public void insertAfter(int key, int data) {
        Node temp = head;

        // Search for the node with given key
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        // If key is found, insert new node
        if (temp != null) {
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
}
