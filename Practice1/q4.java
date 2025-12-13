import java.util.*;
public class q4{
    public static void main(String args[]){
    byte b =4;
    char c ='a';
    short s =512;
    int i =1000;
    float f =3.14f;
    double d =99.9954;
     
    double result = (f*b)+(i%c)-(d*s); // double me convert hoga ku ke largest data type hai..
    // int result =(int) ((f*b)+(i%c)-(d*s));  //int me karwane ke liye tpye cast kiye hai int me..
    System.out.println(result);
    }
}