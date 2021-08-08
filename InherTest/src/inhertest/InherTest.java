/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inhertest;

/**
 *
 * @author Mun
 */

class Room{

int length;
int breadth;

Room(int x,int y)
{
length =x;
breadth =y;
}
int area()
{
return (length*breadth);
} 
}

class BedRoom extends Room
{
int heigth;
BedRoom(int x,int y,int z)
{
super (x,y);
heigth = z;
}
int volume()
{
return(length*breadth*heigth);
}
}
public class InherTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BedRoom room1=new BedRoom(14,12,10);
        int area1 =room1.area();
        int volume1=room1.volume();
        System.out.println("Area1="+area1);
        System.out.println("Volume =" +volume1);
// TODO code application logic here
    }
    
}
