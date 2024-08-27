# Hotel Reservation API

## Descrição

Este projeto é uma API de reserva de hotel construída usando Java com Spring Boot. Ele fornece funcionalidades para gerenciar reservas de hotel, incluindo a criação, atualização, listagem e exclusão de reservas.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **Spring Security**
- **H2 Database**
- **Maven**
- **Docker**
- **PostgreSQL** (com Docker)

## Estrutura do Projeto

A API foi organizada seguindo a arquitetura MVC (Model-View-Controller) com as seguintes camadas:

- **Model**: Contém as entidades e enums do projeto.
- **Repository**: Interface que estende `JpaRepository` para comunicação com o banco de dados.
- **Service**: Contém a lógica de negócios.
- **Controller**: Define os endpoints da API.

## Como Executar o Projeto

### Pré-requisitos

- **JDK 17**: Certifique-se de que o JDK 17 está instalado e configurado no seu ambiente.
- **Maven**: Para gerenciar as dependências do projeto.
- **Docker**: Para rodar o banco de dados PostgreSQL em um container.

### Passos para Execução

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/SeuUsuario/hotel-reservation.git

