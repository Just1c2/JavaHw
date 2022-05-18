package trainning.a1ex2;

public class FlashLamp {
    public boolean state;
    private Battery battery;

    public FlashLamp() {
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public int getBatteryInfo() {
        return battery.getEnergy();
    }

    public void light() {
        if (state == true && battery != null && battery.getEnergy() > 0) {
            battery.decreaseEnergy();
        }
    }
    public void turnOn() {
        if (battery != null && battery.getEnergy() > 0) {
            state = true;
        }
        light();
    }
    public void turnOff() {
        state = false;
    }
}
