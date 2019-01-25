
/**
 * Write a description of class SodaMachine here.
 *
 * @author (Pratyush Das)
 * @version (1/24/19)
 */

public class SodaMachine
{
    private int sodaPrice, numberOfSodas, totalMoney, balance;
    final private int MACHINE_CAPACITY = 300;
    public SodaMachine(){
        sodaPrice = 75;
        numberOfSodas = 200;
        totalMoney = 0;
        balance =0;
    }

    public SodaMachine(int price, int num){
        if(num > MACHINE_CAPACITY){
            System.out.println("Too many sodas! We'll just fill to the max");
            num = MACHINE_CAPACITY;
        }else{
         numberOfSodas = num;}
        sodaPrice = price;
        totalMoney = 0;
        balance =0;
    }
    public boolean refillMachine(){
        if(numberOfSodas< MACHINE_CAPACITY){
            numberOfSodas = MACHINE_CAPACITY;
            return true;
        }
        else{
        return false;
        }
    }
    public int getMaxCapacity(){
        return MACHINE_CAPACITY;
    }
    public void insertMoney(int amt){
        balance +=amt;
    }

    public int getPrice(){
        return sodaPrice;
    }

    public int getBalance(){
        return balance;
    }

    public boolean buySoda(){
        if(balance>=sodaPrice){
            if(numberOfSodas >0){
                System.out.println("###SODA###");
                numberOfSodas--;
                totalMoney += sodaPrice;
                balance -= sodaPrice;
                return true;
            }
            else{
                System.out.println("Sold Out!");
                return false;
            }
        }else{
            System.out.println("You have not inserted enough money");
            System.out.println("Please insert "+ (sodaPrice-balance) + " cents.");
            return false;
        }
    }

    public int refundBalance(){
        int amtToRefund = balance;
        balance =0;
        return amtToRefund;
    }

    public int getTotalMoney(){
        return totalMoney;
    }

    public int getNumberOfSodas(){
        return numberOfSodas;
    }
}
