import java.util.Scanner;

class Constructor{

    public static void main(String[] arg){
        // System.out.println("Constructor");
        Student student1 = new Student(1,"Raviraj Girase");
        // System.out.println(std.rno +" "+ std.name);
        Student student2 = new Student(student1);
        System.out.println(student2.name);

    }
}

class Student{

    int rno;
    String name;
    //Default Constructor
    Student(){
        System.out.println("Default Constructor Created");
    }

        // Parameterised Constructor

    Student(int rno , String name){
        System.out.println("Parameterised Constructor");
        this.rno = rno;
        this.name = name;
    }
    //Copy Costructor
    Student(Student other){
        this.name=other.name;
    }
}