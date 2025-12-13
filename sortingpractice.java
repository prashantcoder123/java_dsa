import java.util.*;
import java.util.Arrays;
import java.util.Collections;

class sortingpractice{

public static void main(String args[]){
int arr [] ={3,6,2,1,8,7,4,5,3,1};

//Arrays.sort(arr);
Arrays.sort(arr,4,8);
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
}
} 