package assistedProblems.animalhierarchy;

class Bird extends Animal{
    //construcor calling
    public Bird (String name , int age){
      super(name, age);
    }

    // Overriding the makeSound() method to specify the sound a bird makes
    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp Chirp!");
    }
}
