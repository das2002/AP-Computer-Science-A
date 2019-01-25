
/**
 * Write a description of class SodaMachineTester here.
 *
 * @author (Pratyush Das)
 * @version (1/24/2019)
 */
public class SodaMachineTester
{
    public static void main(String[]args){
        SodaMachine myMachine = new SodaMachine(50,100);
        myMachine.getPrice();

        myMachine.insertMoney(500);

        myMachine.buySoda();

        myMachine.buySoda();

        myMachine.getBalance();

        myMachine.getTotalMoney();

        myMachine.refundBalance();

        myMachine.buySoda();
    }
}
