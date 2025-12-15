public class LinkedList {
    Node head;

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
}
