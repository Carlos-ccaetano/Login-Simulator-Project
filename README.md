# Simulador de Login Seguro JavaFX

Este projeto demonstra um simulador de login seguro com hash de senhas utilizando BCrypt e uma interface gráfica simples desenvolvida em JavaFX.

## Funcionalidades

- Simula um processo de login com usuário e senha.
- Armazena o hash da senha (não a senha em texto claro) para demonstração de boas práticas de segurança.
- Valida o login comparando o hash da senha fornecida com o hash armazenado.

## Tecnologias Utilizadas

- Java 11+
- Maven (Gerenciador de Dependências)
- JavaFX (Interface Gráfica)
- jBCrypt (Hashing de Senhas)

## Como Compilar e Executar

Para compilar e executar este projeto, você precisará ter o Java Development Kit (JDK) 11 ou superior e o Apache Maven instalados em sua máquina.

### 1. Clonar o Repositório (Exemplo)

```bash
git clone https://github.com/SEU_USUARIO/login-simulator-project.git
cd login-simulator-project
```

### 2. Compilar o Projeto

Navegue até o diretório raiz do projeto (`login-simulator-project`) e execute o seguinte comando Maven para compilar o projeto e baixar as dependências:

```bash
mvn clean install
```

### 3. Executar a Aplicação

Após a compilação bem-sucedida, você pode executar a aplicação JavaFX usando o plugin Maven:

```bash
mvn javafx:run
```

## Estrutura do Projeto

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


