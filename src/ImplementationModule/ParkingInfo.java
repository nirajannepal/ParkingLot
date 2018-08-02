package ImplementationModule;

import SpotsModule.*;
import VehicleModule.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class ParkingInfo {



    HashMap<String,String> currentSituationInParkingLot = new HashMap<String,String>();

    int totalSizeForSmallSpots = 5;
    int totalSizeForMeduimSpots = 4;
    int totalSizeForLargeSpots = 3;
    int totalSizeForXLSpots = 2;
    int totalSizeForVXLSpots = 1;

    Stack<String> stackOfAvailableSmallSpots = new Stack<String>();
    Stack<String> stackOfAvailableMediumSpots = new Stack<String>();
    Stack<String> stackOfAvailableLargeSpots = new Stack<String>();
    Stack<String> stackOfAvailableXLSpots = new Stack<String>();
    Stack<String> stackOfAvailableVXLSpots = new Stack<String>();

    {
        for(int i=1;i<=totalSizeForSmallSpots;i++){
            stackOfAvailableSmallSpots.push("S" + i);
        }

        SpotsForSmallVehicle spotsForSmallVehicle = new SpotsForSmallVehicle(stackOfAvailableSmallSpots);


        for(int i=1;i<=totalSizeForMeduimSpots;i++){
            stackOfAvailableMediumSpots.push("M"+ i);
        }

        SpotsForMediumVehicle spotsForMediumVehicle = new SpotsForMediumVehicle(stackOfAvailableMediumSpots);

        for(int i=1;i<=totalSizeForLargeSpots;i++){
            stackOfAvailableLargeSpots.push("L" + i);
        }

        SpotsForLargeVehicle spotsForLargeVehicle = new SpotsForLargeVehicle(stackOfAvailableLargeSpots);

        for(int i=1;i<=totalSizeForXLSpots;i++){
            stackOfAvailableXLSpots.push("XL" + i);
        }

        for(int i=1;i<=totalSizeForVXLSpots;i++){
            stackOfAvailableVXLSpots.push("VXL" + i);
        }


        SpotsForXlVehicle spotsForXlVehicle = new SpotsForXlVehicle(stackOfAvailableXLSpots);
    }


    Stack<String> [] arrayOfallSizesOfStacks = new Stack[]{
            stackOfAvailableSmallSpots,
            stackOfAvailableMediumSpots,
            stackOfAvailableLargeSpots,
            stackOfAvailableXLSpots,
            stackOfAvailableVXLSpots
    };


    /*
        checks if the spots are available or not
     */
    public String spotAvailableOrNot(Vehicle vehicle) {

        ArrayList<Stack<String>> stacksOfspotsStackForSmallVehicle = generateSpotnamesForVehiclesParking(new int[]{4, 3,2,1,0});
        ArrayList<Stack<String>> stacksOfspotsStackForMediumVehicle = generateSpotnamesForVehiclesParking(new int[]{4, 3,2,1});
        ArrayList<Stack<String>> stacksOfspotsStackForLargeVehicle = generateSpotnamesForVehiclesParking(new int[]{4, 3,2});
        ArrayList<Stack<String>> stacksOfspotsStackForXlVehicle = generateSpotnamesForVehiclesParking(new int[]{4, 3});
        ArrayList<Stack<String>> stacksOfspotsStackForVXlVehicle = generateSpotnamesForVehiclesParking(new int[]{4, 3});

        String spotAvailableOrNotInformation;

        if (vehicle instanceof SmallVehicle){
            String license = vehicle.getLicenseNumber();
            spotAvailableOrNotInformation = addToHashMAp(license,stacksOfspotsStackForSmallVehicle, currentSituationInParkingLot);
        }else if (vehicle instanceof MediumVehicle){
            String license = vehicle.getLicenseNumber();
            spotAvailableOrNotInformation = addToHashMAp(license,stacksOfspotsStackForMediumVehicle, currentSituationInParkingLot);
        }else if (vehicle instanceof LargeVehicle){
            String license = vehicle.getLicenseNumber();
            spotAvailableOrNotInformation = addToHashMAp(license,stacksOfspotsStackForLargeVehicle, currentSituationInParkingLot);
        }else if (vehicle instanceof XlVehicle){
            String license = vehicle.getLicenseNumber();
            spotAvailableOrNotInformation = addToHashMAp(license,stacksOfspotsStackForXlVehicle, currentSituationInParkingLot);
        }else {
            String license = vehicle.getLicenseNumber();
            spotAvailableOrNotInformation = addToHashMAp(license,stacksOfspotsStackForVXlVehicle, currentSituationInParkingLot);
        }

        return spotAvailableOrNotInformation;
    }

    public ArrayList<Stack<String>> generateSpotnamesForVehiclesParking(int[] ints) {
        ArrayList<Stack<String>> stacksOfspotsStackForVehicle = new ArrayList<>();
        for(int index : ints) stacksOfspotsStackForVehicle.add(arrayOfallSizesOfStacks[index]);
        return stacksOfspotsStackForVehicle;
    }


    /**
     *
     * add license as key and numberplate as value in hashmap, and return available spot
     *
     * @param possibleParkingSpots
     * @param currentSituationInParkingLot
     * @return
     */
    public String addToHashMAp(String license, ArrayList<Stack<String>> possibleParkingSpots, HashMap<String, String> currentSituationInParkingLot) {

        for(int i = 0;i<possibleParkingSpots.size(); i++){
            Stack<String> spotNAmeStack = possibleParkingSpots.get(i);
            if(!spotNAmeStack.isEmpty()){
                String spotName = spotNAmeStack.pop();
                currentSituationInParkingLot.put(spotName,license);
                return spotName;
            }


        }

        return "NO SPOTS REMAINING";

    }


}
