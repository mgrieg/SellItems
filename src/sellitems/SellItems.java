/*
 This program asks user to input item prices and calculate total with
7% tax.
 */
package sellitems;
import java.util.Scanner;
/**
 *
 * @author mgrie
 */
public class SellItems {

    public static void main(String[] args) {
        
        System.out.print("How many items to enter? ");
        Scanner kb = new Scanner(System.in);
        int size = kb.nextInt();        
        double []items = new double[size];
        
        double total = 0, tax = 0.07;
        
        for (int i=0; i<items.length; i++) {
            System.out.print("Enter price " + (i+1) + ":");
            items[i] = kb.nextDouble();
            total = total + items[i];
        }
        
        System.out.println("\nItem cost break down:");
        for (int i=0; i<items.length; i++) {
            System.out.printf("$%.2f \n", items[i]);
        }
        
        double totalTax = total * tax;
        System.out.printf("Shopping cart total ... $%.2f \n",total);
        System.out.printf("Tax: $%.2f \n",totalTax);
        System.out.printf("Total ammount: $%.2f \n",(total + totalTax));
        
        kb.close();
    } 
}
