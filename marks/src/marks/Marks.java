/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marks;
import java.io.*;
/**
 *
 * @author Mun
 */
public class Marks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

           int data[] = new int[10];
           int counter,index;
           String str;
           

         try{
    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                 for(counter=0;counter<10;counter++)
                   {
               System.out.print("Enter Marks of Roll No :- "+(counter+1)+"   --> ");
                         System.out.flush();
                         str=obj.readLine();
                         data[counter]=Integer.parseInt(str);
                    }

            //logic begins       for(counter=0;counter<10;counter++)
                        { 
            System.out.println("\nMarks of Rollno : "+(counter+1)+" is  : "+data[counter]);
                            index=(int)(data[counter]/10);
                           switch(index)
                           {
                                case 10:
                                case 9:
                                case 8: 
                                        

System.out.println("Roll No : -  "+(counter+1)+"----->GRADE  A");
                                        break;
                                case 7:
                                case 6:
                                        

System.out.println("Roll No : -  "+(counter+1)+"----->GRADE  B");
                                        break;
                                case 5:
                                case 4:
                                        

System.out.println("Roll No : -  "+(counter+1)+"----->GRADE  C");
                                        break;
                                case 3:
                                case 2:
                                case 1:
                                case 0:
                                    

System.out.println("Roll No : -  "+(counter+1)+"----->FAIL");
                                }
                      }
                    }
                catch (Exception e)  {}
    }
}