# Geração de Capas de Livros com IA

Este projeto é uma aplicação Spring Boot projetada para gerenciar informações sobre livros e seus autores. O objetivo principal é fornecer uma plataforma robusta que, no futuro, será integrada a uma Inteligência Artificial para gerar capas de livros personalizadas.

---

## Funcionalidades

*   **CRUD de Livros:** Crie, leia, atualize e exclua informações sobre livros.
*   **CRUD de Autores:** Gerencie os autores dos livros.
*   **Endpoints da API REST:** Uma API RESTful para interagir com os dados da aplicação.
*   **(Futuro) Geração de Capas com IA:** Integração com um serviço de IA para gerar capas de livros únicas e personalizadas com base no título, gênero e outras informações do livro.

---

## Tecnologias Utilizadas

*   **Java 21:** A versão mais recente do Java, garantindo acesso aos recursos mais modernos da linguagem.
*   **Spring Boot:** Para criar aplicações Spring autônomas e prontas para produção.
*   **Spring Data JPA:** Para simplificar o acesso a dados a partir de um banco de dados relacional.
*   **Spring Web:** Para construir a camada de API REST.
*   **Maven:** Para gerenciamento de dependências e build do projeto.
*   **Docker:** Para containerizar a aplicação e facilitar o deploy.

---

<!--
## Como Começar

Siga estas instruções para ter o projeto rodando em sua máquina local.

### Pré-requisitos

*   JDK 21 ou superior
*   Maven 3.6 ou superior
*   Docker (opcional, para rodar em um container)

 ### Instalação

1.  Clone o repositório:
    ```sh
    git clone https://github.com/phquartin/ImageAIGenerator.git
    ```
2.  Navegue até o diretório do projeto:
    ```sh
    cd seu-repositorio
    ```
3.  Compile o projeto com o Maven:
    ```sh
    mvn clean install
    ```
4.  Execute a aplicação:
    ```sh
    java -jar target/nome-do-seu-jar.jar
    ```

A aplicação estará disponível em `http://localhost:8080`.

### Usando Docker (Em desenvolvimento)

1.  Construa a imagem Docker:
    ```sh
    docker build -t seu-nome-de-imagem .
    ```
2.  Execute o container:
    ```sh
    docker run -p 8080:8080 seu-nome-de-imagem
    ```
 -->
## Planos Futuros

O próximo grande passo para este projeto é a integração com uma IA para a geração de capas de livros. O fluxo de trabalho planejado é o seguinte:

1.  O usuário cadastra um novo livro com título, autor e gênero.
2.  A aplicação envia essas informações para um serviço de IA.
3.  A IA processa os dados e gera uma imagem de capa de livro personalizada.
4.  A imagem gerada é salva e associada ao livro no banco de dados.

Esta funcionalidade trará um diferencial único para a aplicação, permitindo que autores independentes e pequenas editoras criem capas atraentes para seus livros de forma automatizada e criativa.

---

## Como Contribuir

Contribuições são bem-vindas! Se você tem ideias para novas funcionalidades, melhorias ou encontrou algum bug, sinta-se à vontade para abrir uma issue ou enviar um pull request.

1.  Faça um fork do projeto.
2.  Crie uma nova branch para a sua feature (`git checkout -b feature/nova-feature`).
3.  Faça o commit das suas alterações (`git commit -am 'Adiciona nova feature'`).
4.  Faça o push para a branch (`git push origin feature/nova-feature`).
5.  Abra um Pull Request.

<hr style="border: 3px solid #01ffff;">


## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.