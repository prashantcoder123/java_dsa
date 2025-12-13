class recursion1stoccurence{
    public static int firstOcc(int arr[],int tar, int idx){
        if(idx == arr.length){
            return -1;
        }


        // if(arr[idx] == tar){
        //     return idx;
        // }
        // return firstOcc(arr,tar,idx+1);


        int ans = firstOcc(arr,tar,idx+1);
        if(arr[idx] == tar){
            return idx;        
        } else{
            return ans;   
        }
    }
    public static void main(String args[]){
      int arr[] = {10,9,15,7,8,7,9,7};
      System.out.println(firstOcc(arr,7,0));
    }
}