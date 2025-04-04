public class AIimentaire extends produit {
    private String datePeremption;
    private String provenance;
    private String temperatureConservation;


    public AIimentaire(int id, String nom, double prix, int stock, String datePeremption, String provenance, String temperatureConservation) {
        super(id, nom, prix, stock);
        this.datePeremption = datePeremption;
        this.provenance = provenance;
        this.temperatureConservation = temperatureConservation;
    }

    public String getDatePeremption() {
        return datePeremption;
    }

    public void setDatePeremption(String datePeremption) {
        this.datePeremption = datePeremption;
    }

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    public String getTemperatureConservation() {
        return temperatureConservation;
    }

    public void setTemperatureConservation(String temperatureConservation) {
        this.temperatureConservation = temperatureConservation;
    }

    @Override
    public void afficherProduit() {
        super.afficherProduit();
        System.out.println("Date de péremption: " + datePeremption);
        System.out.println("Provenance: " + provenance);
        System.out.println("Température de conservation: " + temperatureConservation);
    }
}

