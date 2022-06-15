package edu.cscc;
import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        /* Jonah Young
        9/3/2019
        Enter a hurricane's wind speed and get a classification for it
        */
        long speed;
        String classification;
        System.out.print("Enter wind speed (mph): ");
        speed = input.nextLong();
        if (speed < 0) {
            System.out.println("Invalid input");

        } else if (speed < 39) {
            classification = "Not in scale";
            System.out.println("Classification: "+classification);
        } else if (speed < 74) {
            classification = "Tropical Storm";
            System.out.println("Classification: "+classification);
        } else if (speed < 96) {
            classification = "Category One Hurricane";
            System.out.println("Classification: "+classification);
        } else if (speed < 111) {
            classification = "Category Two Hurricane";
            System.out.println("Classification: "+classification);
        } else if (speed < 130) {
            classification = "Category Three Hurricane";
            System.out.println("Classification: "+classification);
        } else if (speed < 157) {
            classification = "Category Four Hurricane";
            System.out.println("Classification: "+classification);
        } else {
            classification = "Category Five Hurricane";
            System.out.println("Classification: "+classification);
        }
    }
}