package Service.Banque;
import Model.Client;
import Model.Compte;

import java.util.Scanner;

import static View.Menu.banque;
public class Service_Admin implements I_Service_Admin {

    public boolean creeEtAjouterClient(Scanner clavier) {
        System.out.println("\n=============================================");
        System.out.println("Cree Et Ajouter Client au Banque");
        System.out.println("ID     : ");
        int id =clavier.nextInt();
        System.out.println("nom    : ");
        String nom=clavier.next();
        System.out.println("prenom : ");
        String prenom=clavier.next();
        System.out.println("email  : ");
        String email=clavier.next();
        System.out.println("Password  : ");
        String password=clavier.next();
        Client c=new Client(id,nom,prenom,email,password);

        boolean not_exist=true;
        for (int i=0;i<banque.getUsers().size();i++) {
            if(banque.getUsers().get(i)!=null)
            {
                if ( banque.getUsers().get(i).getId()==c.getId()) {
                    not_exist=false;
                }
            }

        }
        if(not_exist)
        {
            if(banque.getUsers().size()<3) {
                banque.getUsers().add(c);
                System.out.println("\nClient créé avec succès!");
                System.out.println("=============================================\n");
                return true;
            }
            else
            {
                System.out.println("vous avez atteint le nombre maximum de Client");
                System.out.println("=============================================\n");
                return false;
            }
        }
        else
        {
            System.out.println("Client existe déjà!");
            return false;
        }

    }

    // Erreur
    public static boolean creeEtAjouterCompte(Scanner clavier) {
        System.out.println("\n=============================================");
        System.out.println("Cree Et Ajouter Compte au Banque");
        System.out.println("ID     : ");
        int id =clavier.nextInt();
        System.out.println("solde  : ");
        double solde=clavier.nextDouble();
        System.out.println("\n=============================================");
        System.out.println("Client du Compte :");
        System.out.println("ID     : ");
        int idC =clavier.nextInt();
        //System.out.println("client : ");
        //String client=clavier.next();
        Compte c=new Compte(id,solde);

        boolean not_exist=true;
        int UserP=5;
        for (int i=0;i<banque.getUsers().size();i++) {
            if(banque.getUsers().get(i)!=null)
            {
                if ( banque.getUsers().get(i).getId()==idC) {
                    not_exist=false;
                    UserP=i;
                }
            }

        }
        if(not_exist && UserP!=5)
        {
            if(banque.getUsers().get(UserP).getComptes().size()<3) {
                banque.getUsers().get(UserP).getComptes().add(c);
                System.out.println("\nCompte est créé avec succès!");
                System.out.println("=============================================\n");
                //boolean b=verser(233,c);
                return true;
            }
            else
            {
                System.out.println("vous avez atteint le nombre maximum de comptes!");
                System.out.println("=============================================\n");
                return false;
            }
        }
        else
        {
            System.out.println("Compte existe déjà ou client n'existe pas!");
            return false;
        }

    }



}
