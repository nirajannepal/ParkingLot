package ImplementationModule;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class ParkingInfoTest {

    @Test
    public void addToHashMapTestForSmallVehicles(){
        ParkingInfo parkingInfo = new ParkingInfo();


        ArrayList<Stack<String>> possibleSmallCarsParkingSpotscollection = parkingInfo.generateSpotnamesForVehiclesParking(new int[]{0, 1, 2, 3});
        HashMap<String, String> currentlyParkedStateMap = new HashMap<String, String>();

        String result = parkingInfo.addToHashMAp("ABC",possibleSmallCarsParkingSpotscollection, currentlyParkedStateMap);
        Assert.assertEquals( "S5", result);
        Assert.assertEquals(currentlyParkedStateMap.size(), 1);


        result = parkingInfo.addToHashMAp("BCD",possibleSmallCarsParkingSpotscollection, currentlyParkedStateMap);
        result = parkingInfo.addToHashMAp("BCD1",possibleSmallCarsParkingSpotscollection, currentlyParkedStateMap);
        result = parkingInfo.addToHashMAp("BCD2",possibleSmallCarsParkingSpotscollection, currentlyParkedStateMap);
        result = parkingInfo.addToHashMAp("BCD3",possibleSmallCarsParkingSpotscollection, currentlyParkedStateMap);
        Assert.assertEquals("S1", result);
        Assert.assertEquals(currentlyParkedStateMap.size(), 5);



        result = parkingInfo.addToHashMAp("BCD4",possibleSmallCarsParkingSpotscollection, currentlyParkedStateMap);
        Assert.assertEquals( "M4", result);
        Assert.assertEquals(currentlyParkedStateMap.size(), 6);



        System.out.println(result);



    }



    @Test
    public void addToHashMapTestForMediumVehicles(){
        ParkingInfo parkingInfo = new ParkingInfo();


        ArrayList<Stack<String>> possibleSmallCarsParkingSpotscollection = parkingInfo.generateSpotnamesForVehiclesParking(new int[]{1, 2, 3});
        HashMap<String, String> currentlyParkedStateMap = new HashMap<String, String>();

        String spotName = parkingInfo.addToHashMAp("ABC",possibleSmallCarsParkingSpotscollection, currentlyParkedStateMap);
        Assert.assertEquals( "M4", spotName);
        Assert.assertEquals(1,currentlyParkedStateMap.size());


        spotName = parkingInfo.addToHashMAp("BCD",possibleSmallCarsParkingSpotscollection, currentlyParkedStateMap);
        spotName = parkingInfo.addToHashMAp("BCD1",possibleSmallCarsParkingSpotscollection, currentlyParkedStateMap);
        spotName = parkingInfo.addToHashMAp("BCD2",possibleSmallCarsParkingSpotscollection, currentlyParkedStateMap);
        spotName = parkingInfo.addToHashMAp("BCD3",possibleSmallCarsParkingSpotscollection, currentlyParkedStateMap);
        Assert.assertEquals("L3", spotName);
        Assert.assertEquals(5,currentlyParkedStateMap.size());



        spotName = parkingInfo.addToHashMAp("BCD4",possibleSmallCarsParkingSpotscollection, currentlyParkedStateMap);
        Assert.assertEquals( "L2", spotName);
        Assert.assertEquals(6,currentlyParkedStateMap.size());



        System.out.println(spotName);



    }


    @Test
    public void addToHashMapTestForVeryLargeVehicles(){
        ParkingInfo parkingInfo = new ParkingInfo();


        ArrayList<Stack<String>> possibleVLargeCarsParkingSpotscollection = parkingInfo.generateSpotnamesForVehiclesParking(new int[]{4});
        HashMap<String, String> currentlyParkedStateMap = new HashMap<String, String>();

        String spotName = parkingInfo.addToHashMAp("ABC",possibleVLargeCarsParkingSpotscollection, currentlyParkedStateMap);
        Assert.assertEquals( "VXL1", spotName);
        Assert.assertEquals(1,currentlyParkedStateMap.size());

        System.out.println(spotName);



    }


    @Test
    public void addToHashMapTestInEmptyParkingLot(){
        ParkingInfo parkingInfo = new ParkingInfo();


        ArrayList<Stack<String>> possibleSmallCarsParkingSpotscollection = parkingInfo.generateSpotnamesForVehiclesParking(new int[]{});
        HashMap<String, String> currentlyParkedStateMap = new HashMap<String, String>();

        String spotName = parkingInfo.addToHashMAp("ABC",possibleSmallCarsParkingSpotscollection, currentlyParkedStateMap);
        Assert.assertEquals( "NO SPOTS REMAINING", spotName);
        Assert.assertEquals(0,currentlyParkedStateMap.size());

        System.out.println(spotName);
    }







}