import java.util.*;
class lowercasevowelenter{
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = str.length();
    int count =0 ;
    for(int i =0; i<n; i++){
        char chr = str.charAt(i);
        // chr = Character.toUpperCase(str.charAt(i));
        // System.out.println(chr);

        if(chr =='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'){
            count++;
        }
     
    }
    System.out.println("count of vowel is :" + count);
}
}    