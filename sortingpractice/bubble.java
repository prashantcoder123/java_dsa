class bubble{
    public static void bubblesort(int arr[]){
        int n= arr.length;
        for(int turn =0 ;turn < n-1; turn++){
            //for(int i = 0;i < arr.length-1; i++){
           // for(int i = 0;i < n -1-turn; i++){
             for(int i = 0;i <= n -2-turn; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }         
            }
        }
    }  

    public static void printarr(int arr[]){
        for(int i= 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
     int arr[] = {3,6,2,1,8,7,4,5,3,1};
     bubblesort(arr);
     printarr(arr);
    }
}