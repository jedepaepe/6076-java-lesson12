import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ArgsToCsvFile {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length > 0) {
            PrintWriter writer = new PrintWriter("args.csv");
            writer.println(String.join(";", args));
            writer.close();
            System.out.println("Fichier args.csv est créé");
        } else {
            System.out.println("Veuillez introduire au moins un argument");
        }
    }
}
