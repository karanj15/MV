package lk.ijse.service;

import lk.ijse.dto.TicketDTO;
import lk.ijse.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketService {

    List<TicketDTO> getAllTicket();
}
