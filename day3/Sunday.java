package day3;

import java.util.Scanner;

public class Sunday {



        public static void main(String[] args) {

            Scanner sd = new Scanner(System.in);


            int day = sd.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Mon");
                    break;

                case 2:
                    System.out.println("Tues");
                    break;

                case 3:
                    System.out.println("Wed");
                    break;

                case 4:
                    System.out.println("Thurs");
                    break;

                case 5:
                    System.out.println("Fri");
                    break;

                case 6:
                    System.out.println("Satur");
                    break;

                case 7:
                    System.out.println("Sun");
                    break;

                default:
                    System.out.println("Invalid day! ");
            }


        }
    }