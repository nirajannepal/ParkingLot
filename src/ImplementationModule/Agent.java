package ImplementationModule;


import VehicleModule.LargeVehicle;
import VehicleModule.MediumVehicle;
import VehicleModule.SmallVehicle;
import VehicleModule.XlVehicle;

public class Agent {

    ParkingInfo parkingInfo = new ParkingInfo();

    public String getSpotNumberForParking(String sizeOfCar, String licensePlate) {

        String answer = "No spots available";

        if(sizeOfCar.equals("small")){
            SmallVehicle smallVehicle = new SmallVehicle(licensePlate);
            answer = parkingInfo.spotAvailableOrNot(smallVehicle);
        }else if(sizeOfCar.equals("medium")){
            MediumVehicle mediumVehicle = new MediumVehicle(licensePlate);
            answer = parkingInfo.spotAvailableOrNot(mediumVehicle);
        }else if (sizeOfCar.equals("large")){
            LargeVehicle largeVehicle = new LargeVehicle(licensePlate);
            answer = parkingInfo.spotAvailableOrNot(largeVehicle);
        }else{
            XlVehicle xlVehicle = new XlVehicle(licensePlate);
            answer = parkingInfo.spotAvailableOrNot(xlVehicle);
        }


        return answer;

    }
}
