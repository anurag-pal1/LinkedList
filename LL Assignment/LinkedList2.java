public class LinkedList2 {
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
        Node(){}
    }
    Node head;
    public void push(int new_data)
    {
        Node newNode = new Node();
        newNode.data = new_data;
        newNode.next = null; 
        if(head == null) {
          head = newNode;
        } else {
          Node temp = new Node();
          temp = head;
          while(temp.next != null)
            temp = temp.next;
          temp.next = newNode;
        }    
    }
    public void display()
    {
        Node temp=new Node();
        temp=this.head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public void Duplicate(){
        if(head==null||head.next==null)
        return;
        Node temp=head;
        while(temp!=null&&temp.next!=null)
        {
            if(temp.data==temp.next.data)
            {
                temp.next=temp.next.next;
            }
            else
            {
                temp=temp.next;
            }
        }
        return;
    }
    public static void main(String args[])
    {
        LinkedList2 llist=new LinkedList2();
        llist.push(25);
        llist.push(27);
        llist.push(55);
        llist.push(55);
        llist.push(60);
        llist.push(65);

        llist.display();

        llist.Duplicate();
         System.out.println();
        llist.display();
    }
}
