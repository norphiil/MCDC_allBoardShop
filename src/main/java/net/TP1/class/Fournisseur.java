    class Fournisseur extends Utilisateur {
        Activite activite;
        ArrayList<Vente> ventes = new ArrayList<>();
        Materiel materiel;

        Fournisseur(String nom, String prenom, String adresse, String mail, Materiel materiel, Activite activite){
            this(nom, prenom, adresse, mail, materiel, activite, null, null);
        }
        Fournisseur(String nom, String prenom, String adresse, String mail, Materiel materiel, Activite activite, String tel){
            this(nom, prenom, adresse, mail, materiel, activite, tel, null);
        }
        Fournisseur(String nom, String prenom, String adresse, String mail, Materiel materiel, Activite activite, ArrayList<Vente> ventes){
            this(nom, prenom, adresse, mail, materiel, activite, null, ventes);
        }
        Fournisseur(String nom, String prenom, String adresse, String mail, Materiel materiel, Activite activite, String tel, ArrayList<Vente> ventes){
            this.super(nom, prenom, adresse, mail, tel);
            this.activite = activite;
            this.ventes = ventes;
            this.materiel = materiel;
        }
        void setActivite(Activite activite) {
            this.activite = activite;
        }
        Activite getActivite() {
            return this.activite;
        }
        void setVentes(ArrayList<Vente> ventes) {
            this.ventes = ventes;
        }
        ArrayList<Vente> getVentes() {
            return this.ventes;
        }
        void setMateriel(Materiel materiel) {
            this.materiel = materiel;
        }
        Materiel getMateriel() {
            return this.materiel;
        }
    }