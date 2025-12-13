import java .util.*;
class string{
    public static void printLetter(String str){
        for(int i =0;i<str.length();i++){
            System.out.print(str.charAt(i) +" ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");
   System.out.println(str);
   System.out.println(str2);
        //String are IMMUTABLE....
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);
String fullName = "tony stark";
System.out.println(fullName.length());

String firstName = "prashant";
String lastName = "kumar";
String name = firstName +" "+lastName;
System.out.println(name  + " is this");

printLetter(name);
    }
}