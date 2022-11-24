//This code is used to create a new Vente object, which contains information about a sale.
//The Vente object has a name, a start date, an end date, a description, the list of activities associated with the sale, and the Vente_Produit object associated with the sale.
//The Vente_Produit object contains information about the products that are sold during the sale.
//The Vente_Produit object has a list of Produit objects, which contains information about the products that are sold.
//The Produit object has a name, a price, a category, and a description.

class Vente {
    String nom;
    DateTime date_debut;
    DateTime date_fin;
    String description;
    ArrayList<Activite> activites;
    ArrayList<Vente_Produit> venteProduit;

    Vente(String nom, DateTime date_debut, DateTime date_fin, String description, ArrayList<Vente_Produit> venteProduit, ArrayList<Activite> activites) {
        if (nom == null) {
            throw new IllegalArgumentException("nom cannot be null");
        }
        if (date_debut == null) {
            throw new IllegalArgumentException("date_debut cannot be null");
        }
        if (date_fin == null) {
            throw new IllegalArgumentException("date_fin cannot be null");
        }
        if (description == null) {
            throw new IllegalArgumentException("description cannot be null");
        }
        if (activites == null) {
            throw new IllegalArgumentException("activites cannot be null");
        }
        if (venteProduit == null) {
            throw new IllegalArgumentException("venteProduit cannot be null");
        }
        this.nom = nom;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.description = description;
        this.activites = activites;
        this.venteProduit = venteProduit;
    }

    void setNom(String nom) {
        if (nom == null) {
            throw new IllegalArgumentException("nom cannot be null");
        }
        this.nom = nom;
    }

    String getNom() {
        return this.nom;
    }

    void setDate_debut(DateTime date_debut) {
        if (date_debut == null) {
            throw new IllegalArgumentException("date_debut cannot be null");
        }
        this.date_debut = date_debut;
    }

    DateTime getDate_debut() {
        return this.date_debut;
    }

    void setDate_fin(DateTime date_fin) {
        if (date_fin == null) {
            throw new IllegalArgumentException("date_fin cannot be null");
        }
        this.date_fin = date_fin;
    }

    DateTime getDate_fin() {
        return this.date_fin;
    }

    void setDescription(String description) {
        if (description == null) {
            throw new IllegalArgumentException("description cannot be null");
        }
        this.description = description;
    }

    String getDescription() {
        return this.description;
    }

    void setActivites(ArrayList<Activite> activites) {
        if (activites == null) {
            throw new IllegalArgumentException("activites cannot be null");
        }
        this.activites = activites;
    }

    ArrayList<Activite> getActivites() {
        return this.activites;
    }

    void setVenteProduit(ArrayList<Vente_Produit> venteProduit) {
        if (venteProduit == null) {
            throw new IllegalArgumentException("venteProduit cannot be null");
        }
        this.venteProduit = venteProduit;
    }
    ArrayList<Vente_Produit> getVenteProduit() {
        return this.venteProduit;
    }
}