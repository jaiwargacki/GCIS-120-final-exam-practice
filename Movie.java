import java.util.HashSet;
import java.util.Iterator;

public class Movie implements Iterable<Actor>{
    private String name;
    private HashSet<Actor> actors; // LinkedList, HashSet, ArrayList

    public Movie(String name) {
        this.name = name;
        this.actors = new HashSet<>();
    }

    public void addActor(Actor actor) {
        actors.add(actor); // O(C)
    }

    public boolean hasActor(Actor actor) {
        if (actors.contains(actor)) { // O(C)
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Iterator<Actor> iterator() {
        return actors.iterator();
    }
}
