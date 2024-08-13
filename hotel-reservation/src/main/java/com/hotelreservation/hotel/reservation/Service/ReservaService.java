package com.hotelreservation.hotel.reservation.Service;

import java.time.temporal.ChronoUnit;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelreservation.hotel.reservation.Repository.ReservaRepository;
import com.hotelreservation.hotel.reservation.modal.Reserva;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva save(Reserva reserva) {
        reserva.setValorTotal(calcularValorTotal(reserva));
        return reservaRepository.save(reserva);
    }

    public void deleteById(Long id) {
        reservaRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return reservaRepository.existsById(id);
    }

    public Optional<Reserva> findById(Long id) {
        return reservaRepository.findById(id);
    }

    public Reserva update(Long id, Reserva reservaDetails) {
        return reservaRepository.findById(id)
                .map(reserva -> {
                    reserva.setDataEntrada(reservaDetails.getDataEntrada());
                    reserva.setDataSaida(reservaDetails.getDataSaida());
                    reserva.setNumeroQuarto(reservaDetails.getNumeroQuarto());
                    reserva.setQuantidadePessoas(reservaDetails.getQuantidadePessoas());
                    reserva.setValorTotal(calcularValorTotal(reservaDetails));
                    return reservaRepository.save(reserva);
                })
                .orElse(null); // ou lance uma exceção se preferir
    }

    private double calcularValorTotal(Reserva reserva) {
        long dias = ChronoUnit.DAYS.between(reserva.getDataEntrada(), reserva.getDataSaida());
        double valorBase = reserva.getNumeroQuarto() <= 30 ? 200 : 350;
        double valorPorPessoa = 85 * (reserva.getQuantidadePessoas() - 1);
        return valorBase * dias + valorPorPessoa;
    }
    
    
}
