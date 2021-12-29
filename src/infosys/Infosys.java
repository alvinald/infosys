/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infosys;

import java.util.Scanner;

/**
 *
 * @author Alvinald
 */
public class Infosys {
    
    static void bubbleSort(int[] array) {  
        int n = array.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(array[j-1] > array[j]){  
                    temp = array[j-1];  
                    array[j-1] = array[j];  
                    array[j] = temp;  
                }  
                          
            }  
        }  
  
    }  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int voucher[] = {10000, 25000,  100000, 50000,};
        int point[] = {100, 200, 400, 800};
        int myPoint = 0;
        
        //Melakukan sorting array
        bubbleSort(voucher);
        bubbleSort(point);
        
        //input point yang di inginkan
        System.out.print("Masukan Jumlah Point = ");
        myPoint = input.nextInt();
        System.out.println("");
        
        //jumlah voucher terbesar
        System.out.println("Voucher terbesar adalah "+voucher[voucher.length-1]); 
        System.out.println("");
        
        //sisa point setelah di redeem ke voucher terbesar
        int sisa = 1000 % point[point.length-1];
        System.out.println("Sisa point (1000P) setelah di redeem voucher terbesar adalah "+sisa);
        System.out.println("");
                
        //menghitung voucher yang di dapat sesuai point yang dimiliki
        int myVoucher=0;
        for(int n=point.length-1; n>=0; n--){
            myVoucher = myPoint/point[n];
            myPoint = myPoint % point[n];
            System.out.println("Voucher "+voucher[n]+" x"+myVoucher);
        }       
        System.out.println("Sisa point = "+myPoint);
           
    }
    
} 

