package com.company;

public class Cat extends Animal {

    public String scratches(){
        return "A cat scratches & bites...";
    }

    @Override
    public String speak (){
        return"A cat purrrrs....";
    }
}
