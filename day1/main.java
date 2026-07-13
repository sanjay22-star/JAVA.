package day1;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sd.nextInt();
        System.out.println("enter: " + num);

        System.out.print("Enter a byte value: ");
        byte num1 = sd.nextByte();
        System.out.println("enter: " + num1);

        System.out.print("Enter a short value: ");
        short num2 = sd.nextShort();
        System.out.println(" enter: " + num2);

        System.out.print("Enter a long value: ");
        long num3 = sd.nextLong();
        System.out.println(" enter: " + num3);
        System.out.print("Enter a character: ");
        char num4 = sd.next().charAt(0);
        System.out.println(" enter: " + num4);

        System.out.print("Enter a float value: ");
        float num5 = sd.nextFloat();
        System.out.println(" enter: " + num5);

        System.out.print("Enter a double value: ");
        double num6 = sd.nextDouble();
        System.out.println(" enter: " + num6);

        System.out.print("Enter your name: ");
        String name1 = sd.next();
        System.out.println(name1);

        System.out.print("Enter your full name: ");
        String name3 = sd.nextLine();
        System.out.println(name3);
        System.out.print("Enter your full name: ");


    }


}

