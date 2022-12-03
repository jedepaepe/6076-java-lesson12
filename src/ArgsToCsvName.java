import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ArgsToCsvName {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length > 1) {
            String fileName = args[0];
            PrintWriter writer = new PrintWriter(new FileOutputStream(fileName, true));
            writer.println(String.join(";", args));
            writer.close();
            System.out.println("Une ligne a été ajoutée au fichier " + fileName);
        } else {
            System.out.println("Veuillez introduire au moins deux arguments: le nom du fichier et un donnée");
        }
    }
}
