package assistedProblems.animalhierarchy;

public class Main {
    public static void main(String[] args) {
        // Creating objects for each subclass
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        Animal bird = new Bird("Tweety", 1);

        // Displaying details and making sounds for each animal
        dog.displayDetails();
        dog.makeSound();

        cat.displayDetails();
        cat.makeSound();

        bird.displayDetails();
        bird.makeSound();
    }
}
