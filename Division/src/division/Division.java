/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package division;

/**
 *
 * @author Mun
 */
import java.io.*;
public class Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String choice = new String();
        BufferedReader br = new  BufferedReader (new InputStreamReader(System.in));
        System.out.println("Choose your division: ");
         System.out.println("Honors");
          System.out.println("First");
           System.out.println("Second");
            System.out.println("Third");
             System.out.println("Fail");
              System.out.println("Enter your Choice--->");
        try 
        {
            choice = br.readLine();
            System.out.flush();
            switch(choice)
            {
            case "Honors" :
                System.out.println("Marks >= 80 ");
                break;
                case "First" :
                    System.out.println("Marks >= 65% and <80% ");
                break;
                case "Second" :
                    System.out.println("Marks >= 55% and < 65% ");
                break;case "Third" :
                    System.out.println("Marks >= 40% and 55% ");
                break;
                case "Fail" :
                    System.out.println("Marks <40% ");
                break;
                default:
                System.out.println("Invalid Choice");
            }
        
        }   catch (Exception e)
                    {
                    System.out.println("I/O Error");
                    }
        // TODO code application logic here
    }
    
}
