package com.hihusky.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyScheduledTasks {
    @Scheduled(fixedRate = 5000)
    public void sayHello() {
        log.info("Hello World!");
    }
}
