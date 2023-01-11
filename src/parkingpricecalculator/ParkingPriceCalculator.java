/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingpricecalculator;

import java.util.Scanner;

/**
 *
 * @author Kofi Osel
 */
public class ParkingPriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input the number of minute your car has parked:");
        double park = scan.nextDouble();
        
        double minuConvert = park / 60;
        double hours = (Math.ceil(minuConvert));
        double price = 2;
        double finPrice = hours * price;
        
        System.out.printf("%-25s: %.0f\n","Parking Time (minutes)",park);
        System.out.printf("%-25s: %.0f\n","Parking Time (hour)",hours);
        System.out.printf("%-25s: %.2f\n","Price",finPrice);
         
    }
    
}
