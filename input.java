import java.util.*;

public class input{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

        //  String input =sc.next();  //  bass ek word ka input lega jaise hee space denge uske baad ka nhi lega ..
        //  System.out.println(input);

         String name =sc.nextLine();  // space ke baad ka bhii input legaaa.. sentence bhi print karwate hai es se
         System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);


        float price = sc.nextFloat();
        System.out.println(price);

        double db =sc.nextDouble();
        System.out.println(db);

        long lg =sc.nextLong();
        System.out.println(lg); 
    }
}