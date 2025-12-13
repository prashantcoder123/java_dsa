import java.util.*;
class arrayfunction{
    public static void  update(int marks[],int nonchangable){
         nonchangable = 10;  
        System.out.println(nonchangable);  //value of nonchangale is change here becz its work on call by value..
    for(int i = 0;i<marks.length;i++){
        marks[i] = marks[i]+1;  //update marks by +1
    }
}
    public static void main(String args[]){
    int marks [] = {97,98,99};
    int nonchangable = 5;
     for(int i=0;i<marks.length;i++){
        System.out.print(marks[i] +" ");
    }
    System.out.println();
    update(marks,nonchangable);
    System.out.println(nonchangable); //value is same here..bcz not work on call by reference.
    for(int i=0;i<marks.length;i++){
        System.out.print(marks[i] +" ");//marks update bcz work on call by reference..
    }
    }
}