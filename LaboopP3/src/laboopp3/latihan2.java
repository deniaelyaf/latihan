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
public class latihan2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumalh bilangan = ");
        int i = input.nextInt();
        int[] x = new int[i];
        int total = 0;      
        for (int a=0;a<i;++a){
            System.out.println("Masukan Bilangan ke-"+(a+1)+"=");
            x[a] = input.nextInt();
        }
        int min = x[0];
        int max = x[0];
        for (i=0;i<x.length;++i){
            if (max < x[i]){
                max = x[i];}
        }
        for (i=0;i<x.length;++i){
            if (min > x[i]){
                min = x[i];}
        }
        for (i=0;i<x.length;++i){
            total = total + x[i];
        }
        System.out.println("Angka Terkecil = "+min);
        System.out.println("Angka Terbesar = "+max);
        System.out.println("Total Bilangan = "+total);
    }
    
}
