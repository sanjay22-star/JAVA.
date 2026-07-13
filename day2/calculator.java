package day2;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dailyWage = sc.nextInt();
        int workingDays = sc.nextInt();
        int monthlySalary = dailyWage * workingDays;
        System.out.println(monthlySalary);



    }

}
