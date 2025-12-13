import java.util.*;
public class ifelse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int age =22;
        int age =sc.nextInt();
        if(age>=18){
            System.out.println("adult : drive , vote");
        }

        if(age>13&&age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("not adult");
        }
    }
}