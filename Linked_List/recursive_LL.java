public class recursive_LL {
    Node head;
    Node tail;
    int len;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        len++;
    }

    void addstart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode = tail;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void atSpecificpos(int pos, int data) {
        Node newNode = new Node(data);
        if (pos < 0 || pos > len) {
            System.out.println("Length out of range");
            return;
        }
        len++;
        if (pos == len) {
            tail = newNode;
        }
        if (pos == 0) {
            addstart(data);
            return;
        }
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; i <= pos - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        
    }

    void delete(int pos){
        Node temp = head;
        for (int i = 0; i < pos-1; i++) {
            temp = temp.next;
        }
        temp.next=temp.next.next;
    }

    void print() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        recursive_LL ob = new recursive_LL();
        ob.add(1);
        ob.add(2);
        ob.add(3);
        ob.add(4);
       
        //ob.atSpecificpos(4, 200);
        ob.print();
        System.out.println();
         System.out.println("_____________");
        ob.delete(3);
        ob.print();
        System.out.println();
        System.out.println("Head Value : " + ob.head.data);
        System.out.println("Tail Value : " + ob.tail.data);
        System.out.println("LEngth : " + ob.len);
    }
}
