/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofdigit;
import java.io.*;

/**
 *
 * @author Mun
 */
public class SumOfDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
		int result=0,number[] = null,i;
		for(i=100;i<=200;i++)
                {
			if(i%7==0)
                        {
				result+=i;
                        }
		
                }
        
                System.out.println(" All integer between 100 and 200 are: " +number[i] );
		System.out.println("Output of Program is : "+result);
	}
}
