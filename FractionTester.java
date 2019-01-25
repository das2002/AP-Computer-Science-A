public class FractionTester{

  public static void main(String[]args){

    Fraction frac1 = new Fraction(); //frac1 = (0/1)

    Fraction frac2 = new Fraction(8); //frac2= (8/1)

    Fraction frac3 = new Fraction(-12, 20);

    Fraction frac4 = new Fraction(frac3);

    System.out.println("frac1 = " + frac1);

    System.out.println("frac2 = " + frac2);

    System.out.println("frac3 = " + frac3);

    System.out.println("frac4 = " + frac4);

  }

}