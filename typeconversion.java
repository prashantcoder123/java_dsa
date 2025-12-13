import java.util.*;
public class typeconversion{
    public static void main(String args[]){
        
    char ch ='a';
    char ch2 ='b';
    int n =ch;
    int n2=ch2;
     System.out.println(n);
     System.out.println(n2);



        int a =25;
        long b =a;
         System.out.println(b);
        //  long a =25;
        // int b =a;

        Scanner sc =new Scanner(System.in);
        // int number = sc.nextFloat();   ye nhi hoga ku ke float int me change nhi ho skta hai .
        float number = sc.nextInt(); // ye hoga ku ke int float me change ho skta hai..
        System.out.println(number);

// type casting bala code hai yaha seee.

  float a1 = (float)25.12;
//   float a1 = 25.12f;
  int b1 =(int)a1;
  System.out.println(b1);


    }
}