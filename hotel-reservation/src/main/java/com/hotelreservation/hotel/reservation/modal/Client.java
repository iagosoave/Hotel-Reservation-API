package com.hotelreservation.hotel.reservation.modal;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "clientes")
public class Client {

    @Id
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @Pattern(regexp = "\\d{11}", message = "CPF deve ter 11 dígitos")
    @NotBlank(message = "CPF é obrigatório")
    private String cpf;

    @Past(message = "Data de nascimento deve ser no passado")
    @NotNull(message = "Data de nascimento é obrigatória")
    private LocalDate dataNascimento;

    @NotBlank(message = "Cidade é obrigatória")
    private String cidade;

    @NotBlank(message = "País é obrigatório")
    private String pais;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
