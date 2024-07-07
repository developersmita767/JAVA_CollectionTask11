//You are given 10 different years(2011-2020) and number of movies released in each year. Write program to store the data. Find out the year in which minimum number of movies released.
import java.util.ArrayList;
import java.util.List;

class MovieData {
    private int year;
    private int numMovies;

    public MovieData(int year, int numMovies) {
        this.year = year;
        this.numMovies = numMovies;
    }

    public int getYear() {
        return year;
    }

    public int getNumMovies() {
        return numMovies;
    }
}

public class CollectionTask11{
    public static void main(String[] args) {
        // Create a list to store movie data
        List<MovieData> movieDataList = new ArrayList<>();

        // Adding movie data for different years
        movieDataList.add(new MovieData(2011, 150));
        movieDataList.add(new MovieData(2012, 180));
        movieDataList.add(new MovieData(2013, 140));
        movieDataList.add(new MovieData(2014, 160));
        movieDataList.add(new MovieData(2015, 130));
        movieDataList.add(new MovieData(2016, 170));
        movieDataList.add(new MovieData(2017, 120));
        movieDataList.add(new MovieData(2018, 190));
        movieDataList.add(new MovieData(2019, 110));
        movieDataList.add(new MovieData(2020, 200));

        // Find the year with the minimum number of movies released
        int minMovies = Integer.MAX_VALUE;
        int minYear = 0;

        for (MovieData data : movieDataList) {
            if (data.getNumMovies() < minMovies) {
                minMovies = data.getNumMovies();
                minYear = data.getYear();
            }
        }

        // Print the year with the minimum number of movies released
        System.out.println("Year with minimum number of movies released: " + minYear);
        System.out.println("Number of movies released: " + minMovies);
    }
}
