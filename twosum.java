import java.util.*;
class twosum {
    // esme sorted ka koi kaam nhi kiya hai n^2 tc..
    // public static int[] twoSum(int numbers[], int target) { //multiple output aata hai tab int [] ka use krte hai ..
    //     for (int i = 0; i < numbers.length; i++) {
    //         for (int j = i + 1; j < numbers.length; j++) {
    //             if (numbers[i] + numbers[j] == target) {
    //                 return new int[] {i, j}; // returning indices
    //             }
    //         }
    //     }
    //      return new int[] {-1,-1}; // pair not found
    // }
    // public static void main(String[] args) {
    //     int numbers[] = {2, 4, 8, 11, 12, 14};
    //     int target = 15;
    //     int result[] = twoSum(numbers, target);
    //     if (result[0] != -1) {
    //         System.out.println("Pair found at indices: " + result[0] + ", " + result[1]);
    //     } else {
    //         System.out.println("No valid pair found.");
    //     }
       
    // }
// jab array sorted n ho tab use karenge...
    //------------------------yeha tak upar bale ke liye hai ------------------------

    // sorted ka use karengeeee........
    public static int[] twoSum (int[] nums, int target){
        int n = nums.length;
        int l = 0;
        int r = n-1;
        while(l<r){
            int csum = nums[l] + nums[r];
            if(csum == target){
                return new int[] {l,r};
            }else if(csum <target){
                l++;
            }else{
                r--;
            }
        }
        return new int[]{};
    }      

    public static void main (String args[]){
        int arr[] = {2,4,8,11,12,14};
        int ans[] = twoSum(arr,15);
        System.out.println(ans[0] +" "+ans[1]);
    }                              
}
