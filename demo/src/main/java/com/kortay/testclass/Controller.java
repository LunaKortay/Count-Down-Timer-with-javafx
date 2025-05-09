package com.kortay.testclass;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    public Label labelfirst;

    @FXML
    private void startthetimer() {
        TimerCTD timer = new TimerCTD(this);
        timer.start();
    }

}
