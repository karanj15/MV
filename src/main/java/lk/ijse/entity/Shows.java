package lk.ijse.entity;

import javax.persistence.*;

@Entity
@Table(name = "Shows")
public class Shows {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int showId;
    private  String showTime;

    @ManyToOne
    private Movies movies;
    @ManyToOne(cascade = CascadeType.ALL)
    private Movies movieId;

    public Shows() {
    }

    public Shows(String showTime, Movies movies, Movies movieId) {
        this.showTime = showTime;
        this.movies = movies;
        this.movieId = movieId;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public Movies getMovies() {
        return movies;
    }

    public void setMovies(Movies movies) {
        this.movies = movies;
    }

    public Movies getMovieId() {
        return movieId;
    }

    public void setMovieId(Movies movieId) {
        this.movieId = movieId;
    }

    @Override
    public String toString() {
        return "Shows{" +
                "showId=" + showId +
                ", showTime='" + showTime + '\'' +
                ", movies=" + movies +
                ", movieId=" + movieId +
                '}';
    }
}
