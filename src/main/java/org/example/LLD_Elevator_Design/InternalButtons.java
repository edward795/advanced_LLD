package org.example.LLD_Elevator_Design;

public class InternalButtons {
    InternalDispatcher dispatcher= new InternalDispatcher();

    int[] avaailableButtons = {1,2,3,4,5,6,7,8,9,10};
    int buttonSelected;

    void pressButton(int destination,ElevatorCar elevatorCar){
        //1.check if the destination is in the list of vailable floors

        //submit the request to the job Dispatcher
        dispatcher.submitInternalRequest(destination,elevatorCar);
    }
}
