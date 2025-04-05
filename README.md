# 💼 Sistema de Reembolso de Despesas Corporativas

Um sistema web desenvolvido com Spring Boot para gerenciamento de pedidos de reembolso de despesas corporativas.

Funcionários podem cadastrar solicitações de reembolso — como despesas com viagens, alimentação ou deslocamentos — e administradores podem aprovar ou rejeitar esses pedidos de forma simples e eficaz.

---

## 🧩 Funcionalidades

- ✅ Cadastro e autenticação de usuários (funcionários e administradores)
- 📝 Criação de pedidos de reembolso com descrição, valor, data e categoria
- 🔍 Visualização de status dos pedidos: Pendente, Aprovado, Rejeitado
- 🗂️ Interface para administradores revisarem e aprovarem/rejeitarem solicitações
- 📁 Upload de comprovantes de despesa (ex: nota fiscal, recibo, etc.)
- 📊 Painel administrativo com resumo de despesas por categoria e período

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- MySQL ou PostgreSQL
- Lombok
- Swagger/OpenAPI (para documentação da API)
- Flyway (para versionamento de banco de dados)
- Docker (opcional)

---

## ⚙️ Como Rodar o Projeto

1. **Clone o repositório:**

```bash
git clone https://github.com/seu-usuario/nome-do-repo.git
cd nome-do-repo
