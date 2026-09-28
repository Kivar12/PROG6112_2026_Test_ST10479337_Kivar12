/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112testquestion1;
import java.util.Arrays;
/**
 *
 * @author emeris
 */
public class PROG6112TestQuestion1 {

    public static void main(String[] args) {
       int[][] sales = {
            //Cape Town
            {1000,2000,3000},
            //Port Elizabeth
            {2000,3000,4000},
            //Pretoria
            {1500,1100,1200},
        };                  
        System.out.println("---------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------");
        String[] provinces = {"Cape Town","Port Elizabeth","Pretoria"};
        System.out.println("            PS5        XBOX        Switch");
        //For loop for report , using arrays class
        for(int i = 0;i<sales.length;i++){
          System.out.println(provinces[i]+  " " +   "  " + " " + Arrays.toString(sales[i]));
          
          
       
       int sum = 0;
       
        System.out.println("");
        System.out.println("*********************************************");
         System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("*********************************************");
        for(int j = 0;j<sales.length;j++){
          int [] oneDarray = sales[i]; 
          System.out.println(provinces[i]+"  "+Arrays.toString(oneDarray));
          int ps5 = sales[i][0];
          int xbox = sales[i][1];
          int nswitch =  sales[i][2];
          
          int total = ps5+xbox+nswitch;
          totals[i] = total;
       }  
}
    }
}