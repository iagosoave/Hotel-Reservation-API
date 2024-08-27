Hotel Reservation API
Descrição
A Hotel Reservation API é uma aplicação RESTful desenvolvida em Java utilizando o framework Spring Boot. Esta API permite a criação, leitura, atualização e exclusão de reservas de hotel e informações de clientes. Além disso, inclui funcionalidades como cálculos automáticos de valores de reserva, validações de dados e documentação da API com Swagger.

Tecnologias Utilizadas
Java 17
Spring Boot
Spring Data JPA
Hibernate
PostgreSQL (ou H2 Database em ambiente de testes)
Docker e Docker Compose
Gerenciamento de Clientes:

Criar, ler, atualizar e deletar informações de clientes.
Validação de CPF, nome, data de nascimento, cidade e país.
Gerenciamento de Reservas:

Criar, ler, atualizar e deletar reservas.
Calcular automaticamente o valor total da reserva com base no número de dias, quantidade de pessoas e número do quarto.
Relacionar reservas a clientes específicos.
Pré-requisitos
Java 17
Maven 3.6+
Docker (para executar o PostgreSQL ou H2 Database via Docker Compose)
Instalação e Configuração
Clonar o repositório:

bash
Copiar código
git clone https://github.com/seu-usuario/hotel-reservation-api.git
cd hotel-reservation-api
Configurar o banco de dados:

Se estiver utilizando PostgreSQL via Docker Compose:
bash
Copiar código
docker-compose up -d
Configure as propriedades de conexão ao banco de dados no arquivo application.properties ou application.yml em src/main/resources.
Compilar o projeto:

bash
Copiar código
mvn clean install
Executar a aplicação:

bash
Copiar código
mvn spring-boot:run
Acessar a documentação Swagger:

Após iniciar a aplicação, a documentação da API estará disponível em:
bash
Copiar código
http://localhost:8080/swagger-ui.html
Endpoints Principais
Clientes
GET /api/clients: Retorna todos os clientes.
GET /api/clients/{id}: Retorna os detalhes de um cliente específico.
POST /api/clients: Cria um novo cliente.
PUT /api/clients/{id}: Atualiza as informações de um cliente existente.
DELETE /api/clients/{id}: Deleta um cliente específico.
Reservas
GET /reservas: Retorna todas as reservas.
GET /reservas/{id}: Retorna os detalhes de uma reserva específica.
POST /reservas: Cria uma nova reserva.
PUT /reservas/{id}: Atualiza uma reserva existente.
DELETE /reservas/{id}: Deleta uma reserva específica.
Testes
Os testes automatizados podem ser executados utilizando o Maven:

bash
Copiar código
mvn test
Os testes incluem validações de integridade e lógica de negócio, garantindo que a aplicação se comporte conforme esperado.

Utilização de Lombok
Para reduzir a verbosidade do código, foi utilizado o Lombok para gerar automaticamente getters, setters e outros métodos comuns. Certifique-se de que seu IDE está configurado para suportar o Lombok.

Docker
O projeto inclui um arquivo Dockerfile e docker-compose.yml para facilitar a configuração do ambiente de desenvolvimento com Docker.

Comandos Docker
Construir a imagem Docker:

bash
Copiar código
docker build -t hotel-reservation-api .
Executar o container:

bash
Copiar código
docker run -p 8080:8080 hotel-reservation-api
Subir ambiente completo com Docker Compose:

bash
Copiar código
docker-compose up -d
Estrutura do Projeto
plaintext
Copiar código

Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

Licença
Este projeto está licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.

Contato
Nome do Desenvolvedor: Iago Soave
GitHub: https://github.com/iagosoave
LinkedIn: www.linkedin.com/in/iagosoave

