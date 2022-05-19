package trainning.a1ex2;

public class Client {
    public static void main(String[] args) {
        SwitchButton switchButton = new SwitchButton();
        FlashLamp lamp = new FlashLamp();
        Battery battery = new Battery();
        lamp.setBattery(battery);
        lamp.turnOn();
        System.out.println(lamp.getBatteryInfo());
        /*for (int i = 0; i < 10; i++) {
            switchButton.switchOn();
            battery.decreaseEnergy();
        }
        System.out.println("phan tram pin con lai " + battery.getEnergy());*/
    }
}

