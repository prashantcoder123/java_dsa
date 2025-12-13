import java.util.*;
public class dowhile{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number:");
    int counter =sc.nextInt();
    int n =1;
    do{
        System.out.println("Hello World!");
        n++;
    } while(n<=counter);
    }
}