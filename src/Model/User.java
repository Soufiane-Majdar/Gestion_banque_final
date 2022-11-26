package Model;

import java.time.LocalDate;

public class User {
    protected int id;
    protected String nom;
    protected String prenom;
    protected String email;
    protected String role;
    protected LocalDate d_cration;


    public User(int id, String nom, String prenom, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        d_cration=LocalDate.now();
        boolean valide=false;
        for(int i=0;i<email.length();i++)
        {
            if (email.charAt(i)=='@')
                valide=true;

        }
        if(valide)
            this.email = email;

    }

    public User() {
        d_cration=LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getD_cration() {
        return d_cration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        boolean valide=false;
        for(int i=0;i<email.length();i++)
        {
            if (email.charAt(i)=='@')
                valide=true;

        }
        if(valide)
            this.email = email;
    }

    public void setD_cration(LocalDate d_cration) {
        this.d_cration = d_cration;
    }


    public boolean equals(Object obj) {
        if(obj instanceof User)
            return  false;
        User o= (User) obj;
        if (this.getId()==o.getId())
            return true;
        else return false;
    }

    public String toString() {
        String r="\n";
        r+="        Id            : "+id+"\n";
        r+="        Nom           : "+nom+"\n";
        r+="        Prenom        : "+prenom+"\n";
        r+="        Email         : "+email+"\n";
        r+="        Date Creation : "+d_cration+"\n";
        return r;
    }
}
