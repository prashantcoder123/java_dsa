class Recursionxtopowern{
    public static int power(int x , int n){
        if(n == 0){
            return 1;
        }
        // int xnm1 = power(x,n-1);
        // int xn = x * xnm1;
        // return xn;
        return x*power(x,n-1);

        //  int smaller = power(x,n-1);
        //  return x * smaller;
    }
    public static void main(String args[]){
 System.out.println(power((int)2.2,10));
 System.out.println(power(5,13));
    }
}