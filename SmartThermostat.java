
public class SmartThermostat extends SmartDevice{
    public SmartThermostat(String name, boolean status){
        super(name, status);
    }
    @Override
    public void turnOn(){
        status = true;
        System.out.println(name + " Thermostat is now ON. Temperature set to 72°F");
    }

    @Override
    public void turnOff(){
        status = false;
        System.out.println(name + " Thermostat is OFF");
    }

    @Override
    public void adjustSettings() {
        System.out.println(name + " Thermostat temperature adjusted to 68°F");
    }
}
