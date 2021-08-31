package ex3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input month: ");
        int month= sc.nextInt();
        System.out.println("Input year: ");
        int year= sc.nextInt();
        Number n1= new Number();
        System.out.println( "Month: "+ month+ " have to: "+ n1.monthOfYear(month,year));
    }
}
