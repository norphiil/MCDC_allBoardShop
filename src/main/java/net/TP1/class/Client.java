class Client extends Information_personnelle {
    Bool privilegie = false;
    ArrayList<Activite> activites;

    Client(String nom, String prenom, String adresse, String mail, ArrayList<Activite> activites){
        this(nom, prenom, adresse, mail, null, false, activites);
    }
    Client(String nom, String prenom, String adresse, String mail, ArrayList<Activite> activites, String tel){
        this(nom, prenom, adresse, mail, tel, false, activites);
    }
    Client(String nom, String prenom, String adresse, String mail, ArrayList<Activite> activites, Bool privilegie){
        this(nom, prenom, adresse, mail, null, privilegie, activites);
    }
    Client(String nom, String prenom, String adresse, String mail, ArrayList<Activite> activites, String tel, Bool privilegie){
        this.super(nom, prenom, adresse, mail, tel);
        this.privilegie = privilegie;
        this.activites = activites;
    }
}
