package com.anmuserver.yongtaek.assignment2.controller;

import com.anmuserver.yongtaek.assignment2.domain.Ticket;
import com.anmuserver.yongtaek.assignment2.service.TicketService;

import com.anmuserver.yongtaek.week3.model.Member;
import com.anmuserver.yongtaek.week3.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("ticket")
public class TicketController {
    private final TicketService ticketService;

    @GetMapping("")
    public List<Ticket> getAllTickets(){
        return ticketService.getAllTickets();
    }

    @GetMapping("/{id}")
    public Ticket getTicket(@PathVariable("id") final String id){
        return ticketService.getTicket(id);
    }

    @PostMapping("")
    @Transactional
    public Long bookTicket(@RequestBody final Ticket ticket) {
        return ticketService.bookTicket(ticket);
    }

    @DeleteMapping("/{id}")
    public Long cancelTicket(@PathVariable("id") final String id) {
        return ticketService.cancelTicket(id);
    }

}
