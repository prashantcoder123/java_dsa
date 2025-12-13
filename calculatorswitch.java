import java.util.*;
public class calculatorswitch{
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter a:");
    int a =sc.nextInt();
    System.out.println("enter operator:");
    char operator =sc.next().charAt(0);  //next likhne se string input hota esiliye eska use kiye hai..
    System.out.println("enter b:");
    int b =sc.nextInt();

  switch(operator){
    case '+':System.out.println(a+b);
    break;
    case '-':System.out.println(a-b);
    break;
    case '*':System.out.println(a*b);
    break;
    case '/':System.out.println(a/b);
    break;
    case '%':System.out.println(a%b);
    break;
    default :System.out.println("error");
  }
    }
}