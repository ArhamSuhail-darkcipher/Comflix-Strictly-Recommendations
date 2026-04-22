//// File: MovieSeeder.java
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MovieSeeder {

    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();

        // Bollywood movies
        movies.add(new Movie(1, "3 Idiots",
                new ArrayList<>(Arrays.asList("Comedy", "Drama")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Kareena Kapoor")),
                8.4, 2009, "Bollywood"));
        movies.add(new Movie(2, "Dangal",
                new ArrayList<>(Arrays.asList("Drama", "Sports")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Fatima Sana Shaikh")),
                8.4, 2016, "Bollywood"));
        movies.add(new Movie(3, "Bajrangi Bhaijaan",
                new ArrayList<>(Arrays.asList("Drama", "Adventure")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Harshaali Malhotra")),
                8.0, 2015, "Bollywood")); // info from Wikipedia; movie widely known :contentReference[oaicite:0]{index=0}
        movies.add(new Movie(4, "PK",
                new ArrayList<>(Arrays.asList("Comedy", "Drama")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Anushka Sharma")),
                8.1, 2014, "Bollywood"));
        movies.add(new Movie(5, "Dilwale Dulhania Le Jayenge",
                new ArrayList<>(Arrays.asList("Romance", "Drama")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Kajol")),
                8.1, 1995, "Bollywood"));
        movies.add(new Movie(6, "Lagaan",
                new ArrayList<>(Arrays.asList("Drama", "Sports")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Gracy Singh")),
                8.1, 2001, "Bollywood"));
        movies.add(new Movie(7, "Gangs of Wasseypur",
                new ArrayList<>(Arrays.asList("Action", "Drama")),
                new ArrayList<>(Arrays.asList("Manoj Bajpayee", "Nawazuddin Siddiqui")),
                8.2, 2012, "Bollywood"));
        movies.add(new Movie(8, "Barfi!",
                new ArrayList<>(Arrays.asList("Romance", "Comedy")),
                new ArrayList<>(Arrays.asList("Ranbir Kapoor", "Priyanka Chopra")),
                8.1, 2012, "Bollywood"));
        movies.add(new Movie(9, "Kal Ho Naa Ho",
                new ArrayList<>(Arrays.asList("Romance", "Drama")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Preity Zinta")),
                7.9, 2003, "Bollywood"));
        movies.add(new Movie(10, "Devdas",
                new ArrayList<>(Arrays.asList("Romance", "Drama")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Aishwarya Rai")),
                7.6, 2002, "Bollywood"));
        movies.add(new Movie(11, "Ek Tha Tiger",
                new ArrayList<>(Arrays.asList("Action", "Romance")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Katrina Kaif")),
                6.5, 2012, "Bollywood"));
        movies.add(new Movie(12, "Dhoom 3",
                new ArrayList<>(Arrays.asList("Action", "Thriller")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Abhishek Bachchan")),
                6.3, 2013, "Bollywood"));
        movies.add(new Movie(13, "Dilwale",
                new ArrayList<>(Arrays.asList("Action", "Romance")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Kajol")),
                5.6, 2015, "Bollywood"));
        movies.add(new Movie(14, "Shershaah",
                new ArrayList<>(Arrays.asList("War", "Biography")),
                new ArrayList<>(Arrays.asList("Sidharth Malhotra", "Kiara Advani")),
                8.2, 2021, "Bollywood")); // known from war film lists :contentReference[oaicite:1]{index=1}
        movies.add(new Movie(15, "Raazi",
                new ArrayList<>(Arrays.asList("Spy", "Drama")),
                new ArrayList<>(Arrays.asList("Alia Bhatt", "Vicky Kaushal")),
                7.8, 2018, "Bollywood")); // included in spy film lists :contentReference[oaicite:2]{index=2}
        movies.add(new Movie(16, "Mission Majnu",
                new ArrayList<>(Arrays.asList("Spy", "Drama")),
                new ArrayList<>(Arrays.asList("Sidharth Malhotra", "Rashmika Mandanna")),
                7.0, 2023, "Bollywood")); // included in spy list :contentReference[oaicite:3]{index=3}
        movies.add(new Movie(17, "Kahaani",
                new ArrayList<>(Arrays.asList("Thriller", "Drama")),
                new ArrayList<>(Arrays.asList("Vidya Balan", "Nawazuddin Siddiqui")),
                8.1, 2012, "Bollywood")); // noted in storytelling lists :contentReference[oaicite:4]{index=4}
        movies.add(new Movie(18, "Andhadhun",
                new ArrayList<>(Arrays.asList("Thriller", "Crime")),
                new ArrayList<>(Arrays.asList("Ayushmann Khurrana", "Tabu")),
                8.3, 2018, "Bollywood")); // listed by Times of India :contentReference[oaicite:5]{index=5}
        movies.add(new Movie(19, "Special 26",
                new ArrayList<>(Arrays.asList("Crime", "Thriller")),
                new ArrayList<>(Arrays.asList("Akshay Kumar", "Anupam Kher")),
                8.0, 2013, "Bollywood")); // known list entry :contentReference[oaicite:6]{index=6}
        movies.add(new Movie(20, "Kai Po Che!",
                new ArrayList<>(Arrays.asList("Drama", "Sports")),
                new ArrayList<>(Arrays.asList("Sushant Singh Rajput", "Rajkummar Rao")),
                7.8, 2013, "Bollywood")); // list reference :contentReference[oaicite:7]{index=7}
        movies.add(new Movie(21, "Zindagi Na Milegi Dobara",
                new ArrayList<>(Arrays.asList("Adventure", "Drama")),
                new ArrayList<>(Arrays.asList("Hrithik Roshan", "Farhan Akhtar")),
                8.2, 2011, "Bollywood"));
        movies.add(new Movie(22, "Queen",
                new ArrayList<>(Arrays.asList("Adventure", "Comedy")),
                new ArrayList<>(Arrays.asList("Kangana Ranaut", "Rajkummar Rao")),
                8.2, 2013, "Bollywood"));
        movies.add(new Movie(23, "Udaan",
                new ArrayList<>(Arrays.asList("Drama")),
                new ArrayList<>(Arrays.asList("Rajat Barmecha", "Ronit Roy")),
                8.2, 2010, "Bollywood"));
        movies.add(new Movie(24, "Swades",
                new ArrayList<>(Arrays.asList("Drama")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Gayatri Joshi")),
                8.2, 2004, "Bollywood"));
        movies.add(new Movie(25, "Chak De! India",
                new ArrayList<>(Arrays.asList("Drama", "Sports")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Vidya Malvade")),
                8.2, 2007, "Bollywood"));
        movies.add(new Movie(26, "Taare Zameen Par",
                new ArrayList<>(Arrays.asList("Drama", "Family")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Darsheel Safary")),
                8.4, 2007, "Bollywood"));
        movies.add(new Movie(27, "Gully Boy",
                new ArrayList<>(Arrays.asList("Drama", "Music")),
                new ArrayList<>(Arrays.asList("Ranveer Singh", "Alia Bhatt")),
                8.0, 2019, "Bollywood"));
        movies.add(new Movie(28, "Article 15",
                new ArrayList<>(Arrays.asList("Crime", "Drama")),
                new ArrayList<>(Arrays.asList("Ayushmann Khurrana", "Nassar")),
                8.2, 2019, "Bollywood"));
        movies.add(new Movie(29, "Drishyam",
                new ArrayList<>(Arrays.asList("Crime", "Thriller")),
                new ArrayList<>(Arrays.asList("Ajay Devgn", "Tabu")),
                8.2, 2015, "Bollywood"));
        movies.add(new Movie(30, "Haider",
                new ArrayList<>(Arrays.asList("Crime", "Drama")),
                new ArrayList<>(Arrays.asList("Shahid Kapoor", "Tabu")),
                8.1, 2014, "Bollywood"));
        movies.add(new Movie(31, "Om Shanti Om",
                new ArrayList<>(Arrays.asList("Action", "Romance")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Deepika Padukone")),
                6.7, 2007, "Bollywood"));
        movies.add(new Movie(32, "Jab We Met",
                new ArrayList<>(Arrays.asList("Comedy", "Romance")),
                new ArrayList<>(Arrays.asList("Shahid Kapoor", "Kareena Kapoor")),
                7.9, 2007, "Bollywood"));
        movies.add(new Movie(33, "Rockstar",
                new ArrayList<>(Arrays.asList("Drama", "Music")),
                new ArrayList<>(Arrays.asList("Ranbir Kapoor", "Nargis Fakhri")),
                7.7, 2011, "Bollywood"));
        movies.add(new Movie(34, "Pink",
                new ArrayList<>(Arrays.asList("Drama", "Thriller")),
                new ArrayList<>(Arrays.asList("Amitabh Bachchan", "Taapsee Pannu")),
                8.1, 2016, "Bollywood"));
        movies.add(new Movie(35, "Piku",
                new ArrayList<>(Arrays.asList("Comedy", "Drama")),
                new ArrayList<>(Arrays.asList("Amitabh Bachchan", "Deepika Padukone")),
                7.6, 2015, "Bollywood"));
        movies.add(new Movie(36, "Masaan",
                new ArrayList<>(Arrays.asList("Drama", "Romance")),
                new ArrayList<>(Arrays.asList("Vicky Kaushal", "Richa Chadda")),
                8.1, 2015, "Bollywood"));
        movies.add(new Movie(37, "Badhaai Ho",
                new ArrayList<>(Arrays.asList("Comedy", "Drama")),
                new ArrayList<>(Arrays.asList("Ayushmann Khurrana", "Neena Gupta")),
                8.0, 2018, "Bollywood"));
        movies.add(new Movie(38, "Stree",
                new ArrayList<>(Arrays.asList("Comedy", "Horror")),
                new ArrayList<>(Arrays.asList("Rajkummar Rao", "Shraddha Kapoor")),
                7.6, 2018, "Bollywood"));
        movies.add(new Movie(39, "Super 30",
                new ArrayList<>(Arrays.asList("Biography", "Drama")),
                new ArrayList<>(Arrays.asList("Hrithik Roshan", "Mrunal Thakur")),
                8.0, 2019, "Bollywood"));
        movies.add(new Movie(40, "Bajirao Mastani",
                new ArrayList<>(Arrays.asList("Action", "History")),
                new ArrayList<>(Arrays.asList("Ranveer Singh", "Deepika Padukone")),
                7.2, 2015, "Bollywood"));

        // Hollywood movies
        movies.add(new Movie(101, "Inception",
                new ArrayList<>(Arrays.asList("Action", "Sci-Fi")),
                new ArrayList<>(Arrays.asList("Leonardo DiCaprio", "Joseph Gordon-Levitt")),
                8.8, 2010, "Hollywood"));
        movies.add(new Movie(102, "The Dark Knight",
                new ArrayList<>(Arrays.asList("Action", "Drama")),
                new ArrayList<>(Arrays.asList("Christian Bale", "Heath Ledger")),
                9.0, 2008, "Hollywood"));
        movies.add(new Movie(103, "Titanic",
                new ArrayList<>(Arrays.asList("Romance", "Drama")),
                new ArrayList<>(Arrays.asList("Leonardo DiCaprio", "Kate Winslet")),
                7.8, 1997, "Hollywood"));
        movies.add(new Movie(104, "Avengers: Endgame",
                new ArrayList<>(Arrays.asList("Action", "Sci-Fi")),
                new ArrayList<>(Arrays.asList("Robert Downey Jr.", "Chris Evans")),
                8.4, 2019, "Hollywood"));
        movies.add(new Movie(105, "Forrest Gump",
                new ArrayList<>(Arrays.asList("Drama", "Romance")),
                new ArrayList<>(Arrays.asList("Tom Hanks", "Robin Wright")),
                8.8, 1994, "Hollywood"));
        movies.add(new Movie(108, "Jurassic Park",
                new ArrayList<>(Arrays.asList("Adventure", "Sci-Fi")),
                new ArrayList<>(Arrays.asList("Sam Neill", "Jeff Goldblum")),
                8.1, 1993, "Hollywood"));
        movies.add(new Movie(109, "The Matrix",
                new ArrayList<>(Arrays.asList("Action", "Sci-Fi")),
                new ArrayList<>(Arrays.asList("Keanu Reeves", "Laurence Fishburne")),
                8.7, 1999, "Hollywood"));
        movies.add(new Movie(110, "Interstellar",
                new ArrayList<>(Arrays.asList("Sci-Fi", "Drama")),
                new ArrayList<>(Arrays.asList("Matthew McConaughey", "Anne Hathaway")),
                8.6, 2014, "Hollywood"));
        movies.add(new Movie(111, "Gladiator",
                new ArrayList<>(Arrays.asList("Action", "Drama")),
                new ArrayList<>(Arrays.asList("Russell Crowe", "Joaquin Phoenix")),
                8.5, 2000, "Hollywood"));
        movies.add(new Movie(112, "The Lion King",
                new ArrayList<>(Arrays.asList("Animation", "Drama")),
                new ArrayList<>(Arrays.asList("Matthew Broderick", "Jeremy Irons")),
                8.5, 1994, "Hollywood"));
        movies.add(new Movie(113, "Fight Club",
                new ArrayList<>(Arrays.asList("Drama")),
                new ArrayList<>(Arrays.asList("Brad Pitt", "Edward Norton")),
                8.8, 1999, "Hollywood"));
        movies.add(new Movie(114, "Back to the Future",
                new ArrayList<>(Arrays.asList("Adventure", "Sci-Fi")),
                new ArrayList<>(Arrays.asList("Michael J. Fox", "Christopher Lloyd")),
                8.5, 1985, "Hollywood"));
        movies.add(new Movie(115, "Pulp Fiction",
                new ArrayList<>(Arrays.asList("Crime", "Drama")),
                new ArrayList<>(Arrays.asList("John Travolta", "Samuel L. Jackson")),
                8.9, 1994, "Hollywood"));
        movies.add(new Movie(116, "Schindler's List",
                new ArrayList<>(Arrays.asList("Biography", "Drama")),
                new ArrayList<>(Arrays.asList("Liam Neeson", "Ralph Fiennes")),
                8.9, 1993, "Hollywood"));
        movies.add(new Movie(117, "The Lord of the Rings: The Fellowship of the Ring",
                new ArrayList<>(Arrays.asList("Action", "Adventure")),
                new ArrayList<>(Arrays.asList("Elijah Wood", "Ian McKellen")),
                8.8, 2001, "Hollywood"));
        movies.add(new Movie(118, "Goodfellas",
                new ArrayList<>(Arrays.asList("Biography", "Crime")),
                new ArrayList<>(Arrays.asList("Robert De Niro", "Ray Liotta")),
                8.7, 1990, "Hollywood"));
        movies.add(new Movie(119, "The Silence of the Lambs",
                new ArrayList<>(Arrays.asList("Crime", "Drama")),
                new ArrayList<>(Arrays.asList("Jodie Foster", "Anthony Hopkins")),
                8.6, 1991, "Hollywood"));
        movies.add(new Movie(120, "Saving Private Ryan",
                new ArrayList<>(Arrays.asList("Drama", "War")),
                new ArrayList<>(Arrays.asList("Tom Hanks", "Matt Damon")),
                8.6, 1998, "Hollywood"));
        movies.add(new Movie(121, "The Green Mile",
                new ArrayList<>(Arrays.asList("Crime", "Drama")),
                new ArrayList<>(Arrays.asList("Tom Hanks", "Michael Clarke Duncan")),
                8.6, 1999, "Hollywood"));
        movies.add(new Movie(122, "Se7en",
                new ArrayList<>(Arrays.asList("Crime", "Drama")),
                new ArrayList<>(Arrays.asList("Morgan Freeman", "Brad Pitt")),
                8.6, 1995, "Hollywood"));
        movies.add(new Movie(123, "The Prestige",
                new ArrayList<>(Arrays.asList("Drama", "Mystery")),
                new ArrayList<>(Arrays.asList("Christian Bale", "Hugh Jackman")),
                8.5, 2006, "Hollywood"));
        movies.add(new Movie(124, "The Departed",
                new ArrayList<>(Arrays.asList("Crime", "Thriller")),
                new ArrayList<>(Arrays.asList("Leonardo DiCaprio", "Matt Damon")),
                8.5, 2006, "Hollywood"));
        movies.add(new Movie(125, "Whiplash",
                new ArrayList<>(Arrays.asList("Drama", "Music")),
                new ArrayList<>(Arrays.asList("Miles Teller", "J.K. Simmons")),
                8.5, 2014, "Hollywood"));
        movies.add(new Movie(126, "The Pianist",
                new ArrayList<>(Arrays.asList("Biography", "Drama")),
                new ArrayList<>(Arrays.asList("Adrien Brody", "Thomas Kretschmann")),
                8.5, 2002, "Hollywood"));
        movies.add(new Movie(127, "Django Unchained",
                new ArrayList<>(Arrays.asList("Drama", "Western")),
                new ArrayList<>(Arrays.asList("Jamie Foxx", "Christoph Waltz")),
                8.4, 2012, "Hollywood"));
        movies.add(new Movie(128, "The Wolf of Wall Street",
                new ArrayList<>(Arrays.asList("Biography", "Comedy")),
                new ArrayList<>(Arrays.asList("Leonardo DiCaprio", "Jonah Hill")),
                8.2, 2013, "Hollywood"));
        movies.add(new Movie(129, "Joker",
                new ArrayList<>(Arrays.asList("Crime", "Drama")),
                new ArrayList<>(Arrays.asList("Joaquin Phoenix", "Robert De Niro")),
                8.4, 2019, "Hollywood"));
        movies.add(new Movie(130, "Spider-Man: Into the Spider-Verse",
                new ArrayList<>(Arrays.asList("Animation", "Action")),
                new ArrayList<>(Arrays.asList("Shameik Moore", "Jake Johnson")),
                8.4, 2018, "Hollywood"));
        movies.add(new Movie(131, "Coco",
                new ArrayList<>(Arrays.asList("Animation", "Adventure")),
                new ArrayList<>(Arrays.asList("Anthony Gonzalez", "Gael Garcia Bernal")),
                8.4, 2017, "Hollywood"));
        movies.add(new Movie(132, "WALL-E",
                new ArrayList<>(Arrays.asList("Animation", "Adventure")),
                new ArrayList<>(Arrays.asList("Ben Burtt", "Elissa Knight")),
                8.4, 2008, "Hollywood"));
        movies.add(new Movie(133, "Toy Story",
                new ArrayList<>(Arrays.asList("Animation", "Comedy")),
                new ArrayList<>(Arrays.asList("Tom Hanks", "Tim Allen")),
                8.3, 1995, "Hollywood"));
        movies.add(new Movie(134, "Alien",
                new ArrayList<>(Arrays.asList("Horror", "Sci-Fi")),
                new ArrayList<>(Arrays.asList("Sigourney Weaver", "Tom Skerritt")),
                8.4, 1979, "Hollywood"));
        movies.add(new Movie(135, "Terminator 2: Judgment Day",
                new ArrayList<>(Arrays.asList("Action", "Sci-Fi")),
                new ArrayList<>(Arrays.asList("Arnold Schwarzenegger", "Linda Hamilton")),
                8.5, 1991, "Hollywood"));

        // Lollywood / Pakistani movies
        movies.add(new Movie(201, "Khuda Kay Liye",
                new ArrayList<>(Arrays.asList("Drama")),
                new ArrayList<>(Arrays.asList("Shaan Shahid", "Fawad Khan")),
                7.5, 2007, "Lollywood"));
        movies.add(new Movie(202, "Bol",
                new ArrayList<>(Arrays.asList("Drama")),
                new ArrayList<>(Arrays.asList("Humaima Malik", "Manzar Sehbai")),
                8.2, 2011, "Lollywood"));
        movies.add(new Movie(203, "Laal Kabootar",
                new ArrayList<>(Arrays.asList("Action", "Crime")),
                new ArrayList<>(Arrays.asList("Ahmed Ali Akbar", "Mansha Pasha")),
                7.8, 2019, "Lollywood"));
        movies.add(new Movie(204, "Na Band Na Baraati",
                new ArrayList<>(Arrays.asList("Comedy", "Romance")),
                new ArrayList<>(Arrays.asList("Mikaal Zulfiqar", "Anzhelika Tahir")),
                6.9, 2018, "Lollywood"));
        movies.add(new Movie(205, "I Am Shahid Afridi",
                new ArrayList<>(Arrays.asList("Sports", "Drama")),
                new ArrayList<>(Arrays.asList("Humayun Saeed", "Mahnoor Baloch")),
                7.3, 2013, "Lollywood"));
        movies.add(new Movie(206, "To Strike",
                new ArrayList<>(Arrays.asList("Action")),
                new ArrayList<>(Arrays.asList("Shaan Shahid", "Hamza Ali Abbasi")),
                7.4, 2013, "Lollywood"));
        movies.add(new Movie(207, "Zinda Bhaag",
                new ArrayList<>(Arrays.asList("Drama")),
                new ArrayList<>(Arrays.asList("Raja Hassan", "Muhammad Safwan Bawany")),
                7.5, 2013, "Lollywood"));
        movies.add(new Movie(208, "Mah e Mir",
                new ArrayList<>(Arrays.asList("Drama")),
                new ArrayList<>(Arrays.asList("Iman Ali", "Inam Hasan")),
                7.0, 2016, "Lollywood"));
        // ... previous Lollywood entries ...

        movies.add(new Movie(209, "Jawani Phir Nahi Ani",
                new ArrayList<>(Arrays.asList("Adventure", "Comedy")),
                new ArrayList<>(Arrays.asList("Humayun Saeed", "Hamza Ali Abbasi")),
                7.2, 2015, "Lollywood"));
        movies.add(new Movie(210, "Jawani Phir Nahi Ani 2",
                new ArrayList<>(Arrays.asList("Adventure", "Comedy")),
                new ArrayList<>(Arrays.asList("Humayun Saeed", "Fahad Mustafa")),
                7.0, 2018, "Lollywood"));
        movies.add(new Movie(211, "Punjab Nahi Jaungi",
                new ArrayList<>(Arrays.asList("Comedy", "Romance")),
                new ArrayList<>(Arrays.asList("Humayun Saeed", "Mehwish Hayat")),
                7.1, 2017, "Lollywood"));
        movies.add(new Movie(212, "Actor in Law",
                new ArrayList<>(Arrays.asList("Comedy", "Drama")),
                new ArrayList<>(Arrays.asList("Fahad Mustafa", "Mehwish Hayat")),
                7.7, 2016, "Lollywood"));
        movies.add(new Movie(213, "Teefa in Trouble",
                new ArrayList<>(Arrays.asList("Action", "Comedy")),
                new ArrayList<>(Arrays.asList("Ali Zafar", "Maya Ali")),
                7.3, 2018, "Lollywood"));
        movies.add(new Movie(214, "Load Wedding",
                new ArrayList<>(Arrays.asList("Comedy", "Drama")),
                new ArrayList<>(Arrays.asList("Fahad Mustafa", "Mehwish Hayat")),
                7.3, 2018, "Lollywood"));
        movies.add(new Movie(215, "Cake",
                new ArrayList<>(Arrays.asList("Drama", "Family")),
                new ArrayList<>(Arrays.asList("Aamina Sheikh", "Sanam Saeed")),
                7.6, 2018, "Lollywood"));
        movies.add(new Movie(216, "Moor",
                new ArrayList<>(Arrays.asList("Drama")),
                new ArrayList<>(Arrays.asList("Hameed Sheikh", "Samiya Mumtaz")),
                7.8, 2015, "Lollywood"));
        movies.add(new Movie(217, "Bin Roye",
                new ArrayList<>(Arrays.asList("Drama", "Romance")),
                new ArrayList<>(Arrays.asList("Mahira Khan", "Humayun Saeed")),
                6.3, 2015, "Lollywood"));
        movies.add(new Movie(218, "Ho Mann Jahaan",
                new ArrayList<>(Arrays.asList("Drama", "Music")),
                new ArrayList<>(Arrays.asList("Adeel Husain", "Mahira Khan")),
                6.7, 2015, "Lollywood"));
        // --- Shah Rukh Khan Collection ---
        movies.add(new Movie(301, "Kuch Kuch Hota Hai",
                new ArrayList<>(Arrays.asList("Romance", "Drama")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Kajol")),
                7.6, 1998, "Bollywood"));
        movies.add(new Movie(302, "Kabhi Khushi Kabhie Gham",
                new ArrayList<>(Arrays.asList("Drama", "Romance")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Kajol")),
                7.4, 2001, "Bollywood"));
        movies.add(new Movie(303, "My Name Is Khan",
                new ArrayList<>(Arrays.asList("Drama")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Kajol")),
                8.0, 2010, "Bollywood"));
        movies.add(new Movie(304, "Veer-Zaara",
                new ArrayList<>(Arrays.asList("Drama", "Romance")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Preity Zinta")),
                7.8, 2004, "Bollywood"));
        movies.add(new Movie(305, "Baazigar",
                new ArrayList<>(Arrays.asList("Crime", "Thriller")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Kajol")),
                7.6, 1993, "Bollywood"));
        movies.add(new Movie(306, "Darr",
                new ArrayList<>(Arrays.asList("Thriller", "Drama")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Juhi Chawla")),
                7.6, 1993, "Bollywood"));
        movies.add(new Movie(307, "Dil To Pagal Hai",
                new ArrayList<>(Arrays.asList("Romance", "Musical")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Madhuri Dixit")),
                7.0, 1997, "Bollywood"));
        movies.add(new Movie(308, "Mohabbatein",
                new ArrayList<>(Arrays.asList("Romance", "Musical")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Amitabh Bachchan")),
                7.1, 2000, "Bollywood"));
        movies.add(new Movie(309, "Main Hoon Na",
                new ArrayList<>(Arrays.asList("Action", "Comedy")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Sushmita Sen")),
                7.0, 2004, "Bollywood"));
        movies.add(new Movie(310, "Don",
                new ArrayList<>(Arrays.asList("Action", "Thriller")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Priyanka Chopra")),
                7.1, 2006, "Bollywood"));
        movies.add(new Movie(311, "Don 2",
                new ArrayList<>(Arrays.asList("Action", "Thriller")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Priyanka Chopra")),
                7.1, 2011, "Bollywood"));
        movies.add(new Movie(312, "Rab Ne Bana Di Jodi",
                new ArrayList<>(Arrays.asList("Romance", "Comedy")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Anushka Sharma")),
                7.2, 2008, "Bollywood"));
        movies.add(new Movie(313, "Chennai Express",
                new ArrayList<>(Arrays.asList("Action", "Comedy")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Deepika Padukone")),
                6.1, 2013, "Bollywood"));
        movies.add(new Movie(314, "Happy New Year",
                new ArrayList<>(Arrays.asList("Action", "Comedy")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Deepika Padukone")),
                5.0, 2014, "Bollywood"));
        movies.add(new Movie(315, "Fan",
                new ArrayList<>(Arrays.asList("Thriller", "Drama")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Sayani Gupta")),
                7.0, 2016, "Bollywood"));
        movies.add(new Movie(316, "Raees",
                new ArrayList<>(Arrays.asList("Action", "Crime")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Mahira Khan")),
                6.6, 2017, "Bollywood"));
        movies.add(new Movie(317, "Dear Zindagi",
                new ArrayList<>(Arrays.asList("Drama", "Romance")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Alia Bhatt")),
                7.4, 2016, "Bollywood"));
        movies.add(new Movie(318, "Pathaan",
                new ArrayList<>(Arrays.asList("Action", "Thriller")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Deepika Padukone")),
                5.9, 2023, "Bollywood"));
        movies.add(new Movie(319, "Jawan",
                new ArrayList<>(Arrays.asList("Action", "Thriller")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Nayanthara")),
                7.0, 2023, "Bollywood"));
        movies.add(new Movie(320, "Pardes",
                new ArrayList<>(Arrays.asList("Drama", "Romance")),
                new ArrayList<>(Arrays.asList("Shah Rukh Khan", "Mahima Chaudhry")),
                6.9, 1997, "Bollywood"));
        // --- Salman Khan Collection ---
        movies.add(new Movie(321, "Maine Pyar Kiya",
                new ArrayList<>(Arrays.asList("Romance", "Drama")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Bhagyashree")),
                7.6, 1989, "Bollywood"));
        movies.add(new Movie(322, "Hum Aapke Hain Koun..!",
                new ArrayList<>(Arrays.asList("Drama", "Romance")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Madhuri Dixit")),
                7.5, 1994, "Bollywood"));
        movies.add(new Movie(323, "Karan Arjun",
                new ArrayList<>(Arrays.asList("Action", "Fantasy")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Shah Rukh Khan")),
                6.8, 1995, "Bollywood"));
        movies.add(new Movie(324, "Judwaa",
                new ArrayList<>(Arrays.asList("Comedy", "Action")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Karisma Kapoor")),
                6.1, 1997, "Bollywood"));
        movies.add(new Movie(325, "Hum Dil De Chuke Sanam",
                new ArrayList<>(Arrays.asList("Romance", "Drama")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Aishwarya Rai")),
                7.5, 1999, "Bollywood"));
        movies.add(new Movie(326, "Tere Naam",
                new ArrayList<>(Arrays.asList("Romance", "Drama")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Bhumika Chawla")),
                7.2, 2003, "Bollywood"));
        movies.add(new Movie(327, "Mujhse Shaadi Karogi",
                new ArrayList<>(Arrays.asList("Comedy", "Romance")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Akshay Kumar")),
                6.7, 2004, "Bollywood"));
        movies.add(new Movie(328, "No Entry",
                new ArrayList<>(Arrays.asList("Comedy", "Drama")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Anil Kapoor")),
                6.6, 2005, "Bollywood"));
        movies.add(new Movie(329, "Partner",
                new ArrayList<>(Arrays.asList("Comedy", "Romance")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Govinda")),
                5.8, 2007, "Bollywood"));
        movies.add(new Movie(330, "Wanted",
                new ArrayList<>(Arrays.asList("Action", "Thriller")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Ayesha Takia")),
                6.6, 2009, "Bollywood"));
        movies.add(new Movie(331, "Dabangg",
                new ArrayList<>(Arrays.asList("Action", "Comedy")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Sonakshi Sinha")),
                6.2, 2010, "Bollywood"));
        movies.add(new Movie(332, "Bodyguard",
                new ArrayList<>(Arrays.asList("Action", "Romance")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Kareena Kapoor")),
                4.6, 2011, "Bollywood"));
        movies.add(new Movie(333, "Ready",
                new ArrayList<>(Arrays.asList("Comedy", "Romance")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Asin")),
                4.7, 2011, "Bollywood"));
        movies.add(new Movie(334, "Dabangg 2",
                new ArrayList<>(Arrays.asList("Action", "Comedy")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Sonakshi Sinha")),
                4.8, 2012, "Bollywood"));
        movies.add(new Movie(335, "Kick",
                new ArrayList<>(Arrays.asList("Action", "Comedy")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Jacqueline Fernandez")),
                5.3, 2014, "Bollywood"));
        movies.add(new Movie(336, "Prem Ratan Dhan Payo",
                new ArrayList<>(Arrays.asList("Drama", "Romance")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Sonam Kapoor")),
                4.4, 2015, "Bollywood"));
        movies.add(new Movie(337, "Sultan",
                new ArrayList<>(Arrays.asList("Action", "Drama")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Anushka Sharma")),
                7.0, 2016, "Bollywood"));
        movies.add(new Movie(338, "Tiger Zinda Hai",
                new ArrayList<>(Arrays.asList("Action", "Thriller")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Katrina Kaif")),
                5.9, 2017, "Bollywood"));
        movies.add(new Movie(339, "Bharat",
                new ArrayList<>(Arrays.asList("Action", "Drama")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Katrina Kaif")),
                4.7, 2019, "Bollywood"));
        movies.add(new Movie(340, "Tiger 3",
                new ArrayList<>(Arrays.asList("Action", "Thriller")),
                new ArrayList<>(Arrays.asList("Salman Khan", "Katrina Kaif")),
                5.5, 2023, "Bollywood"));
        // --- Aamir Khan Collection ---
        movies.add(new Movie(341, "Qayamat Se Qayamat Tak",
                new ArrayList<>(Arrays.asList("Romance", "Drama")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Juhi Chawla")),
                7.5, 1988, "Bollywood"));
        movies.add(new Movie(342, "Dil",
                new ArrayList<>(Arrays.asList("Comedy", "Romance")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Madhuri Dixit")),
                6.7, 1990, "Bollywood"));
        movies.add(new Movie(343, "Jo Jeeta Wohi Sikandar",
                new ArrayList<>(Arrays.asList("Drama", "Sports")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Ayesha Jhulka")),
                8.2, 1992, "Bollywood"));
        movies.add(new Movie(344, "Andaz Apna Apna",
                new ArrayList<>(Arrays.asList("Comedy", "Romance")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Salman Khan")),
                8.0, 1994, "Bollywood"));
        movies.add(new Movie(345, "Rangeela",
                new ArrayList<>(Arrays.asList("Comedy", "Romance")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Urmila Matondkar")),
                7.1, 1995, "Bollywood"));
        movies.add(new Movie(346, "Raja Hindustani",
                new ArrayList<>(Arrays.asList("Romance", "Drama")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Karisma Kapoor")),
                6.1, 1996, "Bollywood"));
        movies.add(new Movie(347, "Ishq",
                new ArrayList<>(Arrays.asList("Comedy", "Romance")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Ajay Devgn")),
                6.8, 1997, "Bollywood"));
        movies.add(new Movie(348, "Ghulam",
                new ArrayList<>(Arrays.asList("Action", "Drama")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Rani Mukerji")),
                7.3, 1998, "Bollywood"));
        movies.add(new Movie(349, "Sarfarosh",
                new ArrayList<>(Arrays.asList("Action", "Drama")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Naseeruddin Shah")),
                8.1, 1999, "Bollywood"));
        movies.add(new Movie(350, "Mann",
                new ArrayList<>(Arrays.asList("Romance", "Drama")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Manisha Koirala")),
                6.2, 1999, "Bollywood"));
        movies.add(new Movie(351, "Earth",
                new ArrayList<>(Arrays.asList("Drama", "Romance")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Nandita Das")),
                7.7, 1998, "Bollywood"));
        movies.add(new Movie(352, "Dil Chahta Hai",
                new ArrayList<>(Arrays.asList("Comedy", "Drama")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Saif Ali Khan")),
                8.1, 2001, "Bollywood"));
        movies.add(new Movie(353, "Mangal Pandey: The Rising",
                new ArrayList<>(Arrays.asList("Biography", "Drama")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Rani Mukerji")),
                6.5, 2005, "Bollywood"));
        movies.add(new Movie(354, "Rang De Basanti",
                new ArrayList<>(Arrays.asList("Drama", "History")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Siddharth")),
                8.1, 2006, "Bollywood"));
        movies.add(new Movie(355, "Fanaa",
                new ArrayList<>(Arrays.asList("Drama", "Romance")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Kajol")),
                7.1, 2006, "Bollywood"));
        movies.add(new Movie(356, "Ghajini",
                new ArrayList<>(Arrays.asList("Action", "Thriller")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Asin")),
                7.3, 2008, "Bollywood"));
        movies.add(new Movie(357, "Dhobi Ghat",
                new ArrayList<>(Arrays.asList("Drama")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Prateik Babbar")),
                7.0, 2010, "Bollywood"));
        movies.add(new Movie(358, "Talaash",
                new ArrayList<>(Arrays.asList("Crime", "Mystery")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Kareena Kapoor")),
                7.2, 2012, "Bollywood"));
        movies.add(new Movie(359, "Secret Superstar",
                new ArrayList<>(Arrays.asList("Drama", "Music")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Zaira Wasim")),
                7.8, 2017, "Bollywood"));
        movies.add(new Movie(360, "Laal Singh Chaddha",
                new ArrayList<>(Arrays.asList("Drama", "Romance")),
                new ArrayList<>(Arrays.asList("Aamir Khan", "Kareena Kapoor")),
                5.6, 2022, "Bollywood"));
        // --- Horror Genre Collection ---
        movies.add(new Movie(401, "The Exorcist",
                new ArrayList<>(Arrays.asList("Horror")),
                new ArrayList<>(Arrays.asList("Ellen Burstyn", "Max von Sydow")),
                8.1, 1973, "Hollywood"));
        movies.add(new Movie(402, "The Shining",
                new ArrayList<>(Arrays.asList("Horror", "Drama")),
                new ArrayList<>(Arrays.asList("Jack Nicholson", "Shelley Duvall")),
                8.4, 1980, "Hollywood"));
        movies.add(new Movie(403, "Psycho",
                new ArrayList<>(Arrays.asList("Horror", "Mystery")),
                new ArrayList<>(Arrays.asList("Anthony Perkins", "Janet Leigh")),
                8.5, 1960, "Hollywood"));
        movies.add(new Movie(404, "The Conjuring",
                new ArrayList<>(Arrays.asList("Horror", "Thriller")),
                new ArrayList<>(Arrays.asList("Patrick Wilson", "Vera Farmiga")),
                7.5, 2013, "Hollywood"));
        movies.add(new Movie(405, "Get Out",
                new ArrayList<>(Arrays.asList("Horror", "Mystery")),
                new ArrayList<>(Arrays.asList("Daniel Kaluuya", "Allison Williams")),
                7.8, 2017, "Hollywood"));
        movies.add(new Movie(406, "Hereditary",
                new ArrayList<>(Arrays.asList("Horror", "Drama")),
                new ArrayList<>(Arrays.asList("Toni Collette", "Alex Wolff")),
                7.3, 2018, "Hollywood"));
        movies.add(new Movie(407, "It",
                new ArrayList<>(Arrays.asList("Horror", "Thriller")),
                new ArrayList<>(Arrays.asList("Bill Skarsgard", "Jaeden Martell")),
                7.3, 2017, "Hollywood"));
        movies.add(new Movie(408, "A Nightmare on Elm Street",
                new ArrayList<>(Arrays.asList("Horror")),
                new ArrayList<>(Arrays.asList("Heather Langenkamp", "Johnny Depp")),
                7.4, 1984, "Hollywood"));
        movies.add(new Movie(409, "Halloween",
                new ArrayList<>(Arrays.asList("Horror", "Thriller")),
                new ArrayList<>(Arrays.asList("Jamie Lee Curtis", "Donald Pleasence")),
                7.7, 1978, "Hollywood"));
        movies.add(new Movie(410, "Scream",
                new ArrayList<>(Arrays.asList("Horror", "Mystery")),
                new ArrayList<>(Arrays.asList("Neve Campbell", "Courteney Cox")),
                7.4, 1996, "Hollywood"));
        movies.add(new Movie(411, "Saw",
                new ArrayList<>(Arrays.asList("Horror", "Mystery")),
                new ArrayList<>(Arrays.asList("Cary Elwes", "Leigh Whannell")),
                7.6, 2004, "Hollywood"));
        movies.add(new Movie(412, "The Ring",
                new ArrayList<>(Arrays.asList("Horror", "Mystery")),
                new ArrayList<>(Arrays.asList("Naomi Watts", "Martin Henderson")),
                7.1, 2002, "Hollywood"));
        movies.add(new Movie(413, "Insidious",
                new ArrayList<>(Arrays.asList("Horror", "Thriller")),
                new ArrayList<>(Arrays.asList("Patrick Wilson", "Rose Byrne")),
                6.8, 2010, "Hollywood"));
        movies.add(new Movie(414, "The Blair Witch Project",
                new ArrayList<>(Arrays.asList("Horror", "Mystery")),
                new ArrayList<>(Arrays.asList("Heather Donahue", "Michael C. Williams")),
                6.5, 1999, "Hollywood"));
        movies.add(new Movie(415, "A Quiet Place",
                new ArrayList<>(Arrays.asList("Horror", "Drama")),
                new ArrayList<>(Arrays.asList("Emily Blunt", "John Krasinski")),
                7.5, 2018, "Hollywood"));
        movies.add(new Movie(416, "The Sixth Sense",
                new ArrayList<>(Arrays.asList("Drama", "Mystery")),
                new ArrayList<>(Arrays.asList("Bruce Willis", "Haley Joel Osment")),
                8.2, 1999, "Hollywood"));
        movies.add(new Movie(417, "Tumbbad",
                new ArrayList<>(Arrays.asList("Horror", "Fantasy")),
                new ArrayList<>(Arrays.asList("Sohum Shah", "Jyoti Malshe")),
                8.2, 2018, "Bollywood"));
        movies.add(new Movie(418, "Raaz",
                new ArrayList<>(Arrays.asList("Horror", "Thriller")),
                new ArrayList<>(Arrays.asList("Bipasha Basu", "Dino Morea")),
                6.6, 2002, "Bollywood"));
        movies.add(new Movie(419, "Bhool Bhulaiyaa",
                new ArrayList<>(Arrays.asList("Horror", "Comedy")),
                new ArrayList<>(Arrays.asList("Akshay Kumar", "Vidya Balan")),
                7.4, 2007, "Bollywood"));
        movies.add(new Movie(420, "1920",
                new ArrayList<>(Arrays.asList("Horror", "Mystery")),
                new ArrayList<>(Arrays.asList("Rajniesh Duggall", "Adah Sharma")),
                6.4, 2008, "Bollywood"));
        movies.add(new Movie(376, "Sholay",
                new ArrayList<>(Arrays.asList("Action", "Adventure")),
                new ArrayList<>(Arrays.asList("Dharmendra", "Amitabh Bachchan")),
                8.2, 1975, "Bollywood"));
        movies.add(new Movie(377, "Mughal-e-Azam",
                new ArrayList<>(Arrays.asList("Drama", "Romance")),
                new ArrayList<>(Arrays.asList("Dilip Kumar", "Madhubala")),
                8.4, 1960, "Bollywood"));
        movies.add(new Movie(378, "Deewaar",
                new ArrayList<>(Arrays.asList("Action", "Crime")),
                new ArrayList<>(Arrays.asList("Amitabh Bachchan", "Shashi Kapoor")),
                8.1, 1975, "Bollywood"));
        movies.add(new Movie(379, "Anand",
                new ArrayList<>(Arrays.asList("Drama", "Musical")),
                new ArrayList<>(Arrays.asList("Rajesh Khanna", "Amitabh Bachchan")),
                8.3, 1971, "Bollywood"));
        movies.add(new Movie(380, "Jaane Bhi Do Yaaro",
                new ArrayList<>(Arrays.asList("Comedy", "Drama")),
                new ArrayList<>(Arrays.asList("Naseeruddin Shah", "Ravi Baswani")),
                8.4, 1983, "Bollywood"));
        movies.add(new Movie(381, "Mr. India",
                new ArrayList<>(Arrays.asList("Action", "Comedy")),
                new ArrayList<>(Arrays.asList("Anil Kapoor", "Sridevi")),
                7.8, 1987, "Bollywood"));
        movies.add(new Movie(382, "Hera Pheri",
                new ArrayList<>(Arrays.asList("Comedy", "Crime")),
                new ArrayList<>(Arrays.asList("Akshay Kumar", "Paresh Rawal")),
                8.2, 2000, "Bollywood"));
        movies.add(new Movie(383, "Munna Bhai M.B.B.S.",
                new ArrayList<>(Arrays.asList("Comedy", "Drama")),
                new ArrayList<>(Arrays.asList("Sanjay Dutt", "Arshad Warsi")),
                8.1, 2003, "Bollywood"));
        movies.add(new Movie(384, "Gangs of Wasseypur",
                new ArrayList<>(Arrays.asList("Action", "Crime")),
                new ArrayList<>(Arrays.asList("Manoj Bajpayee", "Nawazuddin Siddiqui")),
                8.2, 2012, "Bollywood"));
        movies.add(new Movie(385, "Drishyam",
                new ArrayList<>(Arrays.asList("Crime", "Thriller")),
                new ArrayList<>(Arrays.asList("Ajay Devgn", "Tabu")),
                8.2, 2015, "Bollywood"));
        movies.add(new Movie(386, "Andhadhun",
                new ArrayList<>(Arrays.asList("Crime", "Thriller")),
                new ArrayList<>(Arrays.asList("Ayushmann Khurrana", "Tabu")),
                8.2, 2018, "Bollywood"));
        movies.add(new Movie(387, "Tumbbad",
                new ArrayList<>(Arrays.asList("Horror", "Fantasy")),
                new ArrayList<>(Arrays.asList("Sohum Shah", "Jyoti Malshe")),
                8.3, 2018, "Bollywood"));
        movies.add(new Movie(388, "Uri: The Surgical Strike",
                new ArrayList<>(Arrays.asList("Action", "Drama")),
                new ArrayList<>(Arrays.asList("Vicky Kaushal", "Paresh Rawal")),
                8.2, 2019, "Bollywood"));
        movies.add(new Movie(389, "Baahubali: The Beginning",
                new ArrayList<>(Arrays.asList("Action", "Adventure")),
                new ArrayList<>(Arrays.asList("Prabhas", "Rana Daggubati")),
                8.0, 2015, "Tollywood"));
        movies.add(new Movie(390, "Baahubali 2: The Conclusion",
                new ArrayList<>(Arrays.asList("Action", "Adventure")),
                new ArrayList<>(Arrays.asList("Prabhas", "Anushka Shetty")),
                8.2, 2017, "Tollywood"));
        movies.add(new Movie(391, "RRR",
                new ArrayList<>(Arrays.asList("Action", "Drama")),
                new ArrayList<>(Arrays.asList("N.T. Rama Rao Jr.", "Ram Charan")),
                8.0, 2022, "Tollywood"));
        movies.add(new Movie(392, "K.G.F: Chapter 1",
                new ArrayList<>(Arrays.asList("Action", "Crime")),
                new ArrayList<>(Arrays.asList("Yash", "Srinidhi Shetty")),
                8.2, 2018, "Sandalwood"));
        movies.add(new Movie(393, "K.G.F: Chapter 2",
                new ArrayList<>(Arrays.asList("Action", "Crime")),
                new ArrayList<>(Arrays.asList("Yash", "Sanjay Dutt")),
                8.4, 2022, "Sandalwood"));
        movies.add(new Movie(394, "Kantara",
                new ArrayList<>(Arrays.asList("Action", "Adventure")),
                new ArrayList<>(Arrays.asList("Rishab Shetty", "Kishore")),
                8.3, 2022, "Sandalwood"));
        movies.add(new Movie(395, "Vikram",
                new ArrayList<>(Arrays.asList("Action", "Thriller")),
                new ArrayList<>(Arrays.asList("Kamal Haasan", "Vijay Sethupathi")),
                8.3, 2022, "Kollywood"));
        movies.add(new Movie(396, "Super Deluxe",
                new ArrayList<>(Arrays.asList("Crime", "Drama")),
                new ArrayList<>(Arrays.asList("Vijay Sethupathi", "Fahadh Faasil")),
                8.4, 2019, "Kollywood"));
        movies.add(new Movie(397, "Kumbalangi Nights",
                new ArrayList<>(Arrays.asList("Comedy", "Drama")),
                new ArrayList<>(Arrays.asList("Shane Nigam", "Fahadh Faasil")),
                8.6, 2019, "Mollywood"));
        movies.add(new Movie(398, "Sairat",
                new ArrayList<>(Arrays.asList("Drama", "Romance")),
                new ArrayList<>(Arrays.asList("Rinku Rajguru", "Akash Thosar")),
                8.3, 2016, "Marathi"));
        movies.add(new Movie(399, "Haider",
                new ArrayList<>(Arrays.asList("Action", "Crime")),
                new ArrayList<>(Arrays.asList("Shahid Kapoor", "Tabu")),
                8.0, 2014, "Bollywood"));
// --- Hollywood All-Time Top Rated (401-430) ---
        movies.add(new Movie(401, "The Shawshank Redemption",
                new ArrayList<>(Arrays.asList("Drama")),
                new ArrayList<>(Arrays.asList("Tim Robbins", "Morgan Freeman")),
                9.3, 1994, "Hollywood"));
        movies.add(new Movie(402, "The Godfather",
                new ArrayList<>(Arrays.asList("Crime", "Drama")),
                new ArrayList<>(Arrays.asList("Marlon Brando", "Al Pacino")),
                9.2, 1972, "Hollywood"));
        movies.add(new Movie(403, "The Dark Knight",
                new ArrayList<>(Arrays.asList("Action", "Crime")),
                new ArrayList<>(Arrays.asList("Christian Bale", "Heath Ledger")),
                9.0, 2008, "Hollywood"));
        movies.add(new Movie(404, "The Godfather Part II",
                new ArrayList<>(Arrays.asList("Crime", "Drama")),
                new ArrayList<>(Arrays.asList("Al Pacino", "Robert De Niro")),
                9.0, 1974, "Hollywood"));
        movies.add(new Movie(405, "12 Angry Men",
                new ArrayList<>(Arrays.asList("Drama")),
                new ArrayList<>(Arrays.asList("Henry Fonda", "Lee J. Cobb")),
                9.0, 1957, "Hollywood"));
        movies.add(new Movie(406, "Schindler's List",
                new ArrayList<>(Arrays.asList("Biography", "Drama")),
                new ArrayList<>(Arrays.asList("Liam Neeson", "Ralph Fiennes")),
                8.9, 1993, "Hollywood"));
        movies.add(new Movie(407, "The Lord of the Rings: The Return of the King",
                new ArrayList<>(Arrays.asList("Action", "Adventure")),
                new ArrayList<>(Arrays.asList("Elijah Wood", "Viggo Mortensen")),
                8.9, 2003, "Hollywood"));
        movies.add(new Movie(408, "Pulp Fiction",
                new ArrayList<>(Arrays.asList("Crime", "Drama")),
                new ArrayList<>(Arrays.asList("John Travolta", "Uma Thurman")),
                8.9, 1994, "Hollywood"));
        movies.add(new Movie(409, "The Lord of the Rings: The Fellowship of the Ring",
                new ArrayList<>(Arrays.asList("Action", "Adventure")),
                new ArrayList<>(Arrays.asList("Elijah Wood", "Ian McKellen")),
                8.8, 2001, "Hollywood"));
        movies.add(new Movie(410, "The Good, the Bad and the Ugly",
                new ArrayList<>(Arrays.asList("Adventure", "Western")),
                new ArrayList<>(Arrays.asList("Clint Eastwood", "Eli Wallach")),
                8.8, 1966, "Hollywood"));
        movies.add(new Movie(411, "Forrest Gump",
                new ArrayList<>(Arrays.asList("Drama", "Romance")),
                new ArrayList<>(Arrays.asList("Tom Hanks", "Robin Wright")),
                8.8, 1994, "Hollywood"));
        movies.add(new Movie(412, "Fight Club",
                new ArrayList<>(Arrays.asList("Drama")),
                new ArrayList<>(Arrays.asList("Brad Pitt", "Edward Norton")),
                8.8, 1999, "Hollywood"));
        movies.add(new Movie(413, "Inception",
                new ArrayList<>(Arrays.asList("Action", "Sci-Fi")),
                new ArrayList<>(Arrays.asList("Leonardo DiCaprio", "Joseph Gordon-Levitt")),
                8.8, 2010, "Hollywood"));
        movies.add(new Movie(414, "The Lord of the Rings: The Two Towers",
                new ArrayList<>(Arrays.asList("Action", "Adventure")),
                new ArrayList<>(Arrays.asList("Elijah Wood", "Ian McKellen")),
                8.7, 2002, "Hollywood"));
        movies.add(new Movie(415, "Star Wars: Episode V - The Empire Strikes Back",
                new ArrayList<>(Arrays.asList("Action", "Adventure")),
                new ArrayList<>(Arrays.asList("Mark Hamill", "Harrison Ford")),
                8.7, 1980, "Hollywood"));
        movies.add(new Movie(416, "The Matrix",
                new ArrayList<>(Arrays.asList("Action", "Sci-Fi")),
                new ArrayList<>(Arrays.asList("Keanu Reeves", "Laurence Fishburne")),
                8.7, 1999, "Hollywood"));
        movies.add(new Movie(417, "Goodfellas",
                new ArrayList<>(Arrays.asList("Biography", "Crime")),
                new ArrayList<>(Arrays.asList("Robert De Niro", "Ray Liotta")),
                8.7, 1990, "Hollywood"));
        movies.add(new Movie(418, "One Flew Over the Cuckoo's Nest",
                new ArrayList<>(Arrays.asList("Drama")),
                new ArrayList<>(Arrays.asList("Jack Nicholson", "Louise Fletcher")),
                8.7, 1975, "Hollywood"));
        movies.add(new Movie(419, "Se7en",
                new ArrayList<>(Arrays.asList("Crime", "Drama")),
                new ArrayList<>(Arrays.asList("Morgan Freeman", "Brad Pitt")),
                8.6, 1995, "Hollywood"));
        movies.add(new Movie(420, "Seven Samurai",
                new ArrayList<>(Arrays.asList("Action", "Drama")),
                new ArrayList<>(Arrays.asList("Toshiro Mifune", "Takashi Shimura")),
                8.6, 1954, "Japanese"));
        movies.add(new Movie(421, "It's a Wonderful Life",
                new ArrayList<>(Arrays.asList("Drama", "Family")),
                new ArrayList<>(Arrays.asList("James Stewart", "Donna Reed")),
                8.6, 1946, "Hollywood"));
        movies.add(new Movie(422, "The Silence of the Lambs",
                new ArrayList<>(Arrays.asList("Crime", "Drama")),
                new ArrayList<>(Arrays.asList("Jodie Foster", "Anthony Hopkins")),
                8.6, 1991, "Hollywood"));
        movies.add(new Movie(423, "Saving Private Ryan",
                new ArrayList<>(Arrays.asList("Drama", "War")),
                new ArrayList<>(Arrays.asList("Tom Hanks", "Matt Damon")),
                8.6, 1998, "Hollywood"));
        movies.add(new Movie(424, "City of God",
                new ArrayList<>(Arrays.asList("Crime", "Drama")),
                new ArrayList<>(Arrays.asList("Alexandre Rodrigues", "Leandro Firmino")),
                8.6, 2002, "Brazilian"));
        movies.add(new Movie(425, "Interstellar",
                new ArrayList<>(Arrays.asList("Adventure", "Drama")),
                new ArrayList<>(Arrays.asList("Matthew McConaughey", "Anne Hathaway")),
            8.6, 2014, "Hollywood"));
        movies.add(new Movie(426, "Life Is Beautiful",
                new ArrayList<>(Arrays.asList("Comedy", "Drama")),
                new ArrayList<>(Arrays.asList("Roberto Benigni", "Nicoletta Braschi")),
                8.6, 1997, "Italian"));
        movies.add(new Movie(427, "The Green Mile",
                new ArrayList<>(Arrays.asList("Crime", "Drama")),
                new ArrayList<>(Arrays.asList("Tom Hanks", "Michael Clarke Duncan")),
                8.6, 1999, "Hollywood"));
        movies.add(new Movie(428, "Star Wars: Episode IV - A New Hope",
                new ArrayList<>(Arrays.asList("Action", "Adventure")),
                new ArrayList<>(Arrays.asList("Mark Hamill", "Harrison Ford")),
                8.6, 1977, "Hollywood"));
        movies.add(new Movie(429, "Terminator 2: Judgment Day",
                new ArrayList<>(Arrays.asList("Action", "Sci-Fi")),
                new ArrayList<>(Arrays.asList("Arnold Schwarzenegger", "Linda Hamilton")),
                8.5, 1991, "Hollywood"));
        movies.add(new Movie(430, "Back to the Future",
                new ArrayList<>(Arrays.asList("Adventure", "Comedy")),
                new ArrayList<>(Arrays.asList("Michael J. Fox", "Christopher Lloyd")),
                8.5, 1985, "Hollywood"));

// --- Modern Hollywood Blockbusters & Animation (431-460) ---
        movies.add(new Movie(431, "Spirited Away",
                new ArrayList<>(Arrays.asList("Animation", "Adventure")),
                new ArrayList<>(Arrays.asList("Rumi Hiiragi", "Miyu Irino")),
                8.6, 2001, "Anime"));
        movies.add(new Movie(432, "The Pianist",
                new ArrayList<>(Arrays.asList("Biography", "Drama")),
                new ArrayList<>(Arrays.asList("Adrien Brody", "Thomas Kretschmann")),
                8.5, 2002, "Hollywood"));
        movies.add(new Movie(433, "Parasite",
                new ArrayList<>(Arrays.asList("Drama", "Thriller")),
                new ArrayList<>(Arrays.asList("Song Kang-ho", "Lee Sun-kyun")),
                8.5, 2019, "Korean"));
        movies.add(new Movie(435, "Gladiator",
                new ArrayList<>(Arrays.asList("Action", "Drama")),
                new ArrayList<>(Arrays.asList("Russell Crowe", "Joaquin Phoenix")),
                8.5, 2000, "Hollywood"));
        movies.add(new Movie(437, "The Departed",
                new ArrayList<>(Arrays.asList("Crime", "Drama")),
                new ArrayList<>(Arrays.asList("Leonardo DiCaprio", "Matt Damon")),
                8.5, 2006, "Hollywood"));
        movies.add(new Movie(438, "Whiplash",
                new ArrayList<>(Arrays.asList("Drama", "Music")),
                new ArrayList<>(Arrays.asList("Miles Teller", "J.K. Simmons")),
                8.5, 2014, "Hollywood"));
        movies.add(new Movie(439, "The Prestige",
                new ArrayList<>(Arrays.asList("Drama", "Mystery")),
                new ArrayList<>(Arrays.asList("Christian Bale", "Hugh Jackman")),
                8.5, 2006, "Hollywood"));
        movies.add(new Movie(440, "The Usual Suspects",
                new ArrayList<>(Arrays.asList("Crime", "Thriller")),
                new ArrayList<>(Arrays.asList("Kevin Spacey", "Gabriel Byrne")),
                8.5, 1995, "Hollywood"));
        movies.add(new Movie(441, "Casablanca",
                new ArrayList<>(Arrays.asList("Drama", "Romance")),
                new ArrayList<>(Arrays.asList("Humphrey Bogart", "Ingrid Bergman")),
                8.5, 1942, "Hollywood"));
        movies.add(new Movie(442, "Grave of the Fireflies",
                new ArrayList<>(Arrays.asList("Animation", "Drama")),
                new ArrayList<>(Arrays.asList("Tsutomu Tatsumi", "Ayano Shiraishi")),
                8.5, 1988, "Anime"));
        movies.add(new Movie(443, "Harakiri",
                new ArrayList<>(Arrays.asList("Action", "Drama")),
                new ArrayList<>(Arrays.asList("Tatsuya Nakadai", "Akira Ishihama")),
                8.6, 1962, "Japanese"));
        movies.add(new Movie(444, "The Intouchables",
                new ArrayList<>(Arrays.asList("Biography", "Comedy")),
                new ArrayList<>(Arrays.asList("François Cluzet", "Omar Sy")),
                8.5, 2011, "French"));
        movies.add(new Movie(445, "Modern Times",
                new ArrayList<>(Arrays.asList("Comedy", "Drama")),
                new ArrayList<>(Arrays.asList("Charlie Chaplin", "Paulette Goddard")),
                8.5, 1936, "Hollywood"));
        movies.add(new Movie(446, "Cinema Paradiso",
                new ArrayList<>(Arrays.asList("Drama")),
                new ArrayList<>(Arrays.asList("Philippe Noiret", "Enzo Cannavale")),
                8.5, 1988, "Italian"));
        movies.add(new Movie(447, "Rear Window",
                new ArrayList<>(Arrays.asList("Mystery", "Thriller")),
                new ArrayList<>(Arrays.asList("James Stewart", "Grace Kelly")),
                8.5, 1954, "Hollywood"));
        movies.add(new Movie(448, "Once Upon a Time in the West",
                new ArrayList<>(Arrays.asList("Western")),
                new ArrayList<>(Arrays.asList("Henry Fonda", "Charles Bronson")),
                8.5, 1968, "Hollywood"));
        movies.add(new Movie(450, "Django Unchained",
                new ArrayList<>(Arrays.asList("Drama", "Western")),
                new ArrayList<>(Arrays.asList("Jamie Foxx", "Christoph Waltz")),
                8.4, 2012, "Hollywood"));
        movies.add(new Movie(451, "Memento",
                new ArrayList<>(Arrays.asList("Mystery", "Thriller")),
                new ArrayList<>(Arrays.asList("Guy Pearce", "Carrie-Anne Moss")),
                8.4, 2000, "Hollywood"));
        movies.add(new Movie(452, "Apocalypse Now",
                new ArrayList<>(Arrays.asList("Drama", "War")),
                new ArrayList<>(Arrays.asList("Martin Sheen", "Marlon Brando")),
                8.4, 1979, "Hollywood"));
        movies.add(new Movie(453, "Raiders of the Lost Ark",
                new ArrayList<>(Arrays.asList("Action", "Adventure")),
                new ArrayList<>(Arrays.asList("Harrison Ford", "Karen Allen")),
                8.4, 1981, "Hollywood"));
        movies.add(new Movie(455, "The Lives of Others",
                new ArrayList<>(Arrays.asList("Drama", "Thriller")),
                new ArrayList<>(Arrays.asList("Ulrich Mühe", "Martina Gedeck")),
                8.4, 2006, "German"));
        movies.add(new Movie(456, "Sunset Blvd.",
                new ArrayList<>(Arrays.asList("Drama", "Noir")),
                new ArrayList<>(Arrays.asList("William Holden", "Gloria Swanson")),
                8.4, 1950, "Hollywood"));
        movies.add(new Movie(457, "Paths of Glory",
                new ArrayList<>(Arrays.asList("Drama", "War")),
                new ArrayList<>(Arrays.asList("Kirk Douglas", "Ralph Meeker")),
                8.4, 1957, "Hollywood"));
        movies.add(new Movie(459, "The Great Dictator",
                new ArrayList<>(Arrays.asList("Comedy", "Drama")),
                new ArrayList<>(Arrays.asList("Charlie Chaplin", "Paulette Goddard")),
                8.4, 1940, "Hollywood"));
        movies.add(new Movie(460, "Avengers: Infinity War",
                new ArrayList<>(Arrays.asList("Action", "Sci-Fi")),
                new ArrayList<>(Arrays.asList("Robert Downey Jr.", "Chris Hemsworth","Chris Evans","Scarlett Johannson")),
                8.4, 2018, "Hollywood"));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("movies.dat"))) {
            oos.writeObject(movies);
            System.out.println("Movies seeded successfully: " + movies.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

