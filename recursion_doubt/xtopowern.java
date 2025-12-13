class xtopowern{

public static int fastPower(int a, int n){
    if(n==1){
        return a;
    }
    int halfPower = fastPower(a,n/2);

    if(n%2==0){  //n is even
       return halfPower*halfPower;
    }
    else{
        return halfPower*halfPower*a;
    }
}
    public static void main(String args[]){
int a =5;
int n=13;
int ans = fastPower(a,n);
System.out.println(ans);
    }
}