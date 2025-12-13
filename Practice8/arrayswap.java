import java.util.*;
public class arrayswap{
    //array bala swap heap se hota hai...
    public static void swap1(int arr[]){
    int temp = arr[0];
    arr[0] = arr[1];
    arr[1] = temp;  // heap bnta hai esilye ho rha hai ...
    }
    //function bala swap hai..
    public static void swap(int a, int b){
    int temp = a;
    a=b;
    b = temp;  
    System.out.println("after swap a is : " +a+"  b is : "+b); // yaha pe value change hoga ku ke stack me se delete hone se phele print ho rha hai ..
    }

    public static void main(String args[]){
        int a= 2;
        int b= 5;
        System.out.println(a+" "+b);
    swap (a,b);
    System.out.println(a+" "+b); // yaha pe same print hoga ku kee stack me se delelte ho gya hai ..

 
       int arr[] = new int[2];
       arr[0] = 2;
       arr[1] = 5;
        System.out.println(arr[0]+" "+arr[1]);

    swap1(arr);
            System.out.println("after swap a is:"+arr[0]+"  b is : "+arr[1]);

    }
}