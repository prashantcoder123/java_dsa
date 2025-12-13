import java.util.*;
class subarray{
    public static void subarray(int number[]){
        int ts = 0;
 for(int i = 0; i<number.length;i++){
    int start = i;
    for(int j=i; j<number.length ;j++){
        int end =j;
        int sum =0;
        for(int k = start ; k<= end; k++){
            System.out.print(number[k]+" ");
           // sum += number[k];
        }
       // System.out.println("sum is :"+sum);
        ts++; 
        System.out.println();     
    }
     System.out.println();
 }
 System.out.println( "total subarray is :" +ts);
}
    public static void main(String args[]){
 int number[] ={2,4,6,8,10,12};
 subarray(number);
    } 
}