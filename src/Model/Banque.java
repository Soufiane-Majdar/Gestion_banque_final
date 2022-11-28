package Model;



public class Banque {
    private int idBanque;
    private String nomAgence,emailAgence;

    private User[] users = new User[4];
    public int nbrUser=0;





    public Banque(){
        Admin admin = new Admin();
        users[nbrUser]=admin;
    }

    public Banque(int idBanque,String nomAgence, String emailAgence) {
        this.idBanque=idBanque;
        this.nomAgence = nomAgence;
        this.emailAgence = emailAgence;

        Admin admin = new Admin();
        users[nbrUser]=admin;
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



    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
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
