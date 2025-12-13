import java.util.*;
class continuequestion{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    do{
        System.out.print("Enter number :");
        int n =sc.nextInt();
        if(n%10==0){
            continue;
        }
        System.out.println("number was :" + n);
    }while(true);
// for(;;){
//     System.out.print("Enter number :");
//     int n = sc.nextInt();
//     if(n%10==0){
//         continue;
//     }
//     System.out.println(n);
// }
    }
}