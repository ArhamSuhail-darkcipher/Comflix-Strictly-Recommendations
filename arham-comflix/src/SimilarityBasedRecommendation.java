import java.util.ArrayList;
import java.util.Comparator;

/**
 * Similarity-based recommendation system.
 *
 * Computes a weighted score based on:
 * - genre similarity
 * - actor similarity
 * - movie rating
 * - movie recency
 */
public class SimilarityBasedRecommendation implements RecommendationAlgorithm {

    private double genreWeight = 0.45;
    private double actorWeight = 0.35;
    private double ratingWeight = 0.15;
    private double recencyWeight = 0.05;

    @Override
    public ArrayList<Movie> recommend(User user, ArrayList<Movie> movies, Filters filters) {
        ArrayList<ScoredMovie> scoredMovies = new ArrayList<>();

        ArrayList<String> filterGenres = filters.getGenres();
        ArrayList<String> filterActors = filters.getActors();
        int startYear = filters.getStartYear();
        int endYear = filters.getEndYear();

        for (Movie movie : movies) {
            double genreSimilarity = similarityRatio(filterGenres, movie.getGenres());
            double actorSimilarity = similarityRatio(filterActors, movie.getActors());
            double normalizedRating = movie.getRating() / 10.0;
            double recencyBoost = calculateRecencyBoost(movie);

            double combinedScore =
                genreWeight * genreSimilarity +
                actorWeight * actorSimilarity +
                ratingWeight * normalizedRating +
                recencyWeight * recencyBoost;

            if (movie.getReleaseYear() < startYear || movie.getReleaseYear() > endYear) {
                combinedScore *= 0.6;
            }

            if (!filters.getIndustry().isEmpty()
                && !filters.getIndustry().equalsIgnoreCase(movie.getIndustry())) {
                combinedScore *= 0.85;
            }

            scoredMovies.add(new ScoredMovie(movie, combinedScore));
        }

        scoredMovies.sort(Comparator.comparingDouble(ScoredMovie::getScore).reversed());

        ArrayList<Movie> recommendations = new ArrayList<>();
        for (ScoredMovie scoredMovie : scoredMovies) {
            recommendations.add(scoredMovie.getMovie());
        }

        return recommendations;
    }

    /**
     * Computes partial-match similarity ratio using loops only.
     */
    private double similarityRatio(ArrayList<String> filterValues, ArrayList<String> movieValues) {
        if (filterValues.isEmpty()) {
            return 0;
        }

        int matches = 0;

        for (String filterValue : filterValues) {
            String normalizedFilterValue = filterValue.toLowerCase().trim();

            for (String movieValue : movieValues) {
                if (movieValue.toLowerCase().contains(normalizedFilterValue)) {
                    matches++;
                    break;
                }
            }
        }

        return (double) matches / filterValues.size();
    }

    /**
     * Gives newer movies a small scoring advantage.
     */
    private double calculateRecencyBoost(Movie movie) {
        int age = 2025 - movie.getReleaseYear();

        if (age <= 1) {
            return 1.0;
        }
        if (age <= 5) {
            return 0.6;
        }
        if (age <= 10) {
            return 0.3;
        }
        return 0.0;
    }

    /** Small internal holder for score + movie. */
    private static class ScoredMovie {
        private final Movie movie;
        private final double score;

        ScoredMovie(Movie movie, double score) {
            this.movie = movie;
            this.score = score;
        }

        public Movie getMovie() {
            return movie;
        }

        public double getScore() {
            return score;
        }
    }
}
