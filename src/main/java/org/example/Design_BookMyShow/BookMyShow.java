package org.example.Design_BookMyShow;

import org.example.Design_BookMyShow.Enums.City;

import java.util.ArrayList;
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

        int seatNumber=30;
        List<Integer> bookedSeats=interestedShow.getBookedSeats();
        if(!bookedSeats.contains(seatNumber)){
            bookedSeats.add(seatNumber);

            Booking booking=new Booking();
            List<Seat> myBookedSeats=new ArrayList<>();
            for(Seat screenSeat:interestedShow.getScreen().getSeats()){
                if(screenSeat.getSeatId()==seatNumber){
                    myBookedSeats.add(screenSeat);
                }
            }
            booking.setBookedSeats(myBookedSeats);
            booking.setShow(interestedShow);
        }else{
            System.out.println("seat already booked, try again");
            return;
        }
        System.out.println("BOOKING SUCCESSFUL");
    }

    private void createTheatre(){
        Movie avengerMovie=movieController.getMovieByName("AVENGERS");
        Movie baahubali=movieController.getMovieByName("BAAHUBALI");
        Theatre inoxTheatre=new Theatre();
        inoxTheatre.setTheatreId(1);
        inoxTheatre.setScreen(create);

    }

    private void createMovies(){
        Movie avengers=new Movie();
        avengers.setMovieId(1);
        avengers.setMovieName("AVENGERS");
        avengers.setMovieDurationInMinutes(128);

        Movie baahubali=new Movie();
        baahubali.setMovieId(2);
        baahubali.setMovieName("BAAHUBALI");
        baahubali.setMovieDurationInMinutes(180);

        movieController.addMovie(avengers,City.Bangalore);
        movieController.addMovie(avengers,City.Delhi);
        movieController.addMovie(baahubali,City.Bangalore);
        movieController.addMovie(baahubali,City.Delhi);
    }
}
