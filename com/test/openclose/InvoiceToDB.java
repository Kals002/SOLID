package com.test.openclose;

public class InvoiceToDB implements SaveInterface
{
    private Marker marker;

    public InvoiceToDB(Marker marker)
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

    @Override
    public void save(Marker marker)
    {
        System.out.println("Saved to DB - "+marker.getAmount());
    }
}
