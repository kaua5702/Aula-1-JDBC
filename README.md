
# 📚 Java JDBC - Conexão com MySQL

> ⚠️ **Aviso:** Este código foi copiado como conteúdo de uma **aula introdutória** sobre conexão com banco de dados em Java. Ele não representa boas práticas de produção e tem fins exclusivamente educacionais.

---

## 📄 Descrição

Exemplo básico de conexão com um banco de dados MySQL utilizando **JDBC (Java Database Connectivity)**. O código realiza uma consulta simples em uma tabela de estudantes e exibe o nome do primeiro registro encontrado.

---

## 🛠️ Tecnologias Utilizadas

- **Java**
- **JDBC** (Java Database Connectivity)
- **MySQL**

---

## ⚙️ Pré-requisitos

- JDK instalado
- MySQL rodando localmente na porta `3306`
- Banco de dados `escola` criado com uma tabela `estudante` contendo a coluna `nome`
- Driver JDBC do MySQL (`com.mysql.jdbc.Driver`) no classpath

---

## 🗄️ Configuração do Banco de Dados

```sql
CREATE DATABASE escola;

USE escola;

CREATE TABLE estudante (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL
);

INSERT INTO estudante (nome) VALUES ('Maria'), ('João');
```

---

## ▶️ Como Executar

1. Clone o repositório
2. Adicione o `.jar` do conector MySQL ao seu classpath
3. Ajuste as credenciais no código (`uname` e `pass`) se necessário
4. Compile e execute:

```bash
javac Main.java
java -cp .:mysql-connector-java.jar Main
```

---

## 📋 O que o código faz

1. Estabelece uma conexão com o banco de dados MySQL
2. Executa a query `SELECT * FROM estudante`
3. Lê o primeiro registro retornado
4. Imprime o nome do estudante no console

---
