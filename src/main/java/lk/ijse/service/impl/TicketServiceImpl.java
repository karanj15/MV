package lk.ijse.service.impl;

import lk.ijse.dto.TicketDTO;
import lk.ijse.entity.Ticket;
import lk.ijse.repository.TicketRepo;
import lk.ijse.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepo ticketRepo;

    @Override
    public List<TicketDTO> getAllTicket() {
        List<Ticket>allTicket=ticketRepo.findAll();
        List<TicketDTO>list=new ArrayList<>();
        for (Ticket ti:allTicket){
        }
        return list;
    }
}
