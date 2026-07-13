package day3;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sd = new Scanner(System.in);
        int a = sd.nextInt();
        switch (a){
            case 1:
            if(a<10){
                System.out.println("hello");


            }
            else{
                System.out.println("Hiii");
            }
            break;
            default:
                System.out .println("no match");

        }

    }

}
