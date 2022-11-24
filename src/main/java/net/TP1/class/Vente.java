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
    void setNom(String nom) {
        this.nom = nom;
    }
    String getNom() {
        return this.nom;
    }
    void setDate_debut(DateTime date_debut) {
        this.date_debut = date_debut;
    }
    DateTime getDate_debut() {
        return this.date_debut;
    }
    void setDate_fin(DateTime date_fin) {
        this.date_fin = date_fin;
    }
    DateTime getDate_fin() {
        return this.date_fin;
    }
    void setDescription(String description) {
        this.description = description;
    }
    String getDescription() {
        return this.description;
    }
    void setActivites(ArrayList<Activite> activites) {
        this.activites = activites;
    }
    ArrayList<Activite> getActivites() {
        return this.activites;
    }
    void setVente_Produit(Vente_Produit vente_produit) {
        this.vente_produit = vente_produit;
    }
    Vente_Produit getVente_Produit() {
        return this.vente_produit;
    }
}