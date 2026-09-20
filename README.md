# 💳 CredUp - Sistema de Empréstimos e Crédito

> Projeto desenvolvido com o objetivo de portfólio, simulando uma plataforma digital de concessão de crédito inspirada em modelos de *fintechs*. O sistema engloba o ciclo completo de solicitação de empréstimo, desde o cadastro do usuário até a análise de crédito via integração com serviços externos de score.

---

## 🚀 Tecnologias Utilizadas

O projeto está dividido entre arquitetura Backend e Frontend:

* **Backend:** 
  * Java 21
  * Spring Boot (Spring Web, Spring Data JPA, Spring Security)
  * Banco de Dados Relacional (PostgreSQL / H2 para testes)
* **Frontend:** 
  * HTML5, CSS3, JavaScript (ou Framework a definir)
* **Ferramentas:**
  * Maven
  * Git & GitHub
  * IntelliJ IDEA

---

## ⚙️ Arquitetura e Funcionalidades

* **Autenticação e Cadastro:** Sistema de registro e login seguro para os usuários (`/api/auth`).
* **Gestão de Empréstimos:** Módulo para o cliente solicitar crédito informando o valor desejado.
* **Consulta de Score (Integração Externa):** O backend consome uma API externa para avaliar a pontuação de crédito do cliente e aplicar regras automáticas de aprovação ou recusa do empréstimo.

---

## 🛠️ Como Executar o Projeto Localmente

### Pré-requisitos
* Java JDK 21 instalado
* Maven
* IDE de sua preferência (IntelliJ IDEA recomendado)

### 1. Clonando o repositório
```bash
git clone [https://github.com/SEU-USUARIO/credup.git](https://github.com/SEU-USUARIO/credup.git)
