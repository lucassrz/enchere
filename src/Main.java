import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int nbEnchere = 3;
        int count = 0;

        System.out.println("Bienvenue au enchères!");

        Lot[] allLot = new Lot[nbEnchere];

        allLot[0] = new Lot("iPhone 15 Pro Max 512Go Titane Naturel", 1250, 340, "Lucas");
        allLot[1] = new Lot("Tesla Model X 34000Km", 35600, 2300, "Elon Musk");
        allLot[2] = new Lot("Golf 6 GTI 90000Km", 13400, 1145, "Jacky");

        while(count < nbEnchere) {
            System.out.println("Présentation de l'objet");
            Lot objet = allLot[count];
            System.out.println("Lot n°" + count+1 + ": " + objet.getName() + " avec un prix minimum de " + objet.getMinimumPrice() + "€");
            Thread.sleep(5000);
            System.out.println("L'enchères commence!");
            String prompt = "";
            while(!prompt.equals("stop")) {
                prompt = scanner.next();
                if(!Objects.equals(prompt, "stop")) {
                    double prix = Double.parseDouble(prompt);
                    if(prix > objet.getCurrentPrice()) {
                        objet.setCurrentPrice(prix);
                        System.out.println("Objet enchérie à " + prix + "€");
                    } else {
                        System.out.println("Vous ne pouvez pas enchérir en dessous du prix");
                    }
                }
            }

            System.out.println("Fin de l'enchère, vendu à " + objet.getCurrentPrice() + "€ !");

            count++;
        }
    }
}