package solution;

import graphs.AdjacencyGraph;
import graphs.Graph;

public class BaconGame {

    private static void addMovie(Graph<Actor> graph, Movie movie) {
        for (Actor a1 : movie) {
            graph.add(a1);
            for (Actor a2 : movie) {
                if (!a1.equals(a2) && graph.contains(a2) && !graph.connected(a1, a2)) {
                    graph.connectUndirected(a1, a2);;
                }
            }
        }
    }

    private static boolean areInSameMovie(Graph<Actor> graph, Actor a1, Actor a2) {
        return graph.connected(a1, a2);
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("The Matrix");
        Movie movie2 = new Movie("V for Vendetta");
        Movie movie3 = new Movie("John Wick");

        Actor actor1 = new Actor("Keanu Reeves");
        Actor actor2 = new Actor("Carrie-Anne Moss");
        Actor actor3 = new Actor("Hugo Weaving");
        Actor actor4 = new Actor("Natalie Portman");
        Actor actor5 = new Actor("Rupert Graves");
        Actor actor6 = new Actor("Laurence Fishburne");
        Actor actor7 = new Actor("Dean Winters");

        movie1.addActor(actor1);
        movie1.addActor(actor2);
        movie1.addActor(actor3);
        movie2.addActor(actor6);

        movie2.addActor(actor3);
        movie3.addActor(actor4);
        movie3.addActor(actor5);

        movie3.addActor(actor1);
        movie3.addActor(actor6);
        movie3.addActor(actor7);

        // Populate the graph
        Graph<Actor> graph = new AdjacencyGraph<Actor>();
        addMovie(graph, movie1);
        addMovie(graph, movie2);
        addMovie(graph, movie3);

        System.out.println(areInSameMovie(graph, actor1, actor2));
        System.out.println(areInSameMovie(graph, actor5, actor3));
    }
    
}
