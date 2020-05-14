package lk.ijse.restController;

import lk.ijse.dto.TicketDTO;
import lk.ijse.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketCtrl {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/allTicket")
    public List<TicketDTO>allTicket(){
        return ticketService.getAllTicket();
    }

}
