/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelsetest;

/**
 *
 * @author Mun
 */
public class IfElseTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number[] = {50,65,56,71,81};
        int even = 0, odd = 0;
        for(int i = 0; i<number.length;i++)
        {
        if ((number[i]%2)==0)
        {
        even += 1;
        }
        else {
        odd += 1;
        }
        }
        System.out.println("Even Number : " +even + " Odd Number : " +odd);
        // TODO code application logic here
    }
    
}
