package org.example.Design_BookMyShow;

import org.example.Design_BookMyShow.Enums.City;

import java.util.List;
import java.util.Map;

public class BookMyShow {
    MovieController movieController;
    TheatreController theatreController;

    public BookMyShow(MovieController movieController, TheatreController theatreController) {
        this.movieController = movieController;
        this.theatreController = theatreController;
    }

    public static void main(String[] args) {

    }

    private void createBooking(City city,String movieName){
        List<Movie> movies = movieController.getMoviesByCity(city);
        Movie interestedMovie=null;
        for(Movie movie:movies){
            if(movie.getMovieName().equals(movieName)){
                interestedMovie=movie;
            }
        }

        Map<Theatre,List<Show>> showsTheatreWise=theatreController.getAllShow(interestedMovie,city);
        Map.Entry<Theatre,List<Show>> entry=showsTheatreWise.entrySet().iterator().next();
        List<Show> runningShows=entry.getValue();
        Show interestedShow=runningShows.get(0);
    }
}
