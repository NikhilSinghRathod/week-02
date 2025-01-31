package hybridinheritance.resturantmanage;

// Creating a class Chef to represent specific Chef objects inheriting from Person and implementing Worker
class Chef extends Person implements Worker {

    // Constructor to initialize Chef objects with provided values
    public Chef(String name, int id) {
        super(name, id); // Calling the superclass constructor
    }

    // Overriding the performDuties() method to specify the duties of a chef
    @Override
    public void performDuties() {
        System.out.println("Preparing meals, managing kitchen staff, and ensuring food quality.");
    }
}
