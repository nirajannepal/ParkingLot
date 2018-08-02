package ImplementationModule;


import VehicleModule.*;

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
        }else if (sizeOfCar.equals("XLLarge")){
            XlVehicle xlVehicle = new XlVehicle(licensePlate);
            answer = parkingInfo.spotAvailableOrNot(xlVehicle);
        }else if (sizeOfCar.equals("VXLarge")){
            VeryLargeXlVehicle xlVehicle = new VeryLargeXlVehicle(licensePlate);
            answer = parkingInfo.spotAvailableOrNot(xlVehicle);
        }


        return answer;

    }
}
