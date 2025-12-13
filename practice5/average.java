import java.util.*;
class average{

    public static double average(double x, double y,double z){
        double avg = (x+y+z)/3;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first input : ");
        double x = sc.nextDouble();
        System.out.print("Enter second input : ");
        double y = sc.nextDouble();
        System.out.print("Enter third input : ");
        double z = sc.nextDouble();
        System.out.print("the average value is" + average(x,y,z));
    }
}