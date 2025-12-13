import java.util.*;
class linerasearch{
    public static int linearsearch(int number[],int key){
     for(int i=0;i<number.length;i++){
         if(number[i]==key){
            return i;
        }
     }
     return -1;
    }
    public static int linearsearchmenu(String[] menu , String found){
     for(int i=0;i<menu.length;i++){
         if(menu[i].equals(found)){  //use to copmare two stringg.
            return i;
        }
     }
     return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number which you want to search:");
        int key = sc.nextInt();
        sc.nextLine();  // next input ke liye use kr rhe hai..
     int number[] = {2,4,6,8,10,12,14,16};
    //  int key = 12;
    

     int index = linearsearch(number,key);
     if(index == -1){
        System.out.println("key is not present");
     }
     else{
        System.out.println("key is present at index :" +index);
     }
    
        System.out.print("Enter the menu item you want to search: ");
        String found = sc.nextLine();
        String menu[] = {"dosa","Chole bhature","samosa","pizza"};
        int indexmenu = linearsearchmenu(menu,found);
        if(indexmenu == -1){
            System.out.println("Menu is not found");
        }
        else{
            System.out.println("Menu is found at index:"+indexmenu);
        }
    }
}