import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class CarCsv {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length == 7) {
            String fileName = args[0];
            Car c = new Car();
            c.licensePlate = args[1];
            c.brand = args[2];
            c.model = args[3];
            c.color = args[4];
            c.constructionYear = Integer.parseInt(args[5]);
            c.buyPrice = Double.parseDouble(args[6]);
            PrintWriter writer = new PrintWriter(new FileOutputStream(fileName, true));
            writer.println(c.licensePlate + ";" + c.brand + ";" + c.model + ";"  + c.color + ";" + c.constructionYear +
                    ";" + c.buyPrice);
            writer.close();
            System.out.println("Voiture " + c.licensePlate + " a été ajoutée au fichier " + fileName);
        } else {
            System.out.println("Veuillez introduire 7 arguments");
            System.out.println("\tle nom du fichier");
            System.out.println("\tla plaque d'immatriculation");
            System.out.println("\tla marque");
            System.out.println("\tle modèle");
            System.out.println("\tla couleur");
            System.out.println("\tl'année de construction");
            System.out.println("\tet le prix d'achat");
        }
    }
}
