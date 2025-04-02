package ConstructorsAndInstance.Level1;
public class Person {
    String name;
    int age;
    Person() {
        name = "Unknown";
        age = 0;
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Person original = new Person("Bhaskar", 20);
        System.out.println("Original Person:");
        original.display();
        Person copy = new Person(original);
        System.out.println("\nCopied Person:");
        copy.display();
    }
}

