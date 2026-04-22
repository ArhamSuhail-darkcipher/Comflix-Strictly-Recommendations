import java.util.ArrayList;

/**
 * Strategy interface for recommendation algorithms.
 *
 * Different algorithm implementations can be swapped at runtime.
 */
public interface RecommendationAlgorithm {

    /**
     * Returns a scored-and-sorted movie list based on the given user and filters.
     */
    ArrayList<Movie> recommend(User user, ArrayList<Movie> movies, Filters filters);
}
