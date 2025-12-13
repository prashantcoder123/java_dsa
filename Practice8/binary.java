import java.util.*;
class binary{
    public static int search(int arr[] , int tar){
     int size = arr.length;
     int l =0;
     int r = size-1;
     while(l<=r){
        int mid =(l+r)/2;
        if(arr[mid]==tar){
            return mid;
        }else if(arr[mid]<tar){
            l= mid+1;
        }else{
            r= mid-1;
        }
     }
     return -1;
    }
    public static void main(String args[]){
    int arr[] = {10,14,17,19,23,38};
    System.out.println(search(arr,38));
     System.out.println(search(arr,91));
    }
}  