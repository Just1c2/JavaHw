package trainning.a1ex2;

public class FlashLamp {
    private boolean status;
    private Battery battery;

    public FlashLamp() {
        status = false;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public int getBatteryInfo() {
        return battery.getEnergy();
    }

    public void light() {
        if (status == true && battery != null && battery.getEnergy() > 0) {
            battery.decreaseEnergy();
        }
    }
    public void turnOn() {
        if (battery != null && battery.getEnergy() > 0) {
            status = true;
        }
        light();
    }
    public void turnOff() {
        status = false;
    }
    public void printInfo() {
        System.out.println("-----------------------------------");
        System.out.println("| Battery |");
        System.out.printf("| %s |\n",this.battery);
    }

    public static void main(String[] args) {
        Battery battery1;

    }
}
