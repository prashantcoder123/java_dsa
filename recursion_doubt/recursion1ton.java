class recursion1ton{
    public static void printInc(int n){
      if(n==0){ 
        return;
      }
        printInc(n-1);
        System.out.println(n +" ");
        
     } 

     public static void printDec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDec(n-1);
     }
      
    public static void main(String args[]){
        int n = 5;
        printInc(n);
        printDec(n);
    }
}