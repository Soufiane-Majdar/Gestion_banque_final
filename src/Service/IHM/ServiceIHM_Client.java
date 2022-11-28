package Service.IHM;

import Model.User;
import View.Menu;

import java.util.Scanner;

import static View.Menu.service_Client;

public class ServiceIHM_Client implements I_ServiceIHM_Client {

    public static User logedUser;

    public ServiceIHM_Client(){}

    public void menu_Client()
    {
        System.out.println("###### Menu Client ######");
        System.out.println("1- Afficher Compte Detaille");
        System.out.println("2- Verser");
        System.out.println("3- Retirer");
        System.out.println("4- Virement");
        System.out.println("5- Deconnexion");
        System.out.println("6- Quitter");

        // choix
        System.out.print("Votre choix : ");
        // scaner
        Scanner clavier = new Scanner(System.in);
        int choix = clavier.nextInt();

        switch (choix) {
            case 1:
                System.out.println("Afficher Compte Detaille");
                service_Client.afficherCompteDetaille();
                menu_Client();
                break;
            case 2:
                System.out.println("Verser");
                service_Client.verser();
                menu_Client();
                break;
            case 3:
                System.out.println("Retirer");
                service_Client.retirer();
                menu_Client();
                break;
            case 4:
                System.out.println("Virement");
                service_Client.virement();
                menu_Client();
                break;
            case 5:
                System.out.println("Deconnexion");
                logedUser = null;
                Menu.Afficher_Menu();
                break;
            case 6:
                System.out.println("Au revoir");
                break;
            default:
                System.out.println("Choix invalide");
                menu_Client();
                break;
        }

        

    }
}
