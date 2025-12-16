//Node represent single element in of the linked list

public class Node {
    int data;   //data stored in the node
    Node next;  //reference to the next node

    //Constructor to initialize the node with data and set next reference to null
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
//                "next=" + next +
                "data=" + data +
                '}';
    }
}
