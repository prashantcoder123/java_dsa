public class oops{
    public static void main(String args[]){
        Pen p1 = new Pen(); //created a pen object p1 
        p1.setColor("Blue");
        System.out.println(p1.getColor()); 
    
        p1.SetTip(8);
        System.out.println(p1.getTip());

        p1.setColor ("yellow");
        System.out.println(p1.getColor()); 

        p1.SetTip(6);
        System.out.println(p1.getTip());


        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "prashant";
        // System.out.println(myAcc.username);
        // myAcc.setPassword("abcdefghi");
        

    }
}


class BankAccount {
   public String username ;
   private String password;
   public void setPassword(String pwd){
    password = pwd;
   }

}

class Pen{
  private  String color;
  private   int tip;

String getColor(){
    return this.color;
}
int getTip(){
    return this.tip;
}
    void setColor(String newColor){
        this.color = newColor;
    }
    void SetTip(int tip){
        this.tip = tip;
    }

}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem , int math){
        percentage = (phy+chem+math)/3;
    }
}