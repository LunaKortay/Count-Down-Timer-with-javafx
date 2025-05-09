package com.kortay.testclass;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    private TimerCTD timer;
    private int secondsRemaining;

    @FXML
    public Label labelfirst;
    @FXML
    private Label labelseconds;

    @FXML
    private void startthetimer() {
        if (timer == null) {

            timer = new TimerCTD(this);
        }
        timer.startTimerCTD();
    }

    @FXML
    private void addten() {
        if (timer == null) {

            timer = new TimerCTD(this);
        }
        secondsRemaining = timer.addTen();
        labelseconds.setText("" + secondsRemaining);
    }

    @FXML
    private void subten() {
        if (timer == null) {

            timer = new TimerCTD(this);
        }
        secondsRemaining = timer.subTen();
        labelseconds.setText("" + secondsRemaining);
    }

    @FXML
    private void minsec() {

    }

}
