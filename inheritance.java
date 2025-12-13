public class inheritance{
    public static void main(String args[]){
        // Fish shark = new Fish();
        // shark.eat();
        // // shark.swim();
        // // shark.breathe();
        // shark.color ="red";
        // System.out.println(shark.color);
        // shark.fins = 4;
        // System.out.println(shark.fins);

        //multi level inheritance...
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);
        // dobby.color = "black";
        // System.out.println(dobby.color);

        //hierarchial inheritance....
        // Bird parrot = new Bird();
        // parrot.fly();
        // parrot.color = "green";
        // System.out.println(parrot.color);

        //hybrid inheritance..
        Dog lucky = new Dog();
        lucky.bark();
        lucky.eat();
        Peacock xyz = new Peacock();
        xyz.wings= 2;
        System.out.println("how much wings have peacock " + xyz.wings);
        xyz.fly();
        xyz.breathe();

    }
} 
//Base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }

}
//hybrid inheritance..
class Mammals extends Animal {
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
class Shark extends Fish{
    int fins;
}
class Peacock extends Bird{
    int wings;
}
class Dog extends Animal{
    void bark(){
        System.out.println("bark");
    }
}

//hierarchial inheritance..

// class Mammals extends Animal {
//     void walk(){
//         System.out.println("walks");
//     }
// }
// class Fish extends Animal{
//     void swim(){
//         System.out.println("swim");
//     }
// }
// class Bird extends Animal{
//     void fly(){
//         System.out.println("fly");
//     }
// }


// multi level inheritance..
// class Mammals extends Animal {
//     int legs;
// }
// class Dog extends Mammals{
//     String breed;
// }





// //derived class..
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims in water");
//     }
// }