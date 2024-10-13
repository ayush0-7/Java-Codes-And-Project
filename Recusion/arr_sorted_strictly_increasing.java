public class arr_sorted_strictly_increasing {
    static boolean k = false;
    static boolean sorted(int a[],int c){
        if(c==a.length-1){
            return true;
        }
        if(a[c]==(a[c+1]-1)){
            k = true;
        }else{
            k= false;
        }
        sorted(a, c+1);
        return k;
    }
    public static void main(String[] args) {
        int b[]={1,2,3,4,5,6};
        boolean a=sorted(b,0);
        System.out.println(a);
    }
}
