import java.io.Serializable;

/**
 * Abstract base class for media items.
 *
 * Demonstrates abstraction by defining common fields and forcing subclasses
 * to provide their own detail formatting.
 */
public abstract class Media implements Serializable {
    private static final long serialVersionUID = 1L;

    protected int id;
    protected String title;
    protected int releaseYear;

    public Media(int id, String title, int releaseYear) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    /**
     * Subclasses must describe themselves in their own way.
     */
    public abstract String getDetails();
}
