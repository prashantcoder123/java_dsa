class missingandrepete{
    public static int missingandrepete(int num[]){
        int n = num.length;
        int cnt = 0;
        for(int i =0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(num[j]==num[i]){
                    cnt++;
                }
            }
            if(cnt ==2 ){
                System.out.println(" repete number is :");
                return num[i];
            }else if(cnt ==0 ){
                return num[i];
            }
        }
        return -1;
    }
    public static void main(String args[]){
int arr[] = {1,2,3,4,3,6};
missingandrepete(arr);
    }
}