package com.education_wired_.work225;

public class Main {
    public static void main(String[] args) {
        /*Device device = new Device("0001","adidas",200.2);
        System.out.println(device);
        Device device1 = new Monitor("00002","dell",20098,1024,768);
        System.out.println(device1);
        Device device2 = new Adapter("29920","urs",2983.22, 14400, "982792i1uh");
        System.out.println(device2);*/
        Device[] devices = createDevices();
        for (Device d: devices){
            System.out.println(d);
        }
    }

    public  static  Device[] createDevices(){
        return new Device[] {
                new Device("0001","adidas",200.2),
                new Monitor("00002","dell",20098,1024,768),
                new Adapter("29920","urs",2983.22, 14400, "982792i1uh"),
        };
    }
}
