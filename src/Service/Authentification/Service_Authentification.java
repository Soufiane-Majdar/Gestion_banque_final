package Service.Authentification;

import Model.Banque;

import java.util.Scanner;

import static View.Menu.IHM_Client;
import static View.Menu.banque;

public class Service_Authentification implements I_Service_Authentification {
    public Service_Authentification(){}


    public boolean login(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("    | Login | \n");

        System.out.print("Votre email : ");
        String email = clavier.next();

        System.out.print("Votre Password : ");
        String password = clavier.next();

        System.out.println("=============================================");

        boolean loged=false;
        for (int i=0 ; i<banque.getUsers().length ; i++) {
            if(banque.getUsers()[i]!=null) {
                if (banque.getUsers()[i].getPassword() == password && banque.getUsers()[i].getEmail().equals(email)) {
                    System.out.println("Login Success");

                    if(banque.getUsers()[i].getRole()=="Client")
                        IHM_Client.menu_Client();

                    loged = true;
                }
            }
        }

        return loged;

    }


}
