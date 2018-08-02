package VehicleModule;

public class SmallVehicle implements Vehicle {

    String licenseNumber;

    public SmallVehicle(String licenseNumber){
        this.licenseNumber = licenseNumber;
    }


    @Override
    public String getLicenseNumber() {
        return licenseNumber;
    }
}
