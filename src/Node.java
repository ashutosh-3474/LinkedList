//Node represent single element in of the linked list

public class Node<T extends Comparable<T>>{
    T data;   //data stored in the node
    Node<T> next;  //reference to the next node

    //Constructor to initialize the node with data and set next reference to null
    public Node(T data) {
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
