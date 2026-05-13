import java.util.*;
class DequeJCF{

   
    public static void main(String args[]){
        Deque <Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);//2134
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);

        System.out.println("first el = " + deque.getFirst());
        System.out.println("first el = " + deque.getLast());

    }

}