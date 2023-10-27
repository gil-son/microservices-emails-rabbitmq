# microservices-emails-rabbitmq

A structure with microservices to save users and send e-mails using rabbitMQ. The purpose of that project are save new user in database and send a email for that user.

Okay, how does it work? There are two microservices, each with its own database. The first project, called 'user' is responsible for saving new user registrations in its own database and sending a message to the RabbitMQ platform to queue the message. RabbitMQ receives the message and forwards it to the second project, 'email'. The email project retrieves the message from RabbitMQ, sends an email to the user, and then saves the message in its own database.

### Diagram
<div align="center" >
  <img src="https://thumbs2.imgbox.com/99/51/7lO5o4GX_t.png" />
</div>

<hr />


<div align="center" >
  <img src="https://thumbs2.imgbox.com/e4/32/WtjYXk3t_t.png" />
</div>


### How do you configure the development environment for the project?

- JDK 17
- Maven
- Postman
- PgAdmin (Postgres)
- IDE (IntelliJ, STS, Eclipse, etc)

### How do you make those projects work together?
  - The user project is using port 8081, and the email project is using port 8082
  - I've set up different ports to access the databases. The user project uses port 5433, and the email project uses port 5432. However, if you prefer, the projects can use the same port and adjust it in the application.properties file
  - If you don't have an account in CloudAMQP, you will need to create one. Once the account is created, you can obtain the URL to configure access in the application.properties file.
  - Start the both projects and use this in user project:
    - Method: POST
    - Endpoint: localhost:8081/users
    ```
    {
        "name":"Unnamed",
        "email":"unnamed@gmail.com"
    }
    
    ```


### Source

- <a href="https://www.decoderproject.com/">Decoder</a>

### Resource
- <a href="https://www.rabbitmq.com/">RabbitMQr</a>
- <a href="https://support.google.com/accounts/answer/185833">Google Senha App</a>
