/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityguide;

/**
 *
 * @author Mun
 */
public class CityGuide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char choice;
        System.out.println("Select your choice ");
        System.out.println(" M -> Madras ");
        System.out.println(" B -> Bombay ");
        System.out.println(" C -> Calcutta ");
        System.out.println("Choice ---> ");
        System.out.flush();
        try{
    switch(choice = (char) System.in.read())
    {
    
        case 'M' :
        case 'm' : System.out.println("Madras : Booklet 5 ");
                  break;
        case 'B' :
        case 'b' :System.out.println("Bombay : Booklet 9 ");
         break;
        case 'C' :
        case 'c':System.out.println("Calcutta : Booklet 15");
        break;
        default: System.out.println("Invalid choice(IC)");
    }
        // TODO code application logic here
    }
    
    catch (Exception e)
    {
    System.out.println("I/O Error");
    }
}
}
