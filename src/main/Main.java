package main;

import arrayList.List;
import menu.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu m1 = new Menu();
        List t2 = new List();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Welcome  to contacts menu press 1 to add,2 to view,3 to search,4 to delete and 5 to exit::: " );
        m1.menu(sc.nextInt());
        String i = "y";
        while(i.equals("y")) {
            m1.menu(sc.nextInt());
            System.out.println("want to try more y/n?");
            sc.nextLine();
            i = sc.nextLine();
        }
    }
}
