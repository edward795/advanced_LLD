package org.example.Design_BookMyShow;

import org.example.Design_BookMyShow.Enums.City;
import org.example.Design_BookMyShow.Enums.SeatCategory;

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

    BookMyShow(){
        movieController=new MovieController();
        theatreController=new TheatreController();
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow=new BookMyShow();
        bookMyShow.initialize();
        bookMyShow.createBooking(City.Bangalore,"BAAHUBALI");
        bookMyShow.createBooking(City.Bangalore,"BAAHUBALI");

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

    private void initialize(){
        //create movies
        createMovies();

        //create theater with screens,seats and shows
        createTheatre();
    }

    private void createTheatre(){
        Movie avengerMovie=movieController.getMovieByName("AVENGERS");
        Movie baahubali=movieController.getMovieByName("BAAHUBALI");
        Theatre inoxTheatre=new Theatre();
        inoxTheatre.setTheatreId(1);
        inoxTheatre.setScreen(createScreen());
        inoxTheatre.setCity(City.Bangalore);
        List<Show> inoxShows=new ArrayList<>();
        Show inoxMorningShow=createShows(1,inoxTheatre.getScreen().get(0),avengerMovie,8 );
        Show inoxEveningShow=createShows(2,inoxTheatre.getScreen().get(0),baahubali,16 );
        inoxShows.add(inoxMorningShow);
        inoxShows.add(inoxEveningShow);
        inoxTheatre.setShows(inoxShows);

        Theatre pvrTheatre=new Theatre();
        pvrTheatre.setTheatreId(2);
        pvrTheatre.setScreen(createScreen());
        pvrTheatre.setCity(City.Delhi);
        List<Show> pvrShows=new ArrayList<>();
        Show pvrMorningShow=createShows(3,pvrTheatre.getScreen().get(0),avengerMovie,13 );
        Show pvrEveningShow=createShows(4,pvrTheatre.getScreen().get(0),baahubali,20 );
        pvrShows.add(pvrMorningShow);
        pvrShows.add(pvrEveningShow);

        theatreController.addTheatre(inoxTheatre,City.Bangalore);
        theatreController.addTheatre(pvrTheatre,City.Delhi);
    }

    private Show createShows(int showId,Screen screen,Movie movie,int showStartTime){
        Show show=new Show();
        show.setShowId(showId);
        show.setScreen(screen);
        show.setMovie(movie);
        show.setShowStartTime(showStartTime);
        return show;
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

    private List<Screen> createScreen(){
        List<Screen> screens=new ArrayList<>();
        Screen screen1=new Screen();
        screen1.setScreenId(1);
        screen1.setSeats(createSeats());
        screens.add(screen1);
        return screens;
    }
    private List<Seat> createSeats(){
        List<Seat> seats=new ArrayList<>();

        //SILVER
        for(int i=0;i<40;i++){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            seats.add(seat);
        }

        //GOLD
        for(int i=40;i<70;i++){
            Seat seat=new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seats.add(seat);
        }

        //PLATINUM
        for(int i=70;i<100;i++){
            Seat seat=new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.PLATINUM);
            seats.add(seat);
        }

        return seats;
    }
}
