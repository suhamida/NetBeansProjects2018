/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelsenesting;

/**
 *
 * @author Mun
 */
public class IfElseNesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a= 325, b= 712,c =478;
        System.out.println(" Largest value is: ");
        if(a>b)
        {
        if(a>c)
        {
        System.out.println(a);
        }
        else
        {
        System.out.println(c);
        }
        }
        else
        {
        if(c>b)
        {
        System.out.println(c);
        }
        else
        {
        System.out.println(b);
        }
        }
            
        // TODO code application logic here
    }
    
}
