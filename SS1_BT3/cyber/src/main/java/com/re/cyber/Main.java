package com.re.cyber;

import com.re.cyber.config.AppConfig;
import com.re.cyber.service.OrderFoodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderFoodService service = context.getBean(OrderFoodService.class);

        String user = "user_duc_2006";

        System.out.println("--- TEST 1: Dat mon thanh cong ---");
        service.order(user, "Mì xào bò", 1);

        System.out.println("\n--- TEST 2: Dat mon khi het tien ---");
        service.order(user, "Sting", 3);

        System.out.println("\n--- TEST 3: Dat mon khi het kho ---");
        service.order(user, "Mì xào bò", 10);

        context.close();
    }
}

