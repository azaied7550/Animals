package com.company;

public class Animal {
    private String name;
    //This is the default constructor. It runs whenever a new object is created in the main method
    public Animal(){
        System.out.println("An animal has been created ...");
    }

    //This is an overloaded constructor
    public Animal (String message){
        System.out.println("Hello " +message);
    }

    public String getName() {
       return name;
    }

    public void setName(String value){
        name = value;
    }
    public String eat(){
        return "An animal eats ...";
    }
    public String sleep() {
        return "An animal sleeps ...";
    }

    public String speak(){
        return "An animal makes noise...";
    }
    public String displayWhatAnimalDoes(){
        String output;
        output = this.eat()+" " + this.sleep();
        return output;
    }
}
