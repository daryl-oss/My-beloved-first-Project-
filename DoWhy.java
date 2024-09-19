/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgdo.why;

import java.util.Scanner;

/**
 *
 * @author CARILLO_COMP111
 */
public class DoWhy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
while (true) {
    double total = 0.0;
    double cash = 0.0;

    do {
        System.out.println("\u001B[32mHello, welcome to Daryl Store!");
        System.out.println("\u001B[33mWe have a Discount Available if your total is 500$ or more!!");
        System.out.println("\u001B[37mHere is our Menu:");
        System.out.println("\u001B[36mA for Apple - $10.00");
        System.out.println("\u001B[36mB for Banana - $15.00");
        System.out.println("\u001B[36mC for Cucumber- $20.00");
        System.out.println("\u001B[36mD for Dalandan - $30.00");
        System.out.println("\u001B[36mE for Elderberry -$25.00");
        char Daryl = scanner.next().toUpperCase().charAt(0);

        switch (Daryl) {
            case 'A':
                System.out.println("\u001B[32mYou selected Apple, enter the quantity");
                double quantity = scanner.nextDouble();
                total += 10.0 * quantity;
                System.out.printf("The total cost is: %.2f%n", total);
                break;
            case 'B':
                System.out.println("\u001B[32mYou selected Banana, enter the quantity ");
                quantity = scanner.nextDouble();
                total += 15.0 * quantity;
                System.out.printf("The total cost is: %.2f%n", total);
                break;
            case 'C':
                System.out.println("\u001B[32mYou selected Cucumber, enter the quantity  ");
                quantity = scanner.nextDouble();
                total += 20.0 * quantity;
                System.out.printf("The total cost is: %.2f%n", total);
                break;
            case 'D':
                System.out.println("\u001B[32mYou selected Dalandan, enter the quantity  ");
                quantity = scanner.nextDouble();
                total += 30.0 * quantity;
                System.out.printf("The total cost is: %.2f%n", total);
                break;
            case 'E':
                System.out.println("\u001B[32mYou selected Elderberry, enter the quantity  ");
                quantity = scanner.nextDouble();
                total += 25.0 * quantity;
                System.out.printf("The total cost is: %.2f%n", total);
                break;
            default:
                System.out.println("\u001B[31mInvalid input. Please enter A, B, C, D or E.");
                continue;
        }

        System.out.println("Do you want to buy more items? (Y for Yes or N for No)");
        char response = scanner.next().toUpperCase().charAt(0);

        if (response == 'N') {
            break;
        }
    } while (true);

    // Apply 20% discount if total bill is 700 pesos or more
    double discount = 0.0;
    if (total >= 500) {
        discount = total * 0.20;
        System.out.printf("\u001B[33mYou are eligible for a 20%% discount of %.2f%n", discount);
    }

    double totalAfterDiscount = total - discount;
    System.out.printf("\u001B[33mYour total bill after discount is: %.2f%n", totalAfterDiscount);

    // Ask for cash until sufficient amount is provided
    cash = 0.0;
    while (true) {
        System.out.printf("\u001B[34mYou need to pay: %.2f%n", totalAfterDiscount);
        System.out.println("Please enter the amount of cash you will pay:");
        double cashInput = scanner.nextDouble();
        cash += cashInput;

        if (cash < totalAfterDiscount) {
            System.out.printf("\u001B[31mInsufficient cash. You still need to pay: %.2f%n", totalAfterDiscount - cash);
        } else {
            double change = cash - totalAfterDiscount;
            System.out.println("\u001B[38mThank you for shopping at Daryl's Store!");
            System.out.printf("\u001B[36mYour change is: %.2f%n", change);
            break;
        }
    }

    System.out.println("Do you want to Another the transaction? (X for yes or N for Stop)");
    char restart = scanner.next().toUpperCase().charAt(0);

    if (restart != 'X') {
        break;
    }}}}

