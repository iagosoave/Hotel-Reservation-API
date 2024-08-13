package com.hotelreservation.hotel.reservation.Service;

import java.util.List;

import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelreservation.hotel.reservation.Repository.ClientRepository;
import com.hotelreservation.hotel.reservation.modal.Client;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClientById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new ValidationException("Cliente não encontrado"));
    }

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    public Client updateClient(Long id, Client clientDetails) {
        Client client = getClientById(id);
        client.setNome(clientDetails.getNome());
        client.setCpf(clientDetails.getCpf());
        client.setDataNascimento(clientDetails.getDataNascimento());
        client.setCidade(clientDetails.getCidade());
        client.setPais(clientDetails.getPais());
        return clientRepository.save(client);
    }

    public void deleteClient(Long id) {
        Client client = getClientById(id);
        clientRepository.delete(client);
    }
}
