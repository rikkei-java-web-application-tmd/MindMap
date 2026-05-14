package com.re.cyber;

import com.re.cyber.config.AppConfig;
import com.re.cyber.service.NotificationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        NotificationService notificationService = context.getBean(NotificationService.class);

        notificationService.notifyRecharge("Tran Minh Duc", 100000);

        context.close();
    }
}

