package org.example;
import static muveletek.muveletek.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Adjon meg két egész számot!");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(osszead (a,b));
        System.out.println(kivon (a,b));
        System.out.println(szoroz (a,b));
        System.out.println(oszt (a,b));
    }
}