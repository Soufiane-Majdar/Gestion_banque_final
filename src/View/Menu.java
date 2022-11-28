package View;

import Model.Admin;
import Model.Banque;
import Service.Authentification.Service_Authentification;
import Service.IHM.ServiceIHM_Admin;
import Service.IHM.ServiceIHM_Client;

import java.util.Scanner;

public class Menu {
    public static Banque banque = new Banque(1,"Majdar_Agence","Majdar@agence.com");

    public static Service_Authentification Authentification = new Service_Authentification();
    public static ServiceIHM_Client IHM_Client= new ServiceIHM_Client();
    public static ServiceIHM_Admin IHM_Admin = new ServiceIHM_Admin();
    public static void Afficher_Menu(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("### Menu Generale ### \n");
        System.out.println("    0  : Quitter\n");
        System.out.println("|->  ::");
        System.out.println("    1  : Login");
        System.out.println("=============================================");
        System.out.print("Votre choix : ");
        int choix = clavier.nextInt();
        System.out.println("=============================================");
        switch (choix) {
            case 0:
                System.out.println("Au revoir !");
                break;
            case 1:
                if(!Authentification.login())
                {
                    System.out.println("Erreur");
                    //System.out.println(banque.getUsers().get(0).getEmail());
                    //System.out.println(banque.getUsers().get(0).getPassword());
                    Afficher_Menu();
                }
                break;
            default:
                System.out.println("Choix invalide");
                Afficher_Menu();
        }
    }

    public static void main(String[] args) {
        Afficher_Menu();
    }
}
