package lk.ijse.dto;

import java.io.Serializable;

public class MoviesDTO implements Serializable {

    private int mid;
    private String m_name;
    private String relese_date;
    private String show_time;
    private String director;

    public MoviesDTO() {
    }

    public MoviesDTO(int mid, String m_name, String relese_date, String show_time, String director) {
        this.mid = mid;
        this.m_name = m_name;
        this.relese_date = relese_date;
        this.show_time = show_time;
        this.director = director;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getRelese_date() {
        return relese_date;
    }

    public void setRelese_date(String relese_date) {
        this.relese_date = relese_date;
    }

    public String getShow_time() {
        return show_time;
    }

    public void setShow_time(String show_time) {
        this.show_time = show_time;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "MoviesDTO{" +
                "mid=" + mid +
                ", m_name='" + m_name + '\'' +
                ", relese_date='" + relese_date + '\'' +
                ", show_time='" + show_time + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}
