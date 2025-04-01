package com.test.dependencyinversion;

public class Remote
{
    /*private BatteryA batteryA;
    private BatteryB batterB;*/

    private Battery battery;

    public void display() {
        battery.batteryType();
    }
}
