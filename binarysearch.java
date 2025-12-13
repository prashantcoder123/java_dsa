import java.util.*;
class binarysearch{
    public static int binarySearch(int number[], int key){
     int start = 0, end = number.length-1;
     while(start <= end){
      int mid = (start + end) /2;
      // comparisons 
      if(number[mid] == key){  //found..
        return mid;
      }
      if(number[mid]<key){ //right
    start = mid+1;
      }else{ //letf
       end = mid-1;
      }
     }
     return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number you want to select :");
        int number[] = {2,4,6,8,10,12,14};
        int key = sc.nextInt();
        // int key = 10;
        System.out.println("index for key is :" + binarySearch(number, key));
        //if print -1 then the number is not present in the given array...
    }
}