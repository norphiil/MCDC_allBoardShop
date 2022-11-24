class Vente_Produit {
    Integer quantite;
    Taille taille;
    ArrayList<Produits> produits = new ArrayList<>();

    Vente_Produit(Integer quantite, Taille taille, ArrayList<Produits> produits){
        this.quantite = quantite;
        this.taille = taille;
        this.produits = produits;
    }
    void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }
    Integer getQuantite() {
        return this.quantite;
    }
    void setTaille(Taille taille) {
        this.taille = taille;
    }
    Taille getTaille() {
        return this.taille;
    }
    void setProduits(ArrayList<Produits> produits) {
        this.produits = produits;
    }
    ArrayList<Produits> getProduits() {
        return this.produits;
    }
}