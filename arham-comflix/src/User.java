import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents a user in the recommendation system.
 *
 * This class is included mainly to demonstrate OOP concepts such as:
 * - encapsulation
 * - composition
 * - deep copy construction
 */
public class User implements Serializable {
    private static final long serialVersionUID = 3L;

    private int id;
    private String name;
    private ArrayList<String> preferredGenres;
    private ArrayList<String> preferredActors;
    private ArrayList<Movie> watchedMovies;
    private HashMap<Integer, Integer> movieRatings;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.preferredGenres = new ArrayList<>();
        this.preferredActors = new ArrayList<>();
        this.watchedMovies = new ArrayList<>();
        this.movieRatings = new HashMap<>();
    }

    /** Deep copy constructor. */
    public User(User other) {
        this.id = other.id;
        this.name = other.name;
        this.preferredGenres = new ArrayList<>(other.preferredGenres);
        this.preferredActors = new ArrayList<>(other.preferredActors);
        this.watchedMovies = new ArrayList<>();

        for (Movie movie : other.watchedMovies) {
            this.watchedMovies.add(movie.deepCopy());
        }

        this.movieRatings = new HashMap<>(other.movieRatings);
    }

    public User deepCopy() {
        return new User(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPreferredGenres() {
        return new ArrayList<>(preferredGenres);
    }

    public ArrayList<String> getPreferredActors() {
        return new ArrayList<>(preferredActors);
    }

    public ArrayList<Movie> getWatchedMovies() {
        return new ArrayList<>(watchedMovies);
    }

    public Map<Integer, Integer> getMovieRatings() {
        return new HashMap<>(movieRatings);
    }

    public void addPreferredGenre(String genre) {
        if (!preferredGenres.contains(genre)) {
            preferredGenres.add(genre);
        }
    }

    public void addPreferredActor(String actor) {
        if (!preferredActors.contains(actor)) {
            preferredActors.add(actor);
        }
    }

    public void addWatchedMovie(Movie movie) {
        watchedMovies.add(movie.deepCopy());
    }

    public void rateMovie(Movie movie, int rating) {
        movieRatings.put(movie.getId(), rating);
    }
}
