/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overridetest;

/**
 *
 * @author Mun
 */

class Super{
int x;
Super(int x)
{
this.x=x;
}
void display()
{
System.out.println("Super x="+x);
}
}
class Sub extends Super{

int y;
Sub(int x,int y)
{
super(x);
this.y=y;
}
void display()
{
System.out.println("Super x="+x);
System.out.println("Sub y="+y);
}
}
public class OverrideTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Sub s1= new Sub(100,200); 
s1.display();
// TODO code application logic here
    }
    
}
