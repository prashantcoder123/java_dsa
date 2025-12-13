public class constructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Prashant";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);  // Copy constructor
        s2.password = "xyz";

        s1.marks[2] = 100; // Changing original object's marks

        // Printing s2's marks to check if deep copy worked
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Copy constructor (Deep Copy) or shallow copy 
    // Student(Student s1) {
    //     this.marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll; 
    //     for (int i = 0; i < 3; i++) {
    //         this.marks[i] = s1.marks[i];
    //     }
    //     System.out.println("Copy constructor is called..");
    // }
      
//deep copy constructor..
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i =0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
    // Non-parameterized constructor
    Student() {
        this.marks = new int[3];
        System.out.println("Default constructor is called..");
    }

    // Parameterized constructors
    Student(String name) {
        this.name = name;
        this.marks = new int[3];
        System.out.println("String parameterized constructor is called..");
    }

    Student(int roll) {
        this.roll = roll;
        this.marks = new int[3];
        System.out.println("Int parameterized constructor is called..");
    }
}
