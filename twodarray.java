import java.util.*;
class twodarray{
    public static boolean search(int matrix[][],int key){
        for(int i= 0 ;i<matrix.length;i++){
        for(int j =0;j<matrix.length;j++){
        if(matrix[i][j]==key){
System.out.println("found at cell (" + i+","+j+")");
            return true;
           }
        }
        }
        return false;
    }
public static void main(String args[]){
    int matrix[][] = new int[3][3];
    int n = matrix.length ;
    int m = matrix.length;
    // int n =3, m=3;
    Scanner sc = new Scanner(System.in);
    for(int i= 0 ;i<n;i++){
        for(int j =0; j<m; j++){
            matrix[i][j] = sc.nextInt();
        }
    }
    //output
    for(int i= 0 ;i<n;i++){
        for(int j =0;j<m;j++){
           System.out.print(matrix[i][j]+ " ");
        }
        System.out.println();
    }
    search(matrix ,2);
   largest(matrix);
   smallest(matrix);
    }
    //----largest element ---...
      public static void largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;   //-infinity..
         for(int i= 0 ;i<matrix.length;i++){
        for(int j =0;j<matrix.length;j++){
           if(largest < matrix[i][j]){
            largest = matrix[i][j];
           }
        }
        }
      System.out.println("largest is :"+ largest);
    }

    // ---- smallest element --------
    public static void smallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;  
         for(int i= 0 ;i<matrix.length;i++){
        for(int j =0;j<matrix.length;j++){
           if(smallest > matrix[i][j]){
            smallest = matrix[i][j];
           }
        }
        }
      System.out.println("smallest :"+ smallest);
    }


}