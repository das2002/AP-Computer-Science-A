
/**
 * Write a description of class FCConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FCConverter
{
    private double tempInFahrenheit, tempInCelsius;
    public FCConverter(){
        tempInFahrenheit= 0;
        tempInCelsius =0;        
    }    
    public boolean setFahrenheit(double degrees){
        tempInFahrenheit = degrees;
        return true;
    }
    public double getCelsius(){
        tempInCelsius= (tempInFahrenheit-32) * (5.0/9);
        return tempInCelsius;
    }
    public double getFahrenheit(){
        tempInFahrenheit= ((tempInCelsius * (9.0/5)) + 32);
        return tempInFahrenheit;
    }
    public boolean setCelsius(double degrees){
        tempInCelsius = degrees;
        return true;
    }
}
