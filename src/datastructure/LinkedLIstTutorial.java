package datastructure;

public class LinkedLIstTutorial {
    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
            this.next = null;

        }
    }
    static Node head;
    public void addFirts(String data)
    {   Node newNode = new Node(data);
        if(head == null)
        {
                head = newNode;
                return;
        }
        newNode.next =  head;
        head = newNode;

    }
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        Node p = head;
        if(head == null)
        {
            head = newNode;
            return;
        }
            while(p.next != null)
            {
                p = p.next;
            }
            p.next = newNode;
    }
    public void printList(){
        if(head == null) System.out.println("List is Empty");
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirstNode()
    {
        if(head == null) System.out.println("Linked list is empty");
        else{
            head = head.next;
        }


    }
    public void deleteLastNode()
    {
        Node lastnode = head.next;
        if(head == null) System.out.println("Linked list is empty");
        if(head.next == null) head = null;
        Node secondlastnode = head;
        while(lastnode.next != null)
        {
            lastnode = lastnode.next;
            secondlastnode = secondlastnode.next;
        }
        secondlastnode.next = null;
    }
    public void reverselinkedlist()
    {
        Node prev = null;
        Node curr = head;
        Node forw = null;
        while(curr != null)
        {
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        head = prev;

    }

    public static void main(String[] args) {
            LinkedLIstTutorial list = new LinkedLIstTutorial();

            list.addFirts("a");
            list.addFirts("b");
            list.printList();
            list.addLast("list");
             list.printList();
//             list.deleteFirstNode();
//             list.deleteLastNode();
//             list.printList();
        list.reverselinkedlist();
        list.printList();



    }

}
