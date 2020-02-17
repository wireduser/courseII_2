package com.education_wired_.work225;

public class Monitor extends Device {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Monitor(String serialNumber, String manufacturer, double price, int x, int y) {
        super(serialNumber, manufacturer, price);
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", x=" + x +
                ", y=" + y ;
    }
}
