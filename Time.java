
/**
 * Write a description of class Time here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Time{
    private int hours;
    private int mins;
    //you will fill in the rest
    public Time(int hoursInput, int minsInput){
        if(hoursInput >= 0 && hoursInput <= 23){
            hours = hoursInput;                                    
        }else{
            throw new IllegalArgumentException("there are only 24 hours in a day"); 
        }
        if(minsInput >= 0 && minsInput <= 59){
            mins = minsInput;                                    
        }else{
            throw new IllegalArgumentException("there are only 60 minutes in an hour"); 
        }
    }
    private int toMins(){
        int hoursToMin = 60*this.hours;
        return hoursToMin + this.mins;
    }
    public boolean lessThan( Time timeVal){
        if(timeVal.toMins() < this.toMins()){
            return false;
        }else{
            return true;
        }
    }
    public String toString(){
        return hours + ":" + mins;
    }
    public int elapsedSince(Time timeVal){
        if(timeVal.lessThan(this)){
            return Math.abs(this.toMins() - timeVal.toMins());
        }else{
            return Math.abs(this.toMins() - (timeVal.toMins() + 1440));
        }        
    }
    
}
