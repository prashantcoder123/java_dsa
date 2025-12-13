class practice1{
    public static void main(String args[]){
// greetingCard("Archit", "agarwall");
// greetingCard("Pranjal");
// greetingCard("Divyani" ,"Patel");
// greetingCard("Divya");
// greetingCard(20);
 String reply = greetingCard("prashant");
 System.out.println(reply);
 int res = sum(2,5);
 System.out.println(res);
}

    public static int sum(int a, int b){
        int res = a+b;
        System.out.println(res);
        return res;
    }
public static String greetingCard(String firstName){
    System.out.println("good evening " + firstName);
    return" good night";
}
 public static void greetingCard(String firstName ,String lastName){
        System.out.println(" Good Evening " + firstName +" "+ lastName);
    }


    // public static void greetingCard(String firstName){  // function overloading ho rha hai ..
    //     System.out.println(" Good Evening " + firstName);
    // }
      public static void greetingCard(int age){  // function overloading ho rha hai ..
        System.out.println(" Good Evening " + age);
    }
}