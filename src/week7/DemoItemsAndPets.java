package week7;

public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold itemSold = new ItemSold();
        itemSold.setInvoiceNumber(1);
        itemSold.setDescription("Dog");
        itemSold.setPrice(500);
        PetSold petSold = new PetSold();
        petSold.setNeutered(true);
        petSold.setVaccinated(true);
        petSold.setHousebroken(false);

        System.out.println("Invoice Number: " + itemSold.getInvoiceNumber()+"\nDescriptin: "+ itemSold.getDescription()+"\nPrice: " + itemSold.getPrice());
        System.out.println("Vaccinated: " + petSold.getVaccinated()+"\nNeutered: "+petSold.getNeutered()+"\nHousebroken: "+petSold.getHousebroken());
    }
}
