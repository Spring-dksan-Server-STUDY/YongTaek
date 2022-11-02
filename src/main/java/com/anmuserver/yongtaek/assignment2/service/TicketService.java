package com.anmuserver.yongtaek.assignment2.service;

import com.anmuserver.yongtaek.assignment2.domain.Ticket;
import com.anmuserver.yongtaek.assignment2.repository.TicketRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TicketService {
    private final TicketRepository ticketRepository;

    public List<Ticket> getAllTickets(){
        return ticketRepository.getAllTickets();
    }

    public Ticket getTicket(String id){
        return ticketRepository.getTicket(id);
    }

    public Long bookTicket(Ticket ticket){
        return ticketRepository.bookTicket(ticket);
    }

    public Long cancelTicket(String id){
        return ticketRepository.cancelTicket(Long.parseLong(id));
    }
}
