import java.util.*;
public class table{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter number:");
       int n = sc.nextInt();
       for(int i=1; i<=10; i++){
    int res = n*i;
    System.out.println( n + "*"+ i + " = " + res +"   ");
       } 


//table of 5 without user input.
    // for(int i=5; i<=50; i=i+5){
    // int res = i;
    // System.out.print(" " +res);
    //    }

//using modular..
    //    for(int i=1; i<=50; i++){
    // if(i%5==0){
    //     System.out.print( "  " +i);
    // }
    //    }

    }
}