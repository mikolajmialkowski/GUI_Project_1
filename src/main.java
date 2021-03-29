import java.io.BufferedWriter;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class main {

    public static boolean menuExit=false;


    public static void main(String[] args) {

        ArrayList<Osiedle> listaOsiedli = new ArrayList();
        ArrayList<Osoba> listaOsob = new ArrayList<>();
        Czas czas = new Czas(listaOsiedli);
        czas.start();
        czas.zatrzymaj();

        Osoba osoba1= new Osoba("Alicja","Adamczyk",971252,"Aleja Kapucynow 39","25-01-1997");
        Osoba osoba2= new Osoba("Basia","Bartosiewicz",961241,"Aleja Kapucynow 28","14-02-1996");
        Osoba osoba3= new Osoba("Cezary","Ciesla",915219,"Ulica Olbrachta 4","08-08-1991");
        Osoba osoba4= new Osoba("Dausia","Dutkowska",921252,"Plac Bociana 24","05-04-1993");
        Osoba osoba5= new Osoba("Ernest","Elsztaj",861252,"Ulica Wiejska 1","30-12-1986");
        Osoba osoba6= new Osoba("Filip","Fabianski",851252,"Ulica Wiejska 14","30-12-1985");
        Osoba osoba7= new Osoba("Gloria","Gawlinska",971252,"Aleja Odrodzenia 7","11-12-1983");
        Osoba osoba8= new Osoba("Hania","Helczyk",991252,"Aleja Guji 17","28-04-1999");
        Osoba osoba9= new Osoba("Iga","Ibisz",741252,"Ulica Dluga 95","31-07-1974");
        Osoba osoba10= new Osoba("Jerzy","Jarlecki",6792552,"Ulica Kominiarzy 52","14-09-1967");
        Osoba osoba11= new Osoba("Kamil","Kaminski",5892312,"Plac Oswiecenia 2","31-11-1958");
        Osoba osoba12= new Osoba("Laura","Lenartowicz",9519532,"Plac Defild 1","01-08-1995");
        Osoba osoba13= new Osoba("Maja","Mialkiewicz",9819532,"Plac Defild 6","01-08-1998");
        Osoba osoba14= new Osoba("Nikola","Nagacz",9119532,"Aleja Stanow Zjednoczonych","10-03-1991");
        Osoba osoba15= new Osoba("Oktawian","Orzechowski",9319532,"Plac Bankowy 13","17-06-1993");
        Osoba osoba16= new Osoba("Piotr","Pachlecki",8919532,"Ulica Wiosny 66","01-08-1989");
        Osoba osoba17= new Osoba("Roman","Rabczak",8319532,"Plac Konstytucji 14","02-04-1983");
        Osoba osoba18= new Osoba("Sandra","Sobiecka",8519532,"Plac Unii Lubelskiej 79","21-08-1985");
        Osoba osoba19= new Osoba("Telimena","Tobczak",9219532,"Ulica Grenadierow 3","01-08-1992");
        Osoba osoba20= new Osoba("Ula","Udzik",6219532,"Ulica Krucza 4","24-05-1962");

        listaOsob.add(osoba1);
        listaOsob.add(osoba2);
        listaOsob.add(osoba3);
        listaOsob.add(osoba4);
        listaOsob.add(osoba5);
        listaOsob.add(osoba6);
        listaOsob.add(osoba7);
        listaOsob.add(osoba8);
        listaOsob.add(osoba9);
        listaOsob.add(osoba10);
        listaOsob.add(osoba11);
        listaOsob.add(osoba12);
        listaOsob.add(osoba13);
        listaOsob.add(osoba14);
        listaOsob.add(osoba15);
        listaOsob.add(osoba16);
        listaOsob.add(osoba17);
        listaOsob.add(osoba18);
        listaOsob.add(osoba19);
        listaOsob.add(osoba20);

        Osiedle osiedle1 = new Osiedle();
        Osiedle osiedle2 = new Osiedle();
        Osiedle osiedle3 = new Osiedle();

        listaOsiedli.add(osiedle1);
        listaOsiedli.add(osiedle2);
        listaOsiedli.add(osiedle3);

        Blok blok1 = new Blok(osiedle1);
        Blok blok2 = new Blok(osiedle1);
        Blok blok3 = new Blok(osiedle1);

        Blok blok4 = new Blok(osiedle2);
        Blok blok5 = new Blok(osiedle2);
        Blok blok6 = new Blok(osiedle2);

        Blok blok7 = new Blok(osiedle3);
        Blok blok8 = new Blok(osiedle3);

        Mieszkanie mieszkanie1 = new Mieszkanie(60,blok1);
        Mieszkanie mieszkanie2 = new Mieszkanie(75,blok1);
        Mieszkanie mieszkanie3 = new Mieszkanie(90,blok1);

        Mieszkanie mieszkanie4 = new Mieszkanie(70,blok2);
        Mieszkanie mieszkanie5 = new Mieszkanie(80,blok2);
        Mieszkanie mieszkanie6 = new Mieszkanie(100,blok2);

        Mieszkanie mieszkanie7 = new Mieszkanie(105,blok3);
        Mieszkanie mieszkanie8 = new Mieszkanie(125,blok3);
        Mieszkanie mieszkanie9 = new Mieszkanie(135,blok3);

        Mieszkanie mieszkanie10 = new Mieszkanie(105,blok4);
        Mieszkanie mieszkanie11 = new Mieszkanie(104,blok4);
        Mieszkanie mieszkanie12 = new Mieszkanie(101,blok4);
        Mieszkanie mieszkanie13 = new Mieszkanie(137,blok3);

        Mieszkanie mieszkanie14 = new Mieszkanie(140,blok5);
        Mieszkanie mieszkanie15 = new Mieszkanie(140,blok5);
        Mieszkanie mieszkanie16 = new Mieszkanie(140,blok5);
        Mieszkanie mieszkanie17 = new Mieszkanie(140,blok5);

        Mieszkanie mieszkanie18 = new Mieszkanie(40,blok6);
        Mieszkanie mieszkanie19 = new Mieszkanie(38,blok6);

        Mieszkanie mieszkanie20 = new Mieszkanie(290,blok7);
        Mieszkanie mieszkanie21 = new Mieszkanie(280,blok7);
        Mieszkanie mieszkanie22 = new Mieszkanie(350,blok7);

        Mieszkanie mieszkanie23 = new Mieszkanie(390,blok8);

        mieszkanie1.dodajMieszkanca(osoba1);
        mieszkanie1.dodajMieszkanca(osoba2);
        mieszkanie1.dodajMieszkanca(osoba20);
        mieszkanie1.dodajMieszkanca(osoba19);
        mieszkanie3.dodajMieszkanca(osoba2);
        mieszkanie3.dodajMieszkanca(osoba5);
        mieszkanie1.dodajMieszkanca(osoba5);
        mieszkanie4.dodajMieszkanca(osoba3);
        mieszkanie4.dodajMieszkanca(osoba10);
        mieszkanie5.dodajMieszkanca(osoba18);
        mieszkanie6.dodajMieszkanca(osoba4);
        mieszkanie6.dodajMieszkanca(osoba1);
        mieszkanie7.dodajMieszkanca(osoba5);
        mieszkanie9.dodajMieszkanca(osoba6);
        mieszkanie12.dodajMieszkanca(osoba7);
        mieszkanie11.dodajMieszkanca(osoba7);
        mieszkanie11.dodajMieszkanca(osoba4);
        mieszkanie11.dodajMieszkanca(osoba16);
        mieszkanie14.dodajMieszkanca(osoba8);
        mieszkanie14.dodajMieszkanca(osoba9);
        mieszkanie15.dodajMieszkanca(osoba9);
        mieszkanie15.dodajMieszkanca(osoba20);
        mieszkanie16.dodajMieszkanca(osoba10);
        mieszkanie16.dodajMieszkanca(osoba3);
        mieszkanie18.dodajMieszkanca(osoba11);
        mieszkanie14.dodajMieszkanca(osoba11);
        mieszkanie18.dodajMieszkanca(osoba14);
        mieszkanie19.dodajMieszkanca(osoba12);
        mieszkanie20.dodajMieszkanca(osoba13);
        mieszkanie20.dodajMieszkanca(osoba15);
        mieszkanie22.dodajMieszkanca(osoba14);
        mieszkanie23.dodajMieszkanca(osoba15);
        mieszkanie23.dodajMieszkanca(osoba2);
        mieszkanie23.dodajMieszkanca(osoba14);
        mieszkanie23.dodajMieszkanca(osoba13);
        mieszkanie23.dodajMieszkanca(osoba1);
        mieszkanie11.dodajMieszkanca(osoba1);
        mieszkanie17.dodajMieszkanca(osoba1);
        mieszkanie2.dodajMieszkanca(osoba7);

        MiejsceParkingowe miejsceParkingowe1 = new MiejsceParkingowe(10,10,3,blok1);
        MiejsceParkingowe miejsceParkingowe2 = new MiejsceParkingowe(8,8,3,blok1);
        MiejsceParkingowe miejsceParkingowe3 = new MiejsceParkingowe(12,5,3,blok1);
        MiejsceParkingowe miejsceParkingowe4 = new MiejsceParkingowe(12,5,3,blok1);

        MiejsceParkingowe miejsceParkingowe5 = new MiejsceParkingowe(150,blok2);
        MiejsceParkingowe miejsceParkingowe6 = new MiejsceParkingowe(150,blok2);
        MiejsceParkingowe miejsceParkingowe7 = new MiejsceParkingowe(150,blok2);

        MiejsceParkingowe miejsceParkingowe8 = new MiejsceParkingowe(100,blok3);
        MiejsceParkingowe miejsceParkingowe9 = new MiejsceParkingowe(110,blok3);
        MiejsceParkingowe miejsceParkingowe10 = new MiejsceParkingowe(90,blok3);

        MiejsceParkingowe miejsceParkingowe11 = new MiejsceParkingowe(200,blok5);
        MiejsceParkingowe miejsceParkingowe12 = new MiejsceParkingowe(225,blok5);

        MiejsceParkingowe miejsceParkingowe13 = new MiejsceParkingowe(170,blok6);
        MiejsceParkingowe miejsceParkingowe14 = new MiejsceParkingowe(160,blok7);
        MiejsceParkingowe miejsceParkingowe15 = new MiejsceParkingowe(165,blok8);

        miejsceParkingowe1.dodajMieszkanca(osoba1);
        miejsceParkingowe1.dodajMieszkanca(osoba3);
        miejsceParkingowe2.dodajMieszkanca(osoba4);
        miejsceParkingowe3.dodajMieszkanca(osoba2);
        miejsceParkingowe4.dodajMieszkanca(osoba3);
        miejsceParkingowe5.dodajMieszkanca(osoba4);
        miejsceParkingowe6.dodajMieszkanca(osoba5);
        miejsceParkingowe7.dodajMieszkanca(osoba1);
        miejsceParkingowe8.dodajMieszkanca(osoba3);
        miejsceParkingowe11.dodajMieszkanca(osoba9);
        miejsceParkingowe12.dodajMieszkanca(osoba9);
        miejsceParkingowe13.dodajMieszkanca(osoba12);
        miejsceParkingowe15.dodajMieszkanca(osoba15);

        Przemiot przemiot1 = new Przemiot("Telewizor Sony",2,1,2);
        Przemiot przemiot2 = new Przemiot("Szafka",2,4,2);
        Przemiot przemiot3 = new Przemiot("Telefon",1,1,1);
        Przemiot przemiot4 = new Przemiot("Pralka",2,2,2);
        Przemiot przemiot5 = new Przemiot("Lodowka",3,1,3);
        Przemiot przemiot6 = new Przemiot("Lampka nocna",1);
        Przemiot przemiot7 = new Przemiot("Kaloryfer",5);
        Przemiot przemiot8 = new Przemiot("Odkurzacz",3);
        Przemiot przemiot9 = new Przemiot("Komputer",2);
        Przemiot przemiot10 = new Przemiot("Zmywarka",5);
        Przemiot przemiot11 = new Przemiot("Dzbanek",1);
        Przemiot przemiot12 = new Przemiot("Czajnik",2);
        Przemiot przemiot13 = new Przemiot("Bieznia",25);
        Przemiot przemiot14 = new Przemiot("Obraz",6);
        Przemiot przemiot15 = new Przemiot("Wanna",45);
        Przemiot przemiot16 = new Przemiot("Piekarnik",3);
        Przemiot przemiot17 = new Przemiot("Szuszarka",2);
        Przemiot przemiot18 = new Przemiot("Doniczka",8);
        Przemiot przemiot19 = new Przemiot("Stol",15);
        Przemiot przemiot20 = new Przemiot("Pianino",50);

        SamochodMiejski BMW = new SamochodMiejski("BMW",30,true);
        SamochodMiejski Opel = new SamochodMiejski("Opel",35,false);
        SamochodMiejski Toyota = new SamochodMiejski("Toyota",30,true);
        SamochodTerenowy JEPP = new SamochodTerenowy("JEPP",60,15);
        SamochodTerenowy RangeRover = new SamochodTerenowy("Range Rover",60,15);
        Motocykl motocyklHonda = new Motocykl("Honda",5,50);
        Lodz Kayak = new Lodz("Kayak",15,1);
        Lodz Yacht = new Lodz("Yacht", 95,10);
        Amfibia Amfibia = new Amfibia("Amfibia",99,90);

        try {
            mieszkanie1.dodajPrzedmiot(przemiot1);
            mieszkanie3.dodajPrzedmiot(przemiot2);
            mieszkanie5.dodajPrzedmiot(przemiot3);
            mieszkanie6.dodajPrzedmiot(przemiot4);
            mieszkanie7.dodajPrzedmiot(przemiot5);
            mieszkanie11.dodajPrzedmiot(przemiot6);
            mieszkanie12.dodajPrzedmiot(przemiot7);
            mieszkanie23.dodajPrzedmiot(przemiot8);
            mieszkanie16.dodajPrzedmiot(przemiot9);
            mieszkanie17.dodajPrzedmiot(przemiot10);
            mieszkanie18.dodajPrzedmiot(przemiot11);
            mieszkanie19.dodajPrzedmiot(przemiot12);
            mieszkanie20.dodajPrzedmiot(przemiot13);
            mieszkanie22.dodajPrzedmiot(przemiot14);
            mieszkanie23.dodajPrzedmiot(przemiot15);
            mieszkanie23.dodajPrzedmiot(przemiot16);

            miejsceParkingowe1.dodajPrzedmiot(przemiot17);
            miejsceParkingowe5.dodajPrzedmiot(przemiot18);
            miejsceParkingowe11.dodajPrzedmiot(przemiot19);
            miejsceParkingowe15.dodajPrzedmiot(przemiot20);

            miejsceParkingowe1.dodajPojazd(BMW);
            miejsceParkingowe1.dodajPojazd(Opel);
            miejsceParkingowe2.dodajPojazd(Toyota);
            miejsceParkingowe3.dodajPojazd(JEPP);
            miejsceParkingowe4.dodajPojazd(RangeRover);
            miejsceParkingowe6.dodajPojazd(motocyklHonda);
            miejsceParkingowe7.dodajPojazd(Kayak);
            miejsceParkingowe11.dodajPojazd(Yacht);
            miejsceParkingowe15.dodajPojazd(Amfibia);
        } catch (TooManyThingsException e) {
            e.printStackTrace();
        }


        Scanner scanner = new Scanner(System.in);
        int menu;

        while (!menuExit){
            System.out.println("\nMENU GLOWNE:");
            System.out.println("WYBIERZ [0], aby zapisac obecny stan Osiedli do pliku");
            System.out.println("WYBIERZ [1], aby wyjsc");
            System.out.println("WYBIERZ [2], aby wyswietlic liste Osiedli");
            System.out.println("WYBIERZ [3], aby wyswietlic liste Blokow");
            System.out.println("WYBIERZ [4], aby wyswietlic liste Pomieszczen");
            System.out.println("WYBIERZ [5], aby wyswietlic liste wolnych Pomieszczen");
            System.out.println("WYBIERZ [6], aby wyswietlic liste Mieszkancow");
            System.out.println("WYBIERZ [7], aby wyswietlic liste Wlascicieli Pomiesczen");
            System.out.println("WYBIERZ [8], aby wyswietlic liste Przedmiotow");
            System.out.println("WYBIERZ [9], aby wyswietlic liste Pojazdow");
            System.out.println("WYBIERZ [10], aby wyswietlic informacje o podanej osobie, jej Pomiesczczeniach i Przedmiotach");
            System.out.println("WYBIERZ [11], aby utworzyć nowa Osobe");
            System.out.println("WYBIERZ [12], aby dodac Osobe do Pomieszczenia");
            System.out.println("WYBIERZ [13], aby usunac Osobe z Pomieszczenia");
            System.out.println("WYBIERZ [14], aby dodac Przedmiot lub Pojazd do Pomieszczenia");
            System.out.println("WYBIERZ [15], aby usunac Przedmiot lub Pojazd z Pomieszczenia");
            System.out.println("WYBIERZ [16], aby zarzadzac obecnymi Umowami");
            System.out.println("WYBIERZ [17], aby wlaczyc uplyw czasu");
            System.out.println("WYBIERZ [18], aby zatrzymac uplyw czasu");

            menu=scanner.nextInt();

            switch (menu){
                case 0:{
                    zapisDoPliku(listaOsiedli, listaOsob);
                }break;

                case 1: { // WYJSCIE
                    menuExit = true;
                }break;
                case 2: { // LISTA OSIEDLI
                    System.out.println("\n**********************************LISTA OSIEDLI**********************************\n");

                    for (int i = 0; i < listaOsiedli.size(); i++) {
                        System.out.println((i + 1) + ") " + "ID OSIEDLA: " + listaOsiedli.get(i).numerID);
                    }
                }break;
                case 3: { // LISTA BLOKOW
                    System.out.println("\n*********************************LISTA BUDYNKOW**********************************\n");
                    for (int i = 0; i < listaOsiedli.size(); i++) {
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("Osiedle: " + (i + 1));
                        System.out.println("---------------------------------------------------------------------------------");
                        for (int j = 0; j < listaOsiedli.get(i).listaBlokow.size(); j++) {
                            System.out.println((j + 1) + ") " + "ID BLOKU: " + listaOsiedli.get(i).listaBlokow.get(j).numerID);
                        }
                    }
                }break;
                case 4: { // LISTA POMIESZCZEN
                    System.out.println("\n********************************LISTA POMIESZCZEN********************************\n");
                    for (int i = 0; i < listaOsiedli.size(); i++) {
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("Osiedle: " + (i + 1));
                        System.out.println("---------------------------------------------------------------------------------");
                        for (int j = 0; j < listaOsiedli.get(i).listaBlokow.size(); j++) {
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("Blok: " + listaOsiedli.get(i).listaBlokow.get(j).numerID);
                            System.out.println("---------------------------------------------------------------------------------");
                            for (int k = 0; k < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size(); k++) {
                                System.out.println((k + 1) + ") " + "ID POMIESZCZENIA: " + listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID);
                            }
                        }
                    }
                }break;

                case 5: { // LISTA WOLNYCH POMIESZCZEN
                    System.out.println("\n****************************LISTA WOLNYCH POMIESZCZEN****************************\n");
                    for (int i = 0; i < listaOsiedli.size(); i++) {
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("Osiedle: " + (i + 1));
                        System.out.println("---------------------------------------------------------------------------------");
                        for (int j = 0; j < listaOsiedli.get(i).listaBlokow.size(); j++) {
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("Blok: " + listaOsiedli.get(i).listaBlokow.get(j).numerID);
                            System.out.println("---------------------------------------------------------------------------------");
                            int licznik = 0;
                            for (int k = 0; k < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size(); k++) {
                                if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).wlasciciel == null) {
                                    System.out.println((licznik + 1) + ") " + "ID WOLNEGO POMIESZCZENIA: " + listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID);
                                    licznik++;
                                }
                            }
                            if (licznik == 0)
                                System.out.println("W tym bloku nie ma wolnych pomieszczen");
                        }
                    }
                }break;

                case 6: { // LISTA MIESZKANCOW
                    System.out.println("\n********************************LISTA MIESZKANCOW********************************\n");
                    for (int i = 0; i < listaOsiedli.size(); i++) {
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("Osiedle: " + (i + 1));
                        System.out.println("---------------------------------------------------------------------------------");
                        for (int j = 0; j < listaOsiedli.get(i).listaBlokow.size(); j++) {
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("Blok: " + listaOsiedli.get(i).listaBlokow.get(j).numerID);
                            System.out.println("---------------------------------------------------------------------------------");
                            for (int k = 0; k < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size(); k++) {
                                System.out.println("Pomieszczenie: " + listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID);
                                if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).listaOsob.size() > 0) {
                                    for (int l = 0; l < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).listaOsob.size(); l++) {
                                        System.out.println((l + 1) + ") " + "Osoba: \n" + listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).listaOsob.get(l)+"\n");
                                    }
                                } else
                                    System.out.println("To pomieszczenie nie ma mieszkancow");
                            }
                        }
                    }
                }break;

                case 7: { // LISTA WLASCICCIELI POMIESZCZEN
                    System.out.println("\n**************************LISTA WLASCICIELI POMIESZCZEN**************************\n");
                    for (int i = 0; i < listaOsiedli.size(); i++) {
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("Osiedle: " + (i + 1));
                        System.out.println("---------------------------------------------------------------------------------");
                        for (int j = 0; j < listaOsiedli.get(i).listaBlokow.size(); j++) {
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("Blok: " + listaOsiedli.get(i).listaBlokow.get(j).numerID);
                            System.out.println("---------------------------------------------------------------------------------");
                            for (int k = 0; k < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size(); k++) {
                                if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).wlasciciel != null)
                                    System.out.println("Pomieszczenie: " + listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID + "\nWlascicielem jest: " + listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).wlasciciel+"\n");
                                else
                                    System.out.println("Pomieszczenie: " + listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID + " nie ma jescze wlasciciela\n");
                            }
                        }
                    }
                }break;

                case 8:{ // LISTA PRZEDMIOTOW
                    System.out.println("\n********************************LISTA PRZEDMIOTOW********************************\n");
                    for (int i = 0; i < listaOsiedli.size() ; i++) {
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("Osiedle: "+(i+1));
                        System.out.println("---------------------------------------------------------------------------------");
                        for (int j = 0; j <listaOsiedli.get(i).listaBlokow.size() ; j++) {
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("Blok: "+ listaOsiedli.get(i).listaBlokow.get(j).numerID);
                            System.out.println("---------------------------------------------------------------------------------");
                            for (int k = 0; k <listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size() ; k++) {
                                int licznik=0;
                                System.out.println("\nPomieszczenie: "+ listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID);
                                Mieszkanie mieszkanieTMP;
                                MiejsceParkingowe miejsceParkingoweTMP;
                                if(listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==Mieszkanie.class) {
                                    mieszkanieTMP = (Mieszkanie) listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k);
                                    if (mieszkanieTMP.listPrzedmiotow.size()>0) {
                                        for (int l = 0; l < mieszkanieTMP.listPrzedmiotow.size() ; l++) {
                                            licznik++;
                                            System.out.println(licznik+") "+ mieszkanieTMP.listPrzedmiotow.get(l));
                                        }
                                    }

                                }
                                if(listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==MiejsceParkingowe.class) {
                                    miejsceParkingoweTMP = (MiejsceParkingowe) listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k);
                                    if (miejsceParkingoweTMP.listaPojazdPrzedmiot.size()>0) {
                                        for (int l = 0; l < miejsceParkingoweTMP.listaPojazdPrzedmiot.size() ; l++) {
                                            if(miejsceParkingoweTMP.listaPojazdPrzedmiot.get(l).getClass()==Przemiot.class) {
                                                licznik++;
                                                System.out.println(licznik + ") " + miejsceParkingoweTMP.listaPojazdPrzedmiot.get(l));
                                            }
                                        }
                                    }
                                }
                                if (licznik==0)
                                    System.out.println("W pomieszczeniu nie ma zadnych przedmiotow\n");

                            }
                        }
                    }
                }break;

                case 9: { // LISTA POJAZDOW
                    System.out.println("\n*********************************LISTA POJAZDOW**********************************\n");
                    for (int i = 0; i < listaOsiedli.size(); i++) {
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("Osiedle: " + (i + 1));
                        System.out.println("---------------------------------------------------------------------------------");
                        for (int j = 0; j < listaOsiedli.get(i).listaBlokow.size(); j++) {
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("Blok: " + listaOsiedli.get(i).listaBlokow.get(j).numerID);
                            System.out.println("---------------------------------------------------------------------------------");
                            for (int k = 0; k < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size(); k++) {
                                int licznik = 0;
                                System.out.println("\nPomieszczenie: " + listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID);
                                MiejsceParkingowe miejsceParkingoweTMP;
                                if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass() == MiejsceParkingowe.class) {
                                    miejsceParkingoweTMP = (MiejsceParkingowe) listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k);
                                    if (miejsceParkingoweTMP.listaPojazdPrzedmiot.size() > 0) {
                                        for (int l = 0; l < miejsceParkingoweTMP.listaPojazdPrzedmiot.size(); l++) {
                                            if (miejsceParkingoweTMP.listaPojazdPrzedmiot.get(l).getClass().getSuperclass() == Pojazd.class) {
                                                licznik++;
                                                System.out.println(licznik + ") " + miejsceParkingoweTMP.listaPojazdPrzedmiot.get(l));
                                            }
                                        }
                                    }
                                }
                                if (licznik == 0)
                                    System.out.println("w pomieszczeniu nie ma zadnych pojazdow\n");

                            }
                        }
                    }
                }break;

                case 10: { // INFORMACJE o Osobie
                    System.out.println("\n*******************************INFORMACJE O OSOBIE*******************************\n");
                    int menuCase10;
                    boolean znalezionoOsobe = false;
                    int wewnetrznyIterator = 0;
                    Osoba osobaTMP = null;
                    ArrayList<Mieszkanie> listaTMPMieszkan= new ArrayList<>();
                    ArrayList<MiejsceParkingowe> listaTMPParking= new ArrayList<>();
                    System.out.println("Podaj ID Osoby: ");
                    menuCase10 = scanner.nextInt();

                    for (Osoba osoba:listaOsob) {
                        if (osoba.osobaID==menuCase10){
                            osobaTMP=osoba;
                            znalezionoOsobe=true;
                            System.out.println("Wybrano osobe: " + osobaTMP);
                        }
                    }


                    if ((osobaTMP!=null)&&(znalezionoOsobe)&&(osobaTMP.iloscPosiadanychPomieszczen > 0)) {

                        System.out.println("\nWybrana Osoba posiada Pomieszczenia o nastepujacych ID: ");
                        for (int i = 0; i < listaOsiedli.size(); i++) {
                            for (int j = 0; j < listaOsiedli.get(i).listaBlokow.size(); j++) {
                                for (int k = 0; k < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size(); k++) {
                                    if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).wlasciciel == osobaTMP) {
                                        if(listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==Mieszkanie.class)
                                            listaTMPMieszkan.add((Mieszkanie) listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k));
                                        if(listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==MiejsceParkingowe.class)
                                            listaTMPParking.add((MiejsceParkingowe) listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k));
                                        System.out.println(wewnetrznyIterator + 1 + ") " + listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID);
                                        wewnetrznyIterator++;
                                    }
                                }
                            }
                        }
                    } else if (znalezionoOsobe)
                        System.out.println("Osoba nie jest wlascicielem zadnego Pomieszczenia");
                    else
                        System.out.println("Nie znaleziono Osoby o podanym ID");

                    wewnetrznyIterator=0;

                   if ((listaTMPMieszkan.size()>0)|(listaTMPParking.size()>0))
                       System.out.println("\nW powyzszych pomiesczeniach znadjuja sie: ");
                   if (listaTMPMieszkan.size()>0){
                       for (Mieszkanie mieszkanieTMP10:listaTMPMieszkan) {
                           for (Przemiot przemiot:mieszkanieTMP10.listPrzedmiotow) {
                               wewnetrznyIterator++;
                               System.out.println(wewnetrznyIterator+") "+przemiot);
                           }
                       }
                   }
                   if (listaTMPParking.size()>0){
                       for (MiejsceParkingowe miejsceParkingoweTMP10:listaTMPParking) {
                           for (PojazdPrzedmiot pojazdPrzedmiot:miejsceParkingoweTMP10.listaPojazdPrzedmiot) {
                               wewnetrznyIterator++;
                               System.out.println(wewnetrznyIterator+") "+pojazdPrzedmiot);
                           }
                       }
                   }


                }break;

                case 11:{ // DODAJ NOWA OSOBE
                    System.out.println("\n********************************DODAJ NOWA OSOBE*********************************\n");
                    String imie;
                    String nazwisko;
                    int pesel;
                    String adres;
                    String dataUrodzin;

                    System.out.println("Podaj Imie nowej osoby:");
                    imie=scanner.next();
                    System.out.println("Podaj Nazwisko nowej osoby:");
                    nazwisko=scanner.next();
                    System.out.println("Podaj numer PESEL nowej osoby:");
                    pesel=scanner.nextInt();
                    System.out.println("Podaj Adres nowej osoby:");
                    adres=scanner.next();
                    System.out.println("Podaj Date Narodzin nowej osoby: (m-d-r)");
                    dataUrodzin=scanner.next();

                    Osoba tmp = new Osoba(imie,nazwisko,pesel,adres,dataUrodzin);
                    listaOsob.add(tmp);
                    System.out.println("Dodano nowa osobe, jej ID to :"+ tmp.osobaID);

                }break;

                case 12: { // DODAJ OSOBE DO POMIESZCZENIA
                    System.out.println("\n**************************DODAJ OSOBE DO POMIESZCZENIA***************************\n");
                    int menuCase12;
                    boolean tylkoRaz = true;
                    boolean znalezionoOsobe = false;
                    Osoba osobaTMP = null;
                    Mieszkanie mieszkanieTMP=null;
                    MiejsceParkingowe miejsceParkingoweTMP=null;
                    System.out.println("Podaj ID osoby: ");
                    menuCase12 = scanner.nextInt();

                    for (Osoba osoba:listaOsob) {
                        if (osoba.osobaID==menuCase12){
                            osobaTMP=osoba;
                            znalezionoOsobe=true;
                            System.out.println("Wybrano osobe: " + osobaTMP);
                        }
                    }

                    if (znalezionoOsobe){
                        System.out.println("Podaj ID Pomieszczenia do ktorego chcesz dodac Osobe:");
                        menuCase12=scanner.nextInt();
                        for (int i = 0; i < listaOsiedli.size(); i++) {
                            for (int j = 0; j <listaOsiedli.get(i).listaBlokow.size() ; j++) {
                                for (int k = 0; k < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size(); k++) {
                                    if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID==menuCase12){
                                        if(listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==Mieszkanie.class){
                                           mieszkanieTMP= (Mieszkanie)listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k);
                                           mieszkanieTMP.dodajMieszkanca(osobaTMP);
                                        }
                                        else if(listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==MiejsceParkingowe.class){
                                            miejsceParkingoweTMP= (MiejsceParkingowe)listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k);
                                            miejsceParkingoweTMP.dodajMieszkanca(osobaTMP);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else {
                        System.out.println("Nie znaleziono Osoby o podanym ID");
                    }
                }break;


                case 13:{ // USUN OSOBE Z POMIESZCZENIA

                    int menuCase13;
                    boolean tylkoRaz = true;
                    boolean znalezionoOsobe = false;
                    boolean usunieto=false;
                    Osoba osobaTMP = null;
                    Mieszkanie mieszkanieTMP=null;
                    MiejsceParkingowe miejsceParkingoweTMP=null;
                    System.out.println("Podaj ID osoby: ");
                    menuCase13 = scanner.nextInt();

                    for (int i = 0; i < listaOsiedli.size(); i++) {
                        for (int j = 0; j < listaOsiedli.get(i).listaBlokow.size(); j++) {
                            for (int k = 0; k < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size(); k++) {
                                if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).wlasciciel != null) {
                                    for (int l = 0; l < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).listaOsob.size(); l++) {
                                        if ((listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).listaOsob.get(l).osobaID == menuCase13) & (tylkoRaz)) {
                                            osobaTMP = listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).listaOsob.get(l);
                                            System.out.println("Wybrano osobe: " + osobaTMP);
                                            znalezionoOsobe = true;
                                            tylkoRaz = false;

                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (znalezionoOsobe){
                        System.out.println("Podaj ID Pomieszczenia z ktorego chcesz usunac podana Osobe:");
                        menuCase13=scanner.nextInt();
                        for (int i = 0; i < listaOsiedli.size(); i++) {
                            for (int j = 0; j <listaOsiedli.get(i).listaBlokow.size() ; j++) {
                                for (int k = 0; k < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size(); k++) {
                                    if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID==menuCase13){
                                        if(listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==Mieszkanie.class){
                                            mieszkanieTMP= (Mieszkanie)listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k);
                                            mieszkanieTMP.usunMieszkanca(osobaTMP);
                                            usunieto=true;
                                        }
                                        else if(listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==MiejsceParkingowe.class){
                                            miejsceParkingoweTMP= (MiejsceParkingowe)listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k);
                                            miejsceParkingoweTMP.usunMieszkanca(osobaTMP);
                                            usunieto=true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else {
                        System.err.println("Nie znaleziono Osoby o podanym ID");
                    }
                    if (!usunieto){
                        System.err.println("Nie usunieto Osoby : nie znaleziono Pomieszczenia o podanym ID");
                    }

                   // System.out.println("usunieto Osobe : " + osobaTMP.imie + " " + osobaTMP.nazwisko + " o ID:" + osobaTMP.osobaID + " z Pomiesczenia o ID: " + menuCase13);



                }break;

                case 14:{ // TWORZENIE PRZEDMIOTU I DODAWANIE
                    System.out.println("\n****************STWORZ NOWY PRZEDMIOT I DODAJ GO DO POMIESZCZENIA****************\n");
                    int objetosc;
                    int dlugosc;
                    int szerokosc;
                    int wysokosc;
                    int menuCase14;
                    int menuCase14Wewnetrzny;
                    int idPomieszczenia;
                    int pojemnoscSilnika;
                    String nazwa;
                    boolean znalezionoPomiesczcenie = false;
                    Mieszkanie mieszkanieTMP14=null;
                    MiejsceParkingowe miejsceParkingoweTMP14=null;
                    System.out.println("Wybierz [1], aby utworzyc Przedmiot");
                    System.out.println("Wybierz [2], aby utworzyc Pojazd");
                    menuCase14=scanner.nextInt();

                    switch (menuCase14){
                        case 1: {// tworzenie Przedmiotu
                            System.out.println("Wybierz [1], aby podac obejtosc nowego Przedmiotu");
                            System.out.println("Wybierz [2], aby podac 3-WYMIARY nowego Przedmiotu");
                            menuCase14Wewnetrzny=scanner.nextInt();
                            switch (menuCase14Wewnetrzny){
                                case 1:{
                                    System.out.println("Podaj objetosc nowego Przedmiotu: ]");
                                    objetosc=scanner.nextInt();
                                    System.out.println("Podaj nazwe nowego Przedmiotu: ");
                                    nazwa=scanner.next();
                                    System.out.println("Podaj ID, pomieszczenia do ktorego chcesz dodac utworzony Przedmiot:");
                                    idPomieszczenia = scanner.nextInt();

                                    for (int i = 0; i < listaOsiedli.size() ; i++) {
                                        for (int j = 0; j < listaOsiedli.get(i).listaBlokow.size() ; j++) {
                                            for (int k = 0; k < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size() ; k++) {
                                                if(listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID==idPomieszczenia){
                                                    if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==Mieszkanie.class) {
                                                        mieszkanieTMP14 = (Mieszkanie) listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k);
                                                        znalezionoPomiesczcenie=true;
                                                    }
                                                    if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==MiejsceParkingowe.class) {
                                                        miejsceParkingoweTMP14 = (MiejsceParkingowe) listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k);
                                                        znalezionoPomiesczcenie=true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (znalezionoPomiesczcenie){
                                        Przemiot dodawanyPrzedmiot = new Przemiot(nazwa,objetosc);


                                        if(mieszkanieTMP14!=null){
                                            try {
                                                mieszkanieTMP14.dodajPrzedmiot(dodawanyPrzedmiot);
                                                System.out.println("Znaleziono Pomieszczenie o podanym ID i pomyslnie dodano do niego nowy przedmiot, ID nowego przedmiotu to: "+ dodawanyPrzedmiot.PojazdPrzedmiotID);
                                            } catch (TooManyThingsException e) {
                                                e.printStackTrace();
                                            }
                                            break;
                                        }

                                        if(miejsceParkingoweTMP14!=null){
                                            try {
                                                miejsceParkingoweTMP14.dodajPrzedmiot(dodawanyPrzedmiot);
                                                System.out.println("Znaleziono Pomieszczenie o podanym ID i pomyslnie dodano do niego nowy przedmiot, ID nowego przedmiotu to: "+ dodawanyPrzedmiot.PojazdPrzedmiotID);
                                            } catch (TooManyThingsException e) {
                                                e.printStackTrace();
                                            }
                                            break;
                                        }
                                    }


                                }break;
                                case 2:{
                                    System.out.println("Podaj dlugosc nowego Przedmiotu: ");
                                    dlugosc=scanner.nextInt();
                                    System.out.println("Podaj szerokosc nowego Przedmiotu: ");
                                    szerokosc=scanner.nextInt();
                                    System.out.println("Podaj wysokosc nowego Przedmiotu: ");
                                    wysokosc=scanner.nextInt();
                                    objetosc=dlugosc*szerokosc*wysokosc;
                                    System.out.println("Podaj nazwe nowego Przedmiotu: ");
                                    nazwa=scanner.next();
                                    System.out.println("Podaj ID, pomieszczenia do ktorego chcesz dodac utworzony Przedmiot:");
                                    idPomieszczenia = scanner.nextInt();

                                    for (int i = 0; i < listaOsiedli.size() ; i++) {
                                        for (int j = 0; j < listaOsiedli.get(i).listaBlokow.size() ; j++) {
                                            for (int k = 0; k < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size() ; k++) {
                                                if(listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID==idPomieszczenia){
                                                    if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==Mieszkanie.class) {
                                                        mieszkanieTMP14 = (Mieszkanie) listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k);
                                                        znalezionoPomiesczcenie=true;
                                                    }
                                                    if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==MiejsceParkingowe.class) {
                                                        miejsceParkingoweTMP14 = (MiejsceParkingowe) listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k);
                                                        znalezionoPomiesczcenie=true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (znalezionoPomiesczcenie){
                                        Przemiot dodawanyPrzedmiot = new Przemiot(nazwa,objetosc);


                                        if(mieszkanieTMP14!=null){
                                            try {
                                                mieszkanieTMP14.dodajPrzedmiot(dodawanyPrzedmiot);
                                                System.out.println("Znaleziono Pomieszczenie o podanym ID i pomyslnie dodano do niego nowy przedmiot, ID nowego przedmiotu to: "+ dodawanyPrzedmiot.PojazdPrzedmiotID);
                                            } catch (TooManyThingsException e) {
                                                e.printStackTrace();
                                            }

                                        }

                                        if(miejsceParkingoweTMP14!=null){
                                            try {
                                                miejsceParkingoweTMP14.dodajPrzedmiot(dodawanyPrzedmiot);
                                                System.out.println("Znaleziono Pomieszczenie o podanym ID i pomyslnie dodano do niego nowy przedmiot, ID nowego przedmiotu to: "+ dodawanyPrzedmiot.PojazdPrzedmiotID);
                                            } catch (TooManyThingsException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    }

                                }break;

                                default:{
                                    System.err.println("Nie wybrano sposobu tworzenia Przedmiotu : wrocono do MENU GLOWNEGO");
                                }
                            }// KONIEC PRZEDMIOTU

                        }break;


                        case 2:{ // tworzenie Pojazdu
                            System.out.println("Wybierz [1], aby podac obejtosc Pojazdu");
                            System.out.println("Wybierz [2], aby podac 3-WYMIARY Pojazdu");
                            menuCase14Wewnetrzny=scanner.nextInt();


                            switch (menuCase14Wewnetrzny){
                                case 1: {
                                    System.out.println("Podaj objetosc nowego Pojazdu: ");
                                    objetosc = scanner.nextInt();
                                    System.out.println("Podaj nazwe nowego Pojazdu: ");
                                    nazwa = scanner.next();
                                    System.out.println("Podaj pojemnosc silnika nowego Pojazdu: ");
                                    pojemnoscSilnika = scanner.nextInt();
                                    System.out.println("Podaj ID, Pomieszczenia do ktorego chcesz dodac utworzony Pojazd:");
                                    idPomieszczenia = scanner.nextInt();

                                    for (int i = 0; i < listaOsiedli.size(); i++) {
                                        for (int j = 0; j < listaOsiedli.get(i).listaBlokow.size(); j++) {
                                            for (int k = 0; k < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size(); k++) {
                                                if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID == idPomieszczenia) {
                                                    if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass() == MiejsceParkingowe.class) {
                                                        miejsceParkingoweTMP14 = (MiejsceParkingowe) listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k);
                                                        znalezionoPomiesczcenie = true;
                                                    }
                                                    if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==Mieszkanie.class) {
                                                        System.err.println("Probojesz dodac Pojazd do Mieszkania : Anulowano operacje : Pojazd moze byc dodany tylko do Miejsca Parkingowego");
                                                        znalezionoPomiesczcenie=false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (znalezionoPomiesczcenie) {
                                        Motocykl dodawanyPojazd = new Motocykl(nazwa, objetosc, pojemnoscSilnika);


                                        if (miejsceParkingoweTMP14 != null) {
                                            try {
                                                miejsceParkingoweTMP14.dodajPojazd(dodawanyPojazd);
                                                System.out.println("Znaleziono Pomieszczenie o podanym ID i pomyslnie dodano do niego nowy przedmiot, ID nowego przedmiotu to: " + dodawanyPojazd.PojazdPrzedmiotID);
                                            } catch (TooManyThingsException e) {
                                                e.printStackTrace();
                                            }


                                        }
                                    }
                                }break;


                                case 2:{
                                    System.out.println("Podaj dlugosc nowego Pojazdu: ");
                                    dlugosc=scanner.nextInt();
                                    System.out.println("Podaj szerokosc nowego Pojazdu: ");
                                    szerokosc=scanner.nextInt();
                                    System.out.println("Podaj wysokosc nowego Pojazdu: ");
                                    wysokosc=scanner.nextInt();
                                    objetosc=dlugosc*szerokosc*wysokosc;
                                    System.out.println("Podaj nazwe nowego Pojazdu: ");
                                    nazwa=scanner.next();
                                    System.out.println("Podaj pojemnosc silnika Pojazdu: ");
                                    pojemnoscSilnika = scanner.nextInt();
                                    System.out.println("Podaj ID, pomieszczenia do ktorego chcesz dodac utworzony Przedmiot:");
                                    idPomieszczenia = scanner.nextInt();

                                    for (int i = 0; i < listaOsiedli.size(); i++) {
                                        for (int j = 0; j < listaOsiedli.get(i).listaBlokow.size(); j++) {
                                            for (int k = 0; k < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size(); k++) {
                                                if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID == idPomieszczenia) {
                                                    if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass() == MiejsceParkingowe.class) {
                                                        miejsceParkingoweTMP14 = (MiejsceParkingowe) listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k);
                                                        znalezionoPomiesczcenie = true;
                                                    }
                                                    if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==Mieszkanie.class) {
                                                        System.err.println("Probojesz dodac Pojazd do Mieszkania : Anulowano operacje : Pojazd moze byc dodany tylko do Miejsca Parkingowego");
                                                        znalezionoPomiesczcenie=false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (znalezionoPomiesczcenie) {
                                        Motocykl dodawanyPojazd = new Motocykl(nazwa, objetosc, pojemnoscSilnika);


                                        if (miejsceParkingoweTMP14 != null) {
                                            try {
                                                miejsceParkingoweTMP14.dodajPojazd(dodawanyPojazd);
                                                System.out.println("Znaleziono Pomieszczenie o podanym ID i pomyslnie dodano do niego nowy przedmiot, ID nowego przedmiotu to: " + dodawanyPojazd.PojazdPrzedmiotID);
                                            } catch (TooManyThingsException e) {
                                                e.printStackTrace();
                                            }


                                        }
                                    }
                                }break;
                                default:{
                                    System.err.println("Nie wybrano sposobu tworzenia Przedmiotu : wrocono do MENU GLOWNEGO");

                                }


                            }// KONIEC POJAZDU

                        }break;
                        default: {
                            System.err.println("Nie wybrano, ani tworzenia Przedmiotu, ani tworzenia Pojazdu : wrocono do MENU GLOWNEGO");
                        }


                    }// switch case12
                }break;

                case 15:{ // USUN POJAZD PRZEDMIOT Z POMIESZCZENIA
                    System.out.println("\n**************************USUN PRZEDMIOT Z POMIESZCZENIA**************************\n");
                    int menuCase15;
                    System.out.println("Podaj ID Pomieszczenia");
                    menuCase15=scanner.nextInt();
                    boolean znalezionoPomiesczcenie = false;
                    Mieszkanie mieszkanieTMP14=null;
                    MiejsceParkingowe miejsceParkingoweTMP14=null;
                    for (int i = 0; i < listaOsiedli.size() ; i++) {
                        for (int j = 0; j < listaOsiedli.get(i).listaBlokow.size() ; j++) {
                            for (int k = 0; k < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size() ; k++) {
                                if(listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID==menuCase15){
                                    if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==Mieszkanie.class) {
                                        mieszkanieTMP14 = (Mieszkanie) listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k);
                                        znalezionoPomiesczcenie=true;
                                    }
                                    if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==MiejsceParkingowe.class) {
                                        miejsceParkingoweTMP14 = (MiejsceParkingowe) listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k);
                                        znalezionoPomiesczcenie=true;
                                    }
                                }
                            }
                        }
                    }

                    Przemiot tmp=null;
                    PojazdPrzedmiot tmp1=null;
                    if (!znalezionoPomiesczcenie)
                        System.err.println("Nie znaleziono pomieszcznia i podanym numerze ID");
                    if (znalezionoPomiesczcenie){
                        System.err.println("Podaj ID Przedmiotu ktory chcesz usunac:");
                        menuCase15=scanner.nextInt();

                        if(mieszkanieTMP14!=null){
                            for (Przemiot przemiot:mieszkanieTMP14.listPrzedmiotow) {
                                if (przemiot.PojazdPrzedmiotID == menuCase15) {
                                    tmp = przemiot;
                                }
                            }
                                if (tmp!= null) {
                                    mieszkanieTMP14.listPrzedmiotow.remove(tmp);
                                    System.out.println("Usunieto: " + tmp + " z pomieszczenia");
                                }

                        }

                        if(miejsceParkingoweTMP14!=null){
                            for (PojazdPrzedmiot przemiot:miejsceParkingoweTMP14.listaPojazdPrzedmiot) {
                                if (przemiot.PojazdPrzedmiotID == menuCase15) {
                                    tmp1 = przemiot;
                                }
                            }
                                miejsceParkingoweTMP14.listaPojazdPrzedmiot.remove(tmp1);
                                System.out.println("Usunieto: "+ tmp1 + " z pomieszczenia");
                        }
                    }


                }break;

                case  16:{ // ZARZADZAJ OBECNYMI UMOWAMI
                    System.out.println("\n***************************ZARZADZAJ OBECNYMI UMOWAMI****************************\n");
                    int menuCase16;
                    int wewnetrznyIterator=0;
                    ArrayList<Mieszkanie> listaTMPMieszkan = new ArrayList<>();
                    ArrayList<MiejsceParkingowe> listaTMPParking = new ArrayList<>();
                    System.out.println("Podaj ID osoby:");
                    menuCase16=scanner.nextInt();
                    Osoba osobaTMP=null;
                    for (int i=0;i< listaOsob.size(); i++ ){
                        if (listaOsob.get(i).osobaID==menuCase16)
                            osobaTMP=listaOsob.get(i);
                    }
                    if (osobaTMP!=null){
                        System.out.println("Wybrano Osobe: "+ osobaTMP);
                        if (osobaTMP.iloscPosiadanychPomieszczen==0)
                            System.out.println("Wybrana Osoba, nie jest wlascicielem zadnego pomieszczenia");
                        else {
                            System.out.println("Wybrana Osoba posiada Pomieszczenia o nastepujacych ID: ");
                            for (int i = 0; i < listaOsiedli.size(); i++) {
                                for (int j = 0; j < listaOsiedli.get(i).listaBlokow.size(); j++) {
                                    for (int k = 0; k < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size(); k++) {
                                        if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).wlasciciel == osobaTMP) {
                                            if(listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==Mieszkanie.class)
                                                listaTMPMieszkan.add((Mieszkanie) listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k));
                                            if(listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==MiejsceParkingowe.class)
                                                listaTMPParking.add((MiejsceParkingowe) listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k));
                                            System.out.println(wewnetrznyIterator + 1 + ") " + listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID);
                                            wewnetrznyIterator++;
                                        }
                                    }
                                }
                            }
                            Mieszkanie zarzadzaneMieszkanie=null;
                            MiejsceParkingowe zarzadzanyParking=null;
                            System.out.println("Podaj ID pomieszczenia w ktorym chcesz zarzadzac umowa: ");
                            menuCase16=scanner.nextInt();
                            for (int j=0; j< listaTMPMieszkan.size();j++){
                                if (listaTMPMieszkan.get(j).numerID==menuCase16){
                                    zarzadzaneMieszkanie=listaTMPMieszkan.get(j);
                                }
                            }
                            for (int j=0; j< listaTMPParking.size();j++){
                                if (listaTMPParking.get(j).numerID==menuCase16){
                                    zarzadzanyParking=listaTMPParking.get(j);
                                }
                            }
                            if (zarzadzaneMieszkanie!=null & zarzadzanyParking==null) {
                                System.out.println("WYBIERZ [1], aby przedluzyc umowe o 30 dni");
                                System.out.println("WYBIERZ [2], aby zerwac umowe i oposcic mieszkanie");
                                menuCase16=scanner.nextInt();
                                switch (menuCase16){
                                    case 1:{
                                        zarzadzaneMieszkanie.odnowUmowe();
                                        System.out.println("Koniec umowy zostal przesuniety o 30 dni");
                                    }break;
                                    case  2:{
                                        if (zarzadzaneMieszkanie.wlasciciel.umowy.size() >= 1) {
                                            zarzadzaneMieszkanie.wlasciciel.umowy.remove(0);
                                        }
                                        zarzadzaneMieszkanie.wyczyscMieszkanie();
                                        System.out.println("Zakonczono wynajem, mieszkanie wyczyszczono ID:"+ zarzadzaneMieszkanie.numerID );

                                    }break;

                                    default:
                                        System.err.println("Nie wybrano opcji z MENU");
                                }

                            }
                            else if (zarzadzanyParking!=null & zarzadzaneMieszkanie==null) {
                                System.out.println("WYBIERZ [1], aby przedluzyc umowe o 30 dni");
                                System.out.println("WYBIERZ [2], aby zerwac umowe i oposcic Pomieszczenie");
                                menuCase16=scanner.nextInt();
                                switch (menuCase16){
                                    case 1:{
                                        zarzadzanyParking.odnowUmowe();
                                        System.out.println("Koniec umowy zostal przesuniety o 30 dni");
                                    }break;
                                    case  2:{
                                        if (zarzadzanyParking.wlasciciel.umowy.size() >= 1) {
                                            zarzadzanyParking.wlasciciel.umowy.remove(0);
                                        }
                                        zarzadzanyParking.wyczyscMiejsceParkingowe();
                                        System.out.println("Zakonczono wynajem, Pomieszczenie wyczyszczono");

                                    }break;

                                    default:
                                        System.err.println("Nie wybrano opcji z MENU");
                                }

                            }

                            else
                                System.err.println("Wybrana osoba nie moze zarzadzac pomieszczeniem o podanym ID");

                        }
                    }
                    else
                        System.err.println("Nie znaleziono Osoby o podanym ID");


                }break;

                case 17:{ // WZNOW UPLYW CZASU
                    czas.wznow();
                    System.out.println("Wznowiono uplyw czasu, aktualizacja dnia co 5 sekund, na komunikat poczekaj do 10 sekund");
                    System.out.println("Obecny dzien :"+ czas.getObecnyCzas());
                }break;

                case 18:{ // ZATRZYMAJ UPLYW CZASU
                    czas.zatrzymaj();
                    System.out.println("Zatrzymano uplyw czasu");
                    System.out.println("Obecny dzien :"+ czas.getObecnyCzas());
                }break;


                default:{
                    System.err.println("Wybierz pozycje z MENU:");
                }
            }
        }

        System.out.println("KONIEC");
        czas.zatrzymaj();
        czas.end();

    }

    public static void zapisDoPliku(ArrayList<Osiedle> listaOsiedli, ArrayList<Osoba> listaOsob){
        StringBuilder tmp = new StringBuilder();
        try {
            FileWriter fileWriter = new FileWriter("dane.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            tmp.append("// s20635 OBECNY STAN OSIEDLI: \n");

            // LISTA OSIEDLI:
            tmp.append("\n**********************************LISTA OSIEDLI**********************************\n\n");
            for (int i = 0; i < listaOsiedli.size(); i++) {
                tmp.append((i + 1) + ") " + "ID OSIEDLA: " + listaOsiedli.get(i).numerID+"\n");
            }

            //LISTA BLOKOW
            tmp.append("\n*********************************LISTA BUDYNKOW**********************************\n\n");
            for (int i = 0; i < listaOsiedli.size(); i++) {
                tmp.append("---------------------------------------------------------------------------------\n");
                tmp.append("Osiedle: " + (i + 1)+"\n");
                tmp.append("---------------------------------------------------------------------------------\n");
                for (int j = 0; j < listaOsiedli.get(i).listaBlokow.size(); j++) {
                    tmp.append((j + 1) + ") " + "ID BLOKU: " + listaOsiedli.get(i).listaBlokow.get(j).numerID+"\n");
                }
            }

            //LISTA POMIESZCZEN
            tmp.append("\n\n**********************LISTA POMIESZCZEN POSORTOWANA ROSNACO**********************\n\n");
            ArrayList<Pomieszczenie> rosnacePomieszczenia = new ArrayList<>();
            for (int i = 0; i < listaOsiedli.size(); i++) {
                for (int j = 0; j < listaOsiedli.get(i).listaBlokow.size(); j++) {
                    for (int k = 0; k < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size(); k++) {
                        rosnacePomieszczenia.add(listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k));
                    }
                }
            }
            Collections.sort(rosnacePomieszczenia);
            for (int i =0; i<rosnacePomieszczenia.size(); i++){
                tmp.append("---------------------------------------------------------------------------------\n");
                tmp.append(i+1+") Pomieszczenie o ID: "+rosnacePomieszczenia.get(i).numerID+ " ma objetosc: "+ rosnacePomieszczenia.get(i).objetosc+"\n");
            }


            //LISTA WOLNYCH POMIESZCZEN
            tmp.append("\n\n****************************LISTA WOLNYCH POMIESZCZEN****************************\n\n");
            for (int i = 0; i < listaOsiedli.size(); i++) {
                tmp.append("---------------------------------------------------------------------------------\n");
                tmp.append("Osiedle: " + (i + 1)+"\n");
                tmp.append("---------------------------------------------------------------------------------\n");
                for (int j = 0; j < listaOsiedli.get(i).listaBlokow.size(); j++) {
                    tmp.append("---------------------------------------------------------------------------------\n");
                    tmp.append("Blok: " + listaOsiedli.get(i).listaBlokow.get(j).numerID+"\n");
                    tmp.append("---------------------------------------------------------------------------------\n");
                    int licznik = 0;
                    for (int k = 0; k < listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size(); k++) {
                        if (listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).wlasciciel == null) {
                            tmp.append((licznik + 1) + ") " + "ID WOLNEGO POMIESZCZENIA: " + listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID+"\n");
                            licznik++;
                        }
                    }
                    if (licznik == 0)
                        tmp.append("W tym bloku nie ma wolnych pomieszczen\n");
                }
            }
            //LISTA PRZEDMIOTOW POSORTOWANYCH MALEJACO
            tmp.append("\n\n*************LISTA PRZEDMIOTOW POSORTOWANYCH MALEJACO LUB PO NAZWIE**************\n\n");

            for (int i = 0; i < listaOsiedli.size() ; i++) {
                tmp.append("---------------------------------------------------------------------------------\n");
                tmp.append("Osiedle: "+(i+1)+"\n");
                tmp.append("---------------------------------------------------------------------------------\n");
                for (int j = 0; j <listaOsiedli.get(i).listaBlokow.size() ; j++) {
                    tmp.append("---------------------------------------------------------------------------------\n");
                    tmp.append("Blok: "+ listaOsiedli.get(i).listaBlokow.get(j).numerID+"\n");
                    tmp.append("---------------------------------------------------------------------------------\n");
                    for (int k = 0; k <listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size() ; k++) {
                        ArrayList<PojazdPrzedmiot> przedmiotyMalejaco =new ArrayList<>();
                        int licznik=0;
                        tmp.append("Pomieszczenie: "+ listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID+"\n");
                        Mieszkanie mieszkanieTMP;
                        MiejsceParkingowe miejsceParkingoweTMP;
                        if(listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==Mieszkanie.class) {
                            mieszkanieTMP = (Mieszkanie) listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k);
                            if (mieszkanieTMP.listPrzedmiotow.size()>0) {
                                for (int l = 0; l < mieszkanieTMP.listPrzedmiotow.size() ; l++) {
                                    licznik++;
                                    przedmiotyMalejaco.add(mieszkanieTMP.listPrzedmiotow.get(l));
                                }
                            }

                        }
                        if(listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==MiejsceParkingowe.class) {
                            miejsceParkingoweTMP = (MiejsceParkingowe) listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k);
                            if (miejsceParkingoweTMP.listaPojazdPrzedmiot.size()>0) {
                                for (int l = 0; l < miejsceParkingoweTMP.listaPojazdPrzedmiot.size() ; l++) {
                                    if(miejsceParkingoweTMP.listaPojazdPrzedmiot.get(l).getClass()==Przemiot.class) {
                                        licznik++;
                                        przedmiotyMalejaco.add(miejsceParkingoweTMP.listaPojazdPrzedmiot.get(l));
                                    }
                                }
                            }
                        }
                        Collections.sort(przedmiotyMalejaco);
                        for (int l = 0; l < przedmiotyMalejaco.size(); l++) {
                            tmp.append((l+1)+") Przedmiot o ID: "+ przedmiotyMalejaco.get(l).PojazdPrzedmiotID+" , nazwie: "+ przedmiotyMalejaco.get(l).nazwa+ " ma objetosc: "+ przedmiotyMalejaco.get(l).objetosc+"\n");
                        }
                        if (przedmiotyMalejaco.size()==0) {
                            tmp.append("W pomieszczeniu nie ma Przedmiotow\n");
                        }
                    }
                }
            }

            //LISTA POJAZDOW POSORTOWANYCH MALEJACO
            tmp.append("\n\n***************LISTA POJAZDOW POSORTOWANYCH MALEJACO LUB PO NAZWIE***************\n\n");

            for (int i = 0; i < listaOsiedli.size() ; i++) {
                tmp.append("---------------------------------------------------------------------------------\n");
                tmp.append("Osiedle: "+(i+1)+"\n");
                tmp.append("---------------------------------------------------------------------------------\n");
                for (int j = 0; j <listaOsiedli.get(i).listaBlokow.size() ; j++) {
                    tmp.append("---------------------------------------------------------------------------------\n");
                    tmp.append("Blok: "+ listaOsiedli.get(i).listaBlokow.get(j).numerID+"\n");
                    tmp.append("---------------------------------------------------------------------------------\n");
                    for (int k = 0; k <listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.size() ; k++) {
                        ArrayList<PojazdPrzedmiot> pojazdyMalejaco =new ArrayList<>();
                        int licznik=0;
                        tmp.append("Pomieszczenie: "+ listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).numerID+"\n");
                        MiejsceParkingowe miejsceParkingoweTMP;
                        if(listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k).getClass()==MiejsceParkingowe.class) {
                            miejsceParkingoweTMP = (MiejsceParkingowe) listaOsiedli.get(i).listaBlokow.get(j).listaPomieszczen.get(k);
                            if (miejsceParkingoweTMP.listaPojazdPrzedmiot.size()>0) {
                                for (int l = 0; l < miejsceParkingoweTMP.listaPojazdPrzedmiot.size() ; l++) {
                                    if(miejsceParkingoweTMP.listaPojazdPrzedmiot.get(l).getClass().getSuperclass()==Pojazd.class) {
                                        licznik++;
                                        pojazdyMalejaco.add(miejsceParkingoweTMP.listaPojazdPrzedmiot.get(l));
                                    }
                                }
                            }
                        }
                        Collections.sort(pojazdyMalejaco);
                        for (int l = 0; l < pojazdyMalejaco.size(); l++) {
                            tmp.append((l+1)+") Pojazd o ID: "+ pojazdyMalejaco.get(l).PojazdPrzedmiotID+" , nazwie: "+ pojazdyMalejaco.get(l).nazwa+ " ma objetosc: "+ pojazdyMalejaco.get(l).objetosc+"\n");
                        }
                        if (pojazdyMalejaco.size()==0) {
                            tmp.append("W pomieszczeniu nie ma Pojazdow\n");
                        }
                    }
                }
            }

            //LISTA OSOB I INFORMACJI O NICH
            tmp.append("\n\n**************************LISTA OSOB I INFORMACJI O NICH*************************\n\n");
            ArrayList<Osoba> listaOsobTMP=null;
            for (int i = 0; i < listaOsob.size() ; i++) {
                int licznik=0;
                tmp.append((i+1)+") \n "+ listaOsob.get(i)+"\n");
                tmp.append("Powyzsza osoba mieszka, choc nie musi byc wlascicielem w pomieszczeniach o ID:\n");
                for (int j = 0; j < listaOsiedli.size(); j++) {
                    for (int k = 0; k <listaOsiedli.get(j).listaBlokow.size() ; k++) {
                        for (int l = 0; l < listaOsiedli.get(j).listaBlokow.get(k).listaPomieszczen.size() ; l++) {
                            for (int m = 0; m < listaOsiedli.get(j).listaBlokow.get(k).listaPomieszczen.get(l).listaOsob.size() ; m++) {
                                if (listaOsob.get(i)==listaOsiedli.get(j).listaBlokow.get(k).listaPomieszczen.get(l).listaOsob.get(m)){
                                    tmp.append(licznik+1+") "+listaOsiedli.get(j).listaBlokow.get(k).listaPomieszczen.get(l).numerID+"\n");
                                    licznik++;
                                }
                            }
                        }
                    }
                }
                tmp.append("---------------------------------------------------------------------------------\n");
            }

            bufferedWriter.write(tmp.toString());
            bufferedWriter.flush();
            bufferedWriter.close();
            System.out.println("Plik pomslnie zapisano!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
