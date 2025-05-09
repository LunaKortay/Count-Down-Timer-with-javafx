package com.kortay.testclass;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;

public class TimerCTD {

    public int secondsRemaining = 100;

    private Controller controller;
    private Timeline timeline;

    public TimerCTD(Controller controller) {
        this.controller = controller;
        timeline = new Timeline(

                new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        secondsRemaining--;
                        controller.labelfirst.setText("Time Left " + secondsRemaining);
                        if (secondsRemaining <= 0) {
                            controller.labelfirst.setText("Timer Stopped!");
                            timeline.stop();
                        }
                    }
                }));
        timeline.setCycleCount(Timeline.INDEFINITE);

    }

    public void startTimerCTD() {
        timeline.playFromStart();
    }

    public int addTen() {
        secondsRemaining += 10;
        return secondsRemaining;
    }

    public int subTen() {
        secondsRemaining -= 10;
        return secondsRemaining;
    }

    public void start() {

    }

}
