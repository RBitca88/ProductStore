package com.step;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner sc;

    public int menu() {
        while (true) {
            try {
                System.out.print(menuMessage());
                sc = new Scanner(System.in);
                int selection = sc.nextInt();
                if (selection > 0 && selection < 6) {
                    return selection;
                } else {
                    throw new Exception(errorMessage());
                }
            } catch (Exception ex) {
                System.out.println(errorMessage());
            }
        }
    }

    private String menuMessage() {
        return "\n\t\tPRODUCT MANAGER\n" +
                "\tPress 1 for product info\n" +
                "\tPress 2 to calculate total price\n" +
                "\tPress 3 for exit\n" +
                "Entered number -> ";
    }

    private String errorMessage() {
        return "\n|-----------------------------------------------------------------|\n" +
                "|     You've entered something wrong please try again    |\n" +
                "|_________________________________________________________________|\n";
    }
}
