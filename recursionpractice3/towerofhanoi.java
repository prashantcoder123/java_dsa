class towerofhanoi{
    //print steps to move n number of discs from A to C with the help of B... 
    public static void towerOfHanoi(int n , int A, int C, int B){
       if(n==0){
        return; 
       }
    towerOfHanoi(n-1, A, B, C); //movinf n-1 disc form A to B using C.
    //moving a to c..
    System.out.println("Moving disc "+ n +" from "+ A + "to "+ C);

    towerOfHanoi(n-1,B,C,A);    //moving n-1 disc Bto C using A..

 
  
    }
    public static void main(String args[]){
    towerOfHanoi(3,10,30,20);
    }
}