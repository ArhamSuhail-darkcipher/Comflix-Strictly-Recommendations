import java.io.Serializable;
import java.util.ArrayList;

/**
 * Holds all user-selected filter values from the GUI.
 *
 * Keeping filters in a dedicated object makes it easy to:
 * - pass them between layers
 * - keep GUI code cleaner
 * - extend the filtering system later
 */
public class Filters implements Serializable {
    private static final long serialVersionUID = 4L;

    private ArrayList<String> genres;
    private int startYear;
    private int endYear;
    private ArrayList<String> actors;
    private String industry;

    public Filters() {
        this.genres = new ArrayList<>();
        this.actors = new ArrayList<>();
        this.startYear = 1900;
        this.endYear = 2100;
        this.industry = "";
    }

    public ArrayList<String> getGenres() {
        return new ArrayList<>(genres);
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = new ArrayList<>(genres);
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setYearRange(int startYear, int endYear) {
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public ArrayList<String> getActors() {
        return new ArrayList<>(actors);
    }

    public void setActors(ArrayList<String> actors) {
        this.actors = new ArrayList<>(actors);
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
}
