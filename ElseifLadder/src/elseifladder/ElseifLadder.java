/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elseifladder;

/**
 *
 * @author Mun
 */
public class ElseifLadder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rollNumber[] = {111,222,333,444};
        int marks [] = {81,75,43,58};
        for(int i = 0; i< rollNumber.length; i++)
        {
        if(marks[i]> 79)
        {
        System.out.println(rollNumber[i] + " Honors");
        }
        else if( marks[i]> 59)
        {
        System.out.println(rollNumber[i] + " I Division");
        }
        else if(marks[i]> 49)
        {
        System.out.println(rollNumber[i] + " II Division");
        }
        else{
        System.out.println(rollNumber[i] + " Fail");
        }
        }
        // TODO code application logic here
    }
    
}
