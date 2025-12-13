class Recursion_sumofnnumber{
    public static int sum( int n){
        //int sum = 0;
        if(n==1){
            return 1;
        }
        int snm1 = sum(n-1);
        int sn = snm1 + n;
        return sn;
    }
    public static void main(String args[]){
        int n =5;
        System.out.println(sum(n));
    }
}