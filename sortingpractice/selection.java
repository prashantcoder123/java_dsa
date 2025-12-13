class selection{
    public static void selectionsort(int arr[]){
        int n = arr.length;
         for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
           // swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
         }   
    }
     public static void printarr(int arr[]){
                for(int i=0;i<arr.length;i++){
                    System.out.println(arr[i]);
                }
            }
    public static void main(String args[]){
      int arr[] = {5,4,1,3,2};
      selectionsort(arr);
      printarr(arr);
    }
    
}