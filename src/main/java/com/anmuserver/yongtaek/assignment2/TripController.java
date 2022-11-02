package com.anmuserver.yongtaek.assignment2;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;

@RestController
@RequestMapping(method = RequestMethod.GET, value = "ticket")
@RequiredArgsConstructor
public class TripController {
        private final EntityManager em;

        @GetMapping("/{id}")
        public Tickets getTicket(
                @PathVariable(value = "id") final String id)
        {
            return em.find(Tickets.class, Long.parseLong(id));
        }


        @DeleteMapping("/{id}")
        public Long deleteTicket(Long id) {
            em.createQuery("DELETE FROM Tickets WHERE id = :id")
                    .setParameter("id", id).executeUpdate();
            return id;
        }

        @PostMapping("")
        @Transactional
        public Long registerTicket(@RequestBody final Tickets ticket) {
            em.persist(ticket);
            return ticket.getId();
        }

}
