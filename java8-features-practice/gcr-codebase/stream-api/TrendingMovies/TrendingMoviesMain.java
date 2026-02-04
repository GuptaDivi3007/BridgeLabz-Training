package TrendingMovies;

import java.util.*;
import java.util.stream.*;
// Main class
public class TrendingMoviesMain {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Movie X",6.9,2020),
                new Movie("Movie Y",9.9,2020),
                new Movie("Movie Z",8.1,2012),
                new Movie("Movie A",9.3,2024),
                new Movie("Movie B",8.9,2021),
                new Movie("Movie P",8.8,2022),
                new Movie("Movie Q",9.3,2024));
        List<Movie> top5TrendingMovies=movies.stream()
                .filter(m -> m.getRating() >= 8.5)
                .sorted(Comparator.comparing(Movie::getRating).reversed().thenComparing(Movie::getReleaseYear, Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors.toList());
        top5TrendingMovies.forEach(System.out::println);
    }
}

