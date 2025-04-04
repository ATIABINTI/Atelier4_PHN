public class Menager extends produit {
    private String typeProduit;
    private String composants;


    public Menager(int id, String nom, double prix, int stock, String typeProduit, String composants) {
        super(id, nom, prix, stock);
        this.typeProduit = typeProduit;
        this.composants = composants;
    }

    public String getTypeProduit() {
        return typeProduit;
    }

    public void setTypeProduit(String typeProduit) {
        this.typeProduit = typeProduit;
    }

    public String getComposants() {
        return composants;
    }

    public void setComposants(String composants) {
        this.composants = composants;
    }

    @Override
    public void afficherProduit() {
        super.afficherProduit();
        System.out.println("Type de produit: " + typeProduit);
        System.out.println("Composants: " + composants);
    }
}
