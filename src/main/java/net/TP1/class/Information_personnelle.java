class Information_personnelle {
    String nom;
    String prenom;
    String adresse;
    String mail;
    String tel;

    Information_personnelle(String nom, String prenom, String adresse, String mail){
        this(nom, prenom, adresse, mail, null);
    }

    Information_personnelle(String nom, String prenom, String adresse, String mail, String tel){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.tel = tel;
    }
}
