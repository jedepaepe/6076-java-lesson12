public class Receipe {
    String name;
    String caterory;
    String origin;
    int difficulty; // possible values: 1, 2, 3, 4, 5 (5 is very difficult)
    int duration;
    String ingredients; // should be an array but we simplify

    boolean equals(Receipe other) {
        return name.equals(other.name) &&
                caterory.equals(other.caterory) &&
                origin.equals(other.origin) &&
                difficulty == other.difficulty &&
                duration == other.duration &&
                ingredients.equals(other.ingredients);
    }
}
