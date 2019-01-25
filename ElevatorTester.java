
/**
 * Write a description of class ElevatorTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElevatorTester
{
    public static void main(String[]args){
        Elevator myElevator = new Elevator(50,100);
        System.out.println(myElevator.loadPassengers(10)); // 10 passengers, level 1

        System.out.println(myElevator.unloadPassengers(500)); // shouldn't work

        System.out.println(myElevator.getNumberOfPassengers()); //should return 10

        System.out.println(myElevator.loadPassengers(10)); //20 passengers
        System.out.println(myElevator.getNumberOfPassengers());
        System.out.println(myElevator.moveToFloor(99)); //current floor is 1

        System.out.println(myElevator.getCurrentFloor());//1

        System.out.println(myElevator.moveToFloor(41)); //should work
        System.out.println(myElevator.getCurrentFloor());// 41

    }
}
