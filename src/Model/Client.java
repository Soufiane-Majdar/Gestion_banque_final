package Model;

import java.util.ArrayList;

public class Client extends User {






    public Client(int id, String nom, String prenom, String email, String password) {
        super(id, nom, prenom, email, password);
        super.role="Client";
    }

    public Client(int id, String nom, String prenom, String email, String password,ArrayList<Compte> comptes ) {
        super(id, nom, prenom, email, password);
        this.comptes = comptes;
        super.role="Client";
    }

    public Client() {
        super();
        super.role="Client";
    }



    public String toString() {
        String r = "\n";
        r += "        << "+role+" >>    |->\n";
        r += super.toString();
        return r;
    }

    
}
