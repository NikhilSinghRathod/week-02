package hybridinheritance.resturantmanage;

// Creating a class Waiter to represent specific Waiter objects inheriting from Person and implementing Worker
class Waiter extends Person implements Worker {

    // Constructor to initialize Waiter objects with provided values
    public Waiter(String name, int id) {
        super(name, id); // Calling the superclass constructor
    }

    // Overriding the performDuties() method to specify the duties of a waiter
    @Override
    public void performDuties() {
        System.out.println("Taking orders, serving food, and providing customer service.");
    }
}