import ImplementationModule.Agent;

import java.util.Stack;

public class MainParkingStartPoint {

    public static void main(String[] args) {

        String sizeOfCar = "medium";
        String licensePlate = "mass1";

        Agent agent = new Agent();
        String answer = agent.getSpotNumberForParking(sizeOfCar,licensePlate);

        System.out.println(answer);


    }
}
