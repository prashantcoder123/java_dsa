import java.util.*;
public class functionsum{

   public static int calculateSum(int num1 , int num2) { //num1 and num2 are parameter and formal parameters.. esko function definitation ke time likhte hai.. 
    int sum = num1 + num2;
    return sum;
   }

public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
int sum = calculateSum(a,b);  // arguments and actual arguments esko function calling ke time likhte hai..
System.out.println("sum is : "+ sum);
    }
}  