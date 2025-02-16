
/**
 * This is the second Lab Imprecision file .
 *
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 2/11/2025
 */
public class Imprecision
{
    public static void main (String[]args){ 
        double x = 1.23456789E204;
        double y,z;
        y=1/x;
        z=x*y;
        
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println("The value of z is: " + z);
        //similar for both y and z
        System.out.println("The value of 1 - z is: " + (1-z));
    }// end Main()
        
}//end Imprecision 
