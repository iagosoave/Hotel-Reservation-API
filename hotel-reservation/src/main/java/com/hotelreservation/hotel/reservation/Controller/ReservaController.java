package com.hotelreservation.hotel.reservation.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelreservation.hotel.reservation.Service.ReservaService;
import com.hotelreservation.hotel.reservation.modal.Reserva;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
    @Autowired
    private ReservaService reservaService;

    @PostMapping
    public ResponseEntity<Reserva> createReserva(@Valid @RequestBody Reserva reserva) {
        Reserva novaReserva = reservaService.save(reserva);
        return ResponseEntity.ok(novaReserva);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReserva(@PathVariable Long id) {
        if (reservaService.existsById(id)) {
            reservaService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reserva> updateReserva(@PathVariable Long id, @Valid @RequestBody Reserva reservaDetails) {
        Reserva updatedReserva = reservaService.update(id, reservaDetails);
        if (updatedReserva != null) {
            return ResponseEntity.ok(updatedReserva);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
