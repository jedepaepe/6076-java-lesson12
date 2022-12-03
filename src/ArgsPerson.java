public class ArgsPerson {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Veuillez introduire le numéro national, prénom, nom de famille, email et année de naissance de la personne");
            return;
        }
        Person person = new Person();
        person.identifier = args[0];
        person.firstName = args[1];
        person.lastName = args[2];
        person.email = args[3];
        person.birthYear = Integer.parseInt(args[4]);

        System.out.println("numéro national: " + person.identifier);
        System.out.println("prénom: " + person.firstName);
        System.out.println("nom de famille: " + person.lastName);
        System.out.println("email: " + person.email);
        System.out.println("année de naissance: " + person.birthYear);
    }
}
