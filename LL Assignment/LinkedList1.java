public class LinkedList1 {
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
        Node(){

        }
    }
    Node head;

    public void push(int new_data)
    {
         Node new_node=new Node(new_data);
         new_node.next=head;
         head=new_node;
        
    }

    public void Insert(int newElement,int position)
    {
        Node newNode = new Node(); 
        newNode.data = newElement;
        newNode.next = null;
    
        if(position < 1) {
          System.out.print("\nposition should be >= 1.");
        } else if (position == 1) {
          newNode.next = head;
          head = newNode;
        } else {
          
          Node temp = new Node();
          temp = head;
          for(int i = 1; i < position-1; i++) {
            if(temp != null) {
              temp = temp.next;
            }
          }
       
          if(temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;  
          } else {
            System.out.print("\nThe previous node is null.");
          }       
        }
      } 

    public void displayLL()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        LinkedList1 llist=new LinkedList1();
        llist.push(25);
        llist.push(12);
        llist.push(17);
        llist.push(85);
        llist.push(96);
        llist.push(102);
      
        System.out.println("Before adding element: ");
        System.out.println();

        llist.displayLL();

        System.out.println("After adding element: ");
        System.out.println();

       llist.Insert(15,3);
       llist.displayLL();

    }
}
