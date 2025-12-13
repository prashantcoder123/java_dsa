import java.util.*; 
class maxsubarraysum{
    //brute force ..



//     public static void maxsubarraysum(int number[]){
//         int currSum = 0;  //brute force ....
//         int maxSum = Integer.MIN_VALUE;
//  for(int i = 0; i<number.length;i++){
//     int start = i;
    
//     for(int j=i; j<number.length ;j++){
//         int end =j;
//         currSum =0;
//         for(int k = start ; k<= end; k++){
//            currSum += number[k];       
//         }
//         System.out.println(currSum);
//         if(maxSum < currSum){
//             maxSum = currSum;
//         }   
//     }
//  }
//  System.out.println( "max sum :" + maxSum);
// }



//prefix array ..

//     public static void maxsubarraysum(int number[]){
//         int currSum = 0;  
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[number.length];
//         prefix[0] = number[0];
//         //calculate prefix array..
//         for(int i = 1; i<prefix.length;i++){
//          prefix[i] = prefix[i-1] + number[i];
//         }
//     for(int i = 0; i<number.length;i++){
//     int start = i;
//     for(int j=i; j<number.length ;j++){
//         int end =j;
//         currSum = start ==0 ? prefix[end] : prefix[end] - prefix[start-1];
//         if(maxSum < currSum){
//             maxSum = currSum;
//         }   
//     }
//  }
//  System.out.println( "max sum :" + maxSum);
// }

//kadane algorithm...
public static void kadanes(int number[]){
int ms = Integer.MIN_VALUE;
int cs = 0;
 for(int i =0;i<number.length;i++){
    cs = cs+number[i];
    
    if(cs < 0){
   cs = 0;
    }
System.out.println(cs);
 if(ms<cs){
ms = cs;   
 }
//  ms.Math.max(cs,ms); pata nhi ku work nhi kr rha h ...
}
System.out.println("our max subarray sum is :" + ms);
}

 public static void main(String args[]){
 int number[] ={-2,-3,4,-1,-2,1,5,-3};
 //int number[] ={-1,-2,-3,-4}; kadan algoritjm me ek case ye bhi hai eske 
 //liye if(cs<0) cs =0 ye bala hata denge toh ho jaiyegaa..
 //maxsubarraysum(number);
 kadanes(number);
    } 
}