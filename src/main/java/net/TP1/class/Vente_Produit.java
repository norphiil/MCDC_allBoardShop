class Vente_Produit {
    Integer quantite;
    Taille taille;
    ArrayList<Produits> produits = new ArrayList<>();

    Vente_Produit(Integer quantite, Taille taille, ArrayList<Produits> produits){
        this.quantite = quantite;
        this.taille = taille;
        this.produits = produits;
    }
}