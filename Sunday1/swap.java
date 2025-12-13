class swap{
    public static void main(String[] args){
    int a =10,b=20;
    System.out.println(a +" "+b);
    swap(a,b);
    }
    public static void swap(int x, int y){
// System.out.println(x +" " + y);
int temp =x;
x=y;
y=temp;
System.out.println(x +" "+y);
    }
} 