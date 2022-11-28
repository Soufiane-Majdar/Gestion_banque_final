package Model;


import java.util.ArrayList;

public class Banque {
    private int idBanque;
    private String nomAgence,emailAgence;

    private ArrayList<User> users = new ArrayList<User>();




    public Banque(){
        Admin admin = new Admin();
        users.add(admin);
    }

    public Banque(int idBanque,String nomAgence, String emailAgence) {
        this.idBanque=idBanque;
        this.nomAgence = nomAgence;
        this.emailAgence = emailAgence;

        Admin admin = new Admin();
        users.add(admin);
    }

    public void setIdBanque(int idBanque) {
        this.idBanque = idBanque;
    }

    public void setNomAgence(String nomAgence) {
        this.nomAgence = nomAgence;
    }

    public void setEmailAgence(String emailAgence) {
        this.emailAgence = emailAgence;
    }





    public  int getIdBanque() {
        return idBanque;
    }

    public String getNomAgence() {
        return nomAgence;
    }

    public String getEmailAgence() {
        return emailAgence;
    }



    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }



    @Override
    public String toString() {


        String r="<<< Banque >>>\n";
        r+="    Id    : "+idBanque+"\n";
        r+="    Nom   : "+nomAgence+"\n";
        r+="    Email : "+emailAgence+"\n";
        r+="=============================================\n";
        return r;
    }


}
