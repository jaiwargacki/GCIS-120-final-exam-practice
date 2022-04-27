package solution;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Movie implements Iterable<Actor> {
    // Name and collection of actors
    private final String name;
    private final Set<Actor> actors;

    // Constructor
    public Movie(String name) {
        this.name = name;
        this.actors = new HashSet<>();
    }

    // Add an actor to the collection
    public void addActor(Actor actor) {
        actors.add(actor);
    }

    // Check if the movie has an actor
    public boolean hasActor(Actor actor) {
        return actors.contains(actor);
    }

    @Override
    public Iterator<Actor> iterator() {
        return actors.iterator();
    }
}
