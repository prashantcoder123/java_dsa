import java.util.*;
public class forloopreverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        // int n = 1089956;
        
        // while(n > 0){
        //     int lastdigit = n%10;
        //     System.out.print(lastdigit);
        //     n=n/10;
        // }
        for(int i =1;n>0;i++){
              int lastdigit = n%10;
            System.out.print(lastdigit);
            n=n/10;  
        }
    }
}