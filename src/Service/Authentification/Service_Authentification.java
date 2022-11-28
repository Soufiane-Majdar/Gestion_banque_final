package Service.Authentification;

import Model.Banque;

import java.util.Scanner;

import static View.Menu.*;

public class Service_Authentification implements I_Service_Authentification {
    public Service_Authentification(){}


    // public boolean login(){
    //     Scanner clavier = new Scanner(System.in);
    //     System.out.println("=============================================");
    //     System.out.println("    | Login | \n");

    //     System.out.print("Votre email : ");
    //     String email = clavier.next();

    //     System.out.print("Votre Password : ");
    //     String password = clavier.next();

    //     System.out.println("=============================================");

    //     boolean loged=false;
    //     for (int i=0 ; i<banque.getUsers().size() ; i++) {
    //             System.out.println(banque.getUsers().get(i).getPassword());
    //             System.out.println(banque.getUsers().get(i).getEmail());
    //             if (banque.getUsers().get(i).getPassword() == password && banque.getUsers().get(i).getEmail()==email) {
    //                 System.out.println("Login Success");

    //                 if(banque.getUsers().get(i).getRole()=="Client")
    //                     IHM_Client.menu_Client();

    //                 if(banque.getUsers().get(i).getRole()=="Admin")
    //                     IHM_Admin.menu_Admin();

    //                 loged = true;

    //         }
    //     }

    //     return loged;

    // }

    // login
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
        for (int i=0 ; i<banque.getUsers().size() ; i++) {
                System.out.println(banque.getUsers().get(i).getPassword());
                System.out.println(banque.getUsers().get(i).getEmail());
                System.out.println(email);
                System.out.println(password);
                if (banque.getUsers().get(i).getPassword().equals(password) && banque.getUsers().get(i).getEmail().equals(email)) {
                    System.out.println("Login Success");

                    if(banque.getUsers().get(i).getRole()=="Client")
                        IHM_Client.menu_Client();
                    else if(banque.getUsers().get(i).getRole()=="Admin")
                        IHM_Admin.menu_Admin();

                    loged = true;
                    return loged;

            }
        }

        return loged;

    }

}
