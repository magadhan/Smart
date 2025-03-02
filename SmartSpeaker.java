public class SmartSpeaker extends SmartDevice{
    public SmartSpeaker(String name, boolean status){
        super(name, status);
    }

    @Override
    public void turnOn(){
        if (status = true) {
            System.out.println(name + " Speaker is ON. Playing music...");
        }
    }

    @Override
    public void turnOff(){
        System.out.println(name + " Speaker is OFF");
    }

    @Override
    public void adjustSettings(){
        System.out.println(name + " Speaker volume set to 50%");
    }
    
}
