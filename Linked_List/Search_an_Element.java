public class Search_an_Element {
    Node head;
    int len = 0;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            len++;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        len++;
    }

    void Search(int ele) {
        if (head == null) {
            System.out.println("Not found");
            return;
        }
        Node ser = head;
        while (ser.next != null) {
            if (ser.data == ele) {
                System.out.println("Element found : " + ser.data);
                return;
            }
            ser = ser.next;
        }
        System.out.println("Not found");
    }

    void Reverse() {

        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    void middle_ele() {
        if (head == null || head.next == null) {
            return;
        }
        System.out.println("Length : "+len);
        Node currNode = head;
        for (int i = 0; i < len; i++) {
            if (i == len/2) {
                System.out.println("Middle Element : "+currNode.data);
                break;
            }
            currNode = currNode.next;
        }
    }

    void searchfromEnd(int pos){
         if (head == null) {
             System.out.println("List is empty");
             return;
         }
         if (pos <= 0 || pos > len) {
             System.out.println("Invalid position");
             return;
         }
         Node temp = head;
         for (int i = 0; i < len - pos; i++) {
             temp = temp.next;
         }
         if (temp == null) {
             System.out.println("Not found");
         } else {
             System.out.println("Element from end at position " + pos + " : " + temp.data);
         }
    }

    void print() {
        if (head == null) {
            System.out.println("Null List");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Search_an_Element ob = new Search_an_Element();
        for (int i = 0; i <= 9; i++) {
            ob.add(i);
        }
        ob.Search(2);
        ob.Reverse();
        ob.print();
        ob.middle_ele();
        ob.searchfromEnd(2);
    }
}
