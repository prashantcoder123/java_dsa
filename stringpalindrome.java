import java.util.*;
class stringpalindrome{
    public static boolean isPalindrome(String str){
        for(int i =0;i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
 
     public static void main(String args[]){
        String str = "noon";
        String str1 = "racecar";
        String str2= "noonkdk";
    //    Scanner sc =new Scanner(System.in);
    //     String str = sc.nextLine();
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
    }
}