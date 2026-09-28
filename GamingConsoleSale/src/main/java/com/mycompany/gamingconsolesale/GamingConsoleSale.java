/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolesale;

/**
 *
 * @author Student
 */
public class GamingConsoleSale {

    public static void main(String[] args) {
        String [] cities = {"Cape Town ", "Port Elizabeth ","Pretoria "};
        int[][]  sales={
            {1000,2000,3000},
            {2000,3000,4000},
            {1500,1100,1200}
        };
       
        
        for(int k = 0; k < sales.length;k++){
            System.out.println("\n" + cities[k]);
            
            System.out.println("\n Ps5" + sales[k][0]);
            System.out.println("\n Xbox" + sales[k][1]);
            System.out.println("\n Switch" + sales[k][2]);
               }
              
              System.out.print("CONSOLE SALES TOTALS FOR EACH CITY");
              
            int highSale = 0;
            String cityMostSale ="";
            
            for(int j = 0; j < cities.length; j++){
                int total = sales[j][0] + sales[j][1] + sales[j][2];
                System.out.println(cities[j] + ": " + total); 
                
                if(total > highSale){
                    highSale = total;
                    cityMostSale = cities[j];
                    
                }
        }
            
            System.out.println("\nCITY WITH THE MOST SALE " + cityMostSale);
    }
    
}
