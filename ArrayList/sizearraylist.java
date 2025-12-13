import java.util.ArrayList;
class sizearraylist{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        list.add(2,10);
        System.out.println(list);
        System.out.println(list.size());
        for(int i =0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        // reverse arraylist..
        System.out.println("reverse of arraylist");

        for(int i=list.size()-1;i>=0;i--){ //0(n).
            System.out.print(list.get(i)+" ");
        }
    }
}