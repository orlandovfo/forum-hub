FórumHub
Visão Geral

FórumHub é uma plataforma de fórum baseada na web que permite aos usuários criar tópicos, postar mensagens e participar de discussões. A plataforma foi construída usando Spring Boot, Java e MySQL.
Recursos

    Funcionalidade de registro e login de usuário
    Criação e gerenciamento de tópicos
    Postagem e edição de mensagens
    Gerenciamento de perfil de usuário
    Controle de acesso baseado em função (administrador, moderador, usuário)
    Recursos de segurança básicos (hash de senha, proteção contra CSRF)

Requisitos Técnicos

    Java 11 ou superior
    Spring Boot 2.3.1 ou superior
    MySQL 8.0 ou superior
    Maven 3.6.0 ou superior

Configuração e Instalação

    Clone o repositório: git clone https://github.com/seu-username/forumhub.git
    Navegue até o diretório do projeto: cd forumhub
    Instale as dependências: mvn clean install
    Crie um banco de dados MySQL: mysql -u root -p<senha> -e "CREATE DATABASE forumhub"
    Configure o arquivo application.properties: src/main/resources/application.properties
    Execute a aplicação: mvn spring-boot:run

Pontos de Fim da API
Tópicos

    POST /topics: Crie um novo tópico
    GET /topics: Recupere todos os tópicos
    GET /topics/{id}: Recupere um tópico por ID
    PUT /topics/{id}: Atualize um tópico
    DELETE /topics/{id}: Exclua um tópico

Mensagens

    POST /topics/{id}/messages: Crie uma nova mensagem em um tópico
    GET /topics/{id}/messages: Recupere todas as mensagens em um tópico
    GET /topics/{id}/messages/{messageId}: Recupere uma mensagem por ID
    PUT /topics/{id}/messages/{messageId}: Atualize uma mensagem
    DELETE /topics/{id}/messages/{messageId}: Exclua uma mensagem

Usuários

    POST /users: Crie um novo usuário
    GET /users: Recupere todos os usuários
    GET /users/{id}: Recupere um usuário por ID
    PUT /users/{id}: Atualize um usuário
    DELETE /users/{id}: Exclua um usuário

Segurança

A aplicação usa recursos de segurança básicos, como hash de senha e proteção contra CSRF. No entanto, essa não é uma configuração de segurança pronta para produção, e você deve considerar implementar medidas de segurança adicionais, como OAuth2, JWT ou outros mecanismos de autenticação.
Contribuição

Contribuições são bem-vindas! Se você deseja contribuir para o projeto, por favor, faça um fork do repositório, faça suas alterações e envie um pull request.
Licença

FórumHub é licenciado sob a Licença MIT. Veja o arquivo LICENSE para detalhes.
