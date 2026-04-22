import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * Simple backend test harness for Comflix.
 *
 * Use this class to:
 * - verify that movies.dat loads correctly
 * - test recommendation algorithms without the GUI
 * - inspect console output during development
 */
public class MainBackendTest {

    public static void main(String[] args) {
        ArrayList<Movie> movies = loadMovies("movies.dat");
        System.out.println("Loaded " + movies.size() + " movies.");

        Filters filters = new Filters();
        User testUser = new User(1, "TestUser");

        RecommendationEngine engine =
            new RecommendationEngine(new RuleBasedRecommendation());

        ArrayList<Movie> topRuleBased = engine.getTopN(testUser, movies, filters, 5);
        System.out.println("Top 5 (Rule-Based):");
        topRuleBased.forEach(movie -> System.out.println(movie.getDetails()));

        engine.setAlgorithm(new SimilarityBasedRecommendation());
        ArrayList<Movie> topSimilarity = engine.getTopN(testUser, movies, filters, 5);
        System.out.println("\nTop 5 (Similarity-Based):");
        topSimilarity.forEach(movie -> System.out.println(movie.getDetails()));
    }

    /**
     * Loads serialized movie data from a .dat file.
     */
    @SuppressWarnings("unchecked")
    public static ArrayList<Movie> loadMovies(String filename) {
        ArrayList<Movie> movies = new ArrayList<>();

        try (ObjectInputStream inputStream =
                 new ObjectInputStream(new FileInputStream(filename))) {
            movies = (ArrayList<Movie>) inputStream.readObject();
        } catch (FileNotFoundException exception) {
            System.out.println("Error: File not found -> " + filename);
            exception.printStackTrace();
        } catch (IOException exception) {
            System.out.println("Error reading file: " + exception.getMessage());
            exception.printStackTrace();
        } catch (ClassNotFoundException exception) {
            System.out.println("Error: Movie class definition not found.");
            exception.printStackTrace();
        }

        return movies;
    }
}
