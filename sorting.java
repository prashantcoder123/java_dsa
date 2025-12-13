import java.util.*;
import java.util.Arrays;
public class sorting{
    //--------------bubble sort----------
    public static void bubblesort(int arr[]){
        for(int turn =0 ;turn<arr.length-1;turn++){
           // int swap = 0;
            for(int j =0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    //swap++; 
                }
                 //System.out.println("\nTotal swaps: " + swap);           
            }          
        } 
        
    }
    public static void printarr(int arr[]){
        for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");    
    }
    System.out.println();
    }

    //--------selection sortt--------

    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){ //descinding keliye ulta kr denge
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos]= arr[i];
            arr[i] = temp;

        }
    }

    // --------insertionsort ---------
    public static void insertionsort(int arr[]){
        for(int i =1; i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct pos to insert. 
            while(prev >=0 && arr[prev] >curr){ // desinding ke liye ulta kr denge...
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion 
            arr[prev+1] = curr;
        }
    }

    public static void main(String args[]){
    int arr[] = {5,4,1,3,2};
     bubblesort(arr);
    //  printarr(arr);
    // selectionsort(arr);
    // printarr(arr);
   // insertionsort(arr);
    printarr(arr);
  
    // for(int i =0;i<arr.length;i++){
    //     System.out.print(arr[i]+" ");
    // }
    }

}