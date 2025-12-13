import java.util.*;
public class palindrome{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    boolean answer = isPalindrome(num);
    System.out.println(answer);
}
public static boolean isPalindrome(int num){
    int input = num;
    int reverse = 0;
    while(input!=0){
        int lastDigit = input % 10;
        input = input/10;
        reverse = reverse *10 + lastDigit;
    }
    if(reverse == num ) {
        return true;
    }
    else{return false;}
}
}