package day2;


import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);

        int a = sd.nextInt();
        int b = sd.nextInt();
        boolean c=((a > 5) && (b < 10));
        System.out.println((a > 5) && (b < 10));
        System.out.println((a > 5) || (b < 10));
        System.out.println(!(a > 5));
    }
}