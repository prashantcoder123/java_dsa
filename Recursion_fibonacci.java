class Recursion_fibonacci{
    public static int fib(int n){
        if(n==0){
            return n;
        }
        if(n==1){
            return n;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fibn = fibnm1 + fibnm2;
        
        return fibn;
        
    }
    public static void main(String args[]){
        int n = 26;
         System.out.println(fib(n));
        for(int i = 0;i <=n ;i++){
            System.out.print(fib(i) + " ");
        }
        System.out.println(); 
       System.out.println(fib(n));
     }
}