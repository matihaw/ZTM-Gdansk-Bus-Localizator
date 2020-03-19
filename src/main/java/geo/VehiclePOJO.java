package geo;

public class VehiclePOJO
{
    private String LastUpdateData;

    private Vehicles[] Vehicles;

    public String getLastUpdateData ()
    {
        return LastUpdateData;
    }

    public void setLastUpdateData (String LastUpdateData)
    {
        this.LastUpdateData = LastUpdateData;
    }

    public Vehicles[] getVehicles ()
    {
        return Vehicles;
    }

    public void setVehicles (Vehicles[] Vehicles)
    {
        this.Vehicles = Vehicles;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [LastUpdateData = "+LastUpdateData+", Vehicles = "+Vehicles+"]";
    }
}
			
			