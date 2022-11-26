package Model;



public class Banque {
    private static int idBanque=0;
    private String nomAgence,emailAgence;

    private User[] users = new User[4];





    public Banque(){}

    public Banque(String nomAgence, String emailAgence) {
        idBanque++;
        this.nomAgence = nomAgence;
        this.emailAgence = emailAgence;
    }

    public static void setIdBanque(int idBanque) {
        Banque.idBanque = idBanque;
    }

    public void setNomAgence(String nomAgence) {
        this.nomAgence = nomAgence;
    }

    public void setEmailAgence(String emailAgence) {
        this.emailAgence = emailAgence;
    }





    public static int getIdBanque() {
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
