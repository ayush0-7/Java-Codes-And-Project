/**
 * Array_to_Tree
 */
public class Array_to_Tree {
    class Node{
        Node left ,right;
        int data;
        Node(int data){
            this.data = data;
            left =right = null;
    }
    }

    static Tree solution(int a[]){
        return build(a,0,a.length-1);

    }
    static Tree build(int a[],int left,int right){
        if (left > right) {
            return null;
        }
        int mid = left+(right - left)/2;
        Tree root = new root(a[mid]);

    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        solution(a);


    }
}