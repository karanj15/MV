package lk.ijse.entity;

import javax.persistence.*;

@Entity
@Table(name = "seat")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int seat_id;
    private int no_of_seat;
    private String seat_Name;

    public Seat() {
    }

    public Seat(int seat_id,int no_of_seat, String seat_Name) {
        this.seat_id=seat_id;
        this.no_of_seat = no_of_seat;
        this.seat_Name = seat_Name;
    }

    public int getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(int seat_id) {
        this.seat_id = seat_id;
    }

    public int getNo_of_seat() {
        return no_of_seat;
    }

    public void setNo_of_seat(int no_of_seat) {
        this.no_of_seat = no_of_seat;
    }

    public String getSeat_Name() {
        return seat_Name;
    }

    public void setSeat_Name(String seat_Name) {
        this.seat_Name = seat_Name;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seat_id=" + seat_id +
                ", no_of_seat=" + no_of_seat +
                ", seat_Name='" + seat_Name + '\'' +
                '}';
    }
}
