import java.util.*;
class continuekey{
    public static void main(String args[]){
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==3){
            // if(i==3|| i ==7 || i==11|| i ==12){
                continue;
            }
            System.out.println(i);
        }
    }
}