import java.util.*;
public class array{
    public static void main(String args[]){
        int [] arr =new int[5]; 
        System.out.println(arr[0]);
        System.out.println(arr[1]);
         arr[2] =55;
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        arr[2] =535;
        System.out.println(arr[2]);
        System.out.println(arr);
        // System.out.println(System.identityHashCode(arr[2]));
        // System.out.println(System.identityHashCode(arr[3]));
       arr[4]=6;
       

    }
}