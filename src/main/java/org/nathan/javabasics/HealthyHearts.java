package org.nathan.javabasics;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        int maxHeartRate;
        System.out.println("Please enter your age:");
        age = scanner.nextInt();
        maxHeartRate = 220 - age;
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute.");
        System.out.println("Your target heart rate zone is " + (maxHeartRate*0.5) + " - " + (maxHeartRate*0.85) + " beats per minute.");
    }
}
