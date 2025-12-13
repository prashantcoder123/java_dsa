import java.util.*;
class functionfactorial{ 
    public static int factorial(int n){
        int f =1;
        for(int i =1; i<=n ;i++){
            f = f*i;
        }
        return f; //factorial of n.
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of number:");
        int n = sc.nextInt();
        int result = factorial(n);
    System.out.println(result);
    } 
}