package lk.ijse.dto;

public class TicketDTO {

    private int tid;
    private int ticket_No;
    private int cid;
    private int showId;

    public TicketDTO() {
    }

    public TicketDTO(int tid, int ticket_No, int cid, int showId) {
        this.tid = tid;
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

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    @Override
    public String toString() {
        return "TicketDTO{" +
                "tid=" + tid +
                ", ticket_No=" + ticket_No +
                ", cid=" + cid +
                ", showId=" + showId +
                '}';
    }
}
