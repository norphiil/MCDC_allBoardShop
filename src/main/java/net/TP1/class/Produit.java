class Produit {
    String nom;
    String description;
    String photo;
    Float prix_base;
    Float prix_vente;

    Produit(String nom, String description, String photo, Float prix_base, Float prix_vente){
        this.nom = nom;
        this.description = description;
        this.photo = photo;
        this.prix_base = prix_base;
        this.prix_vente = prix_vente;
    }
}