import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ReceipeCsv {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length == 7) {
            String fileName = args[0];
            Receipe r = new Receipe();
            r.name = args[1];
            r.caterory = args[2];
            r.origin = args[3];
            r.difficulty = Integer.parseInt(args[4]);
            r.duration = Integer.parseInt(args[5]);
            r.ingredients = args[6];
            PrintWriter writer = new PrintWriter(new FileOutputStream(fileName, true));
            writer.println(r.name + ";" + r.caterory + ";" + r.origin + ";" + r.difficulty + ";" + r.duration + ";" +
                    r.ingredients);
            writer.close();
            System.out.println("La recette " + r.name + " a été ajoutée au fichier " + fileName);
        } else {
            System.out.println("Veuillez introduire 7 arguments");
            System.out.println("\tle nom du fichier");
            System.out.println("\tle nom de la recette");
            System.out.println("\tl'origine");
            System.out.println("\tla difficulté [1-5]");
            System.out.println("\tla durée en minute");
            System.out.println("\tles ingrédients");
        }
    }

}
