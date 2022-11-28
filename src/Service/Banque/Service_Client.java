package Service.Banque;

import Model.User;

import java.util.Scanner;

import static Service.IHM.ServiceIHM_Client.logedUser;
import static View.Menu.banque;

public class Service_Client implements I_Service_Client {


    Scanner clavier = new Scanner(System.in);

    public Service_Client(){}

    // aficher comte detaile
    public void afficherCompteDetaille()
    {
        System.out.println("###### Afficher Compte Detaille ######");
        System.out.println(logedUser.toString());

    }

    // verser
    public void verser()
    {
        System.out.println("###### Verser ######");
        System.out.print("Montant : ");
        double mt = clavier.nextDouble();
        System.out.print("Compte Id: ");
        int id = clavier.nextInt();

        // search Compte in banque
        for (int i=0 ; i<banque.getUsers().size() ; i++) {
            if (banque.getUsers().get(i).equals(logedUser)) {
                for (int j=0 ; j<banque.getUsers().get(i).getComptes().size() ; j++) {
                    if (banque.getUsers().get(i).getComptes().get(j).getIdCompte() == id) {
                        banque.getUsers().get(i).getComptes().get(j).setSolde(banque.getUsers().get(i).getComptes().get(j).getSolde()+mt);
                        System.out.println("Verser Success");
                    }
                }
            }
        }


    }

    // retirer
    public void retirer()
    {
        System.out.println("###### Retirer ######");
        System.out.print("Montant : ");
        double mt = clavier.nextDouble();
        System.out.print("Compte Id: ");
        int id = clavier.nextInt();

        // search Compte in banque
        for (int i=0 ; i<banque.getUsers().size() ; i++) {
            if (banque.getUsers().get(i).equals(logedUser)) {
                for (int j=0 ; j<banque.getUsers().get(i).getComptes().size() ; j++) {
                    if (banque.getUsers().get(i).getComptes().get(j).getIdCompte() == id) {
                        banque.getUsers().get(i).getComptes().get(j).setSolde(banque.getUsers().get(i).getComptes().get(j).getSolde()-mt);
                        System.out.println("Retirer Success");
                    }
                }
            }
        }

    }

    // virement
    public void virement()
    {
        System.out.println("###### Virement ######");
        System.out.print("Montant : ");
        double mt = clavier.nextDouble();
        System.out.print("Compte Source Id: ");
        int idSrc = clavier.nextInt();
        System.out.print("Compte Destination Id: ");
        int idDes = clavier.nextInt();

        // search Compte in banque
        for (int i=0 ; i<banque.getUsers().size() ; i++) {
            if (banque.getUsers().get(i).equals(logedUser)) {
                for (int j=0 ; j<banque.getUsers().get(i).getComptes().size() ; j++) {
                    if (banque.getUsers().get(i).getComptes().get(j).getIdCompte() == idSrc) {
                        banque.getUsers().get(i).getComptes().get(j).setSolde(banque.getUsers().get(i).getComptes().get(j).getSolde()-mt);
                        System.out.println("Retirer Success");
                    }
                }
            }
        }

        // search Compte in banque
        for (int i=0 ; i<banque.getUsers().size() ; i++) {
                for (int j=0 ; j<banque.getUsers().get(i).getComptes().size() ; j++) {
                    if (banque.getUsers().get(i).getComptes().get(j).getIdCompte() == idDes) {
                        banque.getUsers().get(i).getComptes().get(j).setSolde(banque.getUsers().get(i).getComptes().get(j).getSolde()+mt);
                        System.out.println("Verser Success");
                    }
            }
        }

    }
    


        


 
}
