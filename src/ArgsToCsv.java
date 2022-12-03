public class ArgsToCsv {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(String.join(";", args));
        }
    }
}
