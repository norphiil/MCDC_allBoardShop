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
    void setNom(String nom) {
        this.nom = nom;
    }
    String getNom() {
        return this.nom;
    }
    void setDescription(String description) {
        this.description = description;
    }
    String getDescription() {
        return this.description;
    }
    void setPhoto(String photo) {
        this.photo = photo;
    }
    String getPhoto() {
        return this.photo;
    }
    void setPrix_base(Float prix_base) {
        this.prix_base = prix_base;
    }
    Float getPrix_base() {
        return this.prix_base;
    }
    void setPrix_vente(Float prix_vente) {
        this.prix_vente = prix_vente;
    }
    Float getPrix_vente() {
        return this.prix_vente;
    }
}