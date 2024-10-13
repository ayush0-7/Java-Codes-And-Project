import java.util.*;
class paper1
{
     String s;
    paper1(){
        s=" ";
    }
    void readsent(){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter");
        s=in.nextLine();
    }
    int freq(String w){
        int i,k=0;
        for(i=0;i<w.length();i++){
            char c=w.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            k++;
        }
        return k;
    }
    void arrange(){
        String st="";
        int i;
        s = s.trim();
        s = s + " ";
        int l=s.length();
        for(i=0;i<l;i++){
            char c=s.charAt(i);
            st+=c;
            if(c==' '){
                st=st.trim();
                int w_freq=freq(st);
                System.out.println(st+" = "+w_freq);
                st="";
            }
        }
    }
    public static void main(String args[]){
        paper1 ob=new paper1();
        ob.readsent();
        ob.arrange();
    }
}