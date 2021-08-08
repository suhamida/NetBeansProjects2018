/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iftest;

/**
 *
 * @author Mun
 */
public class Iftest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,count, count1,count2;
        float[] weight = {45.0F,55.0F,47.0F,51.0F,54.0F};
        float[] height = {176.0F,174.2F,168.0F,170.0F,169.0F};
        count = 0;
        count1 = 0;
        count2 = 0;
        for(i=0;i<=4;i++)
        {
            if(weight[i]<50.0 && height[i]>170.0)
            {
            count1 = count1+1;
            }
        count = count + 1;
        }
        count2 = count- count1;
        System.out.println("number of persons with...");
        System.out.println("Weight < 50 and height > 170 = "+count1);
        System.out.println("others = "+count2);
        // TODO code application logic here
    }
    
}
