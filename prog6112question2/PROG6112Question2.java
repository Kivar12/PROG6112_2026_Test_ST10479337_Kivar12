/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112question2;
import java.util.Scanner;
/**
 *
 * @author emeris
 */
public class PROG6112Question2 {

    public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
      System.out.print("Select console type: : ");
      int selection = 0;
         while (selection != 3) {
             System.out.println("=====================================================");
             System.out.println("1) PS5");
             System.out.println("2) XBOX");
             System.out.println("3) SWITCH");
     System.out.print("Please enter your selection: ");
             selection = input.nextInt();
             input.nextLine();
              System.out.print("Enter the store: ");
      String store = input.nextLine();
      System.out.print("Enter the total sales: ");
      int totalsales = input.nextInt();
      input.nextLine();
      
      ConsoleSales cs = new ConsoleSales(consoleType, store, totalSales);
      cs.printStaffHiringProcess();
             System.out.println("");
    }
    }
}
