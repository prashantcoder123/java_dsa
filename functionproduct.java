class functionproduct{

    public static int multiply(int a , int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        int a=5;
        int b= 6;
        int result = multiply(a,b);
        System.out.println("product of a and b is :" +result);
       result = multiply(10,6);
        System.out.println("product of a and b is :" +result);
    }
}