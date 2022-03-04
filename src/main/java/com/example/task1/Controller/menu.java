package com.example.task1.Controller;

import com.example.task1.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;

public class menu {

    Main m = new Main();

    @FXML
    void department(ActionEvent event) throws IOException {
        m.changeScene("department.fxml");
    }

    @FXML
    void employees(ActionEvent event) throws IOException {
        m.changeScene("sample.fxml");
    }


}
