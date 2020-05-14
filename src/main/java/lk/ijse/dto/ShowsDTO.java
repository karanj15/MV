package lk.ijse.dto;

public class ShowsDTO {
    private int showId;
    private  String showTime;
    private int movieId;

    public ShowsDTO() {
    }

    public ShowsDTO(int showId, String showTime, int movieId) {
        this.showId = showId;
        this.showTime = showTime;
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

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    @Override
    public String toString() {
        return "ShowsDTO{" +
                "showId=" + showId +
                ", showTime='" + showTime + '\'' +
                ", movieId=" + movieId +
                '}';
    }
}
