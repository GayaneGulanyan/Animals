package com.company;

public class Animal {

    static String name;
    static String family;
    static int age;


}

class Cat extends Animal implements Actions{

    void setArg (String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }
    void getArg (){
        Actions.can();
        Actions.mjump(true);
        Actions.mbark(false);
        Actions.mswim(false);
        Actions.mrun(true);
    }
}
class Dog extends Animal {
    void setArg (String name, String family, int age) {
        this.name=name;
        this.family=family;
        this.age=age;
    }
    void getArg (){
        Actions.can();
        Actions.mjump(true);
        Actions.mbark(false);
        Actions.mswim(false);
        Actions.mrun(true);
    }
}
class Fish extends Animal{
    void setArg (String name, String family, int age) {
        this.name=name;
        this.family=family;
        this.age=age;
    }
    void getArg (){
        Actions.can();
        Actions.mjump(true);
        Actions.mbark(false);
        Actions.mswim(false);
        Actions.mrun(true);
    }
}


