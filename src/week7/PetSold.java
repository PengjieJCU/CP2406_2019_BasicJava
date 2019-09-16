package week7;

public class PetSold {
    boolean vaccinated;
    boolean neutered;
    boolean housebroken;

    public boolean getVaccinated()
    {
        return vaccinated;
    }
    public boolean getNeutered()
    {
        return neutered;
    }
    public boolean getHousebroken()
    {
        return housebroken;
    }
    public void setVaccinated(boolean faVaccinated){
        vaccinated = faVaccinated;
    }

    public void setNeutered(boolean faNeutered){
        neutered = faNeutered;
    }
    public void setHousebroken(boolean fahousebroken){
        housebroken = fahousebroken;
    }
}
