import java.util.*;
public class array{
    public static void main(String args[]){

     // ****** create array *******

        //int marks[] = new int[50];  //array create
        // int numbers[] ={1,2,3};  // or array create
        // System.out.println(numbers[1]);
//********array input ******* */
        int marks [] = new int[100];
        Scanner sc = new Scanner(System.in);
         marks[0] = sc.nextInt();//physics markss..
         marks[1] = sc.nextInt();//chemistry marks.
         marks[2] = sc.nextInt();//maths marks..
         System.out.println("physics : " + marks[0]);
         System.out.println("chemistry : " + marks[1]);
         System.out.println("maths : " + marks[2]);
        //  marks[2] = 100; // maths marks updtae 
         marks[2] = marks[2]+1;  // maths marks updtae 
         System.out.println("maths : " + marks[2]);
         int percentage = (marks[0]+marks[1]+marks[2])/3;
         System.out.println("percentage = " + percentage +"%");
         System.out.println("length of array = " + marks.length);
    }
}