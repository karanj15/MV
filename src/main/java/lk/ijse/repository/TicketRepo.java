package lk.ijse.repository;

import lk.ijse.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<Ticket,Integer> {

}
