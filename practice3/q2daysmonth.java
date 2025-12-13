import java.util.Scanner;
class q2daysmonth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if(month ==2){
            System.out.println("feb has 28 days");
        }
        else if(month<8){
            if(month%2==0){
                System.out.println("30 days");
            }else{
                System.out.println("31 days");
            }
        }   
        else{
            if(month%2==0){
                System.out.println("31 days");
            }else{
                System.out.println("30 days");
            }
        }
    }
}