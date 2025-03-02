public abstract class SmartDevice{
    public String name = "Unknown";
    public boolean status  = false;

    public SmartDevice(String name, boolean status){
        this.name = name;
        this.status = status;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public abstract void adjustSettings();

    public void displaySettings(){
        System.out.print(name + " Speaker is now ");
        if (status = true) {
            System.out.println("ON.");
        } else if (status = false){
            System.out.println("OFF");
        }
    }
}