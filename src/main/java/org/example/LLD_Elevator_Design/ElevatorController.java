package org.example.LLD_Elevator_Design;

import java.util.PriorityQueue;

public class ElevatorController {

    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;
    ElevatorCar elevatorCar;

    ElevatorController(ElevatorCar elevatorCar){
        this.elevatorCar=elevatorCar;
        upMinPQ=new PriorityQueue<>();
        downMaxPQ=new PriorityQueue<>();
    }

    public void submitExternalRequest(int floor,Direction direction){
        if(direction==Direction.DOWN){
            downMaxPQ.offer(floor);
        }else{
            upMinPQ.offer(floor);
        }
    }

    public void submitInternalRequest(int floor){

    }

    public void controlElevator(int floor){
        while(true){
            if(elevatorCar.elevatorDirection==Direction.UP){

            }
        }
    }
}
