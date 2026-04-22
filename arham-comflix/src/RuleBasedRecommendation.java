import java.util.ArrayList;
import java.util.Comparator;

/**
 * Transparent point-based recommendation system.
 *
 * Movies gain points for matching genres, actors, year range, and industry.
 */
public class RuleBasedRecommendation implements RecommendationAlgorithm {

    private double genrePoints = 5.0;
    private double actorPoints = 7.0;
    private double yearPoints = 2.0;
    private double industryPoints = 3.0;

    @Override
    public ArrayList<Movie> recommend(User user, ArrayList<Movie> movies, Filters filters) {
        ArrayList<ScoredMovie> scoredMovies = new ArrayList<>();

        for (Movie movie : movies) {
            double score = 0;

            score += scoreGenreMatches(movie, filters);
            score += scoreActorMatches(movie, filters);
            score += scoreYearMatch(movie, filters);
            score += scoreIndustryMatch(movie, filters);

            scoredMovies.add(new ScoredMovie(movie, score));
        }

        scoredMovies.sort(Comparator.comparingDouble(ScoredMovie::getScore).reversed());

        ArrayList<Movie> recommendations = new ArrayList<>();
        for (ScoredMovie scoredMovie : scoredMovies) {
            recommendations.add(scoredMovie.getMovie());
        }

        return recommendations;
    }

    private double scoreGenreMatches(Movie movie, Filters filters) {
        double score = 0;

        for (String genreFilter : filters.getGenres()) {
            String normalizedGenreFilter = genreFilter.strip().toLowerCase();

            for (String movieGenre : movie.getGenres()) {
                if (movieGenre.toLowerCase().contains(normalizedGenreFilter)) {
                    score += genrePoints;
                    break;
                }
            }
        }

        return score;
    }

    private double scoreActorMatches(Movie movie, Filters filters) {
        double score = 0;

        for (String actorFilter : filters.getActors()) {
            String normalizedActorFilter = actorFilter.strip().toLowerCase();

            for (String movieActor : movie.getActors()) {
                if (movieActor.toLowerCase().contains(normalizedActorFilter)) {
                    score += actorPoints;
                    break;
                }
            }
        }

        return score;
    }

    private double scoreYearMatch(Movie movie, Filters filters) {
        return movie.getReleaseYear() >= filters.getStartYear()
            && movie.getReleaseYear() <= filters.getEndYear()
            ? yearPoints
            : 0;
    }

    private double scoreIndustryMatch(Movie movie, Filters filters) {
        return !filters.getIndustry().isEmpty()
            && movie.getIndustry().equalsIgnoreCase(filters.getIndustry())
            ? industryPoints
            : 0;
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
