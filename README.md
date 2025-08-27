# 🔐 Simulador de Login Seguro JavaFX

**Simulador de Login Seguro** é uma aplicação de exemplo que demonstra boas práticas básicas de autenticação: uso de hash de senhas (BCrypt) em vez de armazenamento em texto claro e uma interface gráfica simples implementada em **JavaFX**.

**Criador:** Carlos Caetano · GitHub: https://github.com/Carlos-ccaetano

---

## ✨ Funcionalidades

- ✅ Simula um fluxo de login (usuário + senha).  
- ✅ Armazena e compara **hashes** de senha (BCrypt) — nunca a senha em texto simples.  
- ✅ Feedback claro ao usuário sobre sucesso/falha no login.  
- ✅ Código didático, ideal para estudos e demonstrações de segurança básica.

---

## 🛠️ Tecnologias

- **Java 11+**  
- **Maven** (gerenciamento de dependências e build)  
- **JavaFX** (UI)  
- **jBCrypt** (hashing seguro de senhas)

> **Dependência jBCrypt (exemplo para `pom.xml`):**
```xml
<dependency>
  <groupId>org.mindrot</groupId>
  <artifactId>jbcrypt</artifactId>
  <version>0.4</version>
</dependency>
```

---

## ▶️ Pré-requisitos

- JDK 11 ou superior instalado e configurado (`java`/`javac` no PATH).  
- Maven instalado (`mvn` disponível no PATH).  
- (Opcional) IDE com suporte a JavaFX (IntelliJ IDEA, VS Code com extensão, Eclipse).

> Observação: projetos JavaFX com módulos podem exigir configuração adicional de VM args dependendo da sua distribuição do Java/JavaFX. O plugin `javafx-maven-plugin` normalmente simplifica a execução.

---

## 🚀 Como Compilar e Executar

1. **Clonar o repositório**
```bash
git clone https://github.com/Carlos-ccaetano/login-simulator-project.git
cd login-simulator-project
```

2. **Compilar**
```bash
mvn clean install
```

3. **Executar**
```bash
mvn javafx:run
```

Se estiver usando uma IDE, importe o projeto Maven e execute a classe `App`/`Main` (ou configure o plugin `javafx-maven-plugin`).

---

## 📂 Estrutura do Projeto
```
login-simulator-project/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── portfolio/
│   │   │           ├── App.java
│   │   │           ├── PrimaryController.java
│   │   │           └── security/
│   │   │               ├── LoginSimulatorController.java
│   │   │               └── PasswordHasher.java
│   │   └── resources/
│   │       ├── primary.fxml
│   │       └── login_simulator.fxml
└── README.md
```

---

## 🛡️ Observações de Segurança (Importante)

- **Nunca** armazene senhas em texto claro. Utilize hashing com salt — o BCrypt já gera e incorpora o salt automaticamente.  
- Para produção, use um repositório seguro para armazenar hashes (banco de dados com acesso controlado).  
- Evite hardcode de usuários/senhas no código-fonte. Use arquivos de configuração seguros ou variáveis de ambiente.  
- Considere proteção adicional (rate limiting, lockout após tentativas falhas, logging seguro, auditoria).

---

## 📌 Próximas Atualizações  
*(No momento estou envolvido em outros projetos e pesquisas acadêmicas, por isso ainda não finalizei todas as melhorias. Contribuições são bem‑vindas!)*

- [ ] Implementar testes automatizados com **JUnit** para cobrir a autenticação.  
- [ ] Adicionar persistência em banco de dados (SQLite / MySQL) e camada DAO.  
- [ ] Melhorar a UX/UI com **CSS** customizado e validação em tempo real.  
- [ ] Suporte a múltiplos usuários e gerenciamento (CRUD de usuários).  
- [ ] Integração com soluções de vault para credenciais em ambientes reais.

---

## 🤝 Contribuindo

Contribuições são bem-vindas — abra uma *issue* para discutir e envie um *pull request* com suas mudanças. Siga estas recomendações:

1. Fork do repositório.  
2. Crie uma branch: `git checkout -b feature/nome-da-feature`.  
3. Faça commits pequenos e descritivos.  
4. Abra um PR com descrição clara das mudanças.

---

## 👤 Autor

**Carlos Caetano** ·

---
