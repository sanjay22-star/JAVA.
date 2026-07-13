package day2;


import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);

        int a = sd.nextInt();
        int b = sd.nextInt();
        System.out.println(a & b );
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(a << 2);
        System.out.println(a >> 3);
}
}
