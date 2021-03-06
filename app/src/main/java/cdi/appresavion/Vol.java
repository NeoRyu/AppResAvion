package cdi.appresavion;

/**
 * Created by Frédéric on 15/09/2016 - Last edit : 21/09/2016
 */
public class Vol {

    // VARIABLES D'ENVIRONNEMENT
    private String depart;      //heure de départ
    private String arrivee;     //heure d'arrivée
    private String code;        //code de l'aeroport
    private String prix;        //prix en euros
    private String Id;        //logo de la compagnie avion


    // CONSTRUCTEURS (avec surcharge pour definir les variables lors interrogation BDD)
    public Vol() {
    }
    public Vol(String depart, String arrivee, String code, String prix) {
        super();
        this.depart = depart;
        this.arrivee = arrivee;
        this.code = code;
        this.prix = prix;
    }
    public Vol(String depart, String arrivee, String code, String prix, String id) {
        super();
        this.depart = depart;
        this.arrivee = arrivee;
        this.code = code;
        this.prix = prix;
        this.Id = id;
    }


    // GET/SET : Accesseurs/Mutateurs
    public String getDepart() {
        return depart;
    }
    public void setDepart(String data) {
        depart = data;
    }

    public String getArrivee() {
        return arrivee;
    }
    public void setArrivee(String data) {
        arrivee = data;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String data) {
        code = data;
    }

    public String getPrix() {
        return prix;
    }
    public void setPrix(String data) {
        this.prix = data;
    }

    public String getId() {
        return Id;
    }
    public void setId(String data) {
        this.Id = data;
    }
}

