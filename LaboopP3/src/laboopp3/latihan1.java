/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboopp3; 
import java.util.Scanner;
/**
 *
 * @author deniaelyaf
 */
public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai X = ");
        int x = input.nextInt();       
        for (int i = 1; i<=x; ++i){
            System.out.print("x");
        }
        System.out.println("");
        for (int i = 1; i<=(x-2); ++i){
            System.out.print("x");
            for (int y = 1;y<=(x-2);++y){
                System.out.print("+");
            }
            System.out.print("x");
            System.out.println("");
        }
        if (x>1){    
            for (int i = 1; i<=x; ++i){
                System.out.print("x");
            }
        }
        
    }
    
}
