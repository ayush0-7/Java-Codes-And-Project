
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class About_ArrayLists {
   public static void main(String args[]) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       ArrayList<String> list2 = new ArrayList<String>();
       ArrayList<Boolean> list3 = new ArrayList<Boolean>();
       Scanner in = new Scanner(System.in);
       
    //    list2.add("Ayuhs");
    //    list2.add("Class");
    //    list2.add("Ball");
    
    for (int i = 0; i < 4; i++) {
        list2.add(in.nextLine());
    }
       //add elements
       list.add(1);
       list.add(3);
       list.add(4);
       list.add(5);
       System.out.println("Print List : "+list);


       //to get an element
       int element = list.get(0); // 0 is the index
       System.out.println("Get Element : "+element);


       //add element in between
       list.add(1,2); // 1 is the index and 2 is the element to be added
       System.out.println("Add Element : "+list);


       //set element
       list.set(0,0);
       System.out.println("Set Element : "+list);


       //delete elements
       list.remove(0); // 0 is the index
       System.out.println("Delete Element : "+list);


       //size of list
       int size = list.size();
       System.out.println("Size of list : "+size);

       //Remove All element from list
       //list.removeAll(list);

       //Loops on lists
       System.out.print("Print Array list by Loop : ");
       for(int i=0; i<list.size(); i++) {
           System.out.print(list.get(i) + " ");
       }
       System.out.println();


       //Sorting the list
       list.add(0);
       Collections.sort(list2);
       System.out.println("Sort List : "+list2);
   }
}
