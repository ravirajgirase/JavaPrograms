package Packages.StaticExamples;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static int population;
    Human(int age, String name, int salary,boolean married){
        this.age = age;
        this.name = name;
        this.salary =salary;
        this.married = married;
        this.population += 1;
        
    }
}
