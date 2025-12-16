//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the linked list program");

        LinkedList<Integer> ll = new LinkedList<>();

        Node<Integer> first = new Node<>(56);
        Node<Integer> second = new Node<>(30);
        Node<Integer> third = new Node<>(70);

        ll.head = first;
        first.next = second;
        second.next = third;

//        ll.addNode(10);
//        ll.appendNode(11);
        ll.insertAfter(70, 15);
        ll.display();
//        ll.deleteFirstNode();
//        ll.display();
//        ll.deleteLastNode();
//        ll.display();
//        System.out.println("search for 30: " + ll.search(30));
//
//        ll.insertAfter(30, 40);
//        ll.display();
//        ll.delete(70);
//        ll.display();
//
//        LinkedList<String> ll_string= new LinkedList<>();
//        ll_string.addNode("A");
//        ll_string.addNode("B");
//        ll_string.display();
//
//
//        OrderedLinkedList<Integer> list = new OrderedLinkedList<>();
//
//        list.add(30);
//        list.display();
//        list.add(20);
//        list.display();
//        list.add(25);
//        list.display();
//        list.add(35);
//        list.display();
    }
}