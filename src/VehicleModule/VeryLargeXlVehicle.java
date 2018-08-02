package VehicleModule;

public class VeryLargeXlVehicle implements Vehicle {

    String licenseNumber;

    public VeryLargeXlVehicle(String licenseNumber){
        this.licenseNumber = licenseNumber;
    }


    @Override
    public String getLicenseNumber() {
        return licenseNumber;
    }
}
