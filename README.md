# game-list

Projeto Java que consome uma API de games para listar, buscar e exibir detalhes de jogos.

---

## Índice

- [Sobre o projeto](#sobre-o-projeto)  
- [Tecnologias](#tecnologias)  
- [Pré-requisitos](#pré-requisitos)  
- [Como rodar o projeto](#como-rodar-o-projeto)  
- [Funcionalidades](#funcionalidades)  
- [Banco de dados](#banco-de-dados)  
- [Testes](#testes)  
- [Estrutura do projeto](#estrutura-do-projeto)  
- [Contribuições](#contribuições)  
- [Licença](#licença)  

---

## Sobre o projeto

Este é um projeto backend em Java (provavelmente utilizando Spring Boot, Maven, ou similar) que consome uma API externa de games para se conectar a uma base de dados local via SQL (visto o arquivo `create.sql`), e disponibiliza endpoints para uso de frontends ou outros sistemas.

---

## Tecnologias

- **Java** – linguagem principal :contentReference[oaicite:1]{index=1}  
- **Maven Wrapper** – gerenciamento de build (arquivos `mvnw`, `mvnw.cmd`, `pom.xml`) :contentReference[oaicite:2]{index=2}  
- **Banco de dados SQL** – esquema inicial fornecido via `create.sql` :contentReference[oaicite:3]{index=3}

---

## Pré-requisitos

Antes de rodar o projeto, instale:

- Java 11 ou superior  
- Maven (ou utilizar os wrappers incluídos)  
- Banco de dados (MySQL, PostgreSQL ou outro compatível)

---

## Como rodar o projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/marireis/game-list.git
   cd game-list
