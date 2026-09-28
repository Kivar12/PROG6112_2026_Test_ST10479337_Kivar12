/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112question2;

/**
 *
 * @author emeris
 */
public abstract class Consoles implements IConsoles { 
    private String consoleType;
   private String store;
   private int totalSales;
   
   public Consoles(String consoleType,String store,int totalSales){
       this.store = store;
       this.totalSales = totalSales;
       this.consoleType = consoleType;
   }
   @Override
    public String getConsoleType() {
        return consoleType;
    }
    @Override
    public String getCity() {
        return store;
    }
    @Override
    public int getTotalSales() {
       return totalSales; 
    }
}