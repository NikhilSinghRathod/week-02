package assistedProblems.animalhierarchy;

 class Dog extends Animal {
    //constructor calling
    public Dog(String name , int age){
        super(name,age);
    }
   
    // Overriding the makeSound() method to specify the sound a dog makes
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}
