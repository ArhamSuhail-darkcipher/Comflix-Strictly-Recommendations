import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Concrete media type representing a movie.
 *
 * Demonstrates inheritance, encapsulation, deep copying, and method overriding.
 */
public class Movie extends Media implements Serializable {
    private static final long serialVersionUID = 2L;

    private ArrayList<String> genres;
    private ArrayList<String> actors;
    private double rating;
    private String industry;

    public Movie(
        int id,
        String title,
        ArrayList<String> genres,
        ArrayList<String> actors,
        double rating,
        int releaseYear,
        String industry
    ) {
        super(id, title, releaseYear);
        this.genres = genres == null ? new ArrayList<>() : new ArrayList<>(genres);
        this.actors = actors == null ? new ArrayList<>() : new ArrayList<>(actors);
        this.rating = rating;
        this.industry = industry;
    }

    /** Deep copy constructor. */
    public Movie(Movie other) {
        super(other.id, other.title, other.releaseYear);
        this.genres = new ArrayList<>(other.genres);
        this.actors = new ArrayList<>(other.actors);
        this.rating = other.rating;
        this.industry = other.industry;
    }

    public Movie deepCopy() {
        return new Movie(this);
    }

    public ArrayList<String> getGenres() {
        return new ArrayList<>(genres);
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = new ArrayList<>(genres);
    }

    public ArrayList<String> getActors() {
        return new ArrayList<>(actors);
    }

    public void setActors(ArrayList<String> actors) {
        this.actors = new ArrayList<>(actors);
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Override
    public String getDetails() {
        return String.format(
            "%s (%d) — %.1f — %s — %s",
            title,
            releaseYear,
            rating,
            industry,
            String.join(", ", genres)
        );
    }

    @Override
    public String toString() {
        return String.format(
            "Movie{id=%d, title='%s', year=%d, rating=%.1f, industry=%s}",
            id,
            title,
            releaseYear,
            rating,
            industry
        );
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Movie movie = (Movie) object;
        return id == movie.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
