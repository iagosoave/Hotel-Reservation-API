package  com.hotelreservation.hotel.reservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.hotelreservation.hotel.reservation.modal.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
