/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112question2;

/**
 *
 * @author emeris
 */
public class ConsoleSales extends Consoles {
    
    public ConsoleSales(String consoleType,String store,int totalSales){
        super(consoleType, store, totalSales);
    }
    public void printReport(){
       System.out.println("Console Type : "+super.getConsoleType());
       System.out.println("Store : "+ super.getStore());
       System.out.println("Total Sales: "+ super.getTotalSales());
    }
}

