import java.util.LinkedList; //optimized
public class LLCollection{
    public static void main(String args[]){
        //create --object int float,boolean ->>Integer,Float,
        LinkedList<Integer> ll= new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
       // 0->1->2
       System.out.println(ll);
       //remove
       ll.removeLast();
       ll.removeFirst();
       System.out.println(ll);
       //

    }

}