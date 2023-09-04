package Utlity;

import org.openqa.selenium.By;

import java.util.Scanner;

import static Utlity.BaseDriver.driver;

public class BillingAdress {
    public static void main(String[] args) {
//        System.out.println("merhaba dÃ¼nya"); // out ekrana yaz
//        // ln yazdÄ±ktan sonra bir alt satÄ±ra geÃ§ demek.
//
//        System.out.println("merhaba");
//        System.out.println(" DÃ¼nya");
//        System.out.println(" merhaba");

//        int sayi=5; // int yani tam sayÄ± saklayacak
//        String cumle="Bu gÃ¼n ek Ã§alÄ±ÅŸma"; // kelime veya cÃ¼mle saklayabilirim
//        // double, char, long, byte,short, float  10.5
//        double ortalama=30.5;
//
//        ortalama=sayi; // kÃ¼Ã§k bir alanÄ±, bÃ¼yÃ¼k alana atÄ±yorsun bir porblem olmaz
//        sayi=(int)ortalama; // bÃ¼yÃ¼k alanÄ± , kÃ¼Ã§Ã¼k alana atÄ±yordun dikkat veri kaybÄ± olabilir

        // kullanÄ±cÄ±dan veri nasÄ±l alÄ±nÄ±r
        Scanner FirstName = new Scanner(System.in); // okuyucu
        System.out.println("First Name=" + FirstName);
        String isim = FirstName.nextLine(); // ekrandan sayÄ± oku sayÄ± olarak ver


        Scanner LastName = new Scanner(System.in); // okuyucu
        System.out.println("Last Name=" + LastName);
        String soyad = LastName.nextLine(); // ekrandan sayÄ± oku sayÄ± olarak ver


        Scanner Email = new Scanner(System.in); // okuyucu
        System.out.println("Email=" + Email);
        String Mail = Email.nextLine(); // ekrandan sayÄ± oku sayÄ± olarak ver


        Scanner Company = new Scanner(System.in); // okuyucu
        System.out.println("Company=" + Company);
        String Firma = Company.nextLine(); // ekrandan sayÄ± oku sayÄ± olarak ver


        Scanner Country = new Scanner(System.in); // okuyucu
        System.out.println("Company=" + Company);
        driver.findElement(By.xpath("//*[@id='BillingNewAddress_CountryId']"));


        Scanner State = new Scanner(System.in); // okuyucu
        System.out.println("State/province=" + State);
        driver.findElement(By.xpath("//*[@id='BillingNewAddress_StateProvinceId']"));


        Scanner City = new Scanner(System.in); // okuyucu
        System.out.println("City=" + City);
        String Stadt = City.nextLine(); // ekrandan sayÄ± oku sayÄ± olarak ver


        Scanner Address1 = new Scanner(System.in); // okuyucu
        System.out.println("Address1=" + Address1);
        String Sokak = Address1.nextLine(); // ekrandan sayÄ± oku sayÄ± olarak ver


        Scanner Address2 = new Scanner(System.in); // okuyucu
        System.out.println("Address2=" + Address2);
        String Sokak2 = Address2.nextLine(); // ekrandan sayÄ± oku sayÄ± olarak ver


        Scanner ZipPostalCode = new Scanner(System.in); // okuyucu
        System.out.println("Zip/Postal Code=" + ZipPostalCode);
        int PLZ = ZipPostalCode.nextInt(); // ekrandan sayÄ± oku sayÄ± olarak ver


        Scanner Phonenumber = new Scanner(System.in); // okuyucu
        System.out.println("Phonenumber=" + Phonenumber);
        int Phone = Phonenumber.nextInt(); // ekrandan sayÄ± oku sayÄ± olarak ver


        Scanner Faxnumber = new Scanner(System.in); // okuyucu
        System.out.println("Faxnumber=" + Faxnumber);
        int Fax = Phonenumber.nextInt(); // ekrandan sayÄ± oku sayÄ± olarak ver

    }
}
