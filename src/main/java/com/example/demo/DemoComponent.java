package com.example.demo;

import org.slf4j.Logger;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;

import static org.slf4j.LoggerFactory.getLogger;

@Component
public class DemoComponent {
    private static final Logger log = getLogger(DemoComponent.class);

    public DemoComponent(TaskExecutor taskExecutor) {
        log.info("TaskExecutor: {}", taskExecutor);
    }
}
