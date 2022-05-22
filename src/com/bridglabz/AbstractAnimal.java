package com.bridglabz;

abstract class AbstractAnimal {
    public abstract void animalVoice();
    public void sleep(){
        System.out.println("Zzzzz");
    }
}
class Pig extends AbstractAnimal{
    public void animalVoice() {
        System.out.println("The pig is Sleeping");
    }
}
class Tiger extends AbstractAnimal{
    public void animalVoice() {
        System.out.println("The tiger roars");
    }
}
class Mains{
    public static void main(String[] args) {
//        Pig pig = new Pig();
//        pig.animalVoice();
//        pig.sleep();
        Tiger tiger = new Tiger();
        tiger.animalVoice();
        tiger.sleep();
    }
}
