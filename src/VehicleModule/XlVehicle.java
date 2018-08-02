package VehicleModule;

public class XlVehicle implements Vehicle {

    String licenseNumber;

    public XlVehicle(String licenseNumber){
        this.licenseNumber = licenseNumber;
    }


    @Override
    public String getLicenseNumber() {
        return licenseNumber;
    }
}
