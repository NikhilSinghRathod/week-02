package hybridinheritance.resturantmanage;

public class Main {
    public static void main(String[] args) {
        // Creating objects for each subclass
        Chef chef1 = new Chef("Alice", 101);
        Chef chef2 = new Chef("John", 103);
        Waiter waiter1 = new Waiter("Bob", 102);
        Waiter waiter2 = new Waiter("Emily", 104);

        // Displaying details and performing duties for each Chef
        chef1.displayDetails();
        chef1.performDuties();
        System.out.println();

        chef2.displayDetails();
        chef2.performDuties();
        System.out.println();

        // Displaying details and performing duties for each Waiter
        waiter1.displayDetails();
        waiter1.performDuties();
        System.out.println();

        waiter2.displayDetails();
        waiter2.performDuties();
    }
}
