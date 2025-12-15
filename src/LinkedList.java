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
    public  void addNode(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
}
