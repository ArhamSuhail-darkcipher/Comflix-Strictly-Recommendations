import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Main GUI layer for the Comflix desktop application.
 *
 * This class owns the high-level user interface flow:
 * - Welcome screen
 * - Main browsing window
 * - Movie cards
 * - Movie details dialog
 */
public class ComflixGUI {

    /* =========================
       Theme constants
       ========================= */
    private static final Color BG_COLOR = new Color(20, 20, 20);
    private static final Color SIDEBAR_COLOR = new Color(33, 33, 33);
    private static final Color ACCENT_COLOR = new Color(229, 9, 20);
    private static final Color TEXT_PRIMARY = Color.WHITE;
    private static final Color TEXT_SECONDARY = new Color(179, 179, 179);
    private static final Color CARD_BG = new Color(45, 45, 45);

    private static final Font FONT_HEADER = new Font("SansSerif", Font.BOLD, 24);
    private static final Font FONT_TITLE = new Font("SansSerif", Font.BOLD, 16);
    private static final Font FONT_NORMAL = new Font("SansSerif", Font.PLAIN, 14);
    private static final Font FONT_SMALL = new Font("SansSerif", Font.PLAIN, 12);

    private final ArrayList<Movie> movies;

    /**
     * Public constructor used by the application entry point.
     */
    public ComflixGUI(ArrayList<Movie> movies) {
        this.movies = movies;
        new WelcomeScreen(this.movies);
    }

    /**
     * Helper used by the entry point when startup fails.
     */
    public static void showStartupError(String message) {
        JOptionPane.showMessageDialog(
            null,
            message,
            "Comflix Startup Error",
            JOptionPane.ERROR_MESSAGE
        );
    }

    /* =========================
       Welcome screen
       ========================= */
    static class WelcomeScreen extends JFrame {
        WelcomeScreen(ArrayList<Movie> movies) {
            setTitle("Comflix");
            setSize(800, 500);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setUndecorated(true);

            JPanel backgroundPanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setRenderingHint(
                        RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON
                    );

                    GradientPaint gradient = new GradientPaint(
                        0,
                        0,
                        new Color(10, 10, 10),
                        getWidth(),
                        getHeight(),
                        new Color(60, 0, 0)
                    );
                    g2d.setPaint(gradient);
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                }
            };

            backgroundPanel.setLayout(new GridBagLayout());
            add(backgroundPanel);

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(0, 0, 20, 0);

            JLabel titleLabel = new JLabel("COMFLIX");
            titleLabel.setFont(new Font("SansSerif", Font.BOLD, 64));
            titleLabel.setForeground(ACCENT_COLOR);
            backgroundPanel.add(titleLabel, gbc);

            gbc.gridy++;
            JLabel subtitleLabel = new JLabel(
                "Unlimited entertainment, strictly recommendations."
            );
            subtitleLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
            subtitleLabel.setForeground(TEXT_SECONDARY);
            backgroundPanel.add(subtitleLabel, gbc);

            gbc.gridy++;
            gbc.insets = new Insets(40, 0, 0, 0);
            JButton startButton = new ModernButton("Start Browsing");
            startButton.setPreferredSize(new Dimension(200, 50));
            startButton.addActionListener(event -> {
                dispose();
                new MainAppWindow(movies);
            });
            backgroundPanel.add(startButton, gbc);

            setVisible(true);
        }
    }

    /* =========================
       Main application window
       ========================= */
    static class MainAppWindow extends JFrame {
        private final ArrayList<Movie> movies;
        private final RecommendationEngine engine;

        // Filter controls
        private JComboBox<String> genreBox;
        private JComboBox<String> yearBox;
        private JComboBox<String> industryBox;
        private JTextField actorsField;
        private JTextField topNField;
        private JRadioButton ruleBasedButton;
        private JRadioButton similarityButton;

        // Results area
        private JPanel resultsPanel;

        MainAppWindow(ArrayList<Movie> movies) {
            this.movies = movies;
            this.engine = new RecommendationEngine(new RuleBasedRecommendation());

            setTitle("Comflix - Home");
            setSize(1200, 800);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel root = new JPanel(new BorderLayout());
            root.setBackground(BG_COLOR);
            setContentPane(root);

            root.add(buildSidebar(), BorderLayout.WEST);
            root.add(buildContentArea(), BorderLayout.CENTER);

            setVisible(true);
            updateResults();
        }

        /**
         * Builds the left sidebar containing all recommendation filters.
         */
        private JPanel buildSidebar() {
            JPanel sidebar = new JPanel();
            sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
            sidebar.setBackground(SIDEBAR_COLOR);
            sidebar.setBorder(new EmptyBorder(20, 20, 20, 20));
            sidebar.setPreferredSize(new Dimension(300, getHeight()));

            JLabel brandLabel = new JLabel("COMFLIX");
            brandLabel.setFont(new Font("SansSerif", Font.BOLD, 32));
            brandLabel.setForeground(ACCENT_COLOR);
            brandLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
            sidebar.add(brandLabel);
            sidebar.add(Box.createRigidArea(new Dimension(0, 30)));

            JLabel filtersTitle = new JLabel("FILTERS");
            filtersTitle.setFont(new Font("SansSerif", Font.BOLD, 12));
            filtersTitle.setForeground(TEXT_SECONDARY);
            filtersTitle.setAlignmentX(Component.LEFT_ALIGNMENT);
            sidebar.add(filtersTitle);
            sidebar.add(Box.createRigidArea(new Dimension(0, 15)));

            sidebar.add(createFilterLabel("Genre"));
            genreBox = createModernComboBox(new String[] {
                "Any", "Action", "Drama", "Romance", "Sci-Fi", "Comedy",
                "Thriller", "Sports", "Animation", "Horror"
            });
            sidebar.add(genreBox);
            sidebar.add(Box.createRigidArea(new Dimension(0, 15)));

            sidebar.add(createFilterLabel("Year"));
            yearBox = createModernComboBox(new String[] {
                "Any", "1980-1989", "1990-1999", "2000-2009", "2010-2019", "2020-2025"
            });
            sidebar.add(yearBox);
            sidebar.add(Box.createRigidArea(new Dimension(0, 15)));

            sidebar.add(createFilterLabel("Industry"));
            industryBox = createModernComboBox(new String[] {
                "Any", "Hollywood", "Bollywood", "Tollywood",
                "Lollywood", "Marathi", "Sandalwood", "Kollywood"
            });
            sidebar.add(industryBox);
            sidebar.add(Box.createRigidArea(new Dimension(0, 15)));

            sidebar.add(createFilterLabel("Actors (comma-separated)"));
            actorsField = createModernTextField();
            sidebar.add(actorsField);
            sidebar.add(Box.createRigidArea(new Dimension(0, 15)));

            sidebar.add(createFilterLabel("Algorithm"));
            JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
            radioPanel.setBackground(SIDEBAR_COLOR);
            radioPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

            ruleBasedButton = createModernRadioButton("Rule-Based", true);
            similarityButton = createModernRadioButton("Similarity", false);

            ButtonGroup algorithmGroup = new ButtonGroup();
            algorithmGroup.add(ruleBasedButton);
            algorithmGroup.add(similarityButton);

            radioPanel.add(ruleBasedButton);
            radioPanel.add(Box.createRigidArea(new Dimension(10, 0)));
            radioPanel.add(similarityButton);
            sidebar.add(radioPanel);
            sidebar.add(Box.createRigidArea(new Dimension(0, 15)));

            sidebar.add(createFilterLabel("Results Count"));
            topNField = createModernTextField();
            topNField.setText("10");
            sidebar.add(topNField);
            sidebar.add(Box.createVerticalGlue());

            JButton searchButton = new ModernButton("Find Movies");
            searchButton.setAlignmentX(Component.LEFT_ALIGNMENT);
            searchButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 45));
            searchButton.addActionListener(event -> updateResults());
            sidebar.add(searchButton);

            return sidebar;
        }

        /**
         * Builds the right content area where recommendation results are displayed.
         */
        private JPanel buildContentArea() {
            JPanel contentPanel = new JPanel(new BorderLayout());
            contentPanel.setBackground(BG_COLOR);

            JLabel headerLabel = new JLabel("Top Picks For You");
            headerLabel.setFont(FONT_HEADER);
            headerLabel.setForeground(TEXT_PRIMARY);
            headerLabel.setBorder(new EmptyBorder(20, 20, 10, 20));
            contentPanel.add(headerLabel, BorderLayout.NORTH);

            resultsPanel = new JPanel(new GridLayout(0, 4, 15, 15));
            resultsPanel.setBackground(BG_COLOR);

            JPanel resultsWrapper = new JPanel(new BorderLayout());
            resultsWrapper.setBackground(BG_COLOR);
            resultsWrapper.add(resultsPanel, BorderLayout.NORTH);

            JScrollPane scrollPane = new JScrollPane(resultsWrapper);
            scrollPane.setBorder(null);
            scrollPane.getVerticalScrollBar().setUnitIncrement(16);
            scrollPane.getVerticalScrollBar().setBackground(BG_COLOR);

            contentPanel.add(scrollPane, BorderLayout.CENTER);
            return contentPanel;
        }

        /**
         * Reads the selected filters from the sidebar and rebuilds the movie results grid.
         */
        private void updateResults() {
            Filters filters = buildFiltersFromUI();
            setRecommendationAlgorithmFromUI();
            int topN = parseTopN();

            ArrayList<Movie> recommendedMovies =
                engine.getTopN(new User(0, "GUIUser"), movies, filters, topN);

            resultsPanel.removeAll();

            if (recommendedMovies.isEmpty()) {
                JLabel emptyLabel = new JLabel("No movies found matching the selected criteria.");
                emptyLabel.setForeground(TEXT_SECONDARY);
                emptyLabel.setFont(FONT_TITLE);
                resultsPanel.add(emptyLabel);
            } else {
                for (Movie movie : recommendedMovies) {
                    resultsPanel.add(new MovieCard(movie));
                }
            }

            resultsPanel.revalidate();
            resultsPanel.repaint();
        }

        /**
         * Converts the current sidebar selections into a Filters object.
         */
        private Filters buildFiltersFromUI() {
            Filters filters = new Filters();

            String genre = (String) genreBox.getSelectedItem();
            if (!"Any".equals(genre)) {
                filters.setGenres(new ArrayList<>(java.util.Collections.singletonList(genre)));
            }

            String yearRange = (String) yearBox.getSelectedItem();
            if (!"Any".equals(yearRange)) {
                String[] parts = yearRange.split("-");
                filters.setYearRange(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
            }

            String industry = (String) industryBox.getSelectedItem();
            if (!"Any".equals(industry)) {
                filters.setIndustry(industry);
            }

            String actorsText = actorsField.getText().trim();
            if (!actorsText.isEmpty()) {
                String[] actorArray = actorsText.split(",");
                ArrayList<String> actorList = new ArrayList<>();
                for (String actor : actorArray) {
                    actorList.add(actor.trim());
                }
                filters.setActors(actorList);
            }

            return filters;
        }

        /**
         * Switches recommendation engine strategy based on radio button selection.
         */
        private void setRecommendationAlgorithmFromUI() {
            if (ruleBasedButton.isSelected()) {
                engine.setAlgorithm(new RuleBasedRecommendation());
            } else {
                engine.setAlgorithm(new SimilarityBasedRecommendation());
            }
        }

        /**
         * Parses the requested number of results.
         * Falls back to 10 if the input is invalid.
         */
        private int parseTopN() {
            try {
                return Integer.parseInt(topNField.getText().trim());
            } catch (NumberFormatException ignored) {
                return 10;
            }
        }

        private JLabel createFilterLabel(String text) {
            JLabel label = new JLabel(text);
            label.setFont(new Font("SansSerif", Font.BOLD, 11));
            label.setForeground(new Color(150, 150, 150));
            label.setAlignmentX(Component.LEFT_ALIGNMENT);
            return label;
        }

        private JComboBox<String> createModernComboBox(String[] items) {
            JComboBox<String> comboBox = new JComboBox<>(items);
            comboBox.setAlignmentX(Component.LEFT_ALIGNMENT);
            comboBox.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
            comboBox.setBackground(Color.WHITE);
            return comboBox;
        }

        private JTextField createModernTextField() {
            JTextField textField = new JTextField();
            textField.setAlignmentX(Component.LEFT_ALIGNMENT);
            textField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
            textField.setBackground(new Color(60, 60, 60));
            textField.setForeground(Color.WHITE);
            textField.setCaretColor(Color.WHITE);
            textField.setBorder(new EmptyBorder(5, 5, 5, 5));
            return textField;
        }

        private JRadioButton createModernRadioButton(String text, boolean selected) {
            JRadioButton radioButton = new JRadioButton(text, selected);
            radioButton.setBackground(SIDEBAR_COLOR);
            radioButton.setForeground(TEXT_PRIMARY);
            radioButton.setFocusPainted(false);
            return radioButton;
        }
    }

    /* =========================
       Custom reusable components
       ========================= */

    /**
     * Reusable movie card used in the results grid.
     */
    static class MovieCard extends JPanel {
        MovieCard(Movie movie) {
            setLayout(new BorderLayout());
            setBackground(CARD_BG);
            setPreferredSize(new Dimension(220, 300));
            setBorder(new LineBorder(new Color(60, 60, 60), 1));
            setCursor(new Cursor(Cursor.HAND_CURSOR));

            JPanel posterPlaceholder = new JPanel(new GridBagLayout());
            posterPlaceholder.setBackground(new Color(25, 25, 25));
            posterPlaceholder.setPreferredSize(new Dimension(220, 140));

            JLabel initialLabel = new JLabel(
                movie.getTitle().substring(0, 1).toUpperCase()
            );
            initialLabel.setFont(new Font("SansSerif", Font.BOLD, 56));
            initialLabel.setForeground(new Color(80, 80, 80));
            posterPlaceholder.add(initialLabel);

            add(posterPlaceholder, BorderLayout.NORTH);

            JPanel infoPanel = new JPanel();
            infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
            infoPanel.setBackground(CARD_BG);
            infoPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

            JLabel titleLabel = new JLabel(movie.getTitle());
            titleLabel.setFont(FONT_TITLE);
            titleLabel.setForeground(TEXT_PRIMARY);

            JLabel metaLabel = new JLabel(
                movie.getReleaseYear() + " • " + movie.getIndustry()
            );
            metaLabel.setFont(FONT_SMALL);
            metaLabel.setForeground(TEXT_SECONDARY);

            JLabel ratingLabel = new JLabel("⭐ " + movie.getRating());
            ratingLabel.setFont(FONT_SMALL);
            ratingLabel.setForeground(TEXT_SECONDARY);

            infoPanel.add(titleLabel);
            infoPanel.add(Box.createVerticalStrut(4));
            infoPanel.add(metaLabel);
            infoPanel.add(Box.createVerticalStrut(6));
            infoPanel.add(ratingLabel);

            add(infoPanel, BorderLayout.CENTER);

            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent event) {
                    new MovieDetailsDialog(movie);
                }

                @Override
                public void mouseEntered(MouseEvent event) {
                    setBorder(new LineBorder(ACCENT_COLOR, 2));
                    setBackground(new Color(55, 55, 55));
                    infoPanel.setBackground(new Color(55, 55, 55));
                }

                @Override
                public void mouseExited(MouseEvent event) {
                    setBorder(new LineBorder(new Color(60, 60, 60), 1));
                    setBackground(CARD_BG);
                    infoPanel.setBackground(CARD_BG);
                }
            });
        }
    }

    /**
     * Shared styled button used throughout the UI.
     */
    static class ModernButton extends JButton {
        ModernButton(String text) {
            super(text);
            setFont(new Font("SansSerif", Font.BOLD, 14));
            setForeground(Color.WHITE);
            setBackground(ACCENT_COLOR);
            setFocusPainted(false);
            setBorderPainted(false);
            setCursor(new Cursor(Cursor.HAND_CURSOR));

            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent event) {
                    setBackground(ACCENT_COLOR.brighter());
                }

                @Override
                public void mouseExited(MouseEvent event) {
                    setBackground(ACCENT_COLOR);
                }
            });
        }
    }

    /**
     * Popup dialog showing details for a selected movie.
     */
    static class MovieDetailsDialog extends JDialog {
        MovieDetailsDialog(Movie movie) {
            setTitle(movie.getTitle());
            setSize(400, 350);
            setLocationRelativeTo(null);
            setModal(true);
            setLayout(new BorderLayout());
            getContentPane().setBackground(BG_COLOR);

            JPanel content = new JPanel();
            content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
            content.setBackground(BG_COLOR);
            content.setBorder(new EmptyBorder(20, 20, 20, 20));

            JLabel titleLabel = new JLabel(movie.getTitle());
            titleLabel.setFont(FONT_HEADER);
            titleLabel.setForeground(ACCENT_COLOR);

            JLabel infoLabel = new JLabel(
                movie.getReleaseYear() + " • " + movie.getIndustry() + " • ⭐ " + movie.getRating()
            );
            infoLabel.setFont(FONT_NORMAL);
            infoLabel.setForeground(TEXT_SECONDARY);

            JTextArea detailsArea = new JTextArea(
                "Genres: " + String.join(", ", movie.getGenres()) + "\n\n" +
                "Actors: " + String.join(", ", movie.getActors())
            );
            detailsArea.setEditable(false);
            detailsArea.setLineWrap(true);
            detailsArea.setWrapStyleWord(true);
            detailsArea.setFont(FONT_NORMAL);
            detailsArea.setForeground(TEXT_PRIMARY);
            detailsArea.setBackground(BG_COLOR);
            detailsArea.setBorder(null);

            JButton closeButton = new ModernButton("Close");
            closeButton.addActionListener(event -> dispose());

            content.add(titleLabel);
            content.add(Box.createVerticalStrut(10));
            content.add(infoLabel);
            content.add(Box.createVerticalStrut(15));
            content.add(detailsArea);
            content.add(Box.createVerticalStrut(20));
            content.add(closeButton);

            add(content, BorderLayout.CENTER);
            setVisible(true);
        }
    }
}
