// import java.util.*;
// class sumofinteger{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum = 0;
//         while(num>0){
//              int lastdigit = num%10;
//             sum = sum+lastdigit;
//             num = num/10;
//         }
//         System.out.print("sum is " + sum);
//     }
// }



import java.util.*;
class sumofinteger{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer ");
        int digits = sc.nextInt();
        System.out.println("the sum is " + sumdigit(digits));
    }


    public static int sumdigit(int n){
        int sumofdigit = 0;
        while(n>0){
            int lastdigit = n%10;
            sumofdigit += lastdigit;
            n/=10;
        }
        return sumofdigit;
    }
}