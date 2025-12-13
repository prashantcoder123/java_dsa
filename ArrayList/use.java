import java.util.ArrayList;
import java.util.*;
class use{

    public static void main(String args[]){
        //java collection framework..- me use hota hai..
       ArrayList<Integer> list  = new ArrayList<>();
    //    ArrayList<String> list2  = new ArrayList<>();
    //    ArrayList<Boolean> list3  = new ArrayList<>();
      
       //add operation ..
       list.add(1); //0(1).
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(4);
       list.add(5);
       System.out.println(list);

       list.add(1,11);
       System.out.println(list);
       //Get Operation.-->0(1).
       int element = list.get(2); //jo chaiye uska index.
        System.out.println(element);

        //remove element..0(n).
        list.remove(4); //jo delete krna h uska index..
        System.out.println(list);

        //set element at index..0(n).

        list.set(2,10);
        System.out.println(list);

        //contains..
        //hoga toht true dega nhi toh false.
        System.out.println(list.contains(1));  
        System.out.println(list.contains(11));
    }
}