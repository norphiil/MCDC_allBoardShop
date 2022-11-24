
// This class represents a supplier.
// It is a subclass of Utilisateur (User).

public class Vente {
    private Fournisseur fournisseur;
    private Materiel materiel;
    private int quantite;
    private Date dateVente;

    public Vente(Fournisseur fournisseur, Materiel materiel, int quantite, Date dateVente) {
        if (fournisseur == null || materiel == null || dateVente == null || quantite <= 0) {
            throw new IllegalArgumentException();
        }

        this.fournisseur = fournisseur;
        this.materiel = materiel;
        this.quantite = quantite;
        this.dateVente = dateVente;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        if (fournisseur == null) {
            throw new IllegalArgumentException();
        }

        this.fournisseur = fournisseur;
    }

    public Fournisseur getFournisseur() {
        return this.fournisseur;
    }

    public void setMateriel(Materiel materiel) {
        if (materiel == null) {
            throw new IllegalArgumentException();
        }

        this.materiel = materiel;
    }

    public Materiel getMateriel() {
        return this.materiel;
    }

    public void setQuantite(int quantite) {
        if (quantite <= 0) {
            throw new IllegalArgumentException();
        }

        this.quantite = quantite;
    }

    public int getQuantite() {
        return this.quantite;
    }

    public void setDateVente(Date dateVente) {
        if (dateVente == null) {
            throw new IllegalArgumentException();
        }

        this.dateVente = dateVente;
    }

    public Date getDateVente() {
        return this.dateVente;
    }
}
