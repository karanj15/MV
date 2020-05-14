package lk.ijse.entity;

import javax.persistence.*;

@Entity
@Table(name = "Ticket")


public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tid;
    private int ticket_No;


    @ManyToOne
    @JoinColumn(name = "cid",referencedColumnName = "cid")
    private Customer cid;

    @ManyToOne
    @JoinColumn(name = "showId",referencedColumnName = "showId")
    private Shows showId;

    public Ticket() {
    }

    public Ticket(int tid,int ticket_No, Customer cid, Shows showId) {
        this.tid=tid;
        this.ticket_No = ticket_No;
        this.cid = cid;
        this.showId = showId;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getTicket_No() {
        return ticket_No;
    }

    public void setTicket_No(int ticket_No) {
        this.ticket_No = ticket_No;
    }

    public Customer getCid() {
        return cid;
    }

    public void setCid(Customer cid) {
        this.cid = cid;
    }

    public Shows getShowId() {
        return showId;
    }

    public void setShowId(Shows showId) {
        this.showId = showId;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "tid=" + tid +
                ", ticket_No=" + ticket_No +
                ", cid=" + cid +
                ", showId=" + showId +
                '}';
    }
}
