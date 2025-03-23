
/**
 *
 * This program will asign a very large double value to x.
 * Calculate y as the reciprocal of x.
 * Multiply x and y to get z, which theoretically should be 1.
 * Print the values of x, y, z, and (1 - z) to observe precision errors.
 * 
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.1
 * @since 3/22/2025
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
