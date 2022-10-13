class Vente {
    String nom;
    DateTime date_debut;
    DateTime date_fin;
    String description;
    ArrayList<Activite> activites;
    Vente_Produit vente_produit;

    Vente(String nom, DateTime date_debut, DateTime date_fin, String description, Vente_Produit vente_produit, ArrayList<Activite> activites) {
        this.nom = nom;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.description = description;
        this.activites = activites;
        this.Vente_Produit = vente_produit;
    }
}