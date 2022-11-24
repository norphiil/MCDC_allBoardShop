class Utilisateur {
    String nom;
    String prenom;
    String adresse;
    String mail;
    String tel;

    Utilisateur(String nom, String prenom, String adresse, String mail){
        this(nom, prenom, adresse, mail, null);
    }

    Utilisateur(String nom, String prenom, String adresse, String mail, String tel){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.tel = tel;
    }
    void setNom(String nom) {
        this.nom = nom;
    }
    String getNom() {
        return this.nom;
    }
    void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    String getPrenom() {
        return this.prenom;
    }
    void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    String getAdresse() {
        return this.adresse;
    }
    void setMail(String mail) {
        this.mail = mail;
    }
    String getMail() {
        return this.mail;
    }
    void setTel(String tel) {
        this.tel = tel;
    }
    String getTel() {
        return this.tel;
    }
}