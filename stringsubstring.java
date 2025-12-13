import java.util.*;
class stringsubstring{
public static String subString(String str,int si, int ei){
    String subStr = "";
    for(int i =si;i<ei;i++){
        subStr += str.charAt(i);
    }
return subStr;
}
public static void main(String args[]){
   String str = "HelloWorld";

   System.out.println(str.substring(0,5));  // inbuilt function.. 
   System.out.println(subString(str,1,7));
}
}