import java.util.*;
class QueueJCF{

    public static void main(String args[]){
        //Queue q = new Queue();
        //Queue<Integer> q = new LinkedList<>();  // queue interface h esilieye class nhi bna kste toh linkedlist bnte hau
        Queue<Integer> q = new ArrayDeque<>();  // queue interface h esilieye class nhi bna kste toh ArrayDeque bnte hau
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove(); 
        }
    }
}