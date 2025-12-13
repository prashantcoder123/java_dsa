class functionoverloading{
    //func to calculate sum of 2 number..
    // public static int sum(int a, int b){
    //     return a+b;
    // }
    // //func to calculate sum of 3 number..
    // public static int sum(int a, int b,int c){
    //     return a+b+c;
    // }
    // public static void main(String args[]){
    //  System.out.println(sum(3,5));
    //  System.out.println(sum(3,5,4));
    // }


    // using data types function overloading

    //func to calculate sum of 2 number..

     public static int sum(int a, int b){
        return a+b;
    }
    //func to calculate sum of 3 number..
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String args[]){
     System.out.println(sum(3,5));
     System.out.println(sum(3.6f,5.9f));
    }
}