package ex2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input pass");
        String str = sc.nextLine();
        Password pss= new Password();
        System.out.println(pss.password(str));
    }



}
