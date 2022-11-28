package Service.IHM;

import java.util.Scanner;
import static View.Menu.*;
public class ServiceIHM_Admin implements I_ServiceIHM_Admin {
    public ServiceIHM_Admin(){}

    public void menu_Admin()
    {
        System.out.println("###### Menu Admin ######");
        System.out.println("0- Quitter");
        System.out.println("1- Ajouter un client");
        System.out.println("2- Ajouter un compte");
        System.out.println("3- Supprimer un client");
        System.out.println("4- Supprimer un compte");
        System.out.println("5- Afficher les clients");
        System.out.println("6- Afficher les comptes");
        System.out.println("7- Modifier un client");
        System.out.println("8- Modifier un compte");
        System.out.println("9- afficher Banque");

        // choix
        System.out.print("Votre choix : ");
        // scaner
        Scanner clavier = new Scanner(System.in);
        int choix = clavier.nextInt();

        switch (choix) {
            case 0:
                System.out.println("Au revoir");
                break;
            case 1:
                System.out.println("Ajouter un client");
                service_Admin.creeEtAjouterClient(clavier);
                menu_Admin();
                break;
            case 2:
                System.out.println("Ajouter un compte");
                service_Admin.creeEtAjouterCompte(clavier);
                menu_Admin();
                break;
            case 3:
                System.out.println("Supprimer un client");
                service_Admin.supprimerClient(clavier);
                menu_Admin();
                break;
            case 4:
                System.out.println("Supprimer un compte");
                service_Admin.supprimerCompte(clavier);
                menu_Admin();
                break;
            case 5:
                System.out.println("Afficher les clients");
                service_Admin.afficherClient(clavier);
                menu_Admin();
                break;
            case 6:
                System.out.println("Afficher les comptes");
                service_Admin.afficherCompte(clavier);
                menu_Admin();
                break;
            case 7:
                System.out.println("Modifier un client");
                service_Admin.modifierClient(clavier);
                menu_Admin();
                break;
            case 8:
                System.out.println("Modifier un compte");
                service_Admin.modifierCompte(clavier);
                menu_Admin();
                break;
            case 9:
                System.out.println("afficher Banque");
                service_Admin.afficherBanque();
                menu_Admin();
                break;
            default:
                System.out.println("Choix invalide");
                break;
        }

        





        


    }
}
