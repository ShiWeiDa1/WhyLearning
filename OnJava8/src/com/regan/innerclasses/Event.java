package com.regan.innerclasses;

import java.time.Duration;
import java.time.Instant;

/**
 *@className: Event
 *@description:
 *@author: weida.shi
 *@date: 2020/2/3 12:15
 *@version: V1.0
 **/
public abstract class Event {
    private Instant eventime;
    protected final Duration delayTime;

    protected Event(long millisecondDelay) {

        this.delayTime = Duration.ofMillis(millisecondDelay);
        start();

    }

    public void start() {
        eventime = Instant.now().plus(delayTime);
    }

    public boolean ready() {
        return Instant.now().isAfter(eventime);
    }

    public abstract void action();
}