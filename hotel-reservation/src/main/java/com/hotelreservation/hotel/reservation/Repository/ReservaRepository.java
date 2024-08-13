package com.hotelreservation.hotel.reservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelreservation.hotel.reservation.modal.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
