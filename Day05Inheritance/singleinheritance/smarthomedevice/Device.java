package singleinheritance.smarthomedevice;

class Device {
    //Attributes
    protected String deviceId ;
    protected String deviceStatus;

    // Constructor to initialize Device objects with provided values
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.deviceStatus = status;
    }

    //method to display the information
    public void displayInfo(){
        System.out.println("Device id : "+deviceId);
        System.out.println("Status : "+deviceStatus);
    }
}
