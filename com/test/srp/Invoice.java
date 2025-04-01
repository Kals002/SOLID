package com.test.srp;

import com.test.openclose.Marker;

public class Invoice
{
    private Marker marker;

    public Invoice(Marker marker)
    {
        this.marker = marker;
    }

    public Marker getMarker()
    {
        return this.marker;
    }
    public void setMarker(Marker marker)
    {
        this.marker = marker;
    }

    public double calculate()
    {
        return this.marker.getAmount() * 2.0;
    }

    public void print()
    {
        System.out.println(new Invoice(new Marker(23.0)).calculate());
    }

    public void saveToFile()
    {
        System.out.println("Saved to file");
    }

}
