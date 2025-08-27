package com.portfolio;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToEmailValidator() throws IOException {
        App.setRoot("emailvalidator");
    }

    @FXML
    private void switchToLoginSimulator() throws IOException {
        App.setRoot("login_simulator");
    }
}

