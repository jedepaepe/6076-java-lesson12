import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ArgsToCsvFileAppend {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length > 0) {
            PrintWriter writer = new PrintWriter(new FileOutputStream("args.csv", true));
            writer.println(String.join(";", args));
            writer.close();
            System.out.println("Fichier args.csv est créé");
        } else {
            System.out.println("Veuillez introduire au moins un argument");
        }
    }
}
