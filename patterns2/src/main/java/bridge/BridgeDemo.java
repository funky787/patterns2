package bridge;

interface Device {
    void turnOn();
}

class TV implements Device {
    public void turnOn() {
        System.out.println("Телевизор включен");
    }
}

class Radio implements Device {
    public void turnOn() {
        System.out.println("Радио включено");
    }
}

abstract class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    abstract void pressPower();
}

class BasicRemote extends Remote {

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    void pressPower() {
        device.turnOn();
    }
}

public class BridgeDemo {
    public static void main(String[] args) {
        Remote remote =
                new BasicRemote(new TV());

        remote.pressPower();
    }
}