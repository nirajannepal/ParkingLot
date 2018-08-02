package VehicleModule;

public class LargeVehicle implements Vehicle {


    String licenseNumber;

    public LargeVehicle(String licenseNumber){
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String getLicenseNumber() {
        return licenseNumber;
    }
}
