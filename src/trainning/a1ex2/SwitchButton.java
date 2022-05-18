package trainning.a1ex2;

public class SwitchButton {
    private boolean status;
    private FlashLamp lamp;
    public SwitchButton() {
        status = false;
    }
    public void connectToLamp(FlashLamp lamp) {
        this.lamp = lamp;
    }
    public void switchOn() {
        if (status == true) {
            lamp.state = true;
            lamp.turnOn();
        }
    }
    public void switchOff() {
        status = false;
        lamp.state = false;
        lamp.turnOff();
    }

}
