package Service.Banque;
import Model.Client;
import Model.Compte;

import java.util.Scanner;

import static View.Menu.banque;
public class Service_Admin implements I_Service_Admin {

    public Service_Admin(){}

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


    public boolean supprimerClient(Scanner clavier) {
        System.out.println("\n=============================================");
        System.out.println("Supprimer Client du Banque");
        System.out.println("ID     : ");
        int id =clavier.nextInt();
        boolean not_exist=true;
        int UserP=5;
        for (int i=0;i<banque.getUsers().size();i++) {
            if(banque.getUsers().get(i)!=null)
            {
                if ( banque.getUsers().get(i).getId()==id) {
                    not_exist=false;
                    UserP=i;
                }
            }

        }
        if(not_exist && UserP!=5)
        {
            banque.getUsers().remove(UserP);
            System.out.println("\nClient est supprimé avec succès!");
            System.out.println("=============================================\n");
            return true;
        }
        else
        {
            System.out.println("Client n'existe pas!");
            return false;
        }

    }

    public boolean supprimerCompte(Scanner clavier) {
        System.out.println("\n=============================================");
        System.out.println("Supprimer Compte du Banque");
        System.out.println("ID     : ");
        int id =clavier.nextInt();
        System.out.println("\n=============================================");
        System.out.println("Client du Compte :");
        System.out.println("ID     : ");
        int idC =clavier.nextInt();
        boolean not_exist=true;
        int UserP=5;
        int CompteP=5;
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
            for (int i=0;i<banque.getUsers().get(UserP).getComptes().size();i++) {
                if(banque.getUsers().get(UserP).getComptes().get(i)!=null)
                {
                    if ( banque.getUsers().get(UserP).getComptes().get(i).getIdCompte()==id) {
                        not_exist=false;
                        CompteP=i;
                    }
                }

            }
            if(not_exist && CompteP!=5)
            {
                banque.getUsers().get(UserP).getComptes().remove(CompteP);
                System.out.println("\nCompte est supprimé avec succès!");
                System.out.println("=============================================\n");
                return true;
            }
            else
            {
                System.out.println("Compte n'existe pas!");
                return false;
            }
        }
        else
        {
            System.out.println("Client n'existe pas!");
            return false;
        }

    }

    // modifier
    public boolean modifierClient(Scanner clavier) {
        System.out.println("\n=============================================");
        System.out.println("Modifier Client du Banque");
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
        int UserP=5;
        for (int i=0;i<banque.getUsers().size();i++) {
            if(banque.getUsers().get(i)!=null)
            {
                if ( banque.getUsers().get(i).getId()==id) {
                    not_exist=false;
                    UserP=i;
                }
            }

        }
        if(not_exist && UserP!=5)
        {
            banque.getUsers().set(UserP,c);
            System.out.println("\nClient est modifié avec succès!");
            System.out.println("=============================================\n");
            return true;
        }
        else
        {
            System.out.println("Client n'existe pas!");
            return false;
        }

    }

    public boolean modifierCompte(Scanner clavier) {
        System.out.println("\n=============================================");
        System.out.println("Modifier Compte du Banque");
        System.out.println("ID     : ");
        int id =clavier.nextInt();
        System.out.println("solde  : ");
        double solde=clavier.nextDouble();
        Compte c=new Compte(id,solde);
        boolean not_exist=true;
        int UserP=5;
        int CompteP=5;
        for (int i=0;i<banque.getUsers().size();i++) {
            if(banque.getUsers().get(i)!=null)
            {
                if ( banque.getUsers().get(i).getId()==id) {
                    not_exist=false;
                    UserP=i;
                }
            }

        }
        if(not_exist && UserP!=5)
        {
            for (int i=0;i<banque.getUsers().get(UserP).getComptes().size();i++) {
                if(banque.getUsers().get(UserP).getComptes().get(i)!=null)
                {
                    if ( banque.getUsers().get(UserP).getComptes().get(i).getIdCompte()==id) {
                        not_exist=false;
                        CompteP=i;
                    }
                }

            }
            if(not_exist && CompteP!=5)
            {
                banque.getUsers().get(UserP).getComptes().set(CompteP,c);
                System.out.println("\nCompte est modifié avec succès!");
                System.out.println("=============================================\n");
                return true;
            }
            else
            {
                System.out.println("Compte n'existe pas!");
                return false;
            }
        }
        else
        {
            System.out.println("Client n'existe pas!");
            return false;
        }

    }

    // afficher

    public void afficherClient(Scanner clavier) {
        System.out.println("\n=============================================");
        System.out.println("Afficher Client du Banque");
        System.out.println("ID     : ");
        int id =clavier.nextInt();
        boolean not_exist=true;
        int UserP=5;
        for (int i=0;i<banque.getUsers().size();i++) {
            if(banque.getUsers().get(i)!=null)
            {
                if ( banque.getUsers().get(i).getId()==id) {
                    not_exist=false;
                    UserP=i;
                }
            }

        }
        if(not_exist && UserP!=5)
        {
            System.out.println(banque.getUsers().get(UserP).toString());
            System.out.println("=============================================\n");
        }
        else
        {
            System.out.println("Client n'existe pas!");
        }

    }

    public void afficherCompte(Scanner clavier) {
        System.out.println("\n=============================================");
        System.out.println("Afficher Compte du Banque");
        System.out.println("ID     : ");
        int id =clavier.nextInt();
        boolean not_exist=true;
        int UserP=5;
        int CompteP=5;
        for (int i=0;i<banque.getUsers().size();i++) {
            if(banque.getUsers().get(i)!=null)
            {
                if ( banque.getUsers().get(i).getId()==id) {
                    not_exist=false;
                    UserP=i;
                }
            }

        }
        if(not_exist && UserP!=5)
        {
            for (int i=0;i<banque.getUsers().get(UserP).getComptes().size();i++) {
                if(banque.getUsers().get(UserP).getComptes().get(i)!=null)
                {
                    if ( banque.getUsers().get(UserP).getComptes().get(i).getIdCompte()==id) {
                        not_exist=false;
                        CompteP=i;
                    }
                }

            }
            if(not_exist && CompteP!=5)
            {
                System.out.println(banque.getUsers().get(UserP).getComptes().get(CompteP).toString());
                System.out.println("=============================================\n");
            }
            else
            {
                System.out.println("Compte n'existe pas!");
            }
        }
        else
        {
            System.out.println("Client n'existe pas!");
        }

    }

    public void afficherBanque() {
        System.out.println("\n=============================================");
        System.out.println("Afficher Banque");
        System.out.println(banque.toString());
        System.out.println("=============================================\n");
    }
    

}
