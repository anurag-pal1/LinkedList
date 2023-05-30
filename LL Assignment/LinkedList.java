
public class LinkedList{
    class Node{
        int data;
        Node next;

        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    
    Node head;
    public void push(int new_data)
    {
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }

    public boolean search(Node head,int x)
    {
        Node current=head;
        while(current!=null)
        {
            if(current.data==x)
            {
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public static void main(String args[])
    {
        LinkedList llist=new LinkedList();
        llist.push(21);
        llist.push(22);
        llist.push(11);
        llist.push(43);
        llist.push(23);
        llist.push(56);

        boolean flag=false;
        flag=llist.search(llist.head,56);
        if(flag==true)
        {
            System.out.println("YES");
            System.out.println();
        }
        else
        {
            System.out.println("NO");
            System.out.println();
        }
    }
}