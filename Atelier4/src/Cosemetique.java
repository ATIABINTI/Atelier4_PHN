public class Cosemetique extends produit {
    private String marque;
    private String typePeauRecommande;
    private double contenance;

    public Cosemetique(int id, String nom, double prix, int stock, String marque, String typePeauRecommande, double contenance) {
        super(id, nom, prix, stock);
        this.marque = marque;
        this.typePeauRecommande = typePeauRecommande;
        this.contenance = contenance;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getTypePeauRecommande() {
        return typePeauRecommande;
    }

    public void setTypePeauRecommande(String typePeauRecommande) {
        this.typePeauRecommande = typePeauRecommande;
    }

    public double getContenance() {
        return contenance;
    }

    public void setContenance(double contenance) {
        this.contenance = contenance;
    }

    @Override
    public void afficherProduit() {
        super.afficherProduit();
        System.out.println("Marque: " + marque);
        System.out.println("Type de peau recommandé: " + typePeauRecommande);
        System.out.println("Contenance: " + contenance + " ml");
    }
}
