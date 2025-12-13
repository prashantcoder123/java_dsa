import java.util.*;
class fever{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if(temp>100){
            System.out.println("you have a fever");
        }
        else{
            System.out.println("yoy don't have a fever");
        }
    }
}