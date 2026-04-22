import java.util.ArrayList;

/**
 * Context class for the Strategy pattern.
 *
 * Holds the current recommendation algorithm and delegates recommendation work to it.
 */
public class RecommendationEngine {
    private RecommendationAlgorithm algorithm;

    public RecommendationEngine(RecommendationAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void setAlgorithm(RecommendationAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public ArrayList<Movie> getRecommendations(
        User user,
        ArrayList<Movie> movies,
        Filters filters
    ) {
        if (algorithm == null) {
            throw new IllegalStateException("Recommendation algorithm not set.");
        }

        return algorithm.recommend(user.deepCopy(), new ArrayList<>(movies), filters);
    }

    /**
     * Convenience method that returns only the first N recommended movies.
     */
    public ArrayList<Movie> getTopN(
        User user,
        ArrayList<Movie> movies,
        Filters filters,
        int limit
    ) {
        ArrayList<Movie> allRecommendations = getRecommendations(user, movies, filters);
        ArrayList<Movie> topRecommendations = new ArrayList<>();

        for (int index = 0; index < Math.min(limit, allRecommendations.size()); index++) {
            topRecommendations.add(allRecommendations.get(index));
        }

        return topRecommendations;
    }
}
