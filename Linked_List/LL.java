public class LL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    // add first
    public void add_first(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add last
    public void add_last(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Dlete first
    public void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }
    
    //delete last
    public void deleteLast(){
        if (head == null) {
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        

    }
    
    //Insertion at specifit position
    public void specificInsert(String  data,int pos){
        Node newNode = new Node(data);
        if (pos ==0) {
            newNode.next = head;
            newNode = head;
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos-1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void print() {
        if (head == null) {
            System.out.println("List is Null");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LL ob = new LL();
        ob.add_first("World");
        ob.add_first("Hello");
        ob.add_last("Ayush");
        ob.add_last("Mishra");
        ob.deleteFirst();
        ob.deleteLast();
        ob.specificInsert("Btech", 1);
        ob.print();
        
    }
}