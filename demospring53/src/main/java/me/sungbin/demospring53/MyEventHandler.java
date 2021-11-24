package me.sungbin.demospring53;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {

    @EventListener
    @Async
    public void handle(MyEvent event) {
        System.out.println(Thread.currentThread());
        System.out.println("이벤트 받았다. 데이터는 " + event.getData());
    }

    @EventListener
    @Async
    public void handle(ContextRefreshedEvent event) {
        System.out.println(Thread.currentThread());
        System.out.println("ContextRefreshEvent");
    }

    @EventListener
    @Async
    public void handle(ContextClosedEvent event) {
        System.out.println(Thread.currentThread());
        System.out.println("ContextClosedEvent");
    }
}
