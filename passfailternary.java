import java.util.*;
public class passfailternary{
    public static void main(String args[]){
// int marks =67;
Scanner sc =new Scanner(System.in);
int marks =sc.nextInt();
String status =(marks>=33)?"pass":"fail";
System.out.println(status);
    }
}