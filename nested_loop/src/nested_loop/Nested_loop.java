/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested_loop;

/**
 *
 * @author Mun
 */
public class Nested_loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The right angle triangle of @ is shown below:\n");
      for (int i=1; i<10; i += 2)
{
    for (int k=0; k < (4 - i / 2); k++)
    {
        System.out.print(" ");
    }
    for (int j=0; j<i; j++)
    {
        System.out.print("*");
    }
    System.out.println("");
}
// TODO code application logic here
    }
    
}
