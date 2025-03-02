public class SmartHome {
    public static void main(String[] args) {
        SmartThermostat thermostat = new SmartThermostat("Bedroom", false);
        SmartSpeaker speaker = new SmartSpeaker("Kitchen", false);

        thermostat.turnOn();
        thermostat.turnOff();
        thermostat.adjustSettings();
        thermostat.displaySettings();

        System.out.println("");
        
        speaker.turnOn();
        speaker.turnOff();
        speaker.adjustSettings();
        speaker.displaySettings();

    }
}
