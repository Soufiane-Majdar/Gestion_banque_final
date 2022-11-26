package Model;

public class Admin extends User{
    // one admin
    private static Admin single_instance = null;


    // public Admin(int id, String nom, String prenom, String email, String password) {
    //     super(id, nom, prenom, email, password);
    //     super.role="Admin";
    // }

    public Admin() {
        super(1,"admin","admin","admin@agence.ma","admin");
        super.role="Admin";
    }


    public String toString() {
        String r = "\n";
        r += "        << "+role+" >>    |->\n";
        r += super.toString();
        return r;
    }


}
