public class OrderedLinkedList<T extends Comparable<T>>{
    Node<T> head;  //hold head of the linked list

    //constructor


    public OrderedLinkedList() {
        this.head = null;
    }

    public void add(T data)
    {
        Node<T> newNode = new Node<>(data);

        //Case 1: if list is empty or insert at beginning
        if (head == null || head.data.compareTo(data) > 0)
        {
            newNode.next = head;
            head = newNode;
            return;
        }
        //Case 2: Search for the correct position
        Node<T> temp = head;
        while(temp.next != null && temp.next.data.compareTo(data) < 0)
        {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Data added successfully");
    }

    //Method to print the list
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

}
