import java.util.*;
class evenoddmethod{
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        } 
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter an number : ");
        num = sc.nextInt();
        if(isEven(num)){
            System.out.print("number is even");
        }
        else{
            System.out.print("number is odd");

        }
    }
}