package singleinheritance.smarthomedevice;

class ThermoStat extends Device {
    //unique attribute
    private double temperatureSetting;

     // Constructor to initialize Thermostat objects with provided values
    public ThermoStat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Calling the superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding the displayStatus() method to include temperature setting information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling the superclass method
        System.out.printf("Temperature Setting: %.1f°C%n", temperatureSetting);
    }
}
