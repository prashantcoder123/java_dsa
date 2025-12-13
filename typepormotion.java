import java.util.*;
public class typepormotion{
    public static void main(String args[]){
        // 1st rule of type promotion... char , byte ,short ko int me chage kar dega . agar expression hoga tab like (a+b*c/d).
       char a ='a';
       char b ='b';
       int c = a-b;
       System.out.println(c);
       System.out.println((int)b);
       System.out.println((int)a);
       System.out.println(a);//type pormotion bass expression pe hota hai..
       System.out.println(b-a);
       
       short s =5;
       byte b1 =25;
       char c1='c';
       byte bt = (byte)(s+b1+c1);// ye int ho gya lekin type casting se byte me change kar liye.
    //    int bt = s+b1+c1;// ye bina type casting ke kiye ku ke int data type me store karra rhe hai..
       System.out.println(bt);

       // 2nd rule of typepormotion ek operand long , float,double hai toh sara yahi 3no me se ek me change ho jaiyega..
       int x=10;
       float y=20.25f;
       long z =25;
       double d =30;
       double ans =x+y+z+d; // expression double me convert kr de rha hai ..
    //    int ans =(int)(x+y+z+d); // expression double me convert kar rha hai lekin int me change karne ke liye type casting kiye hai..
       System.out.println(ans);


        
  byte bt1 =5;
//   bt1 =bt1*2;  //expression int me change ho jaa rha hai esilye byte me chnage nhi hoga..
     bt1 =(byte)(bt1*2); //int me change ho gya lekin byte me krne ke liye type cast kiye hai..
  System.out.println(bt1);

    }
}