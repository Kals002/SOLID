package com.test.openclose;

public class InvoiceToFile implements SaveInterface
{

    private Marker marker;

    public InvoiceToFile(Marker marker)
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
        System.out.println("Saved to file "+marker.getAmount());
    }
}
