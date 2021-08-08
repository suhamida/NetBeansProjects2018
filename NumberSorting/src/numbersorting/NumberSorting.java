/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersorting;

/**
 *
 * @author Mun
 */
public class NumberSorting {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int number[]={55,40,80,65,71};
    int n = number.length;
System.out.println("Given list:");
for(int i=0;i<n;i++)
{
System.out.println(""+number[i]);
}
System.out.println("/n");
for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++)
        if(number[i]<number[j])
        {
        int temp=number[i];
        number[i]=number[j];
        number[j]=temp;
        }
System.out.println("Sorted list");
for(i=0;i<n;i++)
{
System.out.println(""+number[i]);
}
System.out.println("");
}
// TODO code application logic here
    }
    
}
