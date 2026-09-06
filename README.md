# ⚙️ Task Scheduler BFF (Backend For Frontend)

> Arquitetura distribuída em microsserviços e padronizada em camada BFF (Backend For Frontend) para gerenciamento completo de usuários, agendamento de tarefas e disparo automatizado de notificações.

---

## 🎯 Sobre o Projeto

O **Task Scheduler BFF** foi projetado para desacoplar e orquestrar as regras de negócio do sistema de agendamento em microsserviços independentes. A camada **BFF** atua como o ponto único de entrada para as aplicações consumidoras, otimizando a agregação de dados, simplificando as chamadas do cliente e garantindo o controle centralizado de autenticação e autorização.

O ecossistema é dividido nos seguintes microsserviços core:
1. **Serviço de Usuários:** Gerenciamento do ciclo de vida do usuário e autenticação.
2. **Serviço de Agendamento:** Criação, atualização, listagem e controle de status das tarefas.
3. **Serviço de Notificação:** Disparo automatizado de lembretes e alertas de tarefas agendadas.

---

## 🛠️ Tecnologias Utilizadas

- **[Java 21](https://www.oracle.com/java/):** Linguagem base para construção dos serviços backend.
- **[Spring Boot](https://spring.io/projects/spring-boot):** Framework para rápido desenvolvimento e gerenciamento da aplicação.
- **[Spring Security](https://spring.io/projects/spring-security) & [JWT](https://jwt.io/):** Proteção de endpoints e autenticação stateless baseada em tokens.
- **[Spring Data JPA / Hibernate](https://spring.io/projects/spring-data-jpa):** Abstração do ORM e gerenciamento da camada de persistência relacional.
- **[PostgreSQL](https://www.postgresql.org/):** Banco de dados relacional para persistência de dados estruturados (usuários e agendamentos).
- **[MongoDB](https://www.mongodb.com/):** Banco NoSQL utilizado para armazenamento e logs do serviço de notificações.
- **[Swagger / OpenAPI 3](https://swagger.io/):** Documentação interativa e testes diretos das rotas expostas pela API.
- **[Lombok](https://projectlombok.org/):** Redução de código boilerplate.

---

## 🏗️ Arquitetura e Boas Práticas

- **Backend For Frontend (BFF):** Agregação de dados dos microsserviços para entregar respostas sob medida para o front-end, reduzindo o número de requisições e a latência da rede.
- **Tratamento Global de Exceções:** Manipulação centralizada de erros (`@ControllerAdvice`) garantindo retornos HTTP padronizados e informativos (`400`, `401`, `404`, `500`).
- **Persistência Híbrida (Polyglot Persistence):** Uso estratégico de **SQL** para dados transacionais relacionais e **NoSQL** para documentos flexíveis e notificações.
- **Clean Code & Arquitetura em Camadas:** Divisão rigorosa entre *Controllers*, *Services*, *Repositories* e objetos de transferência de dados (*DTOs*).

---

## 🚀 Como Executar o Projeto Localmente

### Pré-requisitos
- **Java 21** instalado
- **Maven** instalado
- Instâncias do **PostgreSQL** e **MongoDB** em execução (localmente ou via Docker)

### Passo a Passo

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/moronioliveira/bff-agendador-tarefas.git](https://github.com/moronioliveira/bff-agendador-tarefas.git)
