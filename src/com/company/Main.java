package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
        Animal a = new Animal("The overloaded constructor has run");
        a.setName("Yogi Bear");
        System.out.println("The animal is called " +a.getName());
        System.out.println(a.eat());
        System.out.println(a.sleep());

        System.out.println();
        Animal b = new Animal();
        b.setName("Smokey the bear");
        System.out.println("This animal is called " +b.getName());
        System.out.println(b.displayWhatAnimalDoes());
        System.out.println();

        Bird c= new Bird();
        System.out.println(c.displayWhatAnimalDoes());
        System.out.println(c.fly());
        System.out.println(c.speak());

        System.out.println();
        Cat d =new Cat();
        System.out.println(d.displayWhatAnimalDoes());
        System.out.println(d.scratches());
        System.out.println(d.speak());

        System.out.println();
        Unicorn e = new Unicorn();
        System.out.println(d.displayWhatAnimalDoes());
        System.out.println(e.flies());
        System.out.println(e.magic());
    }
}
