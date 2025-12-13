import java.util.*;
class triplesum{
    // ---ye unsorted array ke liye hai ....


//  public static int[] triplesum(int arr[] , int target){
// for(int i =0;i<arr.length;i++){
//     for(int j = i+1;j<arr.length;j++){
//         for(int k =j+1;k<arr.length;k++){
//             if(arr[i]+arr[j]+arr[k] == target){
//                 return new int[] {i,j,k};
//             }
//         }
//     }
// }
// return new int[] {};
// }
    // public static void main(String args[]){
    // int arr[] = {2,4,8,11,12,14};
    // int target = 22;
    // int ans[] = triplesum(arr,target);
    //     System.out.println(ans[0] +" "+ans[1]+" "+ans[2]);
    // }

    
    //   ----unsorted array ke liye thaa.-------

public static void threeSum(int[] nums, int target){
    int n = nums.length;
     for(int i =0; i<n; i++){
        int newTar = target - nums[i];
        int l = i+1;
        int r = n-1;

        while(l<r){
           int csum = nums[l]+nums[r];
           if(csum ==newTar){
           System.out.println("triplet is : "+ i +" "+ l+" "+r); 
           l++;
           r--;
           } else if(csum < newTar){
            l++;
           } else{
            r--;
           }
        }
     }
}

public static void main(String args[]){
    int arr[] ={2,4,7,9,11,14};
    threeSum(arr,22);
}
}