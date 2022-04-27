package solution;

public class Actor {
    // Actors have a name
    private final String name;

    // Constructor
    public Actor(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;

        return name.equals(actor.name);
    }

    // Hashcode method
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    // toString method
    @Override
    public String toString() {
        return name;
    }
}
