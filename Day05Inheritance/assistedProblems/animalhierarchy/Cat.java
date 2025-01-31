package assistedProblems.animalhierarchy;
 class Cat extends Animal {
    //constructor to call the parent constructor
    public Cat(String name , int age){
        super(name,age);
    }
    //method to make sound
    @Override
    public void makeSound(){
        System.out.println(name + "ays :Meow Meow");
    }
}
