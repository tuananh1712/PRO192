/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_tap_trong_mang;

import java.util.Scanner;

/**
 *
 * @author Tuan Anh
 */
public class Bai_tap_trong_mang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();                  // Đọc kích thước của mảng
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();                 // Đọc từng phần tử của mảng
        }

        // In ra mảng để kiểm tra
        System.out.println("Mảng vừa nhập:");
       for( int i = 0 ; i < n ; i++){
           int num = arr[i];
           System.out.println(num+" ");
            
        }
                    
            
        
    }
        
}    
        
        
        
        
        
      
    
    

