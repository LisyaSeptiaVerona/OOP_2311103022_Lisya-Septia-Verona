/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_2311103022_lisya.septia.verona;

/**
 *
 * @author Lisya Septia Verona
 * 2311103022
 * S1SI07A
 */
public class MainApp {
    public static void main(String[] args) {
        Komputer komputer = new Komputer(20, "Warnet Gaming X", 5000);
        System.out.println("=====================================");
        System.out.println("        INFORMASI KOMPUTER");
        System.out.println("=====================================");
        komputer.informasi();
        System.out.println();

        KomputerVIP komputerVIP = new KomputerVIP(15, "Warnet Gaming X", 7000, true);
        System.out.println("=====================================");
        System.out.println("        INFORMASI KOMPUTER");
        System.out.println("=====================================");
        komputerVIP.informasi();
        komputerVIP.login("Lisya");
        komputerVIP.bermain(2);
        komputerVIP.bermain(2, 3);
        System.out.println("=====================================");
        System.out.println();

        KomputerPremium komputerPremium = new KomputerPremium(5, "Warnet Gaming X", 10000, true);
        System.out.println("=====================================");
        System.out.println("        INFORMASI KOMPUTER");
        System.out.println("=====================================");
        komputerPremium.informasi();
        komputerPremium.pesan(5);
        komputerPremium.tambahLayanan("Sate Ayam");
        komputerPremium.tambahLayanan("Sate Ayam", "Es Jeruk");
        System.out.println("=====================================");
        System.out.println();

        KomputerVIP komputerVIPNonMember = new KomputerVIP(15, "Warnet Gaming X", 7000, false);
        System.out.println("=====================================");
        System.out.println("        INFORMASI KOMPUTER");
        System.out.println("=====================================");
        komputerVIPNonMember.informasi();
        komputerVIPNonMember.login("Lisya");
        komputerVIPNonMember.bermain(2);
        komputerVIPNonMember.bermain(2, 3);
        System.out.println("=====================================");
        System.out.println();

        KomputerPremium komputerPremiumStandar = new KomputerPremium(5, "Warnet Gaming X", 10000, false);
        System.out.println("=====================================");
        System.out.println("        INFORMASI KOMPUTER");
        System.out.println("=====================================");
        komputerPremiumStandar.informasi();
        komputerPremiumStandar.pesan(5);
        komputerPremiumStandar.tambahLayanan("Sate Ayam");
        komputerPremiumStandar.tambahLayanan("Sate Ayam", "Es Jeruk");
        System.out.println("=====================================");
        System.out.println();
    }
}