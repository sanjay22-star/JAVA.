package day2;
import java.util.Scanner;
public class arithmetric {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);

        int a = sd.nextInt();
        int b = sd.nextInt();
        int c = a+b;

        System.out.println("add:"+c);

        c=a-b;
        System.out.println("sub:"+c);
        c=a*b;
        System.out.println("mul:"+c);
        c=a/b;
        System.out.println("div:"+c);
        c=a%b;
        System.out.println("mol:"+c);

        System.out.println(a++ +" "+ ++a);

        System.out.println(a-- +" "+ --a);




    }
}