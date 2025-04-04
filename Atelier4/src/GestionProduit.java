import java.util.ArrayList;
import java.util.Scanner;

public class GestionProduit {
    private static ArrayList<produit> produit;

    static {
        produit = new ArrayList<produit>();
    }

    private static int idCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bonjour bienvenue dans le systéme ATIA produits");
            System.out.println("----------------------------------------------------");
            System.out.println("Ce systeme vous aide a bien gerer et stocker le produits de votre superMarché");
            System.out.println("Menu:");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Afficher les produits");
            System.out.println("3. Quitter");
            System.out.print("Choix: ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    ajouterProduit(scanner);
                    break;
                case 2:
                    afficherProduits();
                    break;
                case 3:
                    System.out.println("Au revoir et a bientot !");
                    return;
                default:
                    System.out.println("Votre choix est invalide! selectionner selon le menu");
            }
        }
    }

    private static void ajouterProduit(Scanner scanner) {
        System.out.println("Bonjour bienvenue dans le systéme ATIA produits ");
        System.out.println("----------------------------------------------------");
        System.out.println("Choisir une catégorie de produits:");
        System.out.println("1. Alimentaire");
        System.out.println("2. Ménager");
        System.out.println("3. Cosmétique");
        System.out.print("Choix: ");
        int categorie = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nom du produit: ");
        String nom = scanner.nextLine();

        System.out.print("Prix du produit: ");
        double prix = scanner.nextDouble();

        System.out.print("Quantité en stock: ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        switch (categorie) {
            case 1:
                System.out.print("Date de péremption: ");
                String datePeremption = scanner.nextLine();
                System.out.print("Provenance: ");
                String provenance = scanner.nextLine();
                System.out.print("Température de conservation: ");
                String tempConserve = scanner.nextLine();
                produit.add(new AIimentaire(idCounter++, nom, prix, stock, datePeremption, provenance, tempConserve));
                break;
            case 2:
                System.out.print("Type de produit: ");
                String typeProduit = scanner.nextLine();
                System.out.print("Composants: ");
                String composants = scanner.nextLine();
                produit.add(new Menager(idCounter++, nom, prix, stock, typeProduit, composants));
                break;
            case 3:
                System.out.print("Marque: ");
                String marque = scanner.nextLine();
                System.out.print("Type de peau recommandé: ");
                String typePeau = scanner.nextLine();
                System.out.print("Contenance en ml: ");
                double contenance = scanner.nextDouble();
                produit.add(new Cosemetique(idCounter++, nom, prix, stock, marque, typePeau, contenance));
                break;
            default:
                System.out.println("Choix invalide !");
        }
    }

    private static void afficherProduits() {
        if (produit.isEmpty()) {
            System.out.println("Aucun produit à afficher.");
        } else {
            for (produit produit : produit) {
                produit.afficherProduit();
                System.out.println();
            }
        }
    }

    public static ArrayList<produit> getProduit() {
        return produit;
    }

    public static void setProduit(ArrayList<produit> produit) {
        GestionProduit.produit = produit;
    }
}
