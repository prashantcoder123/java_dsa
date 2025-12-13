class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step1 -> create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 -> newnode next= head.
        newNode.next = head; //link
        //step 3 -> head = newNode
        head = newNode;
    }
    public static void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        // if(head ==null){
        //    System.out.println("LL is empty");
        //    return; 
        // }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        //i = idx-1; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    //methods ..
    // add();
    // remove();
    // print();
    // search();

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
         ll.print();
        ll.addFirst(2);
       // ll.print();
        ll.addFirst(1);
       // ll.print();
        ll.addLast(4);
    //    ll.print();
        ll.addLast(5);
        ll.print();
        ll.add(2,3);
      //  ll.add(0,9);
        ll.print(); //1->2->3->4->5
        System.out.println(ll.size);


    }
}