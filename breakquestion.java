import java.util.*;
public class breakquestion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter Your number: ");
            int n =sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
        System.out.println("exit");
System.out.println("same as while loop");
        while(true){
            System.out.print("Enter Your number: ");
            int n =sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }
        System.out.print("exit");
    }
}