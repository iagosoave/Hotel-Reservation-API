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
   
2. **Navegue até o diretório do projeto**:
   ```bash
   cd hotel-reservation
   
3. **Construa o projeto com Maven**:
   ```bash
   mvn clean package
   
4. **Execute a aplicação**:
   ```bash
   java -jar target/hotel-reservation-0.0.1-SNAPSHOT.jar

## Executando com Docker


1. **Construir a imagem Docker**:
   ```bash
   docker build -t hotel-reservation:latest .
   
2. **Rodar a aplicação em um container Docker**:
   ```bash
   docker run -p 8080:8080 hotel-reservation:latest

## Endpoints Principais
**Clientes**
- GET /api/clients: Retorna todos os clientes.
- GET /api/clients/{id}: Retorna os detalhes de um cliente específico.
- POST /api/clients: Cria um novo cliente.
- PUT /api/clients/{id}: Atualiza as informações de um cliente existente.
- DELETE /api/clients/{id}: Deleta um cliente específico.
**Reservas**
- GET /reservas: Retorna todas as reservas.
- GET /reservas/{id}: Retorna os detalhes de uma reserva específica.
- POST /reservas: Cria uma nova reserva.
- PUT /reservas/{id}: Atualiza uma reserva existente.
- DELETE /reservas/{id}: Deleta uma reserva específica.
