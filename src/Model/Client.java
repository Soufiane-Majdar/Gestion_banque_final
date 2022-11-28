package Model;

public class Client extends User {

    private Compte[] comptes = new Compte[4];
    public int  nbrCompte=0;


    public Client(int id, String nom, String prenom, String email, String password) {
        super(id, nom, prenom, email, password);
        super.role="Client";
    }

    public Client(int id, String nom, String prenom, String email, String password,Compte[] comptes ) {
        super(id, nom, prenom, email, password);
        this.comptes = comptes;
        super.role="Client";
    }

    public Client() {
        super();
        super.role="Client";
    }

    public Compte[] getComptes() {
        return comptes;
    }

    public void setComptes(Compte[] comptes) {
        this.comptes = comptes;
    }

    public String toString() {
        String r = "\n";
        r += "        << "+role+" >>    |->\n";
        r += super.toString();
        return r;
    }

    
}
