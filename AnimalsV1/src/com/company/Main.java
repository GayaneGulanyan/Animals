package com.company;

public class Main {

    public static void main(String[] args) {
        Cat theTom = new Cat();
        theTom.setArg("cat Tom", "Siamese breed", 3);
        Actions.description(Cat.name, Cat.family, 3);
        theTom.getArg();

        Dog theJacky = new Dog();
        theJacky.setArg("dog Jacky,", "Spitz", 4);
        Actions.description(Dog.name, Dog.family, Dog.age);
        theJacky.getArg();

        Fish theDory = new Fish();
        theDory.setArg("Dory fish,", "Blue", 2);
        Actions.description(Fish.name, Fish.family, Fish.age);
        theDory.getArg();
    }
}
