public class merge_2_list {
    public static void main(String[] args) {

    }
}

class ListNode {
    int val;ListNodenext;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

}

public ListNode merge(ListNode list1,ListNode list2){
    ListNode temp = new ListNode(-1);
    ListNode curr = temp;
    while (list1!=null && list2!=null) {
        if (list1.val > list2.val) {
            curr.next = list1;
            list1 = list1.next;
        }
        else{
            curr.next = list2;
            list2 = list2.next;
        }
    }
     if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }
    return temp.next;
}