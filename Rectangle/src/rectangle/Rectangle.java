/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author Mun
 */
public class Rectangle {

  int length;

  int breadth;

  //declare constructor to initialize length and breadth of rectangle

  Rectangle()

  {

    length=9;

    breadth=9;

  }

  //declare method to calculate area of rectangle

  int area()

  {

    int rectArea=length*breadth;

    return rectArea;

  }



 public static void main(String[] args) {

     Rectangle r=new Rectangle();

    System.out.println("Area of rectangle="+r.area());

// TODO code application logic here
    }
    
}
