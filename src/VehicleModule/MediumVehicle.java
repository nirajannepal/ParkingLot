package VehicleModule;

public class MediumVehicle implements Vehicle {

    String licenseNumber;

    public MediumVehicle(String licenseNumber){
        this.licenseNumber = licenseNumber;
    }


    @Override
    public String getLicenseNumber() {
        return licenseNumber;
    }
}
