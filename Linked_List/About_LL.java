package Linked_List;

public class About_LL {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    // Add First
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }
    // Add last 
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node CurrentNode=head;
        while (CurrentNode.next != null) {
            CurrentNode = CurrentNode.next;
        }
        CurrentNode.next = newNode;
    }

    // Print
    public void print(){
        if(head == null){
            System.out.println("List is Empty");
        }
        Node CurrentNode=head;
        while (CurrentNode != null) {
            System.out.print(CurrentNode.data +" -> ");
            CurrentNode = CurrentNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        About_LL list = new About_LL();
        list.addFirst("am");
        list.addFirst("I");
        
        list.print();
        list.addLast("Good");
        list.print();

    }
}
