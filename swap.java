class swap{


    public static void swap(int a , int b){
        int temp = a;
        a =b; 
        b =temp;
        System.out.println("a is : " + a);
        System.out.println("a is : " + b);//yaha pe swap hoga ku ke yaha pe copy milta hai .
    }
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        swap(a,b);
        System.out.println("a is : " + a);
        System.out.println("a is : " + b);//yaha pe change nhi hoga ku ke main function me hai.
    }
}