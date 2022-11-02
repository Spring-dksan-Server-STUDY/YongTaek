package com.anmuserver.yongtaek.assignment2.repository;

import com.anmuserver.yongtaek.assignment2.domain.Ticket;
import com.anmuserver.yongtaek.week3.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class TicketRepository {
    private final EntityManager em;

    @Transactional
    public List<Ticket> getAllTickets(){
        return em.createQuery("select m from Ticket m", Ticket.class)
                .getResultList();
    }

    @Transactional
    public Ticket getTicket(String id){
        return em.find(Ticket.class, Long.parseLong(id));
    }

    @Transactional
    public Long bookTicket(Ticket ticket){
        em.persist(ticket);
        return ticket.getId();
    }

    @Transactional
    public Long cancelTicket(Long id){
        em.createQuery("DELETE FROM Ticket WHERE id = :id")
                .setParameter("id", id).executeUpdate();
        return id;
    }
}
