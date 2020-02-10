package com.regan.innerclasses;

import java.util.ArrayList;
import java.util.List;

/**
 *@className: Controller
 *@description:
 *@author: weida.shi
 *@date: 2020/2/3 12:26
 *@version: V1.0
 **/
public class Controller {
    private List<Event> events = new ArrayList<>();

    public void addEvent(Event event) {
        events.add(event);
    }

    public void run() {
        while (events.size() > 0) {
            events.forEach(l -> {
                if (l.ready()) {
                    System.out.println(l);
                    l.action();
                    events.remove(l);
                }
            });
        }
    }
}