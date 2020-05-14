package lk.ijse.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
    private int cid;
    private String cname;
    private String email;
    private String phoneNo;

    public CustomerDTO() {
    }

    public CustomerDTO(int cid, String cname, String email, String phoneNo) {
        this.cid = cid;
        this.cname = cname;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
