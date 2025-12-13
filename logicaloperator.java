import java.util.*;
public class logicaloperator{
    public static void main(String args[]){

   // logical AND operator.. ek bhi false hoga toh false hoga..
System.out.println((3>2)&&(5>0)); //dono sahi hai toh true hoga..
System.out.println((3>2)&&(5<0));//ek bhi false hoga toh false hoga..

//logical OR operator ek bhi true hoga oth true hoga...
System.out.println((3>2)||(5<0));
System.out.println((3<2)||(5<0)); //2no false hai esiliye false dega 
System.out.println((3>2)||(9<0));

// logical not operator.. true->false or false ->true..

System.out.println(!(3>2));// true hai lekin false dega..
System.out.println(!(3<2));// false hai lekin true dega..
    }
}