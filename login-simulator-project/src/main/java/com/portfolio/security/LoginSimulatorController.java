package com.portfolio.security;

import com.portfolio.App;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LoginSimulatorController {

    @FXML
    private TextField usernameInput;
    @FXML
    private PasswordField passwordInput;
    @FXML
    private Label loginResult;

    // In a real application, this would be stored securely (e.g., database)
    private static final Map<String, String> USERS = new HashMap<>();

    static {
        // Pre-populate with a test user
        USERS.put("testuser", PasswordHasher.hashPassword("password123"));
    }

    @FXML
    private void handleLoginButton() {
        String username = usernameInput.getText();
        String password = passwordInput.getText();

        if (USERS.containsKey(username)) {
            String hashedPassword = USERS.get(username);
            if (PasswordHasher.checkPassword(password, hashedPassword)) {
                loginResult.setText("Login bem-sucedido!");
                loginResult.setStyle("-fx-text-fill: green;");
            } else {
                loginResult.setText("Usuário ou senha inválidos.");
                loginResult.setStyle("-fx-text-fill: red;");
            }
        } else {
            loginResult.setText("Usuário ou senha inválidos.");
            loginResult.setStyle("-fx-text-fill: red;");
        }
    }

    @FXML
    private void goBack() throws IOException {
        App.setRoot("primary");
    }
}

