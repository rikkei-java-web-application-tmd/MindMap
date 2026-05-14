package com.re.cyber;

import com.re.cyber.config.AppConfig;
import com.re.cyber.model.PlaySession;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PlaySession computer01 = context.getBean(PlaySession.class);
        PlaySession computer02 = context.getBean(PlaySession.class);

        computer01.addTime(120);
        computer02.addTime(45);

        System.out.println("Thoi gian May 01: " + computer01.getPlayTime() + " phut");
        System.out.println("Thoi gian May 02: " + computer02.getPlayTime() + " phut");

        System.out.println("Trang thai doc lap (Prototype hoat dong): " + (computer01 != computer02));

        context.close();
    }
}
