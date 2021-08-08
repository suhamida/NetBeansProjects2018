/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedif;

import java.util.Scanner;

/**
 *
 * @author Mun
 */
public class Nestedif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        int p,c,m,t,mp;
  Scanner scanner;
        scanner=new Scanner(System.in);
         p= scanner.nextInt();
          c=scanner.nextInt();
         m=scanner.nextInt();
 System.out.println("Input the marks obtained in Physics :" +p);
 
 System.out.println("Input the marks obtained in Chemistry :"+c);
 System.out.println("Input the marks obtained in Mathematics :"+m);
  
   System.out.println("Total marks of Maths, Physics and Chemistry : %d\n"+(m+p+c));
   System.out.println("Total marks of Maths and  Physics : %d\n"+(m+p));


     if (m>=65)
         if(p>=55)
             if(c>=50)
	        if((m+p+c)>=180||(m+p)>=140)
	           System.out.println("The  candidate is eligible for admission.\n");
	        else
	          System.out.println("The candidate is not eligible.\n");
             else
	    System.out.println("The candidate is not eligible.\n");
         else
	 System.out.println("The candidate is not eligible.\n");
    else
    System.out.println("The candidate is not eligible.\n");
}

    }
   


