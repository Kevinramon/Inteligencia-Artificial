/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibonacci;

/**
 *
 * @author kevin
 */
public class SerieFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1 = 0;
        int num2 = 1;
        int temp;
        int limite = 50000;
        
        System.out.println(num1);
        System.out.println(num2);
        
        while(num2 +num1 <= limite){
            temp = num1; //temp=0;
            num1 = num2; //num1 = 1;
            num2 = temp + num1;
            
            System.out.println(num2);
        }
        
    }
    
}
