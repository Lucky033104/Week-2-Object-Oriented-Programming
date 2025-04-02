package Inheritence.HybridInheritence;

interface Worker {
    void performDuties();
}
class Person {
    String name;
    int id;
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println(name + " is preparing dishes.");
    }
}
class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}
public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("Ravi", 107);
        Waiter waiter = new Waiter("Amit", 143);
        chef.displayPersonInfo();
        chef.performDuties();
        System.out.println();
        waiter.displayPersonInfo();
        waiter.performDuties();
    }
}

