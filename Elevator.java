
/**
 * Write a description of class Elevator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elevator
{
    private int levelMax, levelCurrent, passengerMax, passengerCurrent;
    public Elevator(int levelMaxInput, int passengerMaxInput){
        levelMax = levelMaxInput;
        passengerMax = passengerMaxInput;
        levelCurrent = 1;
        passengerCurrent= 0;
    }
    public boolean loadPassengers(int passengers){
        if(passengerCurrent + passengers <= passengerMax){
            passengerCurrent += passengers;
            return true;
        }
        return false;
    }
    public boolean unloadPassengers (int passengersLeaving){
        if(passengersLeaving <= passengerCurrent){
            passengerCurrent -= passengersLeaving;
            return true;
        }
        return false;
    }
    public boolean moveToFloor(int targetLevel){
        if(targetLevel >= 1 && targetLevel <= levelMax){
            levelCurrent = targetLevel;
            return true;
        }
        return false;
    }        
    public int getNumberOfPassengers(){
        return passengerCurrent;
    }
    public int getCurrentFloor(){
        return levelCurrent;
    }
}