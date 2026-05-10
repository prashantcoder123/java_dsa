class LinkedList{
    public static class Node{
        int data;
        Node next;//reference variable -> jo next node ko point karega.
        public Node(int data){
        this.data = data;
        this.next = null;
         
        }  
    }
    public static Node head;
    public static Node tail;
    public static int size;
//methods 
// add()
// remove()
// print()
// search()

//add first 
public void addFirst(int data){
     //step1 create new node  
    Node newNode = new Node(data);
    size++;
    //case 1 if ll is empty
    if(head == null){
        head = tail = newNode;
        return;
    }
    //step1 create new node
    //Node newNode = new Node(data);
    //step 2 newnode next = head;
    newNode.next = head;//link
   // step 3 head = newNode;
   head = newNode;
} 

//add last.
public void addLast(int data){
        //step 1 create new node 
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
        return ; 
    }
    //step 2 tail next -> new node;
    tail.next = newNode;
    //step 3 tail -> new node 
    tail = newNode;
}


// add middle.
public void addMiddle(int idx , int data){
    if(idx==0){
        addFirst(data);
        return;
    }
Node newNode = new Node(data);
size++;
Node temp = head;
int i=0;
while(i<idx-1){
temp = temp.next;
i++;
}
//i = idx-1 temp->prev
newNode.next = temp.next;
temp.next= newNode;
}

public void print(){
    if(head== null){
        System.out.println("LL is empty");
        return;
    }
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+ "->");
        temp = temp.next;
    }
    System.out.println("Null");
}

//remove first.
public int removeFirst(){
    if(size==0){
        System.out.println("LLis empty");
        return Integer.MIN_VALUE;
    } else if(size==1){
        int val = head.data;
        head = tail=null;
        size =0;
        return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
}
//remove last
public int removeLast(){
    if(size ==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }else if(size ==1){
        int val = head.data;
        head = tail= null;
        size =0;
        return val;
    }
    Node prev = head;
    for(int i=0;i<size-2;i++){
        prev = prev.next;
    }
    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;
}
    public int itrSearch(int key){
        Node temp=head;
        int i =0;
        while(temp!=null){
            if(temp.data ==key){    // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1; //key not found
    }

//reverse linkedlist..
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr= next;
        }
        head = prev;

    }

    //find and remove nth node from end  or delete in middle.

    public void deleteNthfromEnd(int n){
        //calcuate size 
        int sz =0;
        Node temp = head;
        while(temp!= null){
            temp = temp.next;
            sz++;
        }
        if(n==sz){
            head = head.next;//remove first.
            return;
        }
        //size-n
        int i =1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev= prev.next;
            i++;
        }
        prev.next= prev.next.next;
        return; 
    }

    //find middle slow-fast approach.
    public Node findMid(Node Head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;//+1
            fast= fast.next.next;//+2
        }
        return slow;//slow is mid.
    }

    public boolean checkPalindrome(){
        if(head ==null ||head.next==null){
            return true;
        }
        //step1 find mid
        Node midNode = findMid(head);
        //step reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next; 
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;//right half head
        Node left = head;
       // step3 check left and right equal
       while(right != null){
        if(left.data != right.data){
            return false;
        }
        left = left.next;
        right = right.next;
       }
       return true;
    }



    public static void main(String args[]){
        LinkedList ll= new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        //yaha se code suru hai 
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(4);
        // ll.print();
        // ll.addLast(5);
        // ll.print();
        // ll.addMiddle(2,3);
        // ll.print();//1->2->3->4->5
        // System.out.println(size);
        // ll.removeFirst();
        // ll.print();
        // System.out.println(size);
        // ll.removeLast();
        // ll.print();
        // System.out.println(size);
        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(10));
        // ll.reverse();
        // ll.print();
        // ll.deleteNthfromEnd(2);
        // ll.print();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        //ll.addLast(1);
        ll.print();
        System.out.println(ll.checkPalindrome());


    }
}