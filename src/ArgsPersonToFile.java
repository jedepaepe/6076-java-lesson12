import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ArgsPersonToFile {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length == 6) {
            String fileName = args[0];
            PrintWriter writer = new PrintWriter(new FileOutputStream(fileName, true));
            Person p = new Person();
            p.identifier = args[1];
            p.firstName = args[2];
            p.lastName = args[3];
            p.email = args[4];
            p.birthYear = Integer.parseInt(args[5]);
            writer.println(p.identifier + ";" + p.firstName + ";" +  p.lastName + ";" + p.email + ";" + p.birthYear);
            writer.close();
            System.out.println("Une ligne a été ajoutée au fichier " + fileName);
        } else {
            System.out.println("Veuillez introduire 6 arguments: ");
            System.out.println("\tle nom du fichier csv");
            System.out.println("\tle numéro national de la personne");
            System.out.println("\tson prénom");
            System.out.println("\tson nom de famille");
            System.out.println("\tson email");
            System.out.println("\tson année de naissance");
        }
    }
}
