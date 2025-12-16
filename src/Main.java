//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the linked list program");

        LinkedList ll = new LinkedList();

        Node first = new Node(56);
        Node second = new Node(30);
        Node third = new Node(70);

        ll.head = first;
        first.next = second;
        second.next = third;

//        ll.addNode(10);
//        ll.appendNode(11);
//        ll.insertAfter(70, 15);
//        ll.display();
//        ll.deleteFirstNode();
//        ll.display();
//        ll.deleteLastNode();
//        ll.display();
//        System.out.println("search for 30: " + ll.search(30));

        ll.insertAfter(30, 40);
        ll.display();
    }
}