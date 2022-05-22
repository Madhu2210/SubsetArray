package com.bridglabz;

class EncapsExample {
    private String myName;
    private int myRoll;
    private int myAge;

    public String getName() {
        return myName;
    }

    public int getRoll() {
        return myRoll;
    }

    public int getAge() {

        return myAge;
    }

    public void setName(String newName) {
        myName = newName;
    }

    public void setRoll(int newRoll) {
        myRoll = newRoll;
    }

    public void setAge(int newAge) {
        myAge = newAge;
    }
}

    class TestEncapsulation {
    public static void main(String[] args) {
        EncapsExample obj = new EncapsExample();
        obj.setName("Madhu");
        obj.setRoll(48);
        obj.setAge(23);

        System.out.println("My name is: " + obj.getName());
        System.out.println("My Roll is: " + obj.getRoll());
        System.out.println("My Age is: " + obj.getAge());
    }
}


