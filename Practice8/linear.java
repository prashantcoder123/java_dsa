import java.util.*;
class linear{
    public static int search(int arr[] , int tar){
     int size = arr.length;
     for(int i=0;i<size;i++){
        if(arr[i] == tar){
            return i;
        }
     } 
     return -1;
    }
    public static void main(String args[]){
    int arr[] ={ 10,14,15, 9 , 8, 11};

    System.out.println(search(arr,9));
    System.out.println(search(arr,91));
    }
}