
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class SingleLinkedList {

      Node head;

    void start(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    void middle(int place,int data)
    {
        
        Node temp=head;
        Node new_Node = new Node(data);
        while(temp.data==place)
        {
         temp= temp.next;
        }
        new_Node.next=temp.next;
        temp.next=new_Node;
        

    }
    void end(int data)
    {
        Node temp=head;
        Node new_Node = new Node(data);
    
        while(temp.next!=null)
        {
            temp=temp.next;

        }
        temp.next=new_Node;

    }

     void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        // SingleLinkedList list1 = new SingleLinkedList();
        list.head = new Node(1);
        list.start(10);
        list.start(20);
        list.start(30);
        list.end(43);
        list.middle(20,4);
        list.display();

        // list.head = new Node(1);
        // list1.start(130);
        // list1.start(22);
        // list1.start(31);
        // list1.display();

    }
}