import java.time.Year;

public class Person {
    String identifier;
    String firstName;
    String lastName;
    String email;
    int birthYear;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean Equals(Person other) {
        return identifier.equals(other.identifier);
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }
}
