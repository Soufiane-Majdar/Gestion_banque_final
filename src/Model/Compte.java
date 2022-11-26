package Model;

import java.time.LocalDate;


public class Compte {
    private  int idCompte;
    private double solde;
    private LocalDate d_cration;
    // private String[] journalisation = new String[10];




    public Compte(){
        d_cration=LocalDate.now();
        // journalisation[j] = "Compte id : " + idCompte + " a ete crere le : " + d_cration;
        // j++;
    }



    public Compte(int idCompte,double solde) {
        this.idCompte=idCompte;
        this.solde = solde;
        this.d_cration = LocalDate.now();

        // journalisation[j] = "Compte id : " + idCompte + " a ete crere le : " + d_cration;
        // j++;

    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }



    public int getIdCompte() {
        return idCompte;
    }

    public double getSolde() {
        return solde;
    }

    public LocalDate getD_cration() {
        return d_cration;
    }




    public void setD_cration(LocalDate d_cration) {
        this.d_cration = d_cration;
    }


    // public String[] getJournalisation() {
    //     return journalisation;
    // }

    // public void setJournalisation(String[] journalisation) {
    //     this.journalisation = journalisation;
    // }


    @Override
    public String toString() {
        String r="|=> Compte >>>\n";
        r+="    Id              : "+idCompte+"\n";
        r+="    solde           : "+solde+"\n";
        r+="    date de cration : "+d_cration+"\n";

        return r;
    }


}
