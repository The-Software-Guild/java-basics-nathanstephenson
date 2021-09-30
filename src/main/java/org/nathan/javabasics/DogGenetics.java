package org.nathan.javabasics;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String dogName;

        System.out.println("What is your dog's name?");
        dogName = scanner.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println(dogName + " is:");
        int remainder = 100;
        int p = random.nextInt(remainder);
        remainder -= p;
        System.out.println(p + "% St. Bernard");
        p = random.nextInt(remainder);
        remainder -= p;
        System.out.println(p + "% Chihuahua");
        p = random.nextInt(remainder);
        remainder -= p;
        System.out.println(p + "% Dramatic RedNosed Asian Pug");
        p = random.nextInt(remainder);
        remainder -= p;
        System.out.println(p + "% Common Cur");
        System.out.println(remainder + "% King Doberman");
        System.out.println("Wow, " + dogName + " is quite the dog!");
    }
}
