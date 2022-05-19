package trainning.a1ex2;

public class SwitchButton {
    private boolean status;
    private FlashLamp lamp;
    public SwitchButton() {
        status = true;
    }
    public void connectToLamp(FlashLamp lamp) {
        this.lamp = lamp;
    }
    public void switchOn() {
        status = true;
    }
    public void switchOff() {
        status = false;
    }

}
