/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas3;
import java.util.Scanner;

/**
 *
 * @author 
 * Aris Prabowo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Umur Anda: ");
        int umur = scanner.nextInt();
        if(umur >= 17){
            System.out.println("Status Dewasa: "+"True");
        }else{
            System.out.println("Status Dewasa: "+"False");
        }
    }
    
}
