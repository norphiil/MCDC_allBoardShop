    class Fournisseur extends Information_personnel {
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
    }