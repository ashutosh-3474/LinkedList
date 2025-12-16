//Linked list class, stores the head and methods to manipulate the linked list
public class LinkedList<T extends Comparable<T>> {
    Node<T> head;  //head of the linked list

    //Method to print the linked list
    public void display()
    {
        Node<T> cur = head;
        while(cur != null)
        {
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
        System.out.println("NULL");
    }

    //Method to add new to node at the beginning and update the head of the linked list
    public void addNode(T data)
    {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    //Method to append node at the end of the linked list
    public void appendNode(T data)
    {
        Node<T> newNode = new Node<>(data);

        // If list is empty, new node becomes head
        if (head == null)
        {
            head = newNode;
            return;
        }

        //Traverse till last node
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //Method to insert node in between of 2 nodes in the linked list
    public void insertAfter(T key, T data) {
        Node<T> temp = head;

        // Search for the node with given key
        while (temp != null && temp.data.compareTo(key) != 0) {
            temp = temp.next;
        }

        // If key is found, insert new node
        if (temp != null) {
            Node<T> newNode = new Node<>(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    //Method to delete first node of the linked list
    public void deleteFirstNode()
    {
        //checks if list is empty
        if (head == null)
        {
            System.out.println("List is already empty");
            return;
        }

        head = head.next;
        System.out.println("First node deleted successfully");
    }

    //Method to delete last node from the linked list
    public void deleteLastNode()
    {
        if (head == null)   //check if list is empty
        {
            System.out.println("List is empty");
            return;
        }
        else if (head.next == null) //only single node is present in the linked list
        {
            head = null;
            System.out.println("Last node deleted successfully");
            return;
        }
        else
        {
            Node<T> temp = head;
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
            System.out.println("Last node deleted successfully");
        }
    }

    //Method to search for an element in the linked list, returns node if found, else null
    public Node<T> search(T key){
        Node<T> temp = head;
        while(temp != null)
        {
            if (temp.data.compareTo(key) == 0)
            {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    //Method to delete a node from the linked list
    public void delete(T key)
    {
        if (head.data.compareTo(key) == 0)
        {
            head = head.next;
            System.out.println("Node deleted successfully");
            return;
        }
        Node<T> cur = head.next;
        Node<T> pre = head;

        while(cur != null)
        {
            if (cur.data.compareTo(key) == 0)
            {
                pre.next = cur.next;
                System.out.println("Node deleted successfully");
                return;
            }
            pre = cur;
            cur = cur.next;
        }
        System.out.println("Unable to delete, key not found");

    }
}
