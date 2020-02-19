package com.education_wired_.work225;

public class Adapter extends Device {
    private  int speed;
    private String mac;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public Adapter(String serialNumber, String manufacturer, double price, int speed, String mac) {
        super(serialNumber, manufacturer, price);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", speed=" + speed +
                ", mac='" + mac ;
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) return false;
        if (!(obj instanceof Adapter)) return false;
        Adapter other = (Adapter) obj;
        if (this.speed != other.speed) return false;
        return this.mac.equals(other.mac) ;
    }

    @Override
    public int hashCode() {
        int sum = super.hashCode();
        sum = 31 * sum + speed;
        sum = 31 * sum + mac.hashCode();
        return sum;
    }
}
