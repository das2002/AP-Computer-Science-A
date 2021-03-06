/**

 *  Write a description of class Fraction here.

 *

 *  @author Pratyush Das

 *  @version 1/23/19

 */

public class Fraction

{

    //field variables (instance variables)

    private int num; //numerator

    private int denom; //denominator

    

    //*** CONSTRUCTORS *************************

    //Constructor #1 - creates the fraction 0/1

    /*public Fraction()

    {

        num = 0;

        denom = 1;

        //could also have

        //this.num = 0;

        //this.denom = 1;

        

        //or could have

        //this(0,1); <--calling constructor #3

        //or

        //this(0);<-- calling constructor #2

        //all these create the fraction 0/1

    }*/

    

    public String toString(){

        return (num + "/" + denom);

    }

    

    //Constructor #2 - creates the fraction num/1

    /*public Fraction(int num)

    {

        this.num = num;

        this.denom = 1;

    }*/

    

    //Constructor #3 - 

    public Fraction(int num, int denom)

    {

        if (denom != 0)

        {   

            this.num = num;

            this.denom = denom;

            reduce();

        }

        else

        {

            throw new IllegalArgumentException(

                "Fraction construction error: denominator is 0");

        }

    }

    

    //this version of Constructor #1

    public Fraction()

    {

        this(0,1);

    }

    //this version of Constructor #2

    public Fraction(int num){

      this(num,1);

    }

    public Fraction(Fraction input){ // new Fraction object using an old Fraction object

      this.num = input.num;

      this.denom = input.denom;

    }

    // *** private helper methods ************************

    //mutator method

    //Reduces this fraction by the gcf and makes denom > 0

    private void reduce()

    {

        if (num == 0)

        {

            denom = 1;

            return;

        }

        if (denom < 0)

        {

            num = -num;

            denom = -denom;

        }

        int q = gcf(Math.abs(num), denom);

        num /= q;

        denom /= q;

    }

    //Returns the greatest common factor of two positive integers

    public static int gcf(int n, int d)

    {

        if (n <= 0 || d <= 0)

        {

            throw new IllegalArgumentException("gcf precondition failed: " + n + ", " + d);

        }

        if (n % d == 0)

            return d;

        else if (d % n == 0)

            return n;

        else

            return gcf(n % d, d % n);

    }

}