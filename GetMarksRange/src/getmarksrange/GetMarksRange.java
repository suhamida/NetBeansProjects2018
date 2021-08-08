/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getmarksrange;

/**
 *
 * @author Mun
 */

import java.util.*;

public class GetMarksRange 
{ 
  public static ArrayList<Integer> marksList = new ArrayList<Integer>();
  public static void main(String[] args) 
  { 
    getMarks();
    int firstCountRange=0;
    int secondCountRange=0;
    int thirdCountRange=0;
    int fourthCountRange=0;
    for(int mark : marksList)
    {
      if(mark>80 && mark<=100)
      {
        firstCountRange++;
      }
      else if(mark>60 && mark<=80)
      {
        secondCountRange++;
      }
      else if(mark>40 && mark<=60)
      {
        thirdCountRange++;
      }
      else if(mark<=40)
      {
        fourthCountRange++;
      }
    }
    System.out.println("Number of students in the range 81 to 100:"+firstCountRange);
    System.out.println("Number of students in the range 61 to 80:"+secondCountRange);
    System.out.println("Number of students in the range 41 to 60:"+thirdCountRange);
    System.out.println("Number of students in the range 0 to 40:"+fourthCountRange);
   
  }
  
  public static void getMarks() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Marks of " + (marksList.size() + 1) + " Student.");
    int marks = scan.nextInt();
    marksList.add(marks);
    System.out.print("Do you want to take marks of another Student(Y/N)");
    scan = new Scanner(System.in);
    char c = scan.nextLine().toUpperCase().toCharArray()[0];
    if (c == 'Y') {
      getMarks();
    }
  }
  
}