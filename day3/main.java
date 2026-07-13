package day3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sd = new Scanner(System.in);


        int a = sd.nextInt();

        if (a % 3 == 0) {
            if (a % 5 == 0) {
                if (a % 7 == 0) {
                    System.out.println("Coding is Fun");
                } else {
                    System.out.println("Hello...");
                }
            } else {
                System.out.println("Not divisible by 5");
            }
        } else {
            System.out.println("Not divisible by 3");
        }


    }
}