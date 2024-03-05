import java.util.Objects;

public class Author {
    private final String name;

    public String getName() {
        return name;
    }

    private final String familiya;

    public String getFamiliya() {
        return familiya;
    }

    public Author(String name, String familiya) {
        this.name = name;
        this.familiya = familiya;
    }

    @Override
    public String toString() {
        return name + " " +  familiya;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return Objects.equals(getName(), author.getName()) && Objects.equals(getFamiliya(), author.getFamiliya());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFamiliya());
    }
}
