import java.util.*;
public class largestarray{
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE; // Integer.MIN_VALUE -> -infinity..
        int smallest= Integer.MAX_VALUE; // Integer.MAX_VALUE -> +infinity..
        for(int i = 0;i<number.length;i++){
            // number[i]=number[i]+1;
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.print("smallest value is :" + smallest);
        System.out.println();
        return largest;
    }
    public static void main(String args[]){
    int number[] = {2,13,6,8,12,4};
     int largest_value = getLargest(number);
     System.out.println("lagest value is : " + largest_value);
    
    }
} 