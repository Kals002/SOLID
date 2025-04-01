package com.test.openclose;

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

    public void saveToFile(Marker marker)
    {
        System.out.println("Saved to file "+marker.getAmount());
    }
    public void saveToDB(Marker marker)
    {
        System.out.println("Saved to DB "+marker.getAmount());
    }
    public void saveToInMemory(Marker marker)
    {
        System.out.println("Saved to InMemory "+marker.getAmount());
    }
}
