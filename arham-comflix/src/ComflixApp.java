import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.util.ArrayList;

public class ComflixApp {

    /** Default data file used by the application. */
    private static final String MOVIE_DATA_FILE = "movies.dat";

    public static void main(String[] args) {
        applySystemLookAndFeel();

        ArrayList<Movie> movies = MainBackendTest.loadMovies(MOVIE_DATA_FILE);
        if (movies == null || movies.isEmpty()) {
            ComflixGUI.showStartupError(
                "No movies found. Run MovieSeeder first to generate movies.dat."
            );
            return;
        }

        SwingUtilities.invokeLater(() -> new ComflixGUI(movies));
    }

    /**
     * Makes the app use the operating system's native UI look where possible.
     */
    private static void applySystemLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
            // If look-and-feel setup fails, Swing will fall back to default styling.
        }
    }
}
