package singleinheritance.smarthomedevice;

public class Main {
    public static void main(String[] args) {
        // Creating Thermostat objects
        ThermoStat thermostat1 = new ThermoStat("TH123", "ON", 22.5);
        ThermoStat thermostat2 = new ThermoStat("TH124", "OFF", 18.0);

        // Displaying status of the thermostats
        thermostat1.displayInfo();
        System.out.println("--------------");
        thermostat2.displayInfo();
    }
}
